package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WbjdGjParams {
    /**
     * T_WBJD_GJ
     */
    protected String orderByClause;

    /**
     * T_WBJD_GJ
     */
    protected boolean distinct;

    /**
     * T_WBJD_GJ
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public WbjdGjParams() {
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
     * T_WBJD_GJ 2018-11-21
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

        public Criteria andLfjdgjidIsNull() {
            addCriterion("LFJDGJID is null");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidIsNotNull() {
            addCriterion("LFJDGJID is not null");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidEqualTo(String value) {
            addCriterion("LFJDGJID =", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidNotEqualTo(String value) {
            addCriterion("LFJDGJID <>", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidGreaterThan(String value) {
            addCriterion("LFJDGJID >", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidGreaterThanOrEqualTo(String value) {
            addCriterion("LFJDGJID >=", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidLessThan(String value) {
            addCriterion("LFJDGJID <", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidLessThanOrEqualTo(String value) {
            addCriterion("LFJDGJID <=", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidLike(String value) {
            addCriterion("LFJDGJID like", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidNotLike(String value) {
            addCriterion("LFJDGJID not like", value, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidIn(List<String> values) {
            addCriterion("LFJDGJID in", values, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidNotIn(List<String> values) {
            addCriterion("LFJDGJID not in", values, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidBetween(String value1, String value2) {
            addCriterion("LFJDGJID between", value1, value2, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfjdgjidNotBetween(String value1, String value2) {
            addCriterion("LFJDGJID not between", value1, value2, "lfjdgjid");
            return (Criteria) this;
        }

        public Criteria andLfidIsNull() {
            addCriterion("LFID is null");
            return (Criteria) this;
        }

        public Criteria andLfidIsNotNull() {
            addCriterion("LFID is not null");
            return (Criteria) this;
        }

        public Criteria andLfidEqualTo(String value) {
            addCriterion("LFID =", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidNotEqualTo(String value) {
            addCriterion("LFID <>", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidGreaterThan(String value) {
            addCriterion("LFID >", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidGreaterThanOrEqualTo(String value) {
            addCriterion("LFID >=", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidLessThan(String value) {
            addCriterion("LFID <", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidLessThanOrEqualTo(String value) {
            addCriterion("LFID <=", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidLike(String value) {
            addCriterion("LFID like", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidNotLike(String value) {
            addCriterion("LFID not like", value, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidIn(List<String> values) {
            addCriterion("LFID in", values, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidNotIn(List<String> values) {
            addCriterion("LFID not in", values, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidBetween(String value1, String value2) {
            addCriterion("LFID between", value1, value2, "lfid");
            return (Criteria) this;
        }

        public Criteria andLfidNotBetween(String value1, String value2) {
            addCriterion("LFID not between", value1, value2, "lfid");
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
     * T_WBJD_GJ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_WBJD_GJ 2018-11-21
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