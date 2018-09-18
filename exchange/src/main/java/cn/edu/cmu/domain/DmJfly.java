package cn.edu.cmu.domain;

public class DmJfly {
    /**
     * 来源id
     */
    private String code;

    /**
     * 经费来源
     */
    private String name;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmJfly(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public DmJfly() {
        super();
    }

    /**
     * 来源id
     * @return CODE 来源id
     */
    public String getCode() {
        return code;
    }

    /**
     * 来源id
     * @param code 来源id
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 经费来源
     * @return NAME 经费来源
     */
    public String getName() {
        return name;
    }

    /**
     * 经费来源
     * @param name 经费来源
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