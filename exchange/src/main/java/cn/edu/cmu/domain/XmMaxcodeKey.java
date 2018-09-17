package cn.edu.cmu.domain;

import java.math.BigDecimal;

public class XmMaxcodeKey {
    /**
     * 年度
     */
    private BigDecimal year;

    /**
     * 最大号码
     */
    private BigDecimal maxcode;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public XmMaxcodeKey(BigDecimal year, BigDecimal maxcode) {
        this.year = year;
        this.maxcode = maxcode;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public XmMaxcodeKey() {
        super();
    }

    /**
     * 年度
     * @return YEAR 年度
     */
    public BigDecimal getYear() {
        return year;
    }

    /**
     * 年度
     * @param year 年度
     */
    public void setYear(BigDecimal year) {
        this.year = year;
    }

    /**
     * 最大号码
     * @return MAXCODE 最大号码
     */
    public BigDecimal getMaxcode() {
        return maxcode;
    }

    /**
     * 最大号码
     * @param maxcode 最大号码
     */
    public void setMaxcode(BigDecimal maxcode) {
        this.maxcode = maxcode;
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
        sb.append(", year=").append(year);
        sb.append(", maxcode=").append(maxcode);
        sb.append("]");
        return sb.toString();
    }
}