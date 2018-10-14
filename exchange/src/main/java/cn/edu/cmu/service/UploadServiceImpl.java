package cn.edu.cmu.service;

import cn.edu.cmu.dao.UploadMapper;
import cn.edu.cmu.domain.Upload;
import cn.edu.cmu.domain.UploadParams;
import cn.edu.cmu.framework.web.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UploadServiceImpl extends BaseService<Upload, UploadParams, UploadMapper> implements UploadService {


    @Override
    public List list(Upload Upload) {
        UploadParams ex = new UploadParams();
        if(Upload != null){
            UploadParams.Criteria c = ex.createCriteria();
            if(StringUtils.isNotEmpty(Upload.getUploadPath())){
                c.andUploadPathLike("%"+Upload.getUploadPath()+"%");
            }
        }
        return dao.selectByExample(ex);
    }

    @Override
    public List list(Object... conditions) throws Exception {
        return null;
    }


    /**
     * 将上传信息保存到数据库中
     * @param uploads
     * @return
     */
    @Override
    public boolean upload(List<Upload> uploads) throws Exception {
        if(uploads == null || uploads.size()<=0){
            return false;
        }

        int count = 0;
        for (Upload upload : uploads) {
            count += dao.insertSelective(upload) ;
        }
        if(count != uploads.size()){
            throw new Exception(String.format("上传文件失败，应上传 %d,实际上传 %d",uploads.size() ,count ));
        }
        return true;
    }
}
