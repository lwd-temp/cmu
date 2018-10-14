package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.List;

public class BjsjxxParams {
    /**
     * V_BJSJXX
     */
    protected String orderByClause;

    /**
     * V_BJSJXX
     */
    protected boolean distinct;

    /**
     * V_BJSJXX
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public BjsjxxParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-14
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
     * @mbggenerated 2018-10-14
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * V_BJSJXX 2018-10-14
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

        public Criteria andDwhIsNull() {
            addCriterion("DWH is null");
            return (Criteria) this;
        }

        public Criteria andDwhIsNotNull() {
            addCriterion("DWH is not null");
            return (Criteria) this;
        }

        public Criteria andDwhEqualTo(String value) {
            addCriterion("DWH =", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotEqualTo(String value) {
            addCriterion("DWH <>", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThan(String value) {
            addCriterion("DWH >", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThanOrEqualTo(String value) {
            addCriterion("DWH >=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThan(String value) {
            addCriterion("DWH <", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThanOrEqualTo(String value) {
            addCriterion("DWH <=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLike(String value) {
            addCriterion("DWH like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotLike(String value) {
            addCriterion("DWH not like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhIn(List<String> values) {
            addCriterion("DWH in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotIn(List<String> values) {
            addCriterion("DWH not in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhBetween(String value1, String value2) {
            addCriterion("DWH between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotBetween(String value1, String value2) {
            addCriterion("DWH not between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andBhIsNull() {
            addCriterion("BH is null");
            return (Criteria) this;
        }

        public Criteria andBhIsNotNull() {
            addCriterion("BH is not null");
            return (Criteria) this;
        }

        public Criteria andBhEqualTo(String value) {
            addCriterion("BH =", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotEqualTo(String value) {
            addCriterion("BH <>", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThan(String value) {
            addCriterion("BH >", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhGreaterThanOrEqualTo(String value) {
            addCriterion("BH >=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThan(String value) {
            addCriterion("BH <", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLessThanOrEqualTo(String value) {
            addCriterion("BH <=", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhLike(String value) {
            addCriterion("BH like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotLike(String value) {
            addCriterion("BH not like", value, "bh");
            return (Criteria) this;
        }

        public Criteria andBhIn(List<String> values) {
            addCriterion("BH in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotIn(List<String> values) {
            addCriterion("BH not in", values, "bh");
            return (Criteria) this;
        }

        public Criteria andBhBetween(String value1, String value2) {
            addCriterion("BH between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBhNotBetween(String value1, String value2) {
            addCriterion("BH not between", value1, value2, "bh");
            return (Criteria) this;
        }

        public Criteria andBjIsNull() {
            addCriterion("BJ is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("BJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("BJ =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("BJ <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("BJ >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("BJ >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("BJ <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("BJ <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("BJ like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("BJ not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("BJ in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("BJ not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("BJ between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("BJ not between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andJbnyIsNull() {
            addCriterion("JBNY is null");
            return (Criteria) this;
        }

        public Criteria andJbnyIsNotNull() {
            addCriterion("JBNY is not null");
            return (Criteria) this;
        }

        public Criteria andJbnyEqualTo(String value) {
            addCriterion("JBNY =", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyNotEqualTo(String value) {
            addCriterion("JBNY <>", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyGreaterThan(String value) {
            addCriterion("JBNY >", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyGreaterThanOrEqualTo(String value) {
            addCriterion("JBNY >=", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyLessThan(String value) {
            addCriterion("JBNY <", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyLessThanOrEqualTo(String value) {
            addCriterion("JBNY <=", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyLike(String value) {
            addCriterion("JBNY like", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyNotLike(String value) {
            addCriterion("JBNY not like", value, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyIn(List<String> values) {
            addCriterion("JBNY in", values, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyNotIn(List<String> values) {
            addCriterion("JBNY not in", values, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyBetween(String value1, String value2) {
            addCriterion("JBNY between", value1, value2, "jbny");
            return (Criteria) this;
        }

        public Criteria andJbnyNotBetween(String value1, String value2) {
            addCriterion("JBNY not between", value1, value2, "jbny");
            return (Criteria) this;
        }

        public Criteria andBzrghIsNull() {
            addCriterion("BZRGH is null");
            return (Criteria) this;
        }

        public Criteria andBzrghIsNotNull() {
            addCriterion("BZRGH is not null");
            return (Criteria) this;
        }

        public Criteria andBzrghEqualTo(String value) {
            addCriterion("BZRGH =", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghNotEqualTo(String value) {
            addCriterion("BZRGH <>", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghGreaterThan(String value) {
            addCriterion("BZRGH >", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghGreaterThanOrEqualTo(String value) {
            addCriterion("BZRGH >=", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghLessThan(String value) {
            addCriterion("BZRGH <", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghLessThanOrEqualTo(String value) {
            addCriterion("BZRGH <=", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghLike(String value) {
            addCriterion("BZRGH like", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghNotLike(String value) {
            addCriterion("BZRGH not like", value, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghIn(List<String> values) {
            addCriterion("BZRGH in", values, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghNotIn(List<String> values) {
            addCriterion("BZRGH not in", values, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghBetween(String value1, String value2) {
            addCriterion("BZRGH between", value1, value2, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzrghNotBetween(String value1, String value2) {
            addCriterion("BZRGH not between", value1, value2, "bzrgh");
            return (Criteria) this;
        }

        public Criteria andBzxhIsNull() {
            addCriterion("BZXH is null");
            return (Criteria) this;
        }

        public Criteria andBzxhIsNotNull() {
            addCriterion("BZXH is not null");
            return (Criteria) this;
        }

        public Criteria andBzxhEqualTo(String value) {
            addCriterion("BZXH =", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhNotEqualTo(String value) {
            addCriterion("BZXH <>", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhGreaterThan(String value) {
            addCriterion("BZXH >", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhGreaterThanOrEqualTo(String value) {
            addCriterion("BZXH >=", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhLessThan(String value) {
            addCriterion("BZXH <", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhLessThanOrEqualTo(String value) {
            addCriterion("BZXH <=", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhLike(String value) {
            addCriterion("BZXH like", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhNotLike(String value) {
            addCriterion("BZXH not like", value, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhIn(List<String> values) {
            addCriterion("BZXH in", values, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhNotIn(List<String> values) {
            addCriterion("BZXH not in", values, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhBetween(String value1, String value2) {
            addCriterion("BZXH between", value1, value2, "bzxh");
            return (Criteria) this;
        }

        public Criteria andBzxhNotBetween(String value1, String value2) {
            addCriterion("BZXH not between", value1, value2, "bzxh");
            return (Criteria) this;
        }

        public Criteria andFdyhIsNull() {
            addCriterion("FDYH is null");
            return (Criteria) this;
        }

        public Criteria andFdyhIsNotNull() {
            addCriterion("FDYH is not null");
            return (Criteria) this;
        }

        public Criteria andFdyhEqualTo(String value) {
            addCriterion("FDYH =", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhNotEqualTo(String value) {
            addCriterion("FDYH <>", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhGreaterThan(String value) {
            addCriterion("FDYH >", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhGreaterThanOrEqualTo(String value) {
            addCriterion("FDYH >=", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhLessThan(String value) {
            addCriterion("FDYH <", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhLessThanOrEqualTo(String value) {
            addCriterion("FDYH <=", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhLike(String value) {
            addCriterion("FDYH like", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhNotLike(String value) {
            addCriterion("FDYH not like", value, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhIn(List<String> values) {
            addCriterion("FDYH in", values, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhNotIn(List<String> values) {
            addCriterion("FDYH not in", values, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhBetween(String value1, String value2) {
            addCriterion("FDYH between", value1, value2, "fdyh");
            return (Criteria) this;
        }

        public Criteria andFdyhNotBetween(String value1, String value2) {
            addCriterion("FDYH not between", value1, value2, "fdyh");
            return (Criteria) this;
        }

        public Criteria andSszyIsNull() {
            addCriterion("SSZY is null");
            return (Criteria) this;
        }

        public Criteria andSszyIsNotNull() {
            addCriterion("SSZY is not null");
            return (Criteria) this;
        }

        public Criteria andSszyEqualTo(String value) {
            addCriterion("SSZY =", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotEqualTo(String value) {
            addCriterion("SSZY <>", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyGreaterThan(String value) {
            addCriterion("SSZY >", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyGreaterThanOrEqualTo(String value) {
            addCriterion("SSZY >=", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyLessThan(String value) {
            addCriterion("SSZY <", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyLessThanOrEqualTo(String value) {
            addCriterion("SSZY <=", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyLike(String value) {
            addCriterion("SSZY like", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotLike(String value) {
            addCriterion("SSZY not like", value, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyIn(List<String> values) {
            addCriterion("SSZY in", values, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotIn(List<String> values) {
            addCriterion("SSZY not in", values, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyBetween(String value1, String value2) {
            addCriterion("SSZY between", value1, value2, "sszy");
            return (Criteria) this;
        }

        public Criteria andSszyNotBetween(String value1, String value2) {
            addCriterion("SSZY not between", value1, value2, "sszy");
            return (Criteria) this;
        }

        public Criteria andSsnjIsNull() {
            addCriterion("SSNJ is null");
            return (Criteria) this;
        }

        public Criteria andSsnjIsNotNull() {
            addCriterion("SSNJ is not null");
            return (Criteria) this;
        }

        public Criteria andSsnjEqualTo(String value) {
            addCriterion("SSNJ =", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjNotEqualTo(String value) {
            addCriterion("SSNJ <>", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjGreaterThan(String value) {
            addCriterion("SSNJ >", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjGreaterThanOrEqualTo(String value) {
            addCriterion("SSNJ >=", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjLessThan(String value) {
            addCriterion("SSNJ <", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjLessThanOrEqualTo(String value) {
            addCriterion("SSNJ <=", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjLike(String value) {
            addCriterion("SSNJ like", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjNotLike(String value) {
            addCriterion("SSNJ not like", value, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjIn(List<String> values) {
            addCriterion("SSNJ in", values, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjNotIn(List<String> values) {
            addCriterion("SSNJ not in", values, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjBetween(String value1, String value2) {
            addCriterion("SSNJ between", value1, value2, "ssnj");
            return (Criteria) this;
        }

        public Criteria andSsnjNotBetween(String value1, String value2) {
            addCriterion("SSNJ not between", value1, value2, "ssnj");
            return (Criteria) this;
        }

        public Criteria andXslbIsNull() {
            addCriterion("XSLB is null");
            return (Criteria) this;
        }

        public Criteria andXslbIsNotNull() {
            addCriterion("XSLB is not null");
            return (Criteria) this;
        }

        public Criteria andXslbEqualTo(String value) {
            addCriterion("XSLB =", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotEqualTo(String value) {
            addCriterion("XSLB <>", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbGreaterThan(String value) {
            addCriterion("XSLB >", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbGreaterThanOrEqualTo(String value) {
            addCriterion("XSLB >=", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLessThan(String value) {
            addCriterion("XSLB <", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLessThanOrEqualTo(String value) {
            addCriterion("XSLB <=", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbLike(String value) {
            addCriterion("XSLB like", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotLike(String value) {
            addCriterion("XSLB not like", value, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbIn(List<String> values) {
            addCriterion("XSLB in", values, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotIn(List<String> values) {
            addCriterion("XSLB not in", values, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbBetween(String value1, String value2) {
            addCriterion("XSLB between", value1, value2, "xslb");
            return (Criteria) this;
        }

        public Criteria andXslbNotBetween(String value1, String value2) {
            addCriterion("XSLB not between", value1, value2, "xslb");
            return (Criteria) this;
        }

        public Criteria andQybzIsNull() {
            addCriterion("QYBZ is null");
            return (Criteria) this;
        }

        public Criteria andQybzIsNotNull() {
            addCriterion("QYBZ is not null");
            return (Criteria) this;
        }

        public Criteria andQybzEqualTo(String value) {
            addCriterion("QYBZ =", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzNotEqualTo(String value) {
            addCriterion("QYBZ <>", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzGreaterThan(String value) {
            addCriterion("QYBZ >", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzGreaterThanOrEqualTo(String value) {
            addCriterion("QYBZ >=", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzLessThan(String value) {
            addCriterion("QYBZ <", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzLessThanOrEqualTo(String value) {
            addCriterion("QYBZ <=", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzLike(String value) {
            addCriterion("QYBZ like", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzNotLike(String value) {
            addCriterion("QYBZ not like", value, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzIn(List<String> values) {
            addCriterion("QYBZ in", values, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzNotIn(List<String> values) {
            addCriterion("QYBZ not in", values, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzBetween(String value1, String value2) {
            addCriterion("QYBZ between", value1, value2, "qybz");
            return (Criteria) this;
        }

        public Criteria andQybzNotBetween(String value1, String value2) {
            addCriterion("QYBZ not between", value1, value2, "qybz");
            return (Criteria) this;
        }

        public Criteria andSfddbIsNull() {
            addCriterion("SFDDB is null");
            return (Criteria) this;
        }

        public Criteria andSfddbIsNotNull() {
            addCriterion("SFDDB is not null");
            return (Criteria) this;
        }

        public Criteria andSfddbEqualTo(String value) {
            addCriterion("SFDDB =", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbNotEqualTo(String value) {
            addCriterion("SFDDB <>", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbGreaterThan(String value) {
            addCriterion("SFDDB >", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbGreaterThanOrEqualTo(String value) {
            addCriterion("SFDDB >=", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbLessThan(String value) {
            addCriterion("SFDDB <", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbLessThanOrEqualTo(String value) {
            addCriterion("SFDDB <=", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbLike(String value) {
            addCriterion("SFDDB like", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbNotLike(String value) {
            addCriterion("SFDDB not like", value, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbIn(List<String> values) {
            addCriterion("SFDDB in", values, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbNotIn(List<String> values) {
            addCriterion("SFDDB not in", values, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbBetween(String value1, String value2) {
            addCriterion("SFDDB between", value1, value2, "sfddb");
            return (Criteria) this;
        }

        public Criteria andSfddbNotBetween(String value1, String value2) {
            addCriterion("SFDDB not between", value1, value2, "sfddb");
            return (Criteria) this;
        }
    }

    /**
     * V_BJSJXX
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * V_BJSJXX 2018-10-14
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