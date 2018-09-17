package cn.edu.cmu.domain;

public class RoleMenuKey {
    /**
     * 角色id
     */
    private String roleId;

    /**
     * 功能id
     */
    private String menuId;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public RoleMenuKey(String roleId, String menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public RoleMenuKey() {
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
     * 功能id
     * @return MENU_ID 功能id
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 功能id
     * @param menuId 功能id
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append("]");
        return sb.toString();
    }
}