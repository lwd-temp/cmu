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
    public User(String userId, String userName, String password, Date lastModifyTime, Date lastLoginTime, String valid, Date createTime) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.lastModifyTime = lastModifyTime;
        this.lastLoginTime = lastLoginTime;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
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
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", password=").append(password);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}