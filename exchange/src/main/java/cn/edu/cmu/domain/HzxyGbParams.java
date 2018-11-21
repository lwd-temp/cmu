package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HzxyGbParams {
    /**
     * T_HZXY_GB
     */
    protected String orderByClause;

    /**
     * T_HZXY_GB
     */
    protected boolean distinct;

    /**
     * T_HZXY_GB
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public HzxyGbParams() {
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
     * T_HZXY_GB 2018-11-21
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

        public Criteria andGbidIsNull() {
            addCriterion("GBID is null");
            return (Criteria) this;
        }

        public Criteria andGbidIsNotNull() {
            addCriterion("GBID is not null");
            return (Criteria) this;
        }

        public Criteria andGbidEqualTo(String value) {
            addCriterion("GBID =", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotEqualTo(String value) {
            addCriterion("GBID <>", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidGreaterThan(String value) {
            addCriterion("GBID >", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidGreaterThanOrEqualTo(String value) {
            addCriterion("GBID >=", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidLessThan(String value) {
            addCriterion("GBID <", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidLessThanOrEqualTo(String value) {
            addCriterion("GBID <=", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidLike(String value) {
            addCriterion("GBID like", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotLike(String value) {
            addCriterion("GBID not like", value, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidIn(List<String> values) {
            addCriterion("GBID in", values, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotIn(List<String> values) {
            addCriterion("GBID not in", values, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidBetween(String value1, String value2) {
            addCriterion("GBID between", value1, value2, "gbid");
            return (Criteria) this;
        }

        public Criteria andGbidNotBetween(String value1, String value2) {
            addCriterion("GBID not between", value1, value2, "gbid");
            return (Criteria) this;
        }

        public Criteria andGjdmIsNull() {
            addCriterion("GJDM is null");
            return (Criteria) this;
        }

        public Criteria andGjdmIsNotNull() {
            addCriterion("GJDM is not null");
            return (Criteria) this;
        }

        public Criteria andGjdmEqualTo(String value) {
            addCriterion("GJDM =", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmNotEqualTo(String value) {
            addCriterion("GJDM <>", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmGreaterThan(String value) {
            addCriterion("GJDM >", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmGreaterThanOrEqualTo(String value) {
            addCriterion("GJDM >=", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmLessThan(String value) {
            addCriterion("GJDM <", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmLessThanOrEqualTo(String value) {
            addCriterion("GJDM <=", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmLike(String value) {
            addCriterion("GJDM like", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmNotLike(String value) {
            addCriterion("GJDM not like", value, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmIn(List<String> values) {
            addCriterion("GJDM in", values, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmNotIn(List<String> values) {
            addCriterion("GJDM not in", values, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmBetween(String value1, String value2) {
            addCriterion("GJDM between", value1, value2, "gjdm");
            return (Criteria) this;
        }

        public Criteria andGjdmNotBetween(String value1, String value2) {
            addCriterion("GJDM not between", value1, value2, "gjdm");
            return (Criteria) this;
        }

        public Criteria andHzysIsNull() {
            addCriterion("HZYS is null");
            return (Criteria) this;
        }

        public Criteria andHzysIsNotNull() {
            addCriterion("HZYS is not null");
            return (Criteria) this;
        }

        public Criteria andHzysEqualTo(String value) {
            addCriterion("HZYS =", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysNotEqualTo(String value) {
            addCriterion("HZYS <>", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysGreaterThan(String value) {
            addCriterion("HZYS >", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysGreaterThanOrEqualTo(String value) {
            addCriterion("HZYS >=", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysLessThan(String value) {
            addCriterion("HZYS <", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysLessThanOrEqualTo(String value) {
            addCriterion("HZYS <=", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysLike(String value) {
            addCriterion("HZYS like", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysNotLike(String value) {
            addCriterion("HZYS not like", value, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysIn(List<String> values) {
            addCriterion("HZYS in", values, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysNotIn(List<String> values) {
            addCriterion("HZYS not in", values, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysBetween(String value1, String value2) {
            addCriterion("HZYS between", value1, value2, "hzys");
            return (Criteria) this;
        }

        public Criteria andHzysNotBetween(String value1, String value2) {
            addCriterion("HZYS not between", value1, value2, "hzys");
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
     * T_HZXY_GB
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZXY_GB 2018-11-21
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