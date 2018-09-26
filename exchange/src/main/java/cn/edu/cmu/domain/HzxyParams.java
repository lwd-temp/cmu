package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HzxyParams {
    /**
     * T_HZXY
     */
    protected String orderByClause;

    /**
     * T_HZXY
     */
    protected boolean distinct;

    /**
     * T_HZXY
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public HzxyParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-26
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
     * @mbggenerated 2018-09-26
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-26
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_HZXY 2018-09-26
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

        public Criteria andXyidIsNull() {
            addCriterion("xyid is null");
            return (Criteria) this;
        }

        public Criteria andXyidIsNotNull() {
            addCriterion("xyid is not null");
            return (Criteria) this;
        }

        public Criteria andXyidEqualTo(String value) {
            addCriterion("xyid =", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotEqualTo(String value) {
            addCriterion("xyid <>", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidGreaterThan(String value) {
            addCriterion("xyid >", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidGreaterThanOrEqualTo(String value) {
            addCriterion("xyid >=", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidLessThan(String value) {
            addCriterion("xyid <", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidLessThanOrEqualTo(String value) {
            addCriterion("xyid <=", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidLike(String value) {
            addCriterion("xyid like", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotLike(String value) {
            addCriterion("xyid not like", value, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidIn(List<String> values) {
            addCriterion("xyid in", values, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotIn(List<String> values) {
            addCriterion("xyid not in", values, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidBetween(String value1, String value2) {
            addCriterion("xyid between", value1, value2, "xyid");
            return (Criteria) this;
        }

        public Criteria andXyidNotBetween(String value1, String value2) {
            addCriterion("xyid not between", value1, value2, "xyid");
            return (Criteria) this;
        }

        public Criteria andXymcIsNull() {
            addCriterion("xymc is null");
            return (Criteria) this;
        }

        public Criteria andXymcIsNotNull() {
            addCriterion("xymc is not null");
            return (Criteria) this;
        }

        public Criteria andXymcEqualTo(String value) {
            addCriterion("xymc =", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotEqualTo(String value) {
            addCriterion("xymc <>", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcGreaterThan(String value) {
            addCriterion("xymc >", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcGreaterThanOrEqualTo(String value) {
            addCriterion("xymc >=", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLessThan(String value) {
            addCriterion("xymc <", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLessThanOrEqualTo(String value) {
            addCriterion("xymc <=", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLike(String value) {
            addCriterion("xymc like", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotLike(String value) {
            addCriterion("xymc not like", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcIn(List<String> values) {
            addCriterion("xymc in", values, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotIn(List<String> values) {
            addCriterion("xymc not in", values, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcBetween(String value1, String value2) {
            addCriterion("xymc between", value1, value2, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotBetween(String value1, String value2) {
            addCriterion("xymc not between", value1, value2, "xymc");
            return (Criteria) this;
        }

        public Criteria andHzfmcIsNull() {
            addCriterion("hzfmc is null");
            return (Criteria) this;
        }

        public Criteria andHzfmcIsNotNull() {
            addCriterion("hzfmc is not null");
            return (Criteria) this;
        }

        public Criteria andHzfmcEqualTo(String value) {
            addCriterion("hzfmc =", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotEqualTo(String value) {
            addCriterion("hzfmc <>", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcGreaterThan(String value) {
            addCriterion("hzfmc >", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcGreaterThanOrEqualTo(String value) {
            addCriterion("hzfmc >=", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcLessThan(String value) {
            addCriterion("hzfmc <", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcLessThanOrEqualTo(String value) {
            addCriterion("hzfmc <=", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcLike(String value) {
            addCriterion("hzfmc like", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotLike(String value) {
            addCriterion("hzfmc not like", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcIn(List<String> values) {
            addCriterion("hzfmc in", values, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotIn(List<String> values) {
            addCriterion("hzfmc not in", values, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcBetween(String value1, String value2) {
            addCriterion("hzfmc between", value1, value2, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotBetween(String value1, String value2) {
            addCriterion("hzfmc not between", value1, value2, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andQdrqIsNull() {
            addCriterion("qdrq is null");
            return (Criteria) this;
        }

        public Criteria andQdrqIsNotNull() {
            addCriterion("qdrq is not null");
            return (Criteria) this;
        }

        public Criteria andQdrqEqualTo(Date value) {
            addCriterion("qdrq =", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotEqualTo(Date value) {
            addCriterion("qdrq <>", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqGreaterThan(Date value) {
            addCriterion("qdrq >", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqGreaterThanOrEqualTo(Date value) {
            addCriterion("qdrq >=", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqLessThan(Date value) {
            addCriterion("qdrq <", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqLessThanOrEqualTo(Date value) {
            addCriterion("qdrq <=", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqIn(List<Date> values) {
            addCriterion("qdrq in", values, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotIn(List<Date> values) {
            addCriterion("qdrq not in", values, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqBetween(Date value1, Date value2) {
            addCriterion("qdrq between", value1, value2, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotBetween(Date value1, Date value2) {
            addCriterion("qdrq not between", value1, value2, "qdrq");
            return (Criteria) this;
        }

        public Criteria andSxrqIsNull() {
            addCriterion("sxrq is null");
            return (Criteria) this;
        }

        public Criteria andSxrqIsNotNull() {
            addCriterion("sxrq is not null");
            return (Criteria) this;
        }

        public Criteria andSxrqEqualTo(Date value) {
            addCriterion("sxrq =", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqNotEqualTo(Date value) {
            addCriterion("sxrq <>", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqGreaterThan(Date value) {
            addCriterion("sxrq >", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("sxrq >=", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqLessThan(Date value) {
            addCriterion("sxrq <", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqLessThanOrEqualTo(Date value) {
            addCriterion("sxrq <=", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqIn(List<Date> values) {
            addCriterion("sxrq in", values, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqNotIn(List<Date> values) {
            addCriterion("sxrq not in", values, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqBetween(Date value1, Date value2) {
            addCriterion("sxrq between", value1, value2, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqNotBetween(Date value1, Date value2) {
            addCriterion("sxrq not between", value1, value2, "sxrq");
            return (Criteria) this;
        }

        public Criteria andUploadIdIsNull() {
            addCriterion("upload_id is null");
            return (Criteria) this;
        }

        public Criteria andUploadIdIsNotNull() {
            addCriterion("upload_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploadIdEqualTo(String value) {
            addCriterion("upload_id =", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotEqualTo(String value) {
            addCriterion("upload_id <>", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdGreaterThan(String value) {
            addCriterion("upload_id >", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdGreaterThanOrEqualTo(String value) {
            addCriterion("upload_id >=", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLessThan(String value) {
            addCriterion("upload_id <", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLessThanOrEqualTo(String value) {
            addCriterion("upload_id <=", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLike(String value) {
            addCriterion("upload_id like", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotLike(String value) {
            addCriterion("upload_id not like", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdIn(List<String> values) {
            addCriterion("upload_id in", values, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotIn(List<String> values) {
            addCriterion("upload_id not in", values, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdBetween(String value1, String value2) {
            addCriterion("upload_id between", value1, value2, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotBetween(String value1, String value2) {
            addCriterion("upload_id not between", value1, value2, "uploadId");
            return (Criteria) this;
        }

        public Criteria andQzrIsNull() {
            addCriterion("qzr is null");
            return (Criteria) this;
        }

        public Criteria andQzrIsNotNull() {
            addCriterion("qzr is not null");
            return (Criteria) this;
        }

        public Criteria andQzrEqualTo(String value) {
            addCriterion("qzr =", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotEqualTo(String value) {
            addCriterion("qzr <>", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrGreaterThan(String value) {
            addCriterion("qzr >", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrGreaterThanOrEqualTo(String value) {
            addCriterion("qzr >=", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrLessThan(String value) {
            addCriterion("qzr <", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrLessThanOrEqualTo(String value) {
            addCriterion("qzr <=", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrLike(String value) {
            addCriterion("qzr like", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotLike(String value) {
            addCriterion("qzr not like", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrIn(List<String> values) {
            addCriterion("qzr in", values, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotIn(List<String> values) {
            addCriterion("qzr not in", values, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrBetween(String value1, String value2) {
            addCriterion("qzr between", value1, value2, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotBetween(String value1, String value2) {
            addCriterion("qzr not between", value1, value2, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrzwIsNull() {
            addCriterion("qzrzw is null");
            return (Criteria) this;
        }

        public Criteria andQzrzwIsNotNull() {
            addCriterion("qzrzw is not null");
            return (Criteria) this;
        }

        public Criteria andQzrzwEqualTo(String value) {
            addCriterion("qzrzw =", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotEqualTo(String value) {
            addCriterion("qzrzw <>", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwGreaterThan(String value) {
            addCriterion("qzrzw >", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwGreaterThanOrEqualTo(String value) {
            addCriterion("qzrzw >=", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwLessThan(String value) {
            addCriterion("qzrzw <", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwLessThanOrEqualTo(String value) {
            addCriterion("qzrzw <=", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwLike(String value) {
            addCriterion("qzrzw like", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotLike(String value) {
            addCriterion("qzrzw not like", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwIn(List<String> values) {
            addCriterion("qzrzw in", values, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotIn(List<String> values) {
            addCriterion("qzrzw not in", values, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwBetween(String value1, String value2) {
            addCriterion("qzrzw between", value1, value2, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotBetween(String value1, String value2) {
            addCriterion("qzrzw not between", value1, value2, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("valid like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("valid not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * T_HZXY
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZXY 2018-09-26
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