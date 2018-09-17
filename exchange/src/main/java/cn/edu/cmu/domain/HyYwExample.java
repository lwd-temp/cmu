package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HyYwExample {
    /**
     * T_HZ_YW
     */
    protected String orderByClause;

    /**
     * T_HZ_YW
     */
    protected boolean distinct;

    /**
     * T_HZ_YW
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public HyYwExample() {
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
     * T_HZ_YW 2018-09-17
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

        public Criteria andYwidIsNull() {
            addCriterion("YWID is null");
            return (Criteria) this;
        }

        public Criteria andYwidIsNotNull() {
            addCriterion("YWID is not null");
            return (Criteria) this;
        }

        public Criteria andYwidEqualTo(String value) {
            addCriterion("YWID =", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotEqualTo(String value) {
            addCriterion("YWID <>", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidGreaterThan(String value) {
            addCriterion("YWID >", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidGreaterThanOrEqualTo(String value) {
            addCriterion("YWID >=", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidLessThan(String value) {
            addCriterion("YWID <", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidLessThanOrEqualTo(String value) {
            addCriterion("YWID <=", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidLike(String value) {
            addCriterion("YWID like", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotLike(String value) {
            addCriterion("YWID not like", value, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidIn(List<String> values) {
            addCriterion("YWID in", values, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotIn(List<String> values) {
            addCriterion("YWID not in", values, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidBetween(String value1, String value2) {
            addCriterion("YWID between", value1, value2, "ywid");
            return (Criteria) this;
        }

        public Criteria andYwidNotBetween(String value1, String value2) {
            addCriterion("YWID not between", value1, value2, "ywid");
            return (Criteria) this;
        }

        public Criteria andHzidIsNull() {
            addCriterion("HZID is null");
            return (Criteria) this;
        }

        public Criteria andHzidIsNotNull() {
            addCriterion("HZID is not null");
            return (Criteria) this;
        }

        public Criteria andHzidEqualTo(String value) {
            addCriterion("HZID =", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotEqualTo(String value) {
            addCriterion("HZID <>", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidGreaterThan(String value) {
            addCriterion("HZID >", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidGreaterThanOrEqualTo(String value) {
            addCriterion("HZID >=", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidLessThan(String value) {
            addCriterion("HZID <", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidLessThanOrEqualTo(String value) {
            addCriterion("HZID <=", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidLike(String value) {
            addCriterion("HZID like", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotLike(String value) {
            addCriterion("HZID not like", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidIn(List<String> values) {
            addCriterion("HZID in", values, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotIn(List<String> values) {
            addCriterion("HZID not in", values, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidBetween(String value1, String value2) {
            addCriterion("HZID between", value1, value2, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotBetween(String value1, String value2) {
            addCriterion("HZID not between", value1, value2, "hzid");
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

        public Criteria andOperatorTimeIsNull() {
            addCriterion("OPERATOR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("OPERATOR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterion("OPERATOR_TIME =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterion("OPERATOR_TIME <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterion("OPERATOR_TIME >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATOR_TIME >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterion("OPERATOR_TIME <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATOR_TIME <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterion("OPERATOR_TIME in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterion("OPERATOR_TIME not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATOR_TIME between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATOR_TIME not between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andSxIsNull() {
            addCriterion("SX is null");
            return (Criteria) this;
        }

        public Criteria andSxIsNotNull() {
            addCriterion("SX is not null");
            return (Criteria) this;
        }

        public Criteria andSxEqualTo(String value) {
            addCriterion("SX =", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotEqualTo(String value) {
            addCriterion("SX <>", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThan(String value) {
            addCriterion("SX >", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxGreaterThanOrEqualTo(String value) {
            addCriterion("SX >=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThan(String value) {
            addCriterion("SX <", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLessThanOrEqualTo(String value) {
            addCriterion("SX <=", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxLike(String value) {
            addCriterion("SX like", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotLike(String value) {
            addCriterion("SX not like", value, "sx");
            return (Criteria) this;
        }

        public Criteria andSxIn(List<String> values) {
            addCriterion("SX in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotIn(List<String> values) {
            addCriterion("SX not in", values, "sx");
            return (Criteria) this;
        }

        public Criteria andSxBetween(String value1, String value2) {
            addCriterion("SX between", value1, value2, "sx");
            return (Criteria) this;
        }

        public Criteria andSxNotBetween(String value1, String value2) {
            addCriterion("SX not between", value1, value2, "sx");
            return (Criteria) this;
        }
    }

    /**
     * T_HZ_YW
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZ_YW 2018-09-17
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