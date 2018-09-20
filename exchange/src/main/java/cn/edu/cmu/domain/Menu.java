package cn.edu.cmu.domain;

import java.util.Date;

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
    public Menu(String menuId, String menuName, String parentId, String icon, String style, String url, String valid, Date createTime) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentId = parentId;
        this.icon = icon;
        this.style = style;
        this.url = url;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-09-20
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
        sb.append(", menuId=").append(menuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", parentId=").append(parentId);
        sb.append(", icon=").append(icon);
        sb.append(", style=").append(style);
        sb.append(", url=").append(url);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}