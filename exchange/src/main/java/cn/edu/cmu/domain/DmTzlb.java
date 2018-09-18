package cn.edu.cmu.domain;

public class DmTzlb {
    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmTzlb(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmTzlb() {
        super();
    }

    /**
     * code
     * @return CODE code
     */
    public String getCode() {
        return code;
    }

    /**
     * code
     * @param code code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * name
     * @return NAME name
     */
    public String getName() {
        return name;
    }

    /**
     * name
     * @param name name
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