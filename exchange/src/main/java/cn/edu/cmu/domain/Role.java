package cn.edu.cmu.domain;

public class Role {
    /**
     * 角色id
     */
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public Role(String roleId, String roleName, String status) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public Role() {
        super();
    }

    /**
     * 角色id
     * @return ROLE_ID 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 角色id
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 角色名称
     * @return ROLE_NAME 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}