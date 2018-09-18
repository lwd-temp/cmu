package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.List;

public class HzxyQzrParams {
    /**
     * T_HZXY_QZR
     */
    protected String orderByClause;

    /**
     * T_HZXY_QZR
     */
    protected boolean distinct;

    /**
     * T_HZXY_QZR
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public HzxyQzrParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-18
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
     * @mbggenerated 2018-09-18
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_HZXY_QZR 2018-09-18
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

        public Criteria andRyidIsNull() {
            addCriterion("RYID is null");
            return (Criteria) this;
        }

        public Criteria andRyidIsNotNull() {
            addCriterion("RYID is not null");
            return (Criteria) this;
        }

        public Criteria andRyidEqualTo(String value) {
            addCriterion("RYID =", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidNotEqualTo(String value) {
            addCriterion("RYID <>", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidGreaterThan(String value) {
            addCriterion("RYID >", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidGreaterThanOrEqualTo(String value) {
            addCriterion("RYID >=", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidLessThan(String value) {
            addCriterion("RYID <", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidLessThanOrEqualTo(String value) {
            addCriterion("RYID <=", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidLike(String value) {
            addCriterion("RYID like", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidNotLike(String value) {
            addCriterion("RYID not like", value, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidIn(List<String> values) {
            addCriterion("RYID in", values, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidNotIn(List<String> values) {
            addCriterion("RYID not in", values, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidBetween(String value1, String value2) {
            addCriterion("RYID between", value1, value2, "ryid");
            return (Criteria) this;
        }

        public Criteria andRyidNotBetween(String value1, String value2) {
            addCriterion("RYID not between", value1, value2, "ryid");
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

        public Criteria andXyidIsNull() {
            addCriterion("XYID is null");
            return (Criteria) this;
        }

        public Criteria andXyidIsNotNull() {
            addCriterion("XYID is not null");
            return (Criteria) this;
        }

        public Criteria andXyidEqualTo(String value) {
            addCriterion("XYID =", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotEqualTo(String value) {
            addCriterion("XYID <>", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidGreaterThan(String value) {
            addCriterion("XYID >", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidGreaterThanOrEqualTo(String value) {
            addCriterion("XYID >=", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidLessThan(String value) {
            addCriterion("XYID <", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidLessThanOrEqualTo(String value) {
            addCriterion("XYID <=", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidLike(String value) {
            addCriterion("XYID like", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotLike(String value) {
            addCriterion("XYID not like", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidIn(List<String> values) {
            addCriterion("XYID in", values, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotIn(List<String> values) {
            addCriterion("XYID not in", values, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidBetween(String value1, String value2) {
            addCriterion("XYID between", value1, value2, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotBetween(String value1, String value2) {
            addCriterion("XYID not between", value1, value2, "xyid");
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
     * T_HZXY_QZR
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZXY_QZR 2018-09-18
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