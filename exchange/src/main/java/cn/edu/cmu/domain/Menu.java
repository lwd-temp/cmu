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
     * 功能路径
     */
    private String url;

    /**
     * 图标
     */
    private String menuIcon;

    /**
     * 样式
     */
    private String menuStyle;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 备注
     */
    private String memo;

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
     * @mbggenerated 2018-11-22
     */
    public Menu(String menuId, String menuName, String parentId, String url, String menuIcon, String menuStyle, Integer sort, String memo, String valid, Date createTime) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.parentId = parentId;
        this.url = url;
        this.menuIcon = menuIcon;
        this.menuStyle = menuStyle;
        this.sort = sort;
        this.memo = memo;
        this.valid = valid;
        this.createTime = createTime;
    }

    /**
     *
     * @mbggenerated 2018-11-22
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
     * 图标
     * @return MENU_ICON 图标
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * 图标
     * @param menuIcon 图标
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    /**
     * 样式
     * @return MENU_STYLE 样式
     */
    public String getMenuStyle() {
        return menuStyle;
    }

    /**
     * 样式
     * @param menuStyle 样式
     */
    public void setMenuStyle(String menuStyle) {
        this.menuStyle = menuStyle == null ? null : menuStyle.trim();
    }

    /**
     * 排序
     * @return SORT 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 备注
     * @return MEMO 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 备注
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
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
     * @mbggenerated 2018-11-22
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
        sb.append(", url=").append(url);
        sb.append(", menuIcon=").append(menuIcon);
        sb.append(", menuStyle=").append(menuStyle);
        sb.append(", sort=").append(sort);
        sb.append(", memo=").append(memo);
        sb.append(", valid=").append(valid);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}