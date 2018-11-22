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
     * @mbggenerated 2018-11-22
     */
    public HzxyParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-22
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
     * @mbggenerated 2018-11-22
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_HZXY 2018-11-22
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

        public Criteria andXymcIsNull() {
            addCriterion("XYMC is null");
            return (Criteria) this;
        }

        public Criteria andXymcIsNotNull() {
            addCriterion("XYMC is not null");
            return (Criteria) this;
        }

        public Criteria andXymcEqualTo(String value) {
            addCriterion("XYMC =", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotEqualTo(String value) {
            addCriterion("XYMC <>", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcGreaterThan(String value) {
            addCriterion("XYMC >", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcGreaterThanOrEqualTo(String value) {
            addCriterion("XYMC >=", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLessThan(String value) {
            addCriterion("XYMC <", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLessThanOrEqualTo(String value) {
            addCriterion("XYMC <=", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcLike(String value) {
            addCriterion("XYMC like", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotLike(String value) {
            addCriterion("XYMC not like", value, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcIn(List<String> values) {
            addCriterion("XYMC in", values, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotIn(List<String> values) {
            addCriterion("XYMC not in", values, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcBetween(String value1, String value2) {
            addCriterion("XYMC between", value1, value2, "xymc");
            return (Criteria) this;
        }

        public Criteria andXymcNotBetween(String value1, String value2) {
            addCriterion("XYMC not between", value1, value2, "xymc");
            return (Criteria) this;
        }

        public Criteria andHzfmcIsNull() {
            addCriterion("HZFMC is null");
            return (Criteria) this;
        }

        public Criteria andHzfmcIsNotNull() {
            addCriterion("HZFMC is not null");
            return (Criteria) this;
        }

        public Criteria andHzfmcEqualTo(String value) {
            addCriterion("HZFMC =", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotEqualTo(String value) {
            addCriterion("HZFMC <>", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcGreaterThan(String value) {
            addCriterion("HZFMC >", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcGreaterThanOrEqualTo(String value) {
            addCriterion("HZFMC >=", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcLessThan(String value) {
            addCriterion("HZFMC <", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcLessThanOrEqualTo(String value) {
            addCriterion("HZFMC <=", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcLike(String value) {
            addCriterion("HZFMC like", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotLike(String value) {
            addCriterion("HZFMC not like", value, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcIn(List<String> values) {
            addCriterion("HZFMC in", values, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotIn(List<String> values) {
            addCriterion("HZFMC not in", values, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcBetween(String value1, String value2) {
            addCriterion("HZFMC between", value1, value2, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andHzfmcNotBetween(String value1, String value2) {
            addCriterion("HZFMC not between", value1, value2, "hzfmc");
            return (Criteria) this;
        }

        public Criteria andQdrqIsNull() {
            addCriterion("QDRQ is null");
            return (Criteria) this;
        }

        public Criteria andQdrqIsNotNull() {
            addCriterion("QDRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQdrqEqualTo(Date value) {
            addCriterion("QDRQ =", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotEqualTo(Date value) {
            addCriterion("QDRQ <>", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqGreaterThan(Date value) {
            addCriterion("QDRQ >", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqGreaterThanOrEqualTo(Date value) {
            addCriterion("QDRQ >=", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqLessThan(Date value) {
            addCriterion("QDRQ <", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqLessThanOrEqualTo(Date value) {
            addCriterion("QDRQ <=", value, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqIn(List<Date> values) {
            addCriterion("QDRQ in", values, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotIn(List<Date> values) {
            addCriterion("QDRQ not in", values, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqBetween(Date value1, Date value2) {
            addCriterion("QDRQ between", value1, value2, "qdrq");
            return (Criteria) this;
        }

        public Criteria andQdrqNotBetween(Date value1, Date value2) {
            addCriterion("QDRQ not between", value1, value2, "qdrq");
            return (Criteria) this;
        }

        public Criteria andSxrqIsNull() {
            addCriterion("SXRQ is null");
            return (Criteria) this;
        }

        public Criteria andSxrqIsNotNull() {
            addCriterion("SXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSxrqEqualTo(Date value) {
            addCriterion("SXRQ =", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqNotEqualTo(Date value) {
            addCriterion("SXRQ <>", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqGreaterThan(Date value) {
            addCriterion("SXRQ >", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("SXRQ >=", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqLessThan(Date value) {
            addCriterion("SXRQ <", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqLessThanOrEqualTo(Date value) {
            addCriterion("SXRQ <=", value, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqIn(List<Date> values) {
            addCriterion("SXRQ in", values, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqNotIn(List<Date> values) {
            addCriterion("SXRQ not in", values, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqBetween(Date value1, Date value2) {
            addCriterion("SXRQ between", value1, value2, "sxrq");
            return (Criteria) this;
        }

        public Criteria andSxrqNotBetween(Date value1, Date value2) {
            addCriterion("SXRQ not between", value1, value2, "sxrq");
            return (Criteria) this;
        }

        public Criteria andUploadIdIsNull() {
            addCriterion("UPLOAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andUploadIdIsNotNull() {
            addCriterion("UPLOAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUploadIdEqualTo(String value) {
            addCriterion("UPLOAD_ID =", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotEqualTo(String value) {
            addCriterion("UPLOAD_ID <>", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdGreaterThan(String value) {
            addCriterion("UPLOAD_ID >", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_ID >=", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLessThan(String value) {
            addCriterion("UPLOAD_ID <", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_ID <=", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdLike(String value) {
            addCriterion("UPLOAD_ID like", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotLike(String value) {
            addCriterion("UPLOAD_ID not like", value, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdIn(List<String> values) {
            addCriterion("UPLOAD_ID in", values, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotIn(List<String> values) {
            addCriterion("UPLOAD_ID not in", values, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdBetween(String value1, String value2) {
            addCriterion("UPLOAD_ID between", value1, value2, "uploadId");
            return (Criteria) this;
        }

        public Criteria andUploadIdNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_ID not between", value1, value2, "uploadId");
            return (Criteria) this;
        }

        public Criteria andQzrIsNull() {
            addCriterion("QZR is null");
            return (Criteria) this;
        }

        public Criteria andQzrIsNotNull() {
            addCriterion("QZR is not null");
            return (Criteria) this;
        }

        public Criteria andQzrEqualTo(String value) {
            addCriterion("QZR =", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotEqualTo(String value) {
            addCriterion("QZR <>", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrGreaterThan(String value) {
            addCriterion("QZR >", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrGreaterThanOrEqualTo(String value) {
            addCriterion("QZR >=", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrLessThan(String value) {
            addCriterion("QZR <", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrLessThanOrEqualTo(String value) {
            addCriterion("QZR <=", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrLike(String value) {
            addCriterion("QZR like", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotLike(String value) {
            addCriterion("QZR not like", value, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrIn(List<String> values) {
            addCriterion("QZR in", values, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotIn(List<String> values) {
            addCriterion("QZR not in", values, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrBetween(String value1, String value2) {
            addCriterion("QZR between", value1, value2, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrNotBetween(String value1, String value2) {
            addCriterion("QZR not between", value1, value2, "qzr");
            return (Criteria) this;
        }

        public Criteria andQzrzwIsNull() {
            addCriterion("QZRZW is null");
            return (Criteria) this;
        }

        public Criteria andQzrzwIsNotNull() {
            addCriterion("QZRZW is not null");
            return (Criteria) this;
        }

        public Criteria andQzrzwEqualTo(String value) {
            addCriterion("QZRZW =", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotEqualTo(String value) {
            addCriterion("QZRZW <>", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwGreaterThan(String value) {
            addCriterion("QZRZW >", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwGreaterThanOrEqualTo(String value) {
            addCriterion("QZRZW >=", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwLessThan(String value) {
            addCriterion("QZRZW <", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwLessThanOrEqualTo(String value) {
            addCriterion("QZRZW <=", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwLike(String value) {
            addCriterion("QZRZW like", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotLike(String value) {
            addCriterion("QZRZW not like", value, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwIn(List<String> values) {
            addCriterion("QZRZW in", values, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotIn(List<String> values) {
            addCriterion("QZRZW not in", values, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwBetween(String value1, String value2) {
            addCriterion("QZRZW between", value1, value2, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andQzrzwNotBetween(String value1, String value2) {
            addCriterion("QZRZW not between", value1, value2, "qzrzw");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
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
     * T_HZXY
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZXY 2018-11-22
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