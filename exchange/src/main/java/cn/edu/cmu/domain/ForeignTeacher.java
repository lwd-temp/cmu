package cn.edu.cmu.domain;

public class ForeignTeacher {
    /**
     * 教师id
     */
    private String 教师id;

    /**
     * 教师姓名
     */
    private String 教师姓名;

    /**
     * 教师性别
     */
    private String 教师性别;

    /**
     * 国籍
     */
    private String 国籍;

    /**
     * 状态
     */
    private String 状态;

    /**
     * 等等
     */
    private String 等等;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public ForeignTeacher(String 教师id, String 教师姓名, String 教师性别, String 国籍, String 状态, String 等等) {
        this.教师id = 教师id;
        this.教师姓名 = 教师姓名;
        this.教师性别 = 教师性别;
        this.国籍 = 国籍;
        this.状态 = 状态;
        this.等等 = 等等;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public ForeignTeacher() {
        super();
    }

    /**
     * 教师id
     * @return 教师ID 教师id
     */
    public String get教师id() {
        return 教师id;
    }

    /**
     * 教师id
     * @param 教师id 教师id
     */
    public void set教师id(String 教师id) {
        this.教师id = 教师id == null ? null : 教师id.trim();
    }

    /**
     * 教师姓名
     * @return 教师姓名 教师姓名
     */
    public String get教师姓名() {
        return 教师姓名;
    }

    /**
     * 教师姓名
     * @param 教师姓名 教师姓名
     */
    public void set教师姓名(String 教师姓名) {
        this.教师姓名 = 教师姓名 == null ? null : 教师姓名.trim();
    }

    /**
     * 教师性别
     * @return 教师性别 教师性别
     */
    public String get教师性别() {
        return 教师性别;
    }

    /**
     * 教师性别
     * @param 教师性别 教师性别
     */
    public void set教师性别(String 教师性别) {
        this.教师性别 = 教师性别 == null ? null : 教师性别.trim();
    }

    /**
     * 国籍
     * @return 国籍 国籍
     */
    public String get国籍() {
        return 国籍;
    }

    /**
     * 国籍
     * @param 国籍 国籍
     */
    public void set国籍(String 国籍) {
        this.国籍 = 国籍 == null ? null : 国籍.trim();
    }

    /**
     * 状态
     * @return 状态 状态
     */
    public String get状态() {
        return 状态;
    }

    /**
     * 状态
     * @param 状态 状态
     */
    public void set状态(String 状态) {
        this.状态 = 状态 == null ? null : 状态.trim();
    }

    /**
     * 等等
     * @return 等等 等等
     */
    public String get等等() {
        return 等等;
    }

    /**
     * 等等
     * @param 等等 等等
     */
    public void set等等(String 等等) {
        this.等等 = 等等 == null ? null : 等等.trim();
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
        sb.append(", 教师id=").append(教师id);
        sb.append(", 教师姓名=").append(教师姓名);
        sb.append(", 教师性别=").append(教师性别);
        sb.append(", 国籍=").append(国籍);
        sb.append(", 状态=").append(状态);
        sb.append(", 等等=").append(等等);
        sb.append("]");
        return sb.toString();
    }
}