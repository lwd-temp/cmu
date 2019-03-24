package cn.edu.cmu.domain;

import java.util.Date;

public class IfsWxlog {
    /**
     * 主键
     */
    private String logid;

    /**
     * 发送者
     */
    private String sendUser;

    /**
     * 接受者
     */
    private String receiveUser;

    /**
     * 接受者姓名
     */
    private String receiveName;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 内容
     */
    private String content;

    /**
     * 响应结果
     */
    private String result;

    /**
     * 数据是否有效(0已经删除 1有效)
     */
    private String valid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     * @mbggenerated 2019-03-24
     */
    public IfsWxlog(String logid, String sendUser, String receiveUser, String receiveName, String title, String description, String content, String result, String valid, Date createTime) {
        this.logid = logid;
        this.sendUser = sendUser;
        this.receiveUser = receiveUser;
        this.receiveName = receiveName;
        this.title = title;
        this.description = description;
        this.content = content;
        this.result = result;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-03-24
     */
    public IfsWxlog() {
        super();
    }

    /**
     * 主键
     * @return LOGID 主键
     */
    public String getLogid() {
        return logid;
    }

    /**
     * 主键
     * @param logid 主键
     */
    public void setLogid(String logid) {
        this.logid = logid == null ? null : logid.trim();
    }

    /**
     * 发送者
     * @return SEND_USER 发送者
     */
    public String getSendUser() {
        return sendUser;
    }

    /**
     * 发送者
     * @param sendUser 发送者
     */
    public void setSendUser(String sendUser) {
        this.sendUser = sendUser == null ? null : sendUser.trim();
    }

    /**
     * 接受者
     * @return RECEIVE_USER 接受者
     */
    public String getReceiveUser() {
        return receiveUser;
    }

    /**
     * 接受者
     * @param receiveUser 接受者
     */
    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser == null ? null : receiveUser.trim();
    }

    /**
     * 接受者姓名
     * @return RECEIVE_NAME 接受者姓名
     */
    public String getReceiveName() {
        return receiveName;
    }

    /**
     * 接受者姓名
     * @param receiveName 接受者姓名
     */
    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    /**
     * 标题
     * @return TITLE 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 描述
     * @return DESCRIPTION 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 内容
     * @return CONTENT 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 响应结果
     * @return RESULT 响应结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 响应结果
     * @param result 响应结果
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
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
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2019-03-24
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logid=").append(logid);
        sb.append(", sendUser=").append(sendUser);
        sb.append(", receiveUser=").append(receiveUser);
        sb.append(", receiveName=").append(receiveName);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", content=").append(content);
        sb.append(", result=").append(result);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}