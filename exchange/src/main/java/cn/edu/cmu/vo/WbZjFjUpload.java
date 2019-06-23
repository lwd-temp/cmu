package cn.edu.cmu.vo;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class WbZjFjUpload {

    public WbZjFjUpload() {
    }

    private MultipartFile file;
    private String zjms;


}