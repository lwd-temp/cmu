package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HyZjParams {
    /**
     * T_HY_ZJ
     */
    protected String orderByClause;

    /**
     * T_HY_ZJ
     */
    protected boolean distinct;

    /**
     * T_HY_ZJ
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public HyZjParams() {
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
     * T_HY_ZJ 2018-11-21
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

        public Criteria andZjidIsNull() {
            addCriterion("ZJID is null");
            return (Criteria) this;
        }

        public Criteria andZjidIsNotNull() {
            addCriterion("ZJID is not null");
            return (Criteria) this;
        }

        public Criteria andZjidEqualTo(String value) {
            addCriterion("ZJID =", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidNotEqualTo(String value) {
            addCriterion("ZJID <>", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidGreaterThan(String value) {
            addCriterion("ZJID >", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidGreaterThanOrEqualTo(String value) {
            addCriterion("ZJID >=", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidLessThan(String value) {
            addCriterion("ZJID <", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidLessThanOrEqualTo(String value) {
            addCriterion("ZJID <=", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidLike(String value) {
            addCriterion("ZJID like", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidNotLike(String value) {
            addCriterion("ZJID not like", value, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidIn(List<String> values) {
            addCriterion("ZJID in", values, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidNotIn(List<String> values) {
            addCriterion("ZJID not in", values, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidBetween(String value1, String value2) {
            addCriterion("ZJID between", value1, value2, "zjid");
            return (Criteria) this;
        }

        public Criteria andZjidNotBetween(String value1, String value2) {
            addCriterion("ZJID not between", value1, value2, "zjid");
            return (Criteria) this;
        }

        public Criteria andSbidIsNull() {
            addCriterion("SBID is null");
            return (Criteria) this;
        }

        public Criteria andSbidIsNotNull() {
            addCriterion("SBID is not null");
            return (Criteria) this;
        }

        public Criteria andSbidEqualTo(String value) {
            addCriterion("SBID =", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotEqualTo(String value) {
            addCriterion("SBID <>", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThan(String value) {
            addCriterion("SBID >", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThanOrEqualTo(String value) {
            addCriterion("SBID >=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThan(String value) {
            addCriterion("SBID <", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThanOrEqualTo(String value) {
            addCriterion("SBID <=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLike(String value) {
            addCriterion("SBID like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotLike(String value) {
            addCriterion("SBID not like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidIn(List<String> values) {
            addCriterion("SBID in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotIn(List<String> values) {
            addCriterion("SBID not in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidBetween(String value1, String value2) {
            addCriterion("SBID between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotBetween(String value1, String value2) {
            addCriterion("SBID not between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andJbxxIsNull() {
            addCriterion("JBXX is null");
            return (Criteria) this;
        }

        public Criteria andJbxxIsNotNull() {
            addCriterion("JBXX is not null");
            return (Criteria) this;
        }

        public Criteria andJbxxEqualTo(String value) {
            addCriterion("JBXX =", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxNotEqualTo(String value) {
            addCriterion("JBXX <>", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxGreaterThan(String value) {
            addCriterion("JBXX >", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxGreaterThanOrEqualTo(String value) {
            addCriterion("JBXX >=", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxLessThan(String value) {
            addCriterion("JBXX <", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxLessThanOrEqualTo(String value) {
            addCriterion("JBXX <=", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxLike(String value) {
            addCriterion("JBXX like", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxNotLike(String value) {
            addCriterion("JBXX not like", value, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxIn(List<String> values) {
            addCriterion("JBXX in", values, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxNotIn(List<String> values) {
            addCriterion("JBXX not in", values, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxBetween(String value1, String value2) {
            addCriterion("JBXX between", value1, value2, "jbxx");
            return (Criteria) this;
        }

        public Criteria andJbxxNotBetween(String value1, String value2) {
            addCriterion("JBXX not between", value1, value2, "jbxx");
            return (Criteria) this;
        }

        public Criteria andPjwhIsNull() {
            addCriterion("PJWH is null");
            return (Criteria) this;
        }

        public Criteria andPjwhIsNotNull() {
            addCriterion("PJWH is not null");
            return (Criteria) this;
        }

        public Criteria andPjwhEqualTo(String value) {
            addCriterion("PJWH =", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhNotEqualTo(String value) {
            addCriterion("PJWH <>", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhGreaterThan(String value) {
            addCriterion("PJWH >", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhGreaterThanOrEqualTo(String value) {
            addCriterion("PJWH >=", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhLessThan(String value) {
            addCriterion("PJWH <", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhLessThanOrEqualTo(String value) {
            addCriterion("PJWH <=", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhLike(String value) {
            addCriterion("PJWH like", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhNotLike(String value) {
            addCriterion("PJWH not like", value, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhIn(List<String> values) {
            addCriterion("PJWH in", values, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhNotIn(List<String> values) {
            addCriterion("PJWH not in", values, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhBetween(String value1, String value2) {
            addCriterion("PJWH between", value1, value2, "pjwh");
            return (Criteria) this;
        }

        public Criteria andPjwhNotBetween(String value1, String value2) {
            addCriterion("PJWH not between", value1, value2, "pjwh");
            return (Criteria) this;
        }

        public Criteria andJtqkjsIsNull() {
            addCriterion("JTQKJS is null");
            return (Criteria) this;
        }

        public Criteria andJtqkjsIsNotNull() {
            addCriterion("JTQKJS is not null");
            return (Criteria) this;
        }

        public Criteria andJtqkjsEqualTo(String value) {
            addCriterion("JTQKJS =", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsNotEqualTo(String value) {
            addCriterion("JTQKJS <>", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsGreaterThan(String value) {
            addCriterion("JTQKJS >", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsGreaterThanOrEqualTo(String value) {
            addCriterion("JTQKJS >=", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsLessThan(String value) {
            addCriterion("JTQKJS <", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsLessThanOrEqualTo(String value) {
            addCriterion("JTQKJS <=", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsLike(String value) {
            addCriterion("JTQKJS like", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsNotLike(String value) {
            addCriterion("JTQKJS not like", value, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsIn(List<String> values) {
            addCriterion("JTQKJS in", values, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsNotIn(List<String> values) {
            addCriterion("JTQKJS not in", values, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsBetween(String value1, String value2) {
            addCriterion("JTQKJS between", value1, value2, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andJtqkjsNotBetween(String value1, String value2) {
            addCriterion("JTQKJS not between", value1, value2, "jtqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsIsNull() {
            addCriterion("CCQKJS is null");
            return (Criteria) this;
        }

        public Criteria andCcqkjsIsNotNull() {
            addCriterion("CCQKJS is not null");
            return (Criteria) this;
        }

        public Criteria andCcqkjsEqualTo(String value) {
            addCriterion("CCQKJS =", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsNotEqualTo(String value) {
            addCriterion("CCQKJS <>", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsGreaterThan(String value) {
            addCriterion("CCQKJS >", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsGreaterThanOrEqualTo(String value) {
            addCriterion("CCQKJS >=", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsLessThan(String value) {
            addCriterion("CCQKJS <", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsLessThanOrEqualTo(String value) {
            addCriterion("CCQKJS <=", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsLike(String value) {
            addCriterion("CCQKJS like", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsNotLike(String value) {
            addCriterion("CCQKJS not like", value, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsIn(List<String> values) {
            addCriterion("CCQKJS in", values, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsNotIn(List<String> values) {
            addCriterion("CCQKJS not in", values, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsBetween(String value1, String value2) {
            addCriterion("CCQKJS between", value1, value2, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andCcqkjsNotBetween(String value1, String value2) {
            addCriterion("CCQKJS not between", value1, value2, "ccqkjs");
            return (Criteria) this;
        }

        public Criteria andJyywtIsNull() {
            addCriterion("JYYWT is null");
            return (Criteria) this;
        }

        public Criteria andJyywtIsNotNull() {
            addCriterion("JYYWT is not null");
            return (Criteria) this;
        }

        public Criteria andJyywtEqualTo(String value) {
            addCriterion("JYYWT =", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtNotEqualTo(String value) {
            addCriterion("JYYWT <>", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtGreaterThan(String value) {
            addCriterion("JYYWT >", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtGreaterThanOrEqualTo(String value) {
            addCriterion("JYYWT >=", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtLessThan(String value) {
            addCriterion("JYYWT <", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtLessThanOrEqualTo(String value) {
            addCriterion("JYYWT <=", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtLike(String value) {
            addCriterion("JYYWT like", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtNotLike(String value) {
            addCriterion("JYYWT not like", value, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtIn(List<String> values) {
            addCriterion("JYYWT in", values, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtNotIn(List<String> values) {
            addCriterion("JYYWT not in", values, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtBetween(String value1, String value2) {
            addCriterion("JYYWT between", value1, value2, "jyywt");
            return (Criteria) this;
        }

        public Criteria andJyywtNotBetween(String value1, String value2) {
            addCriterion("JYYWT not between", value1, value2, "jyywt");
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
     * T_HY_ZJ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HY_ZJ 2018-11-21
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