package cn.edu.cmu.domain;

import java.util.Date;

public class Upload {
    /**
     * 文件id
     */
    private String fileId;

    /**
     * 上传文件路径
     */
    private String uploadPath;

    /**
     * 上传时间
     */
    private Date createtime;

    /**
     * 扩展名
     */
    private String ext;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 操作ip
     */
    private String ip;

    /**
     * 数据是否有效(0已经删除 1有效)
     */
    private String valid;

    /**
     * 创建时间默认当前数据生成时间
     */
    private Date createTime;

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public Upload(String fileId, String uploadPath, Date createtime, String ext, String operator, String ip, String valid, Date createTime) {
        this.fileId = fileId;
        this.uploadPath = uploadPath;
        this.createtime = createtime;
        this.ext = ext;
        this.operator = operator;
        this.ip = ip;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public Upload() {
        super();
    }

    /**
     * 文件id
     * @return FILE_ID 文件id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 文件id
     * @param fileId 文件id
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * 上传文件路径
     * @return UPLOAD_PATH 上传文件路径
     */
    public String getUploadPath() {
        return uploadPath;
    }

    /**
     * 上传文件路径
     * @param uploadPath 上传文件路径
     */
    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath == null ? null : uploadPath.trim();
    }

    /**
     * 上传时间
     * @return CREATETIME 上传时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 上传时间
     * @param createtime 上传时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 扩展名
     * @return EXT 扩展名
     */
    public String getExt() {
        return ext;
    }

    /**
     * 扩展名
     * @param ext 扩展名
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    /**
     * 操作者
     * @return OPERATOR 操作者
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 操作者
     * @param operator 操作者
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 操作ip
     * @return IP 操作ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * 操作ip
     * @param ip 操作ip
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @return VALID 数据是否有效(0已经删除 1有效)
     */
    public String getValid() {
        return valid;
    }

    /**
     * 数据是否有效(0已经删除 1有效)
     * @param valid 数据是否有效(0已经删除 1有效)
     */
    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    /**
     * 创建时间默认当前数据生成时间
     * @return CREATE_TIME 创建时间默认当前数据生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间默认当前数据生成时间
     * @param createTime 创建时间默认当前数据生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", uploadPath=").append(uploadPath);
        sb.append(", createtime=").append(createtime);
        sb.append(", ext=").append(ext);
        sb.append(", operator=").append(operator);
        sb.append(", ip=").append(ip);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}