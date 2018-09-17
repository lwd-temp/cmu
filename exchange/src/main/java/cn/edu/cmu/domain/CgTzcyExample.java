package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgTzcyExample {
    /**
     * T_CG_TZCY
     */
    protected String orderByClause;

    /**
     * T_CG_TZCY
     */
    protected boolean distinct;

    /**
     * T_CG_TZCY
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public CgTzcyExample() {
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
     * T_CG_TZCY 2018-09-17
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

        public Criteria andCyidIsNull() {
            addCriterion("CYID is null");
            return (Criteria) this;
        }

        public Criteria andCyidIsNotNull() {
            addCriterion("CYID is not null");
            return (Criteria) this;
        }

        public Criteria andCyidEqualTo(String value) {
            addCriterion("CYID =", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidNotEqualTo(String value) {
            addCriterion("CYID <>", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidGreaterThan(String value) {
            addCriterion("CYID >", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidGreaterThanOrEqualTo(String value) {
            addCriterion("CYID >=", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidLessThan(String value) {
            addCriterion("CYID <", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidLessThanOrEqualTo(String value) {
            addCriterion("CYID <=", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidLike(String value) {
            addCriterion("CYID like", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidNotLike(String value) {
            addCriterion("CYID not like", value, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidIn(List<String> values) {
            addCriterion("CYID in", values, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidNotIn(List<String> values) {
            addCriterion("CYID not in", values, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidBetween(String value1, String value2) {
            addCriterion("CYID between", value1, value2, "cyid");
            return (Criteria) this;
        }

        public Criteria andCyidNotBetween(String value1, String value2) {
            addCriterion("CYID not between", value1, value2, "cyid");
            return (Criteria) this;
        }

        public Criteria andTzidIsNull() {
            addCriterion("TZID is null");
            return (Criteria) this;
        }

        public Criteria andTzidIsNotNull() {
            addCriterion("TZID is not null");
            return (Criteria) this;
        }

        public Criteria andTzidEqualTo(String value) {
            addCriterion("TZID =", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotEqualTo(String value) {
            addCriterion("TZID <>", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidGreaterThan(String value) {
            addCriterion("TZID >", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidGreaterThanOrEqualTo(String value) {
            addCriterion("TZID >=", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLessThan(String value) {
            addCriterion("TZID <", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLessThanOrEqualTo(String value) {
            addCriterion("TZID <=", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidLike(String value) {
            addCriterion("TZID like", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotLike(String value) {
            addCriterion("TZID not like", value, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidIn(List<String> values) {
            addCriterion("TZID in", values, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotIn(List<String> values) {
            addCriterion("TZID not in", values, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidBetween(String value1, String value2) {
            addCriterion("TZID between", value1, value2, "tzid");
            return (Criteria) this;
        }

        public Criteria andTzidNotBetween(String value1, String value2) {
            addCriterion("TZID not between", value1, value2, "tzid");
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

        public Criteria andEjdwmcIsNull() {
            addCriterion("EJDWMC is null");
            return (Criteria) this;
        }

        public Criteria andEjdwmcIsNotNull() {
            addCriterion("EJDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andEjdwmcEqualTo(String value) {
            addCriterion("EJDWMC =", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcNotEqualTo(String value) {
            addCriterion("EJDWMC <>", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcGreaterThan(String value) {
            addCriterion("EJDWMC >", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcGreaterThanOrEqualTo(String value) {
            addCriterion("EJDWMC >=", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcLessThan(String value) {
            addCriterion("EJDWMC <", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcLessThanOrEqualTo(String value) {
            addCriterion("EJDWMC <=", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcLike(String value) {
            addCriterion("EJDWMC like", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcNotLike(String value) {
            addCriterion("EJDWMC not like", value, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcIn(List<String> values) {
            addCriterion("EJDWMC in", values, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcNotIn(List<String> values) {
            addCriterion("EJDWMC not in", values, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcBetween(String value1, String value2) {
            addCriterion("EJDWMC between", value1, value2, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andEjdwmcNotBetween(String value1, String value2) {
            addCriterion("EJDWMC not between", value1, value2, "ejdwmc");
            return (Criteria) this;
        }

        public Criteria andZwIsNull() {
            addCriterion("ZW is null");
            return (Criteria) this;
        }

        public Criteria andZwIsNotNull() {
            addCriterion("ZW is not null");
            return (Criteria) this;
        }

        public Criteria andZwEqualTo(String value) {
            addCriterion("ZW =", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotEqualTo(String value) {
            addCriterion("ZW <>", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThan(String value) {
            addCriterion("ZW >", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwGreaterThanOrEqualTo(String value) {
            addCriterion("ZW >=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThan(String value) {
            addCriterion("ZW <", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLessThanOrEqualTo(String value) {
            addCriterion("ZW <=", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwLike(String value) {
            addCriterion("ZW like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotLike(String value) {
            addCriterion("ZW not like", value, "zw");
            return (Criteria) this;
        }

        public Criteria andZwIn(List<String> values) {
            addCriterion("ZW in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotIn(List<String> values) {
            addCriterion("ZW not in", values, "zw");
            return (Criteria) this;
        }

        public Criteria andZwBetween(String value1, String value2) {
            addCriterion("ZW between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andZwNotBetween(String value1, String value2) {
            addCriterion("ZW not between", value1, value2, "zw");
            return (Criteria) this;
        }

        public Criteria andJbIsNull() {
            addCriterion("JB is null");
            return (Criteria) this;
        }

        public Criteria andJbIsNotNull() {
            addCriterion("JB is not null");
            return (Criteria) this;
        }

        public Criteria andJbEqualTo(String value) {
            addCriterion("JB =", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotEqualTo(String value) {
            addCriterion("JB <>", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThan(String value) {
            addCriterion("JB >", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbGreaterThanOrEqualTo(String value) {
            addCriterion("JB >=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThan(String value) {
            addCriterion("JB <", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLessThanOrEqualTo(String value) {
            addCriterion("JB <=", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbLike(String value) {
            addCriterion("JB like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotLike(String value) {
            addCriterion("JB not like", value, "jb");
            return (Criteria) this;
        }

        public Criteria andJbIn(List<String> values) {
            addCriterion("JB in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotIn(List<String> values) {
            addCriterion("JB not in", values, "jb");
            return (Criteria) this;
        }

        public Criteria andJbBetween(String value1, String value2) {
            addCriterion("JB between", value1, value2, "jb");
            return (Criteria) this;
        }

        public Criteria andJbNotBetween(String value1, String value2) {
            addCriterion("JB not between", value1, value2, "jb");
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
     * T_CG_TZCY
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CG_TZCY 2018-09-17
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