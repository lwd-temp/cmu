package cn.edu.cmu.framework.excel;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author: jshand
 * @Date: 2018/10/2 20:44
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class ExcelUtil {

    //Logger logger = Logger.getLogger(ExcelTest.class);


    public static void expExcel(List datas, String url, OutputStream os) throws IOException {

        FileInputStream fis = new FileInputStream(url);
        POIFSFileSystem fs = new POIFSFileSystem(fis);//使用POIFSFileSystem包括下避免同时读，写出错
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        HSSFSheet sheet = workbook.getSheetAt(0);//第一个sheet页
        HSSFRow firstRow = sheet.getRow(0);//第一行

        List<String> columnKeys = getKeys(firstRow);//所有字段的key
        for (int i = 0; i < datas.size(); i++) {
            Object data = datas.get(i);

            HSSFRow dataRow = sheet.createRow(i + 2);
            for (int j = 0; j < columnKeys.size(); j++) {
                HSSFCell dataCell = dataRow.createCell(j);
                String key = columnKeys.get(j);
                setCellData(dataCell, data, key);
            }
        }

        //删除第一行的模板数据
        sheet.removeRow(firstRow);

        workbook.write(os);
    }

    private static void setCellData(HSSFCell dataCell, Object data, String key) {

        if (StringUtils.isEmpty(key)) {
            return;
        }
        Object cellValue = null;
        if (data instanceof Map) {
            Map dataMap = (Map) data;
            cellValue = dataMap.get(key);
        } else {
            //getCreateTime
            try {
                String methodName = "get" + key.substring(0, 1).toUpperCase() + key.substring(1);

                Method method = data.getClass().getDeclaredMethod(methodName, null);
                cellValue = method.invoke(data);

            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                System.out.println("没有找到属性[" + key + "]");
                e.printStackTrace();
            }
        }


        if (cellValue == null) {
            return;
        }


        if (cellValue instanceof Date) {//日期
            Date date = (Date) cellValue;
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            dataCell.setCellValue(cal);
        } else if (cellValue instanceof Double) {
            Double doubleValue = (Double) cellValue;
            dataCell.setCellValue(doubleValue);
        } else if (cellValue instanceof Float) {
            Float floatValue = (Float) cellValue;
            dataCell.setCellValue(floatValue);
        } else if (cellValue instanceof Integer) {
            Integer intValue = (Integer) cellValue;
            dataCell.setCellValue(intValue);
        } else if (cellValue instanceof Long) {
            Long longValue = (Long) cellValue;
            dataCell.setCellValue(longValue);
        } else if (cellValue instanceof Short) {
            Short shortValue = (Short) cellValue;
            dataCell.setCellValue(shortValue);
        } else {
            dataCell.setCellValue(String.valueOf(cellValue));
        }

    }


    /**
     * 获取第一行 的 key
     *
     * @param firstRow
     * @return
     */
    public static List getKeys(HSSFRow firstRow) {
        List listKeys = new ArrayList(0);

        short lastCellNum = firstRow.getLastCellNum();

        System.out.println("lastCellNum :" + lastCellNum);
        for (int i = 0; i < lastCellNum; i++) {
            HSSFCell cell = firstRow.getCell(i);
            if (cell == null) {
                listKeys.add("");
            } else {
                String key = cell.getStringCellValue();
                listKeys.add(key);
            }
        }

        return listKeys;

    }


}
