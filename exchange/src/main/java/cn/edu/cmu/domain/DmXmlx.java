package cn.edu.cmu.domain;

public class DmXmlx {
    /**
     * 类型编码
     */
    private String code;

    /**
     * 类型名称
     */
    private String name;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmXmlx(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmXmlx() {
        super();
    }

    /**
     * 类型编码
     * @return CODE 类型编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 类型编码
     * @param code 类型编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 类型名称
     * @return NAME 类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 类型名称
     * @param name 类型名称
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