package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XmMaxcodeExample {
    /**
     * T_XM_MAXCODE
     */
    protected String orderByClause;

    /**
     * T_XM_MAXCODE
     */
    protected boolean distinct;

    /**
     * T_XM_MAXCODE
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public XmMaxcodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-17
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
     * @mbggenerated 2018-09-17
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_XM_MAXCODE 2018-09-17
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

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(BigDecimal value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(BigDecimal value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(BigDecimal value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(BigDecimal value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<BigDecimal> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<BigDecimal> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMaxcodeIsNull() {
            addCriterion("MAXCODE is null");
            return (Criteria) this;
        }

        public Criteria andMaxcodeIsNotNull() {
            addCriterion("MAXCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcodeEqualTo(BigDecimal value) {
            addCriterion("MAXCODE =", value, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeNotEqualTo(BigDecimal value) {
            addCriterion("MAXCODE <>", value, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeGreaterThan(BigDecimal value) {
            addCriterion("MAXCODE >", value, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXCODE >=", value, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeLessThan(BigDecimal value) {
            addCriterion("MAXCODE <", value, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAXCODE <=", value, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeIn(List<BigDecimal> values) {
            addCriterion("MAXCODE in", values, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeNotIn(List<BigDecimal> values) {
            addCriterion("MAXCODE not in", values, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXCODE between", value1, value2, "maxcode");
            return (Criteria) this;
        }

        public Criteria andMaxcodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAXCODE not between", value1, value2, "maxcode");
            return (Criteria) this;
        }
    }

    /**
     * T_XM_MAXCODE
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_XM_MAXCODE 2018-09-17
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