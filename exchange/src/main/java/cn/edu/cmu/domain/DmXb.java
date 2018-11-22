package cn.edu.cmu.domain;

public class DmXb {
    /**
     * null
     */
    private String code;

    /**
     * null
     */
    private String name;

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public DmXb(String code, String caption) {
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public DmXb() {
        super();
    }

    /**
     * null
     * @return CODE null
     */
    public String getCode() {
        return code;
    }

    /**
     * null
     * @param code null
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * null
     * @return CAPTION null
     */
    public String getName() {
        return name;
    }

    /**
     * null
     * @param name null
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}