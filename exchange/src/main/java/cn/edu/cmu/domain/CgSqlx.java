package cn.edu.cmu.domain;

public class CgSqlx {
    /**
     * 代码 01，02 
     */
    private String code;

    /**
     * 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     */
    private String name;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public CgSqlx(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public CgSqlx() {
        super();
    }

    /**
     * 代码 01，02 
     * @return CODE 代码 01，02 
     */
    public String getCode() {
        return code;
    }

    /**
     * 代码 01，02 
     * @param code 代码 01，02 
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     * @return NAME 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     */
    public String getName() {
        return name;
    }

    /**
     * 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
     * @param name 名称 在职人员因公短期出国（境）申请、校管干部因私短期出国（境）申请
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