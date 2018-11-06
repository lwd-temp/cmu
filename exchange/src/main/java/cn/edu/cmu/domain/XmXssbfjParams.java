package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XmXssbfjParams {
    /**
     * T_XM_XSSBFJ
     */
    protected String orderByClause;

    /**
     * T_XM_XSSBFJ
     */
    protected boolean distinct;

    /**
     * T_XM_XSSBFJ
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public XmXssbfjParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-06
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
     * @mbggenerated 2018-11-06
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-06
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_XM_XSSBFJ 2018-11-06
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

        public Criteria andFjIdIsNull() {
            addCriterion("FJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andFjIdIsNotNull() {
            addCriterion("FJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFjIdEqualTo(String value) {
            addCriterion("FJ_ID =", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdNotEqualTo(String value) {
            addCriterion("FJ_ID <>", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdGreaterThan(String value) {
            addCriterion("FJ_ID >", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdGreaterThanOrEqualTo(String value) {
            addCriterion("FJ_ID >=", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdLessThan(String value) {
            addCriterion("FJ_ID <", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdLessThanOrEqualTo(String value) {
            addCriterion("FJ_ID <=", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdLike(String value) {
            addCriterion("FJ_ID like", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdNotLike(String value) {
            addCriterion("FJ_ID not like", value, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdIn(List<String> values) {
            addCriterion("FJ_ID in", values, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdNotIn(List<String> values) {
            addCriterion("FJ_ID not in", values, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdBetween(String value1, String value2) {
            addCriterion("FJ_ID between", value1, value2, "fjId");
            return (Criteria) this;
        }

        public Criteria andFjIdNotBetween(String value1, String value2) {
            addCriterion("FJ_ID not between", value1, value2, "fjId");
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("FILE_ID like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("FILE_ID not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andClsmIsNull() {
            addCriterion("CLSM is null");
            return (Criteria) this;
        }

        public Criteria andClsmIsNotNull() {
            addCriterion("CLSM is not null");
            return (Criteria) this;
        }

        public Criteria andClsmEqualTo(String value) {
            addCriterion("CLSM =", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmNotEqualTo(String value) {
            addCriterion("CLSM <>", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmGreaterThan(String value) {
            addCriterion("CLSM >", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmGreaterThanOrEqualTo(String value) {
            addCriterion("CLSM >=", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmLessThan(String value) {
            addCriterion("CLSM <", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmLessThanOrEqualTo(String value) {
            addCriterion("CLSM <=", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmLike(String value) {
            addCriterion("CLSM like", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmNotLike(String value) {
            addCriterion("CLSM not like", value, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmIn(List<String> values) {
            addCriterion("CLSM in", values, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmNotIn(List<String> values) {
            addCriterion("CLSM not in", values, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmBetween(String value1, String value2) {
            addCriterion("CLSM between", value1, value2, "clsm");
            return (Criteria) this;
        }

        public Criteria andClsmNotBetween(String value1, String value2) {
            addCriterion("CLSM not between", value1, value2, "clsm");
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
     * T_XM_XSSBFJ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_XM_XSSBFJ 2018-11-06
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