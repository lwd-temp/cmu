package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SjjlZtExample {
    /**
     * T_SJJL_ZT
     */
    protected String orderByClause;

    /**
     * T_SJJL_ZT
     */
    protected boolean distinct;

    /**
     * T_SJJL_ZT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public SjjlZtExample() {
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
     * T_SJJL_ZT 2018-09-17
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

        public Criteria andGjidIsNull() {
            addCriterion("GJID is null");
            return (Criteria) this;
        }

        public Criteria andGjidIsNotNull() {
            addCriterion("GJID is not null");
            return (Criteria) this;
        }

        public Criteria andGjidEqualTo(String value) {
            addCriterion("GJID =", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidNotEqualTo(String value) {
            addCriterion("GJID <>", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidGreaterThan(String value) {
            addCriterion("GJID >", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidGreaterThanOrEqualTo(String value) {
            addCriterion("GJID >=", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidLessThan(String value) {
            addCriterion("GJID <", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidLessThanOrEqualTo(String value) {
            addCriterion("GJID <=", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidLike(String value) {
            addCriterion("GJID like", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidNotLike(String value) {
            addCriterion("GJID not like", value, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidIn(List<String> values) {
            addCriterion("GJID in", values, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidNotIn(List<String> values) {
            addCriterion("GJID not in", values, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidBetween(String value1, String value2) {
            addCriterion("GJID between", value1, value2, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjidNotBetween(String value1, String value2) {
            addCriterion("GJID not between", value1, value2, "gjid");
            return (Criteria) this;
        }

        public Criteria andGjnrIsNull() {
            addCriterion("GJNR is null");
            return (Criteria) this;
        }

        public Criteria andGjnrIsNotNull() {
            addCriterion("GJNR is not null");
            return (Criteria) this;
        }

        public Criteria andGjnrEqualTo(String value) {
            addCriterion("GJNR =", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrNotEqualTo(String value) {
            addCriterion("GJNR <>", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrGreaterThan(String value) {
            addCriterion("GJNR >", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrGreaterThanOrEqualTo(String value) {
            addCriterion("GJNR >=", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrLessThan(String value) {
            addCriterion("GJNR <", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrLessThanOrEqualTo(String value) {
            addCriterion("GJNR <=", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrLike(String value) {
            addCriterion("GJNR like", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrNotLike(String value) {
            addCriterion("GJNR not like", value, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrIn(List<String> values) {
            addCriterion("GJNR in", values, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrNotIn(List<String> values) {
            addCriterion("GJNR not in", values, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrBetween(String value1, String value2) {
            addCriterion("GJNR between", value1, value2, "gjnr");
            return (Criteria) this;
        }

        public Criteria andGjnrNotBetween(String value1, String value2) {
            addCriterion("GJNR not between", value1, value2, "gjnr");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCzghIsNull() {
            addCriterion("CZGH is null");
            return (Criteria) this;
        }

        public Criteria andCzghIsNotNull() {
            addCriterion("CZGH is not null");
            return (Criteria) this;
        }

        public Criteria andCzghEqualTo(String value) {
            addCriterion("CZGH =", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghNotEqualTo(String value) {
            addCriterion("CZGH <>", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghGreaterThan(String value) {
            addCriterion("CZGH >", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghGreaterThanOrEqualTo(String value) {
            addCriterion("CZGH >=", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghLessThan(String value) {
            addCriterion("CZGH <", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghLessThanOrEqualTo(String value) {
            addCriterion("CZGH <=", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghLike(String value) {
            addCriterion("CZGH like", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghNotLike(String value) {
            addCriterion("CZGH not like", value, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghIn(List<String> values) {
            addCriterion("CZGH in", values, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghNotIn(List<String> values) {
            addCriterion("CZGH not in", values, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghBetween(String value1, String value2) {
            addCriterion("CZGH between", value1, value2, "czgh");
            return (Criteria) this;
        }

        public Criteria andCzghNotBetween(String value1, String value2) {
            addCriterion("CZGH not between", value1, value2, "czgh");
            return (Criteria) this;
        }

        public Criteria andSqjlIdIsNull() {
            addCriterion("SQJL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqjlIdIsNotNull() {
            addCriterion("SQJL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqjlIdEqualTo(String value) {
            addCriterion("SQJL_ID =", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotEqualTo(String value) {
            addCriterion("SQJL_ID <>", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdGreaterThan(String value) {
            addCriterion("SQJL_ID >", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdGreaterThanOrEqualTo(String value) {
            addCriterion("SQJL_ID >=", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdLessThan(String value) {
            addCriterion("SQJL_ID <", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdLessThanOrEqualTo(String value) {
            addCriterion("SQJL_ID <=", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdLike(String value) {
            addCriterion("SQJL_ID like", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotLike(String value) {
            addCriterion("SQJL_ID not like", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdIn(List<String> values) {
            addCriterion("SQJL_ID in", values, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotIn(List<String> values) {
            addCriterion("SQJL_ID not in", values, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdBetween(String value1, String value2) {
            addCriterion("SQJL_ID between", value1, value2, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotBetween(String value1, String value2) {
            addCriterion("SQJL_ID not between", value1, value2, "sqjlId");
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
    }

    /**
     * T_SJJL_ZT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_SJJL_ZT 2018-09-17
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