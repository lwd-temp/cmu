package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgRwzxqkfkParams {
    /**
     * T_CG_RWZXQKFK
     */
    protected String orderByClause;

    /**
     * T_CG_RWZXQKFK
     */
    protected boolean distinct;

    /**
     * T_CG_RWZXQKFK
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public CgRwzxqkfkParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-21
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
     * @mbggenerated 2018-11-21
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_CG_RWZXQKFK 2018-11-21
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

        public Criteria andRwfkIdIsNull() {
            addCriterion("RWFK_ID is null");
            return (Criteria) this;
        }

        public Criteria andRwfkIdIsNotNull() {
            addCriterion("RWFK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRwfkIdEqualTo(String value) {
            addCriterion("RWFK_ID =", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdNotEqualTo(String value) {
            addCriterion("RWFK_ID <>", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdGreaterThan(String value) {
            addCriterion("RWFK_ID >", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdGreaterThanOrEqualTo(String value) {
            addCriterion("RWFK_ID >=", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdLessThan(String value) {
            addCriterion("RWFK_ID <", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdLessThanOrEqualTo(String value) {
            addCriterion("RWFK_ID <=", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdLike(String value) {
            addCriterion("RWFK_ID like", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdNotLike(String value) {
            addCriterion("RWFK_ID not like", value, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdIn(List<String> values) {
            addCriterion("RWFK_ID in", values, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdNotIn(List<String> values) {
            addCriterion("RWFK_ID not in", values, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdBetween(String value1, String value2) {
            addCriterion("RWFK_ID between", value1, value2, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andRwfkIdNotBetween(String value1, String value2) {
            addCriterion("RWFK_ID not between", value1, value2, "rwfkId");
            return (Criteria) this;
        }

        public Criteria andTzdwIsNull() {
            addCriterion("TZDW is null");
            return (Criteria) this;
        }

        public Criteria andTzdwIsNotNull() {
            addCriterion("TZDW is not null");
            return (Criteria) this;
        }

        public Criteria andTzdwEqualTo(String value) {
            addCriterion("TZDW =", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwNotEqualTo(String value) {
            addCriterion("TZDW <>", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwGreaterThan(String value) {
            addCriterion("TZDW >", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwGreaterThanOrEqualTo(String value) {
            addCriterion("TZDW >=", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwLessThan(String value) {
            addCriterion("TZDW <", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwLessThanOrEqualTo(String value) {
            addCriterion("TZDW <=", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwLike(String value) {
            addCriterion("TZDW like", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwNotLike(String value) {
            addCriterion("TZDW not like", value, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwIn(List<String> values) {
            addCriterion("TZDW in", values, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwNotIn(List<String> values) {
            addCriterion("TZDW not in", values, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwBetween(String value1, String value2) {
            addCriterion("TZDW between", value1, value2, "tzdw");
            return (Criteria) this;
        }

        public Criteria andTzdwNotBetween(String value1, String value2) {
            addCriterion("TZDW not between", value1, value2, "tzdw");
            return (Criteria) this;
        }

        public Criteria andCfgjdqIsNull() {
            addCriterion("CFGJDQ is null");
            return (Criteria) this;
        }

        public Criteria andCfgjdqIsNotNull() {
            addCriterion("CFGJDQ is not null");
            return (Criteria) this;
        }

        public Criteria andCfgjdqEqualTo(String value) {
            addCriterion("CFGJDQ =", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqNotEqualTo(String value) {
            addCriterion("CFGJDQ <>", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqGreaterThan(String value) {
            addCriterion("CFGJDQ >", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqGreaterThanOrEqualTo(String value) {
            addCriterion("CFGJDQ >=", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqLessThan(String value) {
            addCriterion("CFGJDQ <", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqLessThanOrEqualTo(String value) {
            addCriterion("CFGJDQ <=", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqLike(String value) {
            addCriterion("CFGJDQ like", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqNotLike(String value) {
            addCriterion("CFGJDQ not like", value, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqIn(List<String> values) {
            addCriterion("CFGJDQ in", values, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqNotIn(List<String> values) {
            addCriterion("CFGJDQ not in", values, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqBetween(String value1, String value2) {
            addCriterion("CFGJDQ between", value1, value2, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andCfgjdqNotBetween(String value1, String value2) {
            addCriterion("CFGJDQ not between", value1, value2, "cfgjdq");
            return (Criteria) this;
        }

        public Criteria andTzxmIsNull() {
            addCriterion("TZXM is null");
            return (Criteria) this;
        }

        public Criteria andTzxmIsNotNull() {
            addCriterion("TZXM is not null");
            return (Criteria) this;
        }

        public Criteria andTzxmEqualTo(String value) {
            addCriterion("TZXM =", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotEqualTo(String value) {
            addCriterion("TZXM <>", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmGreaterThan(String value) {
            addCriterion("TZXM >", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmGreaterThanOrEqualTo(String value) {
            addCriterion("TZXM >=", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmLessThan(String value) {
            addCriterion("TZXM <", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmLessThanOrEqualTo(String value) {
            addCriterion("TZXM <=", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmLike(String value) {
            addCriterion("TZXM like", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotLike(String value) {
            addCriterion("TZXM not like", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmIn(List<String> values) {
            addCriterion("TZXM in", values, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotIn(List<String> values) {
            addCriterion("TZXM not in", values, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmBetween(String value1, String value2) {
            addCriterion("TZXM between", value1, value2, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotBetween(String value1, String value2) {
            addCriterion("TZXM not between", value1, value2, "tzxm");
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

        public Criteria andTzzdwIsNull() {
            addCriterion("TZZDW is null");
            return (Criteria) this;
        }

        public Criteria andTzzdwIsNotNull() {
            addCriterion("TZZDW is not null");
            return (Criteria) this;
        }

        public Criteria andTzzdwEqualTo(String value) {
            addCriterion("TZZDW =", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwNotEqualTo(String value) {
            addCriterion("TZZDW <>", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwGreaterThan(String value) {
            addCriterion("TZZDW >", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwGreaterThanOrEqualTo(String value) {
            addCriterion("TZZDW >=", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwLessThan(String value) {
            addCriterion("TZZDW <", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwLessThanOrEqualTo(String value) {
            addCriterion("TZZDW <=", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwLike(String value) {
            addCriterion("TZZDW like", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwNotLike(String value) {
            addCriterion("TZZDW not like", value, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwIn(List<String> values) {
            addCriterion("TZZDW in", values, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwNotIn(List<String> values) {
            addCriterion("TZZDW not in", values, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwBetween(String value1, String value2) {
            addCriterion("TZZDW between", value1, value2, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzdwNotBetween(String value1, String value2) {
            addCriterion("TZZDW not between", value1, value2, "tzzdw");
            return (Criteria) this;
        }

        public Criteria andTzzwIsNull() {
            addCriterion("TZZW is null");
            return (Criteria) this;
        }

        public Criteria andTzzwIsNotNull() {
            addCriterion("TZZW is not null");
            return (Criteria) this;
        }

        public Criteria andTzzwEqualTo(String value) {
            addCriterion("TZZW =", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotEqualTo(String value) {
            addCriterion("TZZW <>", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwGreaterThan(String value) {
            addCriterion("TZZW >", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwGreaterThanOrEqualTo(String value) {
            addCriterion("TZZW >=", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwLessThan(String value) {
            addCriterion("TZZW <", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwLessThanOrEqualTo(String value) {
            addCriterion("TZZW <=", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwLike(String value) {
            addCriterion("TZZW like", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotLike(String value) {
            addCriterion("TZZW not like", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwIn(List<String> values) {
            addCriterion("TZZW in", values, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotIn(List<String> values) {
            addCriterion("TZZW not in", values, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwBetween(String value1, String value2) {
            addCriterion("TZZW between", value1, value2, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotBetween(String value1, String value2) {
            addCriterion("TZZW not between", value1, value2, "tzzw");
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

        public Criteria andPzcfrwIsNull() {
            addCriterion("PZCFRW is null");
            return (Criteria) this;
        }

        public Criteria andPzcfrwIsNotNull() {
            addCriterion("PZCFRW is not null");
            return (Criteria) this;
        }

        public Criteria andPzcfrwEqualTo(BigDecimal value) {
            addCriterion("PZCFRW =", value, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwNotEqualTo(BigDecimal value) {
            addCriterion("PZCFRW <>", value, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwGreaterThan(BigDecimal value) {
            addCriterion("PZCFRW >", value, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PZCFRW >=", value, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwLessThan(BigDecimal value) {
            addCriterion("PZCFRW <", value, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PZCFRW <=", value, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwIn(List<BigDecimal> values) {
            addCriterion("PZCFRW in", values, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwNotIn(List<BigDecimal> values) {
            addCriterion("PZCFRW not in", values, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PZCFRW between", value1, value2, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcfrwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PZCFRW not between", value1, value2, "pzcfrw");
            return (Criteria) this;
        }

        public Criteria andPzcftsIsNull() {
            addCriterion("PZCFTS is null");
            return (Criteria) this;
        }

        public Criteria andPzcftsIsNotNull() {
            addCriterion("PZCFTS is not null");
            return (Criteria) this;
        }

        public Criteria andPzcftsEqualTo(BigDecimal value) {
            addCriterion("PZCFTS =", value, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsNotEqualTo(BigDecimal value) {
            addCriterion("PZCFTS <>", value, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsGreaterThan(BigDecimal value) {
            addCriterion("PZCFTS >", value, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PZCFTS >=", value, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsLessThan(BigDecimal value) {
            addCriterion("PZCFTS <", value, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PZCFTS <=", value, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsIn(List<BigDecimal> values) {
            addCriterion("PZCFTS in", values, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsNotIn(List<BigDecimal> values) {
            addCriterion("PZCFTS not in", values, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PZCFTS between", value1, value2, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andPzcftsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PZCFTS not between", value1, value2, "pzcfts");
            return (Criteria) this;
        }

        public Criteria andSjcfrsIsNull() {
            addCriterion("SJCFRS is null");
            return (Criteria) this;
        }

        public Criteria andSjcfrsIsNotNull() {
            addCriterion("SJCFRS is not null");
            return (Criteria) this;
        }

        public Criteria andSjcfrsEqualTo(BigDecimal value) {
            addCriterion("SJCFRS =", value, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsNotEqualTo(BigDecimal value) {
            addCriterion("SJCFRS <>", value, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsGreaterThan(BigDecimal value) {
            addCriterion("SJCFRS >", value, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SJCFRS >=", value, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsLessThan(BigDecimal value) {
            addCriterion("SJCFRS <", value, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SJCFRS <=", value, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsIn(List<BigDecimal> values) {
            addCriterion("SJCFRS in", values, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsNotIn(List<BigDecimal> values) {
            addCriterion("SJCFRS not in", values, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJCFRS between", value1, value2, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJCFRS not between", value1, value2, "sjcfrs");
            return (Criteria) this;
        }

        public Criteria andSjcftsIsNull() {
            addCriterion("SJCFTS is null");
            return (Criteria) this;
        }

        public Criteria andSjcftsIsNotNull() {
            addCriterion("SJCFTS is not null");
            return (Criteria) this;
        }

        public Criteria andSjcftsEqualTo(BigDecimal value) {
            addCriterion("SJCFTS =", value, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsNotEqualTo(BigDecimal value) {
            addCriterion("SJCFTS <>", value, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsGreaterThan(BigDecimal value) {
            addCriterion("SJCFTS >", value, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SJCFTS >=", value, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsLessThan(BigDecimal value) {
            addCriterion("SJCFTS <", value, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SJCFTS <=", value, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsIn(List<BigDecimal> values) {
            addCriterion("SJCFTS in", values, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsNotIn(List<BigDecimal> values) {
            addCriterion("SJCFTS not in", values, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJCFTS between", value1, value2, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andSjcftsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJCFTS not between", value1, value2, "sjcfts");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNull() {
            addCriterion("CJSJ is null");
            return (Criteria) this;
        }

        public Criteria andCjsjIsNotNull() {
            addCriterion("CJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjsjEqualTo(Date value) {
            addCriterion("CJSJ =", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotEqualTo(Date value) {
            addCriterion("CJSJ <>", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThan(Date value) {
            addCriterion("CJSJ >", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CJSJ >=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThan(Date value) {
            addCriterion("CJSJ <", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjLessThanOrEqualTo(Date value) {
            addCriterion("CJSJ <=", value, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjIn(List<Date> values) {
            addCriterion("CJSJ in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotIn(List<Date> values) {
            addCriterion("CJSJ not in", values, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjBetween(Date value1, Date value2) {
            addCriterion("CJSJ between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andCjsjNotBetween(Date value1, Date value2) {
            addCriterion("CJSJ not between", value1, value2, "cjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjIsNull() {
            addCriterion("RJSJ is null");
            return (Criteria) this;
        }

        public Criteria andRjsjIsNotNull() {
            addCriterion("RJSJ is not null");
            return (Criteria) this;
        }

        public Criteria andRjsjEqualTo(Date value) {
            addCriterion("RJSJ =", value, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjNotEqualTo(Date value) {
            addCriterion("RJSJ <>", value, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjGreaterThan(Date value) {
            addCriterion("RJSJ >", value, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("RJSJ >=", value, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjLessThan(Date value) {
            addCriterion("RJSJ <", value, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjLessThanOrEqualTo(Date value) {
            addCriterion("RJSJ <=", value, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjIn(List<Date> values) {
            addCriterion("RJSJ in", values, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjNotIn(List<Date> values) {
            addCriterion("RJSJ not in", values, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjBetween(Date value1, Date value2) {
            addCriterion("RJSJ between", value1, value2, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRjsjNotBetween(Date value1, Date value2) {
            addCriterion("RJSJ not between", value1, value2, "rjsj");
            return (Criteria) this;
        }

        public Criteria andRwpjwhIsNull() {
            addCriterion("RWPJWH is null");
            return (Criteria) this;
        }

        public Criteria andRwpjwhIsNotNull() {
            addCriterion("RWPJWH is not null");
            return (Criteria) this;
        }

        public Criteria andRwpjwhEqualTo(String value) {
            addCriterion("RWPJWH =", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotEqualTo(String value) {
            addCriterion("RWPJWH <>", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhGreaterThan(String value) {
            addCriterion("RWPJWH >", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhGreaterThanOrEqualTo(String value) {
            addCriterion("RWPJWH >=", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhLessThan(String value) {
            addCriterion("RWPJWH <", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhLessThanOrEqualTo(String value) {
            addCriterion("RWPJWH <=", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhLike(String value) {
            addCriterion("RWPJWH like", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotLike(String value) {
            addCriterion("RWPJWH not like", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhIn(List<String> values) {
            addCriterion("RWPJWH in", values, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotIn(List<String> values) {
            addCriterion("RWPJWH not in", values, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhBetween(String value1, String value2) {
            addCriterion("RWPJWH between", value1, value2, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotBetween(String value1, String value2) {
            addCriterion("RWPJWH not between", value1, value2, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andCfbtIsNull() {
            addCriterion("CFBT is null");
            return (Criteria) this;
        }

        public Criteria andCfbtIsNotNull() {
            addCriterion("CFBT is not null");
            return (Criteria) this;
        }

        public Criteria andCfbtEqualTo(String value) {
            addCriterion("CFBT =", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotEqualTo(String value) {
            addCriterion("CFBT <>", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtGreaterThan(String value) {
            addCriterion("CFBT >", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtGreaterThanOrEqualTo(String value) {
            addCriterion("CFBT >=", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtLessThan(String value) {
            addCriterion("CFBT <", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtLessThanOrEqualTo(String value) {
            addCriterion("CFBT <=", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtLike(String value) {
            addCriterion("CFBT like", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotLike(String value) {
            addCriterion("CFBT not like", value, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtIn(List<String> values) {
            addCriterion("CFBT in", values, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotIn(List<String> values) {
            addCriterion("CFBT not in", values, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtBetween(String value1, String value2) {
            addCriterion("CFBT between", value1, value2, "cfbt");
            return (Criteria) this;
        }

        public Criteria andCfbtNotBetween(String value1, String value2) {
            addCriterion("CFBT not between", value1, value2, "cfbt");
            return (Criteria) this;
        }

        public Criteria andRwzxqkIsNull() {
            addCriterion("RWZXQK is null");
            return (Criteria) this;
        }

        public Criteria andRwzxqkIsNotNull() {
            addCriterion("RWZXQK is not null");
            return (Criteria) this;
        }

        public Criteria andRwzxqkEqualTo(String value) {
            addCriterion("RWZXQK =", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkNotEqualTo(String value) {
            addCriterion("RWZXQK <>", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkGreaterThan(String value) {
            addCriterion("RWZXQK >", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkGreaterThanOrEqualTo(String value) {
            addCriterion("RWZXQK >=", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkLessThan(String value) {
            addCriterion("RWZXQK <", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkLessThanOrEqualTo(String value) {
            addCriterion("RWZXQK <=", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkLike(String value) {
            addCriterion("RWZXQK like", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkNotLike(String value) {
            addCriterion("RWZXQK not like", value, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkIn(List<String> values) {
            addCriterion("RWZXQK in", values, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkNotIn(List<String> values) {
            addCriterion("RWZXQK not in", values, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkBetween(String value1, String value2) {
            addCriterion("RWZXQK between", value1, value2, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwzxqkNotBetween(String value1, String value2) {
            addCriterion("RWZXQK not between", value1, value2, "rwzxqk");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrIsNull() {
            addCriterion("RWWWCNR is null");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrIsNotNull() {
            addCriterion("RWWWCNR is not null");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrEqualTo(String value) {
            addCriterion("RWWWCNR =", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrNotEqualTo(String value) {
            addCriterion("RWWWCNR <>", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrGreaterThan(String value) {
            addCriterion("RWWWCNR >", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrGreaterThanOrEqualTo(String value) {
            addCriterion("RWWWCNR >=", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrLessThan(String value) {
            addCriterion("RWWWCNR <", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrLessThanOrEqualTo(String value) {
            addCriterion("RWWWCNR <=", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrLike(String value) {
            addCriterion("RWWWCNR like", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrNotLike(String value) {
            addCriterion("RWWWCNR not like", value, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrIn(List<String> values) {
            addCriterion("RWWWCNR in", values, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrNotIn(List<String> values) {
            addCriterion("RWWWCNR not in", values, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrBetween(String value1, String value2) {
            addCriterion("RWWWCNR between", value1, value2, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andRwwwcnrNotBetween(String value1, String value2) {
            addCriterion("RWWWCNR not between", value1, value2, "rwwwcnr");
            return (Criteria) this;
        }

        public Criteria andTbrIsNull() {
            addCriterion("TBR is null");
            return (Criteria) this;
        }

        public Criteria andTbrIsNotNull() {
            addCriterion("TBR is not null");
            return (Criteria) this;
        }

        public Criteria andTbrEqualTo(String value) {
            addCriterion("TBR =", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotEqualTo(String value) {
            addCriterion("TBR <>", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrGreaterThan(String value) {
            addCriterion("TBR >", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrGreaterThanOrEqualTo(String value) {
            addCriterion("TBR >=", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrLessThan(String value) {
            addCriterion("TBR <", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrLessThanOrEqualTo(String value) {
            addCriterion("TBR <=", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrLike(String value) {
            addCriterion("TBR like", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotLike(String value) {
            addCriterion("TBR not like", value, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrIn(List<String> values) {
            addCriterion("TBR in", values, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotIn(List<String> values) {
            addCriterion("TBR not in", values, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrBetween(String value1, String value2) {
            addCriterion("TBR between", value1, value2, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrNotBetween(String value1, String value2) {
            addCriterion("TBR not between", value1, value2, "tbr");
            return (Criteria) this;
        }

        public Criteria andTbrDhIsNull() {
            addCriterion("TBR_DH is null");
            return (Criteria) this;
        }

        public Criteria andTbrDhIsNotNull() {
            addCriterion("TBR_DH is not null");
            return (Criteria) this;
        }

        public Criteria andTbrDhEqualTo(String value) {
            addCriterion("TBR_DH =", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhNotEqualTo(String value) {
            addCriterion("TBR_DH <>", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhGreaterThan(String value) {
            addCriterion("TBR_DH >", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhGreaterThanOrEqualTo(String value) {
            addCriterion("TBR_DH >=", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhLessThan(String value) {
            addCriterion("TBR_DH <", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhLessThanOrEqualTo(String value) {
            addCriterion("TBR_DH <=", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhLike(String value) {
            addCriterion("TBR_DH like", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhNotLike(String value) {
            addCriterion("TBR_DH not like", value, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhIn(List<String> values) {
            addCriterion("TBR_DH in", values, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhNotIn(List<String> values) {
            addCriterion("TBR_DH not in", values, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhBetween(String value1, String value2) {
            addCriterion("TBR_DH between", value1, value2, "tbrDh");
            return (Criteria) this;
        }

        public Criteria andTbrDhNotBetween(String value1, String value2) {
            addCriterion("TBR_DH not between", value1, value2, "tbrDh");
            return (Criteria) this;
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
    }

    /**
     * T_CG_RWZXQKFK
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CG_RWZXQKFK 2018-11-21
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