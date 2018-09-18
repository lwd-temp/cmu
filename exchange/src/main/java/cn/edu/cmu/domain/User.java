package cn.edu.cmu.domain;

import java.util.Date;

public class User {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 最后一次修改日
     */
    private Date lastModifyTime;

    /**
     * 最后登录日期
     */
    private Date lastLoginTime;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public User(String userId, String userName, String password, Date lastModifyTime, Date lastLoginTime, String status) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.lastModifyTime = lastModifyTime;
        this.lastLoginTime = lastLoginTime;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public User() {
        super();
    }

    /**
     * 用户id
     * @return USER_ID 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 用户名
     * @return USER_NAME 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return PASSWORD 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 最后一次修改日
     * @return LAST_MODIFY_TIME 最后一次修改日
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 最后一次修改日
     * @param lastModifyTime 最后一次修改日
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * 最后登录日期
     * @return LAST_LOGIN_TIME 最后登录日期
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 最后登录日期
     * @param lastLoginTime 最后登录日期
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 状态
     * @return STATUS 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}