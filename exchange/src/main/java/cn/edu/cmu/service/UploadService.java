package cn.edu.cmu.service;

import cn.edu.cmu.domain.Upload;
import cn.edu.cmu.domain.UploadParams;
import cn.edu.cmu.framework.web.IBaseService;

import java.util.List;


public interface UploadService extends IBaseService<Upload, UploadParams> {


    public boolean upload(List<Upload> uploads) throws Exception;

}

