package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgDqcgjParams {
    /**
     * T_CG_DQCGJ
     */
    protected String orderByClause;

    /**
     * T_CG_DQCGJ
     */
    protected boolean distinct;

    /**
     * T_CG_DQCGJ
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public CgDqcgjParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-07-30
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_CG_DQCGJ 2019-07-30
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCgidIsNull() {
            addCriterion("CGID is null");
            return (Criteria) this;
        }

        public Criteria andCgidIsNotNull() {
            addCriterion("CGID is not null");
            return (Criteria) this;
        }

        public Criteria andCgidEqualTo(String value) {
            addCriterion("CGID =", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotEqualTo(String value) {
            addCriterion("CGID <>", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidGreaterThan(String value) {
            addCriterion("CGID >", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidGreaterThanOrEqualTo(String value) {
            addCriterion("CGID >=", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLessThan(String value) {
            addCriterion("CGID <", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLessThanOrEqualTo(String value) {
            addCriterion("CGID <=", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidLike(String value) {
            addCriterion("CGID like", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotLike(String value) {
            addCriterion("CGID not like", value, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidIn(List<String> values) {
            addCriterion("CGID in", values, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotIn(List<String> values) {
            addCriterion("CGID not in", values, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidBetween(String value1, String value2) {
            addCriterion("CGID between", value1, value2, "cgid");
            return (Criteria) this;
        }

        public Criteria andCgidNotBetween(String value1, String value2) {
            addCriterion("CGID not between", value1, value2, "cgid");
            return (Criteria) this;
        }

        public Criteria andCglxIsNull() {
            addCriterion("CGLX is null");
            return (Criteria) this;
        }

        public Criteria andCglxIsNotNull() {
            addCriterion("CGLX is not null");
            return (Criteria) this;
        }

        public Criteria andCglxEqualTo(String value) {
            addCriterion("CGLX =", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxNotEqualTo(String value) {
            addCriterion("CGLX <>", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxGreaterThan(String value) {
            addCriterion("CGLX >", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxGreaterThanOrEqualTo(String value) {
            addCriterion("CGLX >=", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxLessThan(String value) {
            addCriterion("CGLX <", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxLessThanOrEqualTo(String value) {
            addCriterion("CGLX <=", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxLike(String value) {
            addCriterion("CGLX like", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxNotLike(String value) {
            addCriterion("CGLX not like", value, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxIn(List<String> values) {
            addCriterion("CGLX in", values, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxNotIn(List<String> values) {
            addCriterion("CGLX not in", values, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxBetween(String value1, String value2) {
            addCriterion("CGLX between", value1, value2, "cglx");
            return (Criteria) this;
        }

        public Criteria andCglxNotBetween(String value1, String value2) {
            addCriterion("CGLX not between", value1, value2, "cglx");
            return (Criteria) this;
        }

        public Criteria andXmIsNull() {
            addCriterion("XM is null");
            return (Criteria) this;
        }

        public Criteria andXmIsNotNull() {
            addCriterion("XM is not null");
            return (Criteria) this;
        }

        public Criteria andXmEqualTo(String value) {
            addCriterion("XM =", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotEqualTo(String value) {
            addCriterion("XM <>", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThan(String value) {
            addCriterion("XM >", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmGreaterThanOrEqualTo(String value) {
            addCriterion("XM >=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThan(String value) {
            addCriterion("XM <", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLessThanOrEqualTo(String value) {
            addCriterion("XM <=", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmLike(String value) {
            addCriterion("XM like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotLike(String value) {
            addCriterion("XM not like", value, "xm");
            return (Criteria) this;
        }

        public Criteria andXmIn(List<String> values) {
            addCriterion("XM in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotIn(List<String> values) {
            addCriterion("XM not in", values, "xm");
            return (Criteria) this;
        }

        public Criteria andXmBetween(String value1, String value2) {
            addCriterion("XM between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXmNotBetween(String value1, String value2) {
            addCriterion("XM not between", value1, value2, "xm");
            return (Criteria) this;
        }

        public Criteria andXbIsNull() {
            addCriterion("XB is null");
            return (Criteria) this;
        }

        public Criteria andXbIsNotNull() {
            addCriterion("XB is not null");
            return (Criteria) this;
        }

        public Criteria andXbEqualTo(String value) {
            addCriterion("XB =", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotEqualTo(String value) {
            addCriterion("XB <>", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThan(String value) {
            addCriterion("XB >", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbGreaterThanOrEqualTo(String value) {
            addCriterion("XB >=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThan(String value) {
            addCriterion("XB <", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLessThanOrEqualTo(String value) {
            addCriterion("XB <=", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbLike(String value) {
            addCriterion("XB like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotLike(String value) {
            addCriterion("XB not like", value, "xb");
            return (Criteria) this;
        }

        public Criteria andXbIn(List<String> values) {
            addCriterion("XB in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotIn(List<String> values) {
            addCriterion("XB not in", values, "xb");
            return (Criteria) this;
        }

        public Criteria andXbBetween(String value1, String value2) {
            addCriterion("XB between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andXbNotBetween(String value1, String value2) {
            addCriterion("XB not between", value1, value2, "xb");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("CSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("CSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(Date value) {
            addCriterion("CSRQ =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(Date value) {
            addCriterion("CSRQ <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(Date value) {
            addCriterion("CSRQ >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CSRQ >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(Date value) {
            addCriterion("CSRQ <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(Date value) {
            addCriterion("CSRQ <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<Date> values) {
            addCriterion("CSRQ in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<Date> values) {
            addCriterion("CSRQ not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(Date value1, Date value2) {
            addCriterion("CSRQ between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(Date value1, Date value2) {
            addCriterion("CSRQ not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsdIsNull() {
            addCriterion("CSD is null");
            return (Criteria) this;
        }

        public Criteria andCsdIsNotNull() {
            addCriterion("CSD is not null");
            return (Criteria) this;
        }

        public Criteria andCsdEqualTo(String value) {
            addCriterion("CSD =", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotEqualTo(String value) {
            addCriterion("CSD <>", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThan(String value) {
            addCriterion("CSD >", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdGreaterThanOrEqualTo(String value) {
            addCriterion("CSD >=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThan(String value) {
            addCriterion("CSD <", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLessThanOrEqualTo(String value) {
            addCriterion("CSD <=", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdLike(String value) {
            addCriterion("CSD like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotLike(String value) {
            addCriterion("CSD not like", value, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdIn(List<String> values) {
            addCriterion("CSD in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotIn(List<String> values) {
            addCriterion("CSD not in", values, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdBetween(String value1, String value2) {
            addCriterion("CSD between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andCsdNotBetween(String value1, String value2) {
            addCriterion("CSD not between", value1, value2, "csd");
            return (Criteria) this;
        }

        public Criteria andHjszdIsNull() {
            addCriterion("HJSZD is null");
            return (Criteria) this;
        }

        public Criteria andHjszdIsNotNull() {
            addCriterion("HJSZD is not null");
            return (Criteria) this;
        }

        public Criteria andHjszdEqualTo(String value) {
            addCriterion("HJSZD =", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdNotEqualTo(String value) {
            addCriterion("HJSZD <>", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdGreaterThan(String value) {
            addCriterion("HJSZD >", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdGreaterThanOrEqualTo(String value) {
            addCriterion("HJSZD >=", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdLessThan(String value) {
            addCriterion("HJSZD <", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdLessThanOrEqualTo(String value) {
            addCriterion("HJSZD <=", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdLike(String value) {
            addCriterion("HJSZD like", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdNotLike(String value) {
            addCriterion("HJSZD not like", value, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdIn(List<String> values) {
            addCriterion("HJSZD in", values, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdNotIn(List<String> values) {
            addCriterion("HJSZD not in", values, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdBetween(String value1, String value2) {
            addCriterion("HJSZD between", value1, value2, "hjszd");
            return (Criteria) this;
        }

        public Criteria andHjszdNotBetween(String value1, String value2) {
            addCriterion("HJSZD not between", value1, value2, "hjszd");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNull() {
            addCriterion("SFZH is null");
            return (Criteria) this;
        }

        public Criteria andSfzhIsNotNull() {
            addCriterion("SFZH is not null");
            return (Criteria) this;
        }

        public Criteria andSfzhEqualTo(String value) {
            addCriterion("SFZH =", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotEqualTo(String value) {
            addCriterion("SFZH <>", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThan(String value) {
            addCriterion("SFZH >", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhGreaterThanOrEqualTo(String value) {
            addCriterion("SFZH >=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThan(String value) {
            addCriterion("SFZH <", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLessThanOrEqualTo(String value) {
            addCriterion("SFZH <=", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhLike(String value) {
            addCriterion("SFZH like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotLike(String value) {
            addCriterion("SFZH not like", value, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhIn(List<String> values) {
            addCriterion("SFZH in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotIn(List<String> values) {
            addCriterion("SFZH not in", values, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhBetween(String value1, String value2) {
            addCriterion("SFZH between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSfzhNotBetween(String value1, String value2) {
            addCriterion("SFZH not between", value1, value2, "sfzh");
            return (Criteria) this;
        }

        public Criteria andSsejdwIsNull() {
            addCriterion("SSEJDW is null");
            return (Criteria) this;
        }

        public Criteria andSsejdwIsNotNull() {
            addCriterion("SSEJDW is not null");
            return (Criteria) this;
        }

        public Criteria andSsejdwEqualTo(String value) {
            addCriterion("SSEJDW =", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwNotEqualTo(String value) {
            addCriterion("SSEJDW <>", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwGreaterThan(String value) {
            addCriterion("SSEJDW >", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwGreaterThanOrEqualTo(String value) {
            addCriterion("SSEJDW >=", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwLessThan(String value) {
            addCriterion("SSEJDW <", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwLessThanOrEqualTo(String value) {
            addCriterion("SSEJDW <=", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwLike(String value) {
            addCriterion("SSEJDW like", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwNotLike(String value) {
            addCriterion("SSEJDW not like", value, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwIn(List<String> values) {
            addCriterion("SSEJDW in", values, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwNotIn(List<String> values) {
            addCriterion("SSEJDW not in", values, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwBetween(String value1, String value2) {
            addCriterion("SSEJDW between", value1, value2, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andSsejdwNotBetween(String value1, String value2) {
            addCriterion("SSEJDW not between", value1, value2, "ssejdw");
            return (Criteria) this;
        }

        public Criteria andKsIsNull() {
            addCriterion("KS is null");
            return (Criteria) this;
        }

        public Criteria andKsIsNotNull() {
            addCriterion("KS is not null");
            return (Criteria) this;
        }

        public Criteria andKsEqualTo(String value) {
            addCriterion("KS =", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotEqualTo(String value) {
            addCriterion("KS <>", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThan(String value) {
            addCriterion("KS >", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsGreaterThanOrEqualTo(String value) {
            addCriterion("KS >=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThan(String value) {
            addCriterion("KS <", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLessThanOrEqualTo(String value) {
            addCriterion("KS <=", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsLike(String value) {
            addCriterion("KS like", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotLike(String value) {
            addCriterion("KS not like", value, "ks");
            return (Criteria) this;
        }

        public Criteria andKsIn(List<String> values) {
            addCriterion("KS in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotIn(List<String> values) {
            addCriterion("KS not in", values, "ks");
            return (Criteria) this;
        }

        public Criteria andKsBetween(String value1, String value2) {
            addCriterion("KS between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andKsNotBetween(String value1, String value2) {
            addCriterion("KS not between", value1, value2, "ks");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("ZW is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("ZW is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("ZW =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("ZW <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("ZW >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("ZW >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("ZW <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("ZW <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("ZW like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("ZW not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("ZW in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("ZW not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("ZW between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("ZW not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZcIsNull() {
            addCriterion("ZC is null");
            return (Criteria) this;
        }

        public Criteria andZcIsNotNull() {
            addCriterion("ZC is not null");
            return (Criteria) this;
        }

        public Criteria andZcEqualTo(String value) {
            addCriterion("ZC =", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotEqualTo(String value) {
            addCriterion("ZC <>", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThan(String value) {
            addCriterion("ZC >", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcGreaterThanOrEqualTo(String value) {
            addCriterion("ZC >=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThan(String value) {
            addCriterion("ZC <", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLessThanOrEqualTo(String value) {
            addCriterion("ZC <=", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcLike(String value) {
            addCriterion("ZC like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotLike(String value) {
            addCriterion("ZC not like", value, "zc");
            return (Criteria) this;
        }

        public Criteria andZcIn(List<String> values) {
            addCriterion("ZC in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotIn(List<String> values) {
            addCriterion("ZC not in", values, "zc");
            return (Criteria) this;
        }

        public Criteria andZcBetween(String value1, String value2) {
            addCriterion("ZC between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andZcNotBetween(String value1, String value2) {
            addCriterion("ZC not between", value1, value2, "zc");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNull() {
            addCriterion("LXDH is null");
            return (Criteria) this;
        }

        public Criteria andLxdhIsNotNull() {
            addCriterion("LXDH is not null");
            return (Criteria) this;
        }

        public Criteria andLxdhEqualTo(String value) {
            addCriterion("LXDH =", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotEqualTo(String value) {
            addCriterion("LXDH <>", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThan(String value) {
            addCriterion("LXDH >", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhGreaterThanOrEqualTo(String value) {
            addCriterion("LXDH >=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThan(String value) {
            addCriterion("LXDH <", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLessThanOrEqualTo(String value) {
            addCriterion("LXDH <=", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhLike(String value) {
            addCriterion("LXDH like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotLike(String value) {
            addCriterion("LXDH not like", value, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhIn(List<String> values) {
            addCriterion("LXDH in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotIn(List<String> values) {
            addCriterion("LXDH not in", values, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhBetween(String value1, String value2) {
            addCriterion("LXDH between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andLxdhNotBetween(String value1, String value2) {
            addCriterion("LXDH not between", value1, value2, "lxdh");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNncfcsIsNull() {
            addCriterion("NNCFCS is null");
            return (Criteria) this;
        }

        public Criteria andNncfcsIsNotNull() {
            addCriterion("NNCFCS is not null");
            return (Criteria) this;
        }

        public Criteria andNncfcsEqualTo(BigDecimal value) {
            addCriterion("NNCFCS =", value, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsNotEqualTo(BigDecimal value) {
            addCriterion("NNCFCS <>", value, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsGreaterThan(BigDecimal value) {
            addCriterion("NNCFCS >", value, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NNCFCS >=", value, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsLessThan(BigDecimal value) {
            addCriterion("NNCFCS <", value, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NNCFCS <=", value, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsIn(List<BigDecimal> values) {
            addCriterion("NNCFCS in", values, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsNotIn(List<BigDecimal> values) {
            addCriterion("NNCFCS not in", values, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NNCFCS between", value1, value2, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andNncfcsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NNCFCS not between", value1, value2, "nncfcs");
            return (Criteria) this;
        }

        public Criteria andQtshrzIsNull() {
            addCriterion("QTSHRZ is null");
            return (Criteria) this;
        }

        public Criteria andQtshrzIsNotNull() {
            addCriterion("QTSHRZ is not null");
            return (Criteria) this;
        }

        public Criteria andQtshrzEqualTo(String value) {
            addCriterion("QTSHRZ =", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzNotEqualTo(String value) {
            addCriterion("QTSHRZ <>", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzGreaterThan(String value) {
            addCriterion("QTSHRZ >", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzGreaterThanOrEqualTo(String value) {
            addCriterion("QTSHRZ >=", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzLessThan(String value) {
            addCriterion("QTSHRZ <", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzLessThanOrEqualTo(String value) {
            addCriterion("QTSHRZ <=", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzLike(String value) {
            addCriterion("QTSHRZ like", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzNotLike(String value) {
            addCriterion("QTSHRZ not like", value, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzIn(List<String> values) {
            addCriterion("QTSHRZ in", values, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzNotIn(List<String> values) {
            addCriterion("QTSHRZ not in", values, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzBetween(String value1, String value2) {
            addCriterion("QTSHRZ between", value1, value2, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andQtshrzNotBetween(String value1, String value2) {
            addCriterion("QTSHRZ not between", value1, value2, "qtshrz");
            return (Criteria) this;
        }

        public Criteria andCfgjIsNull() {
            addCriterion("CFGJ is null");
            return (Criteria) this;
        }

        public Criteria andCfgjIsNotNull() {
            addCriterion("CFGJ is not null");
            return (Criteria) this;
        }

        public Criteria andCfgjEqualTo(String value) {
            addCriterion("CFGJ =", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjNotEqualTo(String value) {
            addCriterion("CFGJ <>", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjGreaterThan(String value) {
            addCriterion("CFGJ >", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjGreaterThanOrEqualTo(String value) {
            addCriterion("CFGJ >=", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjLessThan(String value) {
            addCriterion("CFGJ <", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjLessThanOrEqualTo(String value) {
            addCriterion("CFGJ <=", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjLike(String value) {
            addCriterion("CFGJ like", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjNotLike(String value) {
            addCriterion("CFGJ not like", value, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjIn(List<String> values) {
            addCriterion("CFGJ in", values, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjNotIn(List<String> values) {
            addCriterion("CFGJ not in", values, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjBetween(String value1, String value2) {
            addCriterion("CFGJ between", value1, value2, "cfgj");
            return (Criteria) this;
        }

        public Criteria andCfgjNotBetween(String value1, String value2) {
            addCriterion("CFGJ not between", value1, value2, "cfgj");
            return (Criteria) this;
        }

        public Criteria andRjcsIsNull() {
            addCriterion("RJCS is null");
            return (Criteria) this;
        }

        public Criteria andRjcsIsNotNull() {
            addCriterion("RJCS is not null");
            return (Criteria) this;
        }

        public Criteria andRjcsEqualTo(String value) {
            addCriterion("RJCS =", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsNotEqualTo(String value) {
            addCriterion("RJCS <>", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsGreaterThan(String value) {
            addCriterion("RJCS >", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsGreaterThanOrEqualTo(String value) {
            addCriterion("RJCS >=", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsLessThan(String value) {
            addCriterion("RJCS <", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsLessThanOrEqualTo(String value) {
            addCriterion("RJCS <=", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsLike(String value) {
            addCriterion("RJCS like", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsNotLike(String value) {
            addCriterion("RJCS not like", value, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsIn(List<String> values) {
            addCriterion("RJCS in", values, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsNotIn(List<String> values) {
            addCriterion("RJCS not in", values, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsBetween(String value1, String value2) {
            addCriterion("RJCS between", value1, value2, "rjcs");
            return (Criteria) this;
        }

        public Criteria andRjcsNotBetween(String value1, String value2) {
            addCriterion("RJCS not between", value1, value2, "rjcs");
            return (Criteria) this;
        }

        public Criteria andTzidIsNull() {
            addCriterion("TZID is null");
            return (Criteria) this;
        }

        public Criteria andTzidIsNotNull() {
            addCriterion("TZID is not null");
            return (Criteria) this;
        }

        public Criteria andTzidEqualTo(String value) {
            addCriterion("TZID =", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotEqualTo(String value) {
            addCriterion("TZID <>", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidGreaterThan(String value) {
            addCriterion("TZID >", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidGreaterThanOrEqualTo(String value) {
            addCriterion("TZID >=", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLessThan(String value) {
            addCriterion("TZID <", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLessThanOrEqualTo(String value) {
            addCriterion("TZID <=", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLike(String value) {
            addCriterion("TZID like", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotLike(String value) {
            addCriterion("TZID not like", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidIn(List<String> values) {
            addCriterion("TZID in", values, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotIn(List<String> values) {
            addCriterion("TZID not in", values, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidBetween(String value1, String value2) {
            addCriterion("TZID between", value1, value2, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotBetween(String value1, String value2) {
            addCriterion("TZID not between", value1, value2, "tzid");
            return (Criteria) this;
        }

        public Criteria andCfksrqIsNull() {
            addCriterion("CFKSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCfksrqIsNotNull() {
            addCriterion("CFKSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCfksrqEqualTo(Date value) {
            addCriterion("CFKSRQ =", value, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqNotEqualTo(Date value) {
            addCriterion("CFKSRQ <>", value, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqGreaterThan(Date value) {
            addCriterion("CFKSRQ >", value, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CFKSRQ >=", value, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqLessThan(Date value) {
            addCriterion("CFKSRQ <", value, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqLessThanOrEqualTo(Date value) {
            addCriterion("CFKSRQ <=", value, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqIn(List<Date> values) {
            addCriterion("CFKSRQ in", values, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqNotIn(List<Date> values) {
            addCriterion("CFKSRQ not in", values, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqBetween(Date value1, Date value2) {
            addCriterion("CFKSRQ between", value1, value2, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfksrqNotBetween(Date value1, Date value2) {
            addCriterion("CFKSRQ not between", value1, value2, "cfksrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqIsNull() {
            addCriterion("CFJSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCfjsrqIsNotNull() {
            addCriterion("CFJSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCfjsrqEqualTo(Date value) {
            addCriterion("CFJSRQ =", value, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqNotEqualTo(Date value) {
            addCriterion("CFJSRQ <>", value, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqGreaterThan(Date value) {
            addCriterion("CFJSRQ >", value, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("CFJSRQ >=", value, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqLessThan(Date value) {
            addCriterion("CFJSRQ <", value, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqLessThanOrEqualTo(Date value) {
            addCriterion("CFJSRQ <=", value, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqIn(List<Date> values) {
            addCriterion("CFJSRQ in", values, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqNotIn(List<Date> values) {
            addCriterion("CFJSRQ not in", values, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqBetween(Date value1, Date value2) {
            addCriterion("CFJSRQ between", value1, value2, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfjsrqNotBetween(Date value1, Date value2) {
            addCriterion("CFJSRQ not between", value1, value2, "cfjsrq");
            return (Criteria) this;
        }

        public Criteria andCfmdIsNull() {
            addCriterion("CFMD is null");
            return (Criteria) this;
        }

        public Criteria andCfmdIsNotNull() {
            addCriterion("CFMD is not null");
            return (Criteria) this;
        }

        public Criteria andCfmdEqualTo(String value) {
            addCriterion("CFMD =", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotEqualTo(String value) {
            addCriterion("CFMD <>", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdGreaterThan(String value) {
            addCriterion("CFMD >", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdGreaterThanOrEqualTo(String value) {
            addCriterion("CFMD >=", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdLessThan(String value) {
            addCriterion("CFMD <", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdLessThanOrEqualTo(String value) {
            addCriterion("CFMD <=", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdLike(String value) {
            addCriterion("CFMD like", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotLike(String value) {
            addCriterion("CFMD not like", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdIn(List<String> values) {
            addCriterion("CFMD in", values, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotIn(List<String> values) {
            addCriterion("CFMD not in", values, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdBetween(String value1, String value2) {
            addCriterion("CFMD between", value1, value2, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotBetween(String value1, String value2) {
            addCriterion("CFMD not between", value1, value2, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdQtIsNull() {
            addCriterion("CFMD_QT is null");
            return (Criteria) this;
        }

        public Criteria andCfmdQtIsNotNull() {
            addCriterion("CFMD_QT is not null");
            return (Criteria) this;
        }

        public Criteria andCfmdQtEqualTo(String value) {
            addCriterion("CFMD_QT =", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtNotEqualTo(String value) {
            addCriterion("CFMD_QT <>", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtGreaterThan(String value) {
            addCriterion("CFMD_QT >", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtGreaterThanOrEqualTo(String value) {
            addCriterion("CFMD_QT >=", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtLessThan(String value) {
            addCriterion("CFMD_QT <", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtLessThanOrEqualTo(String value) {
            addCriterion("CFMD_QT <=", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtLike(String value) {
            addCriterion("CFMD_QT like", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtNotLike(String value) {
            addCriterion("CFMD_QT not like", value, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtIn(List<String> values) {
            addCriterion("CFMD_QT in", values, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtNotIn(List<String> values) {
            addCriterion("CFMD_QT not in", values, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtBetween(String value1, String value2) {
            addCriterion("CFMD_QT between", value1, value2, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andCfmdQtNotBetween(String value1, String value2) {
            addCriterion("CFMD_QT not between", value1, value2, "cfmdQt");
            return (Criteria) this;
        }

        public Criteria andYqrXmIsNull() {
            addCriterion("YQR_XM is null");
            return (Criteria) this;
        }

        public Criteria andYqrXmIsNotNull() {
            addCriterion("YQR_XM is not null");
            return (Criteria) this;
        }

        public Criteria andYqrXmEqualTo(String value) {
            addCriterion("YQR_XM =", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmNotEqualTo(String value) {
            addCriterion("YQR_XM <>", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmGreaterThan(String value) {
            addCriterion("YQR_XM >", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_XM >=", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmLessThan(String value) {
            addCriterion("YQR_XM <", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmLessThanOrEqualTo(String value) {
            addCriterion("YQR_XM <=", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmLike(String value) {
            addCriterion("YQR_XM like", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmNotLike(String value) {
            addCriterion("YQR_XM not like", value, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmIn(List<String> values) {
            addCriterion("YQR_XM in", values, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmNotIn(List<String> values) {
            addCriterion("YQR_XM not in", values, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmBetween(String value1, String value2) {
            addCriterion("YQR_XM between", value1, value2, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrXmNotBetween(String value1, String value2) {
            addCriterion("YQR_XM not between", value1, value2, "yqrXm");
            return (Criteria) this;
        }

        public Criteria andYqrZwIsNull() {
            addCriterion("YQR_ZW is null");
            return (Criteria) this;
        }

        public Criteria andYqrZwIsNotNull() {
            addCriterion("YQR_ZW is not null");
            return (Criteria) this;
        }

        public Criteria andYqrZwEqualTo(String value) {
            addCriterion("YQR_ZW =", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwNotEqualTo(String value) {
            addCriterion("YQR_ZW <>", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwGreaterThan(String value) {
            addCriterion("YQR_ZW >", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_ZW >=", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwLessThan(String value) {
            addCriterion("YQR_ZW <", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwLessThanOrEqualTo(String value) {
            addCriterion("YQR_ZW <=", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwLike(String value) {
            addCriterion("YQR_ZW like", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwNotLike(String value) {
            addCriterion("YQR_ZW not like", value, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwIn(List<String> values) {
            addCriterion("YQR_ZW in", values, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwNotIn(List<String> values) {
            addCriterion("YQR_ZW not in", values, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwBetween(String value1, String value2) {
            addCriterion("YQR_ZW between", value1, value2, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrZwNotBetween(String value1, String value2) {
            addCriterion("YQR_ZW not between", value1, value2, "yqrZw");
            return (Criteria) this;
        }

        public Criteria andYqrDwIsNull() {
            addCriterion("YQR_DW is null");
            return (Criteria) this;
        }

        public Criteria andYqrDwIsNotNull() {
            addCriterion("YQR_DW is not null");
            return (Criteria) this;
        }

        public Criteria andYqrDwEqualTo(String value) {
            addCriterion("YQR_DW =", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwNotEqualTo(String value) {
            addCriterion("YQR_DW <>", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwGreaterThan(String value) {
            addCriterion("YQR_DW >", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_DW >=", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwLessThan(String value) {
            addCriterion("YQR_DW <", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwLessThanOrEqualTo(String value) {
            addCriterion("YQR_DW <=", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwLike(String value) {
            addCriterion("YQR_DW like", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwNotLike(String value) {
            addCriterion("YQR_DW not like", value, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwIn(List<String> values) {
            addCriterion("YQR_DW in", values, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwNotIn(List<String> values) {
            addCriterion("YQR_DW not in", values, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwBetween(String value1, String value2) {
            addCriterion("YQR_DW between", value1, value2, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrDwNotBetween(String value1, String value2) {
            addCriterion("YQR_DW not between", value1, value2, "yqrDw");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzIsNull() {
            addCriterion("YQR_XXDZ is null");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzIsNotNull() {
            addCriterion("YQR_XXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEqualTo(String value) {
            addCriterion("YQR_XXDZ =", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzNotEqualTo(String value) {
            addCriterion("YQR_XXDZ <>", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzGreaterThan(String value) {
            addCriterion("YQR_XXDZ >", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_XXDZ >=", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzLessThan(String value) {
            addCriterion("YQR_XXDZ <", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzLessThanOrEqualTo(String value) {
            addCriterion("YQR_XXDZ <=", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzLike(String value) {
            addCriterion("YQR_XXDZ like", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzNotLike(String value) {
            addCriterion("YQR_XXDZ not like", value, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzIn(List<String> values) {
            addCriterion("YQR_XXDZ in", values, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzNotIn(List<String> values) {
            addCriterion("YQR_XXDZ not in", values, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzBetween(String value1, String value2) {
            addCriterion("YQR_XXDZ between", value1, value2, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzNotBetween(String value1, String value2) {
            addCriterion("YQR_XXDZ not between", value1, value2, "yqrXxdz");
            return (Criteria) this;
        }

        public Criteria andYqrDhIsNull() {
            addCriterion("YQR_DH is null");
            return (Criteria) this;
        }

        public Criteria andYqrDhIsNotNull() {
            addCriterion("YQR_DH is not null");
            return (Criteria) this;
        }

        public Criteria andYqrDhEqualTo(String value) {
            addCriterion("YQR_DH =", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhNotEqualTo(String value) {
            addCriterion("YQR_DH <>", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhGreaterThan(String value) {
            addCriterion("YQR_DH >", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_DH >=", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhLessThan(String value) {
            addCriterion("YQR_DH <", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhLessThanOrEqualTo(String value) {
            addCriterion("YQR_DH <=", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhLike(String value) {
            addCriterion("YQR_DH like", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhNotLike(String value) {
            addCriterion("YQR_DH not like", value, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhIn(List<String> values) {
            addCriterion("YQR_DH in", values, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhNotIn(List<String> values) {
            addCriterion("YQR_DH not in", values, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhBetween(String value1, String value2) {
            addCriterion("YQR_DH between", value1, value2, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrDhNotBetween(String value1, String value2) {
            addCriterion("YQR_DH not between", value1, value2, "yqrDh");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnIsNull() {
            addCriterion("YQR_XM_EN is null");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnIsNotNull() {
            addCriterion("YQR_XM_EN is not null");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnEqualTo(String value) {
            addCriterion("YQR_XM_EN =", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnNotEqualTo(String value) {
            addCriterion("YQR_XM_EN <>", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnGreaterThan(String value) {
            addCriterion("YQR_XM_EN >", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_XM_EN >=", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnLessThan(String value) {
            addCriterion("YQR_XM_EN <", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnLessThanOrEqualTo(String value) {
            addCriterion("YQR_XM_EN <=", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnLike(String value) {
            addCriterion("YQR_XM_EN like", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnNotLike(String value) {
            addCriterion("YQR_XM_EN not like", value, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnIn(List<String> values) {
            addCriterion("YQR_XM_EN in", values, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnNotIn(List<String> values) {
            addCriterion("YQR_XM_EN not in", values, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnBetween(String value1, String value2) {
            addCriterion("YQR_XM_EN between", value1, value2, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrXmEnNotBetween(String value1, String value2) {
            addCriterion("YQR_XM_EN not between", value1, value2, "yqrXmEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnIsNull() {
            addCriterion("YQR_ZW_EN is null");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnIsNotNull() {
            addCriterion("YQR_ZW_EN is not null");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnEqualTo(String value) {
            addCriterion("YQR_ZW_EN =", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnNotEqualTo(String value) {
            addCriterion("YQR_ZW_EN <>", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnGreaterThan(String value) {
            addCriterion("YQR_ZW_EN >", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_ZW_EN >=", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnLessThan(String value) {
            addCriterion("YQR_ZW_EN <", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnLessThanOrEqualTo(String value) {
            addCriterion("YQR_ZW_EN <=", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnLike(String value) {
            addCriterion("YQR_ZW_EN like", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnNotLike(String value) {
            addCriterion("YQR_ZW_EN not like", value, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnIn(List<String> values) {
            addCriterion("YQR_ZW_EN in", values, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnNotIn(List<String> values) {
            addCriterion("YQR_ZW_EN not in", values, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnBetween(String value1, String value2) {
            addCriterion("YQR_ZW_EN between", value1, value2, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrZwEnNotBetween(String value1, String value2) {
            addCriterion("YQR_ZW_EN not between", value1, value2, "yqrZwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnIsNull() {
            addCriterion("YQR_DW_EN is null");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnIsNotNull() {
            addCriterion("YQR_DW_EN is not null");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnEqualTo(String value) {
            addCriterion("YQR_DW_EN =", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnNotEqualTo(String value) {
            addCriterion("YQR_DW_EN <>", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnGreaterThan(String value) {
            addCriterion("YQR_DW_EN >", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_DW_EN >=", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnLessThan(String value) {
            addCriterion("YQR_DW_EN <", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnLessThanOrEqualTo(String value) {
            addCriterion("YQR_DW_EN <=", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnLike(String value) {
            addCriterion("YQR_DW_EN like", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnNotLike(String value) {
            addCriterion("YQR_DW_EN not like", value, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnIn(List<String> values) {
            addCriterion("YQR_DW_EN in", values, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnNotIn(List<String> values) {
            addCriterion("YQR_DW_EN not in", values, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnBetween(String value1, String value2) {
            addCriterion("YQR_DW_EN between", value1, value2, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrDwEnNotBetween(String value1, String value2) {
            addCriterion("YQR_DW_EN not between", value1, value2, "yqrDwEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnIsNull() {
            addCriterion("YQR_XXDZ_EN is null");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnIsNotNull() {
            addCriterion("YQR_XXDZ_EN is not null");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnEqualTo(String value) {
            addCriterion("YQR_XXDZ_EN =", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnNotEqualTo(String value) {
            addCriterion("YQR_XXDZ_EN <>", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnGreaterThan(String value) {
            addCriterion("YQR_XXDZ_EN >", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_XXDZ_EN >=", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnLessThan(String value) {
            addCriterion("YQR_XXDZ_EN <", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnLessThanOrEqualTo(String value) {
            addCriterion("YQR_XXDZ_EN <=", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnLike(String value) {
            addCriterion("YQR_XXDZ_EN like", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnNotLike(String value) {
            addCriterion("YQR_XXDZ_EN not like", value, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnIn(List<String> values) {
            addCriterion("YQR_XXDZ_EN in", values, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnNotIn(List<String> values) {
            addCriterion("YQR_XXDZ_EN not in", values, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnBetween(String value1, String value2) {
            addCriterion("YQR_XXDZ_EN between", value1, value2, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrXxdzEnNotBetween(String value1, String value2) {
            addCriterion("YQR_XXDZ_EN not between", value1, value2, "yqrXxdzEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnIsNull() {
            addCriterion("YQR_DH_EN is null");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnIsNotNull() {
            addCriterion("YQR_DH_EN is not null");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnEqualTo(String value) {
            addCriterion("YQR_DH_EN =", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnNotEqualTo(String value) {
            addCriterion("YQR_DH_EN <>", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnGreaterThan(String value) {
            addCriterion("YQR_DH_EN >", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnGreaterThanOrEqualTo(String value) {
            addCriterion("YQR_DH_EN >=", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnLessThan(String value) {
            addCriterion("YQR_DH_EN <", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnLessThanOrEqualTo(String value) {
            addCriterion("YQR_DH_EN <=", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnLike(String value) {
            addCriterion("YQR_DH_EN like", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnNotLike(String value) {
            addCriterion("YQR_DH_EN not like", value, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnIn(List<String> values) {
            addCriterion("YQR_DH_EN in", values, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnNotIn(List<String> values) {
            addCriterion("YQR_DH_EN not in", values, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnBetween(String value1, String value2) {
            addCriterion("YQR_DH_EN between", value1, value2, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andYqrDhEnNotBetween(String value1, String value2) {
            addCriterion("YQR_DH_EN not between", value1, value2, "yqrDhEn");
            return (Criteria) this;
        }

        public Criteria andJflyIsNull() {
            addCriterion("JFLY is null");
            return (Criteria) this;
        }

        public Criteria andJflyIsNotNull() {
            addCriterion("JFLY is not null");
            return (Criteria) this;
        }

        public Criteria andJflyEqualTo(String value) {
            addCriterion("JFLY =", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotEqualTo(String value) {
            addCriterion("JFLY <>", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyGreaterThan(String value) {
            addCriterion("JFLY >", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyGreaterThanOrEqualTo(String value) {
            addCriterion("JFLY >=", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyLessThan(String value) {
            addCriterion("JFLY <", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyLessThanOrEqualTo(String value) {
            addCriterion("JFLY <=", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyLike(String value) {
            addCriterion("JFLY like", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotLike(String value) {
            addCriterion("JFLY not like", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyIn(List<String> values) {
            addCriterion("JFLY in", values, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotIn(List<String> values) {
            addCriterion("JFLY not in", values, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyBetween(String value1, String value2) {
            addCriterion("JFLY between", value1, value2, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotBetween(String value1, String value2) {
            addCriterion("JFLY not between", value1, value2, "jfly");
            return (Criteria) this;
        }

        public Criteria andJfysmxIsNull() {
            addCriterion("JFYSMX is null");
            return (Criteria) this;
        }

        public Criteria andJfysmxIsNotNull() {
            addCriterion("JFYSMX is not null");
            return (Criteria) this;
        }

        public Criteria andJfysmxEqualTo(String value) {
            addCriterion("JFYSMX =", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxNotEqualTo(String value) {
            addCriterion("JFYSMX <>", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxGreaterThan(String value) {
            addCriterion("JFYSMX >", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxGreaterThanOrEqualTo(String value) {
            addCriterion("JFYSMX >=", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxLessThan(String value) {
            addCriterion("JFYSMX <", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxLessThanOrEqualTo(String value) {
            addCriterion("JFYSMX <=", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxLike(String value) {
            addCriterion("JFYSMX like", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxNotLike(String value) {
            addCriterion("JFYSMX not like", value, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxIn(List<String> values) {
            addCriterion("JFYSMX in", values, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxNotIn(List<String> values) {
            addCriterion("JFYSMX not in", values, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxBetween(String value1, String value2) {
            addCriterion("JFYSMX between", value1, value2, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfysmxNotBetween(String value1, String value2) {
            addCriterion("JFYSMX not between", value1, value2, "jfysmx");
            return (Criteria) this;
        }

        public Criteria andJfyshjIsNull() {
            addCriterion("JFYSHJ is null");
            return (Criteria) this;
        }

        public Criteria andJfyshjIsNotNull() {
            addCriterion("JFYSHJ is not null");
            return (Criteria) this;
        }

        public Criteria andJfyshjEqualTo(BigDecimal value) {
            addCriterion("JFYSHJ =", value, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjNotEqualTo(BigDecimal value) {
            addCriterion("JFYSHJ <>", value, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjGreaterThan(BigDecimal value) {
            addCriterion("JFYSHJ >", value, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JFYSHJ >=", value, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjLessThan(BigDecimal value) {
            addCriterion("JFYSHJ <", value, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JFYSHJ <=", value, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjIn(List<BigDecimal> values) {
            addCriterion("JFYSHJ in", values, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjNotIn(List<BigDecimal> values) {
            addCriterion("JFYSHJ not in", values, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JFYSHJ between", value1, value2, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andJfyshjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JFYSHJ not between", value1, value2, "jfyshj");
            return (Criteria) this;
        }

        public Criteria andSqbsmIsNull() {
            addCriterion("SQBSM is null");
            return (Criteria) this;
        }

        public Criteria andSqbsmIsNotNull() {
            addCriterion("SQBSM is not null");
            return (Criteria) this;
        }

        public Criteria andSqbsmEqualTo(String value) {
            addCriterion("SQBSM =", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmNotEqualTo(String value) {
            addCriterion("SQBSM <>", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmGreaterThan(String value) {
            addCriterion("SQBSM >", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmGreaterThanOrEqualTo(String value) {
            addCriterion("SQBSM >=", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmLessThan(String value) {
            addCriterion("SQBSM <", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmLessThanOrEqualTo(String value) {
            addCriterion("SQBSM <=", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmLike(String value) {
            addCriterion("SQBSM like", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmNotLike(String value) {
            addCriterion("SQBSM not like", value, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmIn(List<String> values) {
            addCriterion("SQBSM in", values, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmNotIn(List<String> values) {
            addCriterion("SQBSM not in", values, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmBetween(String value1, String value2) {
            addCriterion("SQBSM between", value1, value2, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqbsmNotBetween(String value1, String value2) {
            addCriterion("SQBSM not between", value1, value2, "sqbsm");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNull() {
            addCriterion("SQRQ is null");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNotNull() {
            addCriterion("SQRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSqrqEqualTo(Date value) {
            addCriterion("SQRQ =", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotEqualTo(Date value) {
            addCriterion("SQRQ <>", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThan(Date value) {
            addCriterion("SQRQ >", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SQRQ >=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThan(Date value) {
            addCriterion("SQRQ <", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThanOrEqualTo(Date value) {
            addCriterion("SQRQ <=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqIn(List<Date> values) {
            addCriterion("SQRQ in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotIn(List<Date> values) {
            addCriterion("SQRQ not in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqBetween(Date value1, Date value2) {
            addCriterion("SQRQ between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotBetween(Date value1, Date value2) {
            addCriterion("SQRQ not between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andShjgIsNull() {
            addCriterion("SHJG is null");
            return (Criteria) this;
        }

        public Criteria andShjgIsNotNull() {
            addCriterion("SHJG is not null");
            return (Criteria) this;
        }

        public Criteria andShjgEqualTo(String value) {
            addCriterion("SHJG =", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgNotEqualTo(String value) {
            addCriterion("SHJG <>", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgGreaterThan(String value) {
            addCriterion("SHJG >", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgGreaterThanOrEqualTo(String value) {
            addCriterion("SHJG >=", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgLessThan(String value) {
            addCriterion("SHJG <", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgLessThanOrEqualTo(String value) {
            addCriterion("SHJG <=", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgLike(String value) {
            addCriterion("SHJG like", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgNotLike(String value) {
            addCriterion("SHJG not like", value, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgIn(List<String> values) {
            addCriterion("SHJG in", values, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgNotIn(List<String> values) {
            addCriterion("SHJG not in", values, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgBetween(String value1, String value2) {
            addCriterion("SHJG between", value1, value2, "shjg");
            return (Criteria) this;
        }

        public Criteria andShjgNotBetween(String value1, String value2) {
            addCriterion("SHJG not between", value1, value2, "shjg");
            return (Criteria) this;
        }

        public Criteria andShryIsNull() {
            addCriterion("SHRY is null");
            return (Criteria) this;
        }

        public Criteria andShryIsNotNull() {
            addCriterion("SHRY is not null");
            return (Criteria) this;
        }

        public Criteria andShryEqualTo(String value) {
            addCriterion("SHRY =", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryNotEqualTo(String value) {
            addCriterion("SHRY <>", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryGreaterThan(String value) {
            addCriterion("SHRY >", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryGreaterThanOrEqualTo(String value) {
            addCriterion("SHRY >=", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryLessThan(String value) {
            addCriterion("SHRY <", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryLessThanOrEqualTo(String value) {
            addCriterion("SHRY <=", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryLike(String value) {
            addCriterion("SHRY like", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryNotLike(String value) {
            addCriterion("SHRY not like", value, "shry");
            return (Criteria) this;
        }

        public Criteria andShryIn(List<String> values) {
            addCriterion("SHRY in", values, "shry");
            return (Criteria) this;
        }

        public Criteria andShryNotIn(List<String> values) {
            addCriterion("SHRY not in", values, "shry");
            return (Criteria) this;
        }

        public Criteria andShryBetween(String value1, String value2) {
            addCriterion("SHRY between", value1, value2, "shry");
            return (Criteria) this;
        }

        public Criteria andShryNotBetween(String value1, String value2) {
            addCriterion("SHRY not between", value1, value2, "shry");
            return (Criteria) this;
        }

        public Criteria andShyjIsNull() {
            addCriterion("SHYJ is null");
            return (Criteria) this;
        }

        public Criteria andShyjIsNotNull() {
            addCriterion("SHYJ is not null");
            return (Criteria) this;
        }

        public Criteria andShyjEqualTo(String value) {
            addCriterion("SHYJ =", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotEqualTo(String value) {
            addCriterion("SHYJ <>", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThan(String value) {
            addCriterion("SHYJ >", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjGreaterThanOrEqualTo(String value) {
            addCriterion("SHYJ >=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThan(String value) {
            addCriterion("SHYJ <", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLessThanOrEqualTo(String value) {
            addCriterion("SHYJ <=", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjLike(String value) {
            addCriterion("SHYJ like", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotLike(String value) {
            addCriterion("SHYJ not like", value, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjIn(List<String> values) {
            addCriterion("SHYJ in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotIn(List<String> values) {
            addCriterion("SHYJ not in", values, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjBetween(String value1, String value2) {
            addCriterion("SHYJ between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andShyjNotBetween(String value1, String value2) {
            addCriterion("SHYJ not between", value1, value2, "shyj");
            return (Criteria) this;
        }

        public Criteria andShrqIsNull() {
            addCriterion("SHRQ is null");
            return (Criteria) this;
        }

        public Criteria andShrqIsNotNull() {
            addCriterion("SHRQ is not null");
            return (Criteria) this;
        }

        public Criteria andShrqEqualTo(Date value) {
            addCriterion("SHRQ =", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotEqualTo(Date value) {
            addCriterion("SHRQ <>", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThan(Date value) {
            addCriterion("SHRQ >", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SHRQ >=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThan(Date value) {
            addCriterion("SHRQ <", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqLessThanOrEqualTo(Date value) {
            addCriterion("SHRQ <=", value, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqIn(List<Date> values) {
            addCriterion("SHRQ in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotIn(List<Date> values) {
            addCriterion("SHRQ not in", values, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqBetween(Date value1, Date value2) {
            addCriterion("SHRQ between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andShrqNotBetween(Date value1, Date value2) {
            addCriterion("SHRQ not between", value1, value2, "shrq");
            return (Criteria) this;
        }

        public Criteria andGdwjidIsNull() {
            addCriterion("GDWJID is null");
            return (Criteria) this;
        }

        public Criteria andGdwjidIsNotNull() {
            addCriterion("GDWJID is not null");
            return (Criteria) this;
        }

        public Criteria andGdwjidEqualTo(String value) {
            addCriterion("GDWJID =", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidNotEqualTo(String value) {
            addCriterion("GDWJID <>", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidGreaterThan(String value) {
            addCriterion("GDWJID >", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidGreaterThanOrEqualTo(String value) {
            addCriterion("GDWJID >=", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidLessThan(String value) {
            addCriterion("GDWJID <", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidLessThanOrEqualTo(String value) {
            addCriterion("GDWJID <=", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidLike(String value) {
            addCriterion("GDWJID like", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidNotLike(String value) {
            addCriterion("GDWJID not like", value, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidIn(List<String> values) {
            addCriterion("GDWJID in", values, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidNotIn(List<String> values) {
            addCriterion("GDWJID not in", values, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidBetween(String value1, String value2) {
            addCriterion("GDWJID between", value1, value2, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andGdwjidNotBetween(String value1, String value2) {
            addCriterion("GDWJID not between", value1, value2, "gdwjid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidIsNull() {
            addCriterion("CFZJBGID is null");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidIsNotNull() {
            addCriterion("CFZJBGID is not null");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidEqualTo(String value) {
            addCriterion("CFZJBGID =", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidNotEqualTo(String value) {
            addCriterion("CFZJBGID <>", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidGreaterThan(String value) {
            addCriterion("CFZJBGID >", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidGreaterThanOrEqualTo(String value) {
            addCriterion("CFZJBGID >=", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidLessThan(String value) {
            addCriterion("CFZJBGID <", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidLessThanOrEqualTo(String value) {
            addCriterion("CFZJBGID <=", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidLike(String value) {
            addCriterion("CFZJBGID like", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidNotLike(String value) {
            addCriterion("CFZJBGID not like", value, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidIn(List<String> values) {
            addCriterion("CFZJBGID in", values, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidNotIn(List<String> values) {
            addCriterion("CFZJBGID not in", values, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidBetween(String value1, String value2) {
            addCriterion("CFZJBGID between", value1, value2, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andCfzjbgidNotBetween(String value1, String value2) {
            addCriterion("CFZJBGID not between", value1, value2, "cfzjbgid");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("VALID like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("VALID not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjIsNull() {
            addCriterion("YSFBJZLJJ is null");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjIsNotNull() {
            addCriterion("YSFBJZLJJ is not null");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjEqualTo(String value) {
            addCriterion("YSFBJZLJJ =", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjNotEqualTo(String value) {
            addCriterion("YSFBJZLJJ <>", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjGreaterThan(String value) {
            addCriterion("YSFBJZLJJ >", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjGreaterThanOrEqualTo(String value) {
            addCriterion("YSFBJZLJJ >=", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjLessThan(String value) {
            addCriterion("YSFBJZLJJ <", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjLessThanOrEqualTo(String value) {
            addCriterion("YSFBJZLJJ <=", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjLike(String value) {
            addCriterion("YSFBJZLJJ like", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjNotLike(String value) {
            addCriterion("YSFBJZLJJ not like", value, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjIn(List<String> values) {
            addCriterion("YSFBJZLJJ in", values, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjNotIn(List<String> values) {
            addCriterion("YSFBJZLJJ not in", values, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjBetween(String value1, String value2) {
            addCriterion("YSFBJZLJJ between", value1, value2, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andYsfbjzljjNotBetween(String value1, String value2) {
            addCriterion("YSFBJZLJJ not between", value1, value2, "ysfbjzljj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjIsNull() {
            addCriterion("CFRWJJ is null");
            return (Criteria) this;
        }

        public Criteria andCfrwjjIsNotNull() {
            addCriterion("CFRWJJ is not null");
            return (Criteria) this;
        }

        public Criteria andCfrwjjEqualTo(String value) {
            addCriterion("CFRWJJ =", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjNotEqualTo(String value) {
            addCriterion("CFRWJJ <>", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjGreaterThan(String value) {
            addCriterion("CFRWJJ >", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjGreaterThanOrEqualTo(String value) {
            addCriterion("CFRWJJ >=", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjLessThan(String value) {
            addCriterion("CFRWJJ <", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjLessThanOrEqualTo(String value) {
            addCriterion("CFRWJJ <=", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjLike(String value) {
            addCriterion("CFRWJJ like", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjNotLike(String value) {
            addCriterion("CFRWJJ not like", value, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjIn(List<String> values) {
            addCriterion("CFRWJJ in", values, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjNotIn(List<String> values) {
            addCriterion("CFRWJJ not in", values, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjBetween(String value1, String value2) {
            addCriterion("CFRWJJ between", value1, value2, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfrwjjNotBetween(String value1, String value2) {
            addCriterion("CFRWJJ not between", value1, value2, "cfrwjj");
            return (Criteria) this;
        }

        public Criteria andCfyyIsNull() {
            addCriterion("CFYY is null");
            return (Criteria) this;
        }

        public Criteria andCfyyIsNotNull() {
            addCriterion("CFYY is not null");
            return (Criteria) this;
        }

        public Criteria andCfyyEqualTo(String value) {
            addCriterion("CFYY =", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyNotEqualTo(String value) {
            addCriterion("CFYY <>", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyGreaterThan(String value) {
            addCriterion("CFYY >", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyGreaterThanOrEqualTo(String value) {
            addCriterion("CFYY >=", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyLessThan(String value) {
            addCriterion("CFYY <", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyLessThanOrEqualTo(String value) {
            addCriterion("CFYY <=", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyLike(String value) {
            addCriterion("CFYY like", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyNotLike(String value) {
            addCriterion("CFYY not like", value, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyIn(List<String> values) {
            addCriterion("CFYY in", values, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyNotIn(List<String> values) {
            addCriterion("CFYY not in", values, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyBetween(String value1, String value2) {
            addCriterion("CFYY between", value1, value2, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfyyNotBetween(String value1, String value2) {
            addCriterion("CFYY not between", value1, value2, "cfyy");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidIsNull() {
            addCriterion("CFGSXXBID is null");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidIsNotNull() {
            addCriterion("CFGSXXBID is not null");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidEqualTo(String value) {
            addCriterion("CFGSXXBID =", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidNotEqualTo(String value) {
            addCriterion("CFGSXXBID <>", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidGreaterThan(String value) {
            addCriterion("CFGSXXBID >", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidGreaterThanOrEqualTo(String value) {
            addCriterion("CFGSXXBID >=", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidLessThan(String value) {
            addCriterion("CFGSXXBID <", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidLessThanOrEqualTo(String value) {
            addCriterion("CFGSXXBID <=", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidLike(String value) {
            addCriterion("CFGSXXBID like", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidNotLike(String value) {
            addCriterion("CFGSXXBID not like", value, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidIn(List<String> values) {
            addCriterion("CFGSXXBID in", values, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidNotIn(List<String> values) {
            addCriterion("CFGSXXBID not in", values, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidBetween(String value1, String value2) {
            addCriterion("CFGSXXBID between", value1, value2, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfgsxxbidNotBetween(String value1, String value2) {
            addCriterion("CFGSXXBID not between", value1, value2, "cfgsxxbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidIsNull() {
            addCriterion("CFRCBID is null");
            return (Criteria) this;
        }

        public Criteria andCfrcbidIsNotNull() {
            addCriterion("CFRCBID is not null");
            return (Criteria) this;
        }

        public Criteria andCfrcbidEqualTo(String value) {
            addCriterion("CFRCBID =", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidNotEqualTo(String value) {
            addCriterion("CFRCBID <>", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidGreaterThan(String value) {
            addCriterion("CFRCBID >", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidGreaterThanOrEqualTo(String value) {
            addCriterion("CFRCBID >=", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidLessThan(String value) {
            addCriterion("CFRCBID <", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidLessThanOrEqualTo(String value) {
            addCriterion("CFRCBID <=", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidLike(String value) {
            addCriterion("CFRCBID like", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidNotLike(String value) {
            addCriterion("CFRCBID not like", value, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidIn(List<String> values) {
            addCriterion("CFRCBID in", values, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidNotIn(List<String> values) {
            addCriterion("CFRCBID not in", values, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidBetween(String value1, String value2) {
            addCriterion("CFRCBID between", value1, value2, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andCfrcbidNotBetween(String value1, String value2) {
            addCriterion("CFRCBID not between", value1, value2, "cfrcbid");
            return (Criteria) this;
        }

        public Criteria andYqhidIsNull() {
            addCriterion("YQHID is null");
            return (Criteria) this;
        }

        public Criteria andYqhidIsNotNull() {
            addCriterion("YQHID is not null");
            return (Criteria) this;
        }

        public Criteria andYqhidEqualTo(String value) {
            addCriterion("YQHID =", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidNotEqualTo(String value) {
            addCriterion("YQHID <>", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidGreaterThan(String value) {
            addCriterion("YQHID >", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidGreaterThanOrEqualTo(String value) {
            addCriterion("YQHID >=", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidLessThan(String value) {
            addCriterion("YQHID <", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidLessThanOrEqualTo(String value) {
            addCriterion("YQHID <=", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidLike(String value) {
            addCriterion("YQHID like", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidNotLike(String value) {
            addCriterion("YQHID not like", value, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidIn(List<String> values) {
            addCriterion("YQHID in", values, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidNotIn(List<String> values) {
            addCriterion("YQHID not in", values, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidBetween(String value1, String value2) {
            addCriterion("YQHID between", value1, value2, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYqhidNotBetween(String value1, String value2) {
            addCriterion("YQHID not between", value1, value2, "yqhid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidIsNull() {
            addCriterion("YSQFYJID is null");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidIsNotNull() {
            addCriterion("YSQFYJID is not null");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidEqualTo(String value) {
            addCriterion("YSQFYJID =", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidNotEqualTo(String value) {
            addCriterion("YSQFYJID <>", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidGreaterThan(String value) {
            addCriterion("YSQFYJID >", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidGreaterThanOrEqualTo(String value) {
            addCriterion("YSQFYJID >=", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidLessThan(String value) {
            addCriterion("YSQFYJID <", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidLessThanOrEqualTo(String value) {
            addCriterion("YSQFYJID <=", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidLike(String value) {
            addCriterion("YSQFYJID like", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidNotLike(String value) {
            addCriterion("YSQFYJID not like", value, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidIn(List<String> values) {
            addCriterion("YSQFYJID in", values, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidNotIn(List<String> values) {
            addCriterion("YSQFYJID not in", values, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidBetween(String value1, String value2) {
            addCriterion("YSQFYJID between", value1, value2, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andYsqfyjidNotBetween(String value1, String value2) {
            addCriterion("YSQFYJID not between", value1, value2, "ysqfyjid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidIsNull() {
            addCriterion("CGRWHYSSPYJBID is null");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidIsNotNull() {
            addCriterion("CGRWHYSSPYJBID is not null");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidEqualTo(String value) {
            addCriterion("CGRWHYSSPYJBID =", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidNotEqualTo(String value) {
            addCriterion("CGRWHYSSPYJBID <>", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidGreaterThan(String value) {
            addCriterion("CGRWHYSSPYJBID >", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidGreaterThanOrEqualTo(String value) {
            addCriterion("CGRWHYSSPYJBID >=", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidLessThan(String value) {
            addCriterion("CGRWHYSSPYJBID <", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidLessThanOrEqualTo(String value) {
            addCriterion("CGRWHYSSPYJBID <=", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidLike(String value) {
            addCriterion("CGRWHYSSPYJBID like", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidNotLike(String value) {
            addCriterion("CGRWHYSSPYJBID not like", value, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidIn(List<String> values) {
            addCriterion("CGRWHYSSPYJBID in", values, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidNotIn(List<String> values) {
            addCriterion("CGRWHYSSPYJBID not in", values, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidBetween(String value1, String value2) {
            addCriterion("CGRWHYSSPYJBID between", value1, value2, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andCgrwhysspyjbidNotBetween(String value1, String value2) {
            addCriterion("CGRWHYSSPYJBID not between", value1, value2, "cgrwhysspyjbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidIsNull() {
            addCriterion("XNSQBID is null");
            return (Criteria) this;
        }

        public Criteria andXnsqbidIsNotNull() {
            addCriterion("XNSQBID is not null");
            return (Criteria) this;
        }

        public Criteria andXnsqbidEqualTo(String value) {
            addCriterion("XNSQBID =", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidNotEqualTo(String value) {
            addCriterion("XNSQBID <>", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidGreaterThan(String value) {
            addCriterion("XNSQBID >", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidGreaterThanOrEqualTo(String value) {
            addCriterion("XNSQBID >=", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidLessThan(String value) {
            addCriterion("XNSQBID <", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidLessThanOrEqualTo(String value) {
            addCriterion("XNSQBID <=", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidLike(String value) {
            addCriterion("XNSQBID like", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidNotLike(String value) {
            addCriterion("XNSQBID not like", value, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidIn(List<String> values) {
            addCriterion("XNSQBID in", values, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidNotIn(List<String> values) {
            addCriterion("XNSQBID not in", values, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidBetween(String value1, String value2) {
            addCriterion("XNSQBID between", value1, value2, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andXnsqbidNotBetween(String value1, String value2) {
            addCriterion("XNSQBID not between", value1, value2, "xnsqbid");
            return (Criteria) this;
        }

        public Criteria andCfscIsNull() {
            addCriterion("CFSC is null");
            return (Criteria) this;
        }

        public Criteria andCfscIsNotNull() {
            addCriterion("CFSC is not null");
            return (Criteria) this;
        }

        public Criteria andCfscEqualTo(String value) {
            addCriterion("CFSC =", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscNotEqualTo(String value) {
            addCriterion("CFSC <>", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscGreaterThan(String value) {
            addCriterion("CFSC >", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscGreaterThanOrEqualTo(String value) {
            addCriterion("CFSC >=", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscLessThan(String value) {
            addCriterion("CFSC <", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscLessThanOrEqualTo(String value) {
            addCriterion("CFSC <=", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscLike(String value) {
            addCriterion("CFSC like", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscNotLike(String value) {
            addCriterion("CFSC not like", value, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscIn(List<String> values) {
            addCriterion("CFSC in", values, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscNotIn(List<String> values) {
            addCriterion("CFSC not in", values, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscBetween(String value1, String value2) {
            addCriterion("CFSC between", value1, value2, "cfsc");
            return (Criteria) this;
        }

        public Criteria andCfscNotBetween(String value1, String value2) {
            addCriterion("CFSC not between", value1, value2, "cfsc");
            return (Criteria) this;
        }

        public Criteria andJflydsfIsNull() {
            addCriterion("JFLYDSF is null");
            return (Criteria) this;
        }

        public Criteria andJflydsfIsNotNull() {
            addCriterion("JFLYDSF is not null");
            return (Criteria) this;
        }

        public Criteria andJflydsfEqualTo(String value) {
            addCriterion("JFLYDSF =", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfNotEqualTo(String value) {
            addCriterion("JFLYDSF <>", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfGreaterThan(String value) {
            addCriterion("JFLYDSF >", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfGreaterThanOrEqualTo(String value) {
            addCriterion("JFLYDSF >=", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfLessThan(String value) {
            addCriterion("JFLYDSF <", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfLessThanOrEqualTo(String value) {
            addCriterion("JFLYDSF <=", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfLike(String value) {
            addCriterion("JFLYDSF like", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfNotLike(String value) {
            addCriterion("JFLYDSF not like", value, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfIn(List<String> values) {
            addCriterion("JFLYDSF in", values, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfNotIn(List<String> values) {
            addCriterion("JFLYDSF not in", values, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfBetween(String value1, String value2) {
            addCriterion("JFLYDSF between", value1, value2, "jflydsf");
            return (Criteria) this;
        }

        public Criteria andJflydsfNotBetween(String value1, String value2) {
            addCriterion("JFLYDSF not between", value1, value2, "jflydsf");
            return (Criteria) this;
        }
    }

    /**
     * T_CG_DQCGJ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CG_DQCGJ 2019-07-30
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}