package cn.edu.cmu.domain;

public class Menu {
    /**
     * 功能id
     */
    private String menuId;

    /**
     * 功能名称
     */
    private String menuName;

    /**
     * 上级功能id
     */
    private String parentId;

    /**
     * 图标
     */
    private String icon;

    /**
     * 样式
     */
    private String style;

    /**
     * 功能路径
     */
    private String url;

    /**
     * 状态
     */
    private String status;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public Menu(String menuId, String menuName, String parentId, String icon, String style, String url, String status) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentId = parentId;
        this.icon = icon;
        this.style = style;
        this.url = url;
        this.status = status;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public Menu() {
        super();
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
     * 功能名称
     * @return MENU_NAME 功能名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 功能名称
     * @param menuName 功能名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 上级功能id
     * @return PARENT_ID 上级功能id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 上级功能id
     * @param parentId 上级功能id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 图标
     * @return ICON 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 图标
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 样式
     * @return STYLE 样式
     */
    public String getStyle() {
        return style;
    }

    /**
     * 样式
     * @param style 样式
     */
    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    /**
     * 功能路径
     * @return URL 功能路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 功能路径
     * @param url 功能路径
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
     * @mbggenerated 2018-09-17
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", parentId=").append(parentId);
        sb.append(", icon=").append(icon);
        sb.append(", style=").append(style);
        sb.append(", url=").append(url);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}