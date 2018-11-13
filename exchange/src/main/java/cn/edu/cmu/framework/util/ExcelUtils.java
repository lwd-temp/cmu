package cn.edu.cmu.framework.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: jshand
 * @Date: 2018/10/2 20:44
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class ExcelUtils {

    private static Logger logger = Logger.getLogger(ExcelUtils.class);

    public void testExp() throws IOException {

        OutputStream os = new FileOutputStream(new File("D:\\"+new SimpleDateFormat("yyyyMMdd_HH_mm_ss").format(new Date()) +".xls"));
        List data = new ArrayList();
            
//        data.add(new User("001", "admin1", 18, new Date()));
//        data.add(new User("201", "admin2", 28, new Date(2018-1900,9,20)));
//        data.add(new User("301", "admin3", 38, new Date(2019-1900,8,21,17,19,25)));
//        data.add(new User("401", "admin4", 48, new Date(2020-1900,7,22)));
//        data.add(new User("501", "admin5", 58, new Date(2021-1900,6,23)));

        for (int i = 0; i < 10; i++) {
            Map user = new HashMap();
            user.put("id","id"+i);
            user.put("userName","us:"+i);
            user.put("age",50+i);
            user.put("birthDay",new Date());
            data.add(user);
        }


        expExcel(data,"excel_template/temp.xls",os);
    }

    public static void expExcel(List datas, String path,OutputStream os) throws IOException {


        logger.info("导出excel文件，使用用模板：" + path);


        path = WebAppContextUtils.REAL_CONTEXT_PATH +"/download_template/excel/"+ path;


        FileInputStream fis=new FileInputStream(path);
        POIFSFileSystem fs = new POIFSFileSystem(fis);//使用POIFSFileSystem包括下避免同时读，写出错
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        HSSFSheet sheet = workbook.getSheetAt(0);//第一个sheet页
        HSSFRow firstRow = sheet.getRow(0);//第一行
        List<String> columnKeys = getKeys(firstRow);//所有字段的key
        for (int i = 0; i <datas.size() ; i++) {
            Object data = datas.get(i);
            int cellIndex = 0;
            HSSFRow dataRow = sheet.createRow(i + 2);

            for (int j = 0; j <columnKeys.size() ; j++) {
                String key = columnKeys.get(j);
                HSSFCell dataCell = dataRow.createCell(j);
                if(j == 0 && StringUtils.isEmpty(key)){//第一列没有设置可以，则设置为序号
                    dataCell.setCellValue(String.valueOf((i+1)));
                }else{
                    setCellData(dataCell,data,key);
                }
            }
        }
//        sheet.removeRow(firstRow);//只能删除数据,会留下空行出现
        sheet.shiftRows(1,sheet.getLastRowNum(),-1);//从第二行开始到最后一行，向上移动1行
        HSSFRow titleRow = sheet.getRow(0);
        for (int i = 0; i < titleRow.getLastCellNum(); i++) {
            sheet.autoSizeColumn(i); //让列自适应宽度
        }


        logger.info("准备将文件输出到客户端：" + path);
        workbook.write(os);

        logger.info("输出到客户端完成关闭资源" );
        os.flush();
        os.close();
        workbook.close();
    }

    private static void setCellData(HSSFCell dataCell, Object data, String key) {

        if(StringUtils.isEmpty(key)){
            return;
        }
        Object cellValue = null;
        if(data instanceof Map){
            Map dataMap = (Map) data;
            cellValue = dataMap.get(key);
        }else{
            //getCreateTime
            try {
                String methodName = "get" + key.substring(0, 1).toUpperCase() + key.substring(1);

                Method method = data.getClass().getDeclaredMethod(methodName, null);
                cellValue = method.invoke(data);

            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                logger.debug("没有找到属性["+key+"]");
                //e.printStackTrace();
            }
        }


        if(cellValue ==null){
            return ;
        }


        if(cellValue instanceof Date){//日期
            Date date = (Date) cellValue;
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            dataCell.setCellValue(cal);
        }else if (cellValue instanceof Double){
            Double doubleValue = (Double) cellValue;
            dataCell.setCellValue(doubleValue);
        }else if (cellValue instanceof Float){
            Float floatValue = (Float) cellValue;
            dataCell.setCellValue(floatValue);
        }else if (cellValue instanceof Integer){
            Integer intValue = (Integer) cellValue;
            dataCell.setCellValue(intValue);
        }else if (cellValue instanceof Long){
            Long longValue = (Long) cellValue;
            dataCell.setCellValue(longValue);
        }else if (cellValue instanceof Short){
            Short shortValue = (Short) cellValue;
            dataCell.setCellValue(shortValue);
        }else{
            dataCell.setCellValue(String.valueOf(cellValue));
        }

    }


    /**
     * 获取第一行 的 key
     * @param firstRow;
     * @return
     */
    public static List getKeys(HSSFRow firstRow){
        List listKeys = new ArrayList(0);

        short lastCellNum = firstRow.getLastCellNum();
        //System.out.println("lastCellNum :"+lastCellNum);
        for (int i = 0; i < lastCellNum; i++) {
            HSSFCell cell = firstRow.getCell(i);
            if(cell == null ){
                listKeys.add("");
            }else{
                String key = cell.getStringCellValue();
                listKeys.add(key);
            }
        }

        return listKeys;

    }



}
