package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DmXmmcParams {
    /**
     * T_DM_XMMC
     */
    protected String orderByClause;

    /**
     * T_DM_XMMC
     */
    protected boolean distinct;

    /**
     * T_DM_XMMC
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public DmXmmcParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-20
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
     * @mbggenerated 2018-09-20
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_DM_XMMC 2018-09-20
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

        public Criteria andXmIdIsNull() {
            addCriterion("XM_ID is null");
            return (Criteria) this;
        }

        public Criteria andXmIdIsNotNull() {
            addCriterion("XM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andXmIdEqualTo(String value) {
            addCriterion("XM_ID =", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotEqualTo(String value) {
            addCriterion("XM_ID <>", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdGreaterThan(String value) {
            addCriterion("XM_ID >", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdGreaterThanOrEqualTo(String value) {
            addCriterion("XM_ID >=", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdLessThan(String value) {
            addCriterion("XM_ID <", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdLessThanOrEqualTo(String value) {
            addCriterion("XM_ID <=", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdLike(String value) {
            addCriterion("XM_ID like", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotLike(String value) {
            addCriterion("XM_ID not like", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdIn(List<String> values) {
            addCriterion("XM_ID in", values, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotIn(List<String> values) {
            addCriterion("XM_ID not in", values, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdBetween(String value1, String value2) {
            addCriterion("XM_ID between", value1, value2, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotBetween(String value1, String value2) {
            addCriterion("XM_ID not between", value1, value2, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNull() {
            addCriterion("XMMC is null");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNotNull() {
            addCriterion("XMMC is not null");
            return (Criteria) this;
        }

        public Criteria andXmmcEqualTo(String value) {
            addCriterion("XMMC =", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotEqualTo(String value) {
            addCriterion("XMMC <>", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThan(String value) {
            addCriterion("XMMC >", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("XMMC >=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThan(String value) {
            addCriterion("XMMC <", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThanOrEqualTo(String value) {
            addCriterion("XMMC <=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLike(String value) {
            addCriterion("XMMC like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotLike(String value) {
            addCriterion("XMMC not like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcIn(List<String> values) {
            addCriterion("XMMC in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotIn(List<String> values) {
            addCriterion("XMMC not in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcBetween(String value1, String value2) {
            addCriterion("XMMC between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotBetween(String value1, String value2) {
            addCriterion("XMMC not between", value1, value2, "xmmc");
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
     * T_DM_XMMC
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_DM_XMMC 2018-09-20
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