package cn.edu.cmu.domain;

public class DmXmcc {
    /**
     * 层次代码
     */
    private String code;

    /**
     * 层次名称
     */
    private String name;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmXmcc(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmXmcc() {
        super();
    }

    /**
     * 层次代码
     * @return CODE 层次代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 层次代码
     * @param code 层次代码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 层次名称
     * @return NAME 层次名称
     */
    public String getName() {
        return name;
    }

    /**
     * 层次名称
     * @param name 层次名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}