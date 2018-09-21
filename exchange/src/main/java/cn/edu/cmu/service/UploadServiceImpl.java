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
}
