package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HzParams {
    /**
     * T_HZ
     */
    protected String orderByClause;

    /**
     * T_HZ
     */
    protected boolean distinct;

    /**
     * T_HZ
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-21
     */
    public HzParams() {
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
     * T_HZ 2018-11-21
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

        public Criteria andHzidIsNull() {
            addCriterion("HZID is null");
            return (Criteria) this;
        }

        public Criteria andHzidIsNotNull() {
            addCriterion("HZID is not null");
            return (Criteria) this;
        }

        public Criteria andHzidEqualTo(String value) {
            addCriterion("HZID =", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotEqualTo(String value) {
            addCriterion("HZID <>", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidGreaterThan(String value) {
            addCriterion("HZID >", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidGreaterThanOrEqualTo(String value) {
            addCriterion("HZID >=", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidLessThan(String value) {
            addCriterion("HZID <", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidLessThanOrEqualTo(String value) {
            addCriterion("HZID <=", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidLike(String value) {
            addCriterion("HZID like", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotLike(String value) {
            addCriterion("HZID not like", value, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidIn(List<String> values) {
            addCriterion("HZID in", values, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotIn(List<String> values) {
            addCriterion("HZID not in", values, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidBetween(String value1, String value2) {
            addCriterion("HZID between", value1, value2, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzidNotBetween(String value1, String value2) {
            addCriterion("HZID not between", value1, value2, "hzid");
            return (Criteria) this;
        }

        public Criteria andHzhmIsNull() {
            addCriterion("HZHM is null");
            return (Criteria) this;
        }

        public Criteria andHzhmIsNotNull() {
            addCriterion("HZHM is not null");
            return (Criteria) this;
        }

        public Criteria andHzhmEqualTo(String value) {
            addCriterion("HZHM =", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmNotEqualTo(String value) {
            addCriterion("HZHM <>", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmGreaterThan(String value) {
            addCriterion("HZHM >", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmGreaterThanOrEqualTo(String value) {
            addCriterion("HZHM >=", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmLessThan(String value) {
            addCriterion("HZHM <", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmLessThanOrEqualTo(String value) {
            addCriterion("HZHM <=", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmLike(String value) {
            addCriterion("HZHM like", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmNotLike(String value) {
            addCriterion("HZHM not like", value, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmIn(List<String> values) {
            addCriterion("HZHM in", values, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmNotIn(List<String> values) {
            addCriterion("HZHM not in", values, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmBetween(String value1, String value2) {
            addCriterion("HZHM between", value1, value2, "hzhm");
            return (Criteria) this;
        }

        public Criteria andHzhmNotBetween(String value1, String value2) {
            addCriterion("HZHM not between", value1, value2, "hzhm");
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

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGjIsNull() {
            addCriterion("GJ is null");
            return (Criteria) this;
        }

        public Criteria andGjIsNotNull() {
            addCriterion("GJ is not null");
            return (Criteria) this;
        }

        public Criteria andGjEqualTo(String value) {
            addCriterion("GJ =", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotEqualTo(String value) {
            addCriterion("GJ <>", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThan(String value) {
            addCriterion("GJ >", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjGreaterThanOrEqualTo(String value) {
            addCriterion("GJ >=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThan(String value) {
            addCriterion("GJ <", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLessThanOrEqualTo(String value) {
            addCriterion("GJ <=", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjLike(String value) {
            addCriterion("GJ like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotLike(String value) {
            addCriterion("GJ not like", value, "gj");
            return (Criteria) this;
        }

        public Criteria andGjIn(List<String> values) {
            addCriterion("GJ in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotIn(List<String> values) {
            addCriterion("GJ not in", values, "gj");
            return (Criteria) this;
        }

        public Criteria andGjBetween(String value1, String value2) {
            addCriterion("GJ between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andGjNotBetween(String value1, String value2) {
            addCriterion("GJ not between", value1, value2, "gj");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCsddIsNull() {
            addCriterion("CSDD is null");
            return (Criteria) this;
        }

        public Criteria andCsddIsNotNull() {
            addCriterion("CSDD is not null");
            return (Criteria) this;
        }

        public Criteria andCsddEqualTo(String value) {
            addCriterion("CSDD =", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddNotEqualTo(String value) {
            addCriterion("CSDD <>", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddGreaterThan(String value) {
            addCriterion("CSDD >", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddGreaterThanOrEqualTo(String value) {
            addCriterion("CSDD >=", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddLessThan(String value) {
            addCriterion("CSDD <", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddLessThanOrEqualTo(String value) {
            addCriterion("CSDD <=", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddLike(String value) {
            addCriterion("CSDD like", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddNotLike(String value) {
            addCriterion("CSDD not like", value, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddIn(List<String> values) {
            addCriterion("CSDD in", values, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddNotIn(List<String> values) {
            addCriterion("CSDD not in", values, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddBetween(String value1, String value2) {
            addCriterion("CSDD between", value1, value2, "csdd");
            return (Criteria) this;
        }

        public Criteria andCsddNotBetween(String value1, String value2) {
            addCriterion("CSDD not between", value1, value2, "csdd");
            return (Criteria) this;
        }

        public Criteria andQfrqIsNull() {
            addCriterion("QFRQ is null");
            return (Criteria) this;
        }

        public Criteria andQfrqIsNotNull() {
            addCriterion("QFRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQfrqEqualTo(Date value) {
            addCriterion("QFRQ =", value, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqNotEqualTo(Date value) {
            addCriterion("QFRQ <>", value, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqGreaterThan(Date value) {
            addCriterion("QFRQ >", value, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqGreaterThanOrEqualTo(Date value) {
            addCriterion("QFRQ >=", value, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqLessThan(Date value) {
            addCriterion("QFRQ <", value, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqLessThanOrEqualTo(Date value) {
            addCriterion("QFRQ <=", value, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqIn(List<Date> values) {
            addCriterion("QFRQ in", values, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqNotIn(List<Date> values) {
            addCriterion("QFRQ not in", values, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqBetween(Date value1, Date value2) {
            addCriterion("QFRQ between", value1, value2, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfrqNotBetween(Date value1, Date value2) {
            addCriterion("QFRQ not between", value1, value2, "qfrq");
            return (Criteria) this;
        }

        public Criteria andQfddIsNull() {
            addCriterion("QFDD is null");
            return (Criteria) this;
        }

        public Criteria andQfddIsNotNull() {
            addCriterion("QFDD is not null");
            return (Criteria) this;
        }

        public Criteria andQfddEqualTo(String value) {
            addCriterion("QFDD =", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddNotEqualTo(String value) {
            addCriterion("QFDD <>", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddGreaterThan(String value) {
            addCriterion("QFDD >", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddGreaterThanOrEqualTo(String value) {
            addCriterion("QFDD >=", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddLessThan(String value) {
            addCriterion("QFDD <", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddLessThanOrEqualTo(String value) {
            addCriterion("QFDD <=", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddLike(String value) {
            addCriterion("QFDD like", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddNotLike(String value) {
            addCriterion("QFDD not like", value, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddIn(List<String> values) {
            addCriterion("QFDD in", values, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddNotIn(List<String> values) {
            addCriterion("QFDD not in", values, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddBetween(String value1, String value2) {
            addCriterion("QFDD between", value1, value2, "qfdd");
            return (Criteria) this;
        }

        public Criteria andQfddNotBetween(String value1, String value2) {
            addCriterion("QFDD not between", value1, value2, "qfdd");
            return (Criteria) this;
        }

        public Criteria andYxqzIsNull() {
            addCriterion("YXQZ is null");
            return (Criteria) this;
        }

        public Criteria andYxqzIsNotNull() {
            addCriterion("YXQZ is not null");
            return (Criteria) this;
        }

        public Criteria andYxqzEqualTo(Date value) {
            addCriterion("YXQZ =", value, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzNotEqualTo(Date value) {
            addCriterion("YXQZ <>", value, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzGreaterThan(Date value) {
            addCriterion("YXQZ >", value, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzGreaterThanOrEqualTo(Date value) {
            addCriterion("YXQZ >=", value, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzLessThan(Date value) {
            addCriterion("YXQZ <", value, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzLessThanOrEqualTo(Date value) {
            addCriterion("YXQZ <=", value, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzIn(List<Date> values) {
            addCriterion("YXQZ in", values, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzNotIn(List<Date> values) {
            addCriterion("YXQZ not in", values, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzBetween(Date value1, Date value2) {
            addCriterion("YXQZ between", value1, value2, "yxqz");
            return (Criteria) this;
        }

        public Criteria andYxqzNotBetween(Date value1, Date value2) {
            addCriterion("YXQZ not between", value1, value2, "yxqz");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNull() {
            addCriterion("FZJG is null");
            return (Criteria) this;
        }

        public Criteria andFzjgIsNotNull() {
            addCriterion("FZJG is not null");
            return (Criteria) this;
        }

        public Criteria andFzjgEqualTo(String value) {
            addCriterion("FZJG =", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotEqualTo(String value) {
            addCriterion("FZJG <>", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThan(String value) {
            addCriterion("FZJG >", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgGreaterThanOrEqualTo(String value) {
            addCriterion("FZJG >=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThan(String value) {
            addCriterion("FZJG <", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLessThanOrEqualTo(String value) {
            addCriterion("FZJG <=", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgLike(String value) {
            addCriterion("FZJG like", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotLike(String value) {
            addCriterion("FZJG not like", value, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgIn(List<String> values) {
            addCriterion("FZJG in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotIn(List<String> values) {
            addCriterion("FZJG not in", values, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgBetween(String value1, String value2) {
            addCriterion("FZJG between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andFzjgNotBetween(String value1, String value2) {
            addCriterion("FZJG not between", value1, value2, "fzjg");
            return (Criteria) this;
        }

        public Criteria andHzlxIsNull() {
            addCriterion("HZLX is null");
            return (Criteria) this;
        }

        public Criteria andHzlxIsNotNull() {
            addCriterion("HZLX is not null");
            return (Criteria) this;
        }

        public Criteria andHzlxEqualTo(String value) {
            addCriterion("HZLX =", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotEqualTo(String value) {
            addCriterion("HZLX <>", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxGreaterThan(String value) {
            addCriterion("HZLX >", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxGreaterThanOrEqualTo(String value) {
            addCriterion("HZLX >=", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxLessThan(String value) {
            addCriterion("HZLX <", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxLessThanOrEqualTo(String value) {
            addCriterion("HZLX <=", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxLike(String value) {
            addCriterion("HZLX like", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotLike(String value) {
            addCriterion("HZLX not like", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxIn(List<String> values) {
            addCriterion("HZLX in", values, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotIn(List<String> values) {
            addCriterion("HZLX not in", values, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxBetween(String value1, String value2) {
            addCriterion("HZLX between", value1, value2, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotBetween(String value1, String value2) {
            addCriterion("HZLX not between", value1, value2, "hzlx");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNull() {
            addCriterion("JCSJ is null");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNotNull() {
            addCriterion("JCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJcsjEqualTo(Date value) {
            addCriterion("JCSJ =", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotEqualTo(Date value) {
            addCriterion("JCSJ <>", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThan(Date value) {
            addCriterion("JCSJ >", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThanOrEqualTo(Date value) {
            addCriterion("JCSJ >=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThan(Date value) {
            addCriterion("JCSJ <", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThanOrEqualTo(Date value) {
            addCriterion("JCSJ <=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjIn(List<Date> values) {
            addCriterion("JCSJ in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotIn(List<Date> values) {
            addCriterion("JCSJ not in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjBetween(Date value1, Date value2) {
            addCriterion("JCSJ between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotBetween(Date value1, Date value2) {
            addCriterion("JCSJ not between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andQzsjIsNull() {
            addCriterion("QZSJ is null");
            return (Criteria) this;
        }

        public Criteria andQzsjIsNotNull() {
            addCriterion("QZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andQzsjEqualTo(Date value) {
            addCriterion("QZSJ =", value, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjNotEqualTo(Date value) {
            addCriterion("QZSJ <>", value, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjGreaterThan(Date value) {
            addCriterion("QZSJ >", value, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("QZSJ >=", value, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjLessThan(Date value) {
            addCriterion("QZSJ <", value, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjLessThanOrEqualTo(Date value) {
            addCriterion("QZSJ <=", value, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjIn(List<Date> values) {
            addCriterion("QZSJ in", values, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjNotIn(List<Date> values) {
            addCriterion("QZSJ not in", values, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjBetween(Date value1, Date value2) {
            addCriterion("QZSJ between", value1, value2, "qzsj");
            return (Criteria) this;
        }

        public Criteria andQzsjNotBetween(Date value1, Date value2) {
            addCriterion("QZSJ not between", value1, value2, "qzsj");
            return (Criteria) this;
        }

        public Criteria andCfsjIsNull() {
            addCriterion("CFSJ is null");
            return (Criteria) this;
        }

        public Criteria andCfsjIsNotNull() {
            addCriterion("CFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andCfsjEqualTo(Date value) {
            addCriterion("CFSJ =", value, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjNotEqualTo(Date value) {
            addCriterion("CFSJ <>", value, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjGreaterThan(Date value) {
            addCriterion("CFSJ >", value, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjGreaterThanOrEqualTo(Date value) {
            addCriterion("CFSJ >=", value, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjLessThan(Date value) {
            addCriterion("CFSJ <", value, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjLessThanOrEqualTo(Date value) {
            addCriterion("CFSJ <=", value, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjIn(List<Date> values) {
            addCriterion("CFSJ in", values, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjNotIn(List<Date> values) {
            addCriterion("CFSJ not in", values, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjBetween(Date value1, Date value2) {
            addCriterion("CFSJ between", value1, value2, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfsjNotBetween(Date value1, Date value2) {
            addCriterion("CFSJ not between", value1, value2, "cfsj");
            return (Criteria) this;
        }

        public Criteria andCfmdIsNull() {
            addCriterion("CFMD is null");
            return (Criteria) this;
        }

        public Criteria andCfmdIsNotNull() {
            addCriterion("CFMD is not null");
            return (Criteria) this;
        }

        public Criteria andCfmdEqualTo(String value) {
            addCriterion("CFMD =", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotEqualTo(String value) {
            addCriterion("CFMD <>", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdGreaterThan(String value) {
            addCriterion("CFMD >", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdGreaterThanOrEqualTo(String value) {
            addCriterion("CFMD >=", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdLessThan(String value) {
            addCriterion("CFMD <", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdLessThanOrEqualTo(String value) {
            addCriterion("CFMD <=", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdLike(String value) {
            addCriterion("CFMD like", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotLike(String value) {
            addCriterion("CFMD not like", value, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdIn(List<String> values) {
            addCriterion("CFMD in", values, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotIn(List<String> values) {
            addCriterion("CFMD not in", values, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdBetween(String value1, String value2) {
            addCriterion("CFMD between", value1, value2, "cfmd");
            return (Criteria) this;
        }

        public Criteria andCfmdNotBetween(String value1, String value2) {
            addCriterion("CFMD not between", value1, value2, "cfmd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgIsNull() {
            addCriterion("DCWFQZHM_MG is null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgIsNotNull() {
            addCriterion("DCWFQZHM_MG is not null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgEqualTo(String value) {
            addCriterion("DCWFQZHM_MG =", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgNotEqualTo(String value) {
            addCriterion("DCWFQZHM_MG <>", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgGreaterThan(String value) {
            addCriterion("DCWFQZHM_MG >", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgGreaterThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_MG >=", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgLessThan(String value) {
            addCriterion("DCWFQZHM_MG <", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgLessThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_MG <=", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgLike(String value) {
            addCriterion("DCWFQZHM_MG like", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgNotLike(String value) {
            addCriterion("DCWFQZHM_MG not like", value, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgIn(List<String> values) {
            addCriterion("DCWFQZHM_MG in", values, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgNotIn(List<String> values) {
            addCriterion("DCWFQZHM_MG not in", values, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_MG between", value1, value2, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmMgNotBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_MG not between", value1, value2, "dcwfqzhmMg");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzIsNull() {
            addCriterion("DCWFQZHM_OZ is null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzIsNotNull() {
            addCriterion("DCWFQZHM_OZ is not null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzEqualTo(String value) {
            addCriterion("DCWFQZHM_OZ =", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzNotEqualTo(String value) {
            addCriterion("DCWFQZHM_OZ <>", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzGreaterThan(String value) {
            addCriterion("DCWFQZHM_OZ >", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzGreaterThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_OZ >=", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzLessThan(String value) {
            addCriterion("DCWFQZHM_OZ <", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzLessThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_OZ <=", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzLike(String value) {
            addCriterion("DCWFQZHM_OZ like", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzNotLike(String value) {
            addCriterion("DCWFQZHM_OZ not like", value, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzIn(List<String> values) {
            addCriterion("DCWFQZHM_OZ in", values, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzNotIn(List<String> values) {
            addCriterion("DCWFQZHM_OZ not in", values, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_OZ between", value1, value2, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmOzNotBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_OZ not between", value1, value2, "dcwfqzhmOz");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndIsNull() {
            addCriterion("DCWFQZHM_JND is null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndIsNotNull() {
            addCriterion("DCWFQZHM_JND is not null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndEqualTo(String value) {
            addCriterion("DCWFQZHM_JND =", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndNotEqualTo(String value) {
            addCriterion("DCWFQZHM_JND <>", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndGreaterThan(String value) {
            addCriterion("DCWFQZHM_JND >", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndGreaterThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_JND >=", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndLessThan(String value) {
            addCriterion("DCWFQZHM_JND <", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndLessThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_JND <=", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndLike(String value) {
            addCriterion("DCWFQZHM_JND like", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndNotLike(String value) {
            addCriterion("DCWFQZHM_JND not like", value, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndIn(List<String> values) {
            addCriterion("DCWFQZHM_JND in", values, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndNotIn(List<String> values) {
            addCriterion("DCWFQZHM_JND not in", values, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_JND between", value1, value2, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmJndNotBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_JND not between", value1, value2, "dcwfqzhmJnd");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtIsNull() {
            addCriterion("DCWFQZHM_QT is null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtIsNotNull() {
            addCriterion("DCWFQZHM_QT is not null");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtEqualTo(String value) {
            addCriterion("DCWFQZHM_QT =", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtNotEqualTo(String value) {
            addCriterion("DCWFQZHM_QT <>", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtGreaterThan(String value) {
            addCriterion("DCWFQZHM_QT >", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtGreaterThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_QT >=", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtLessThan(String value) {
            addCriterion("DCWFQZHM_QT <", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtLessThanOrEqualTo(String value) {
            addCriterion("DCWFQZHM_QT <=", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtLike(String value) {
            addCriterion("DCWFQZHM_QT like", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtNotLike(String value) {
            addCriterion("DCWFQZHM_QT not like", value, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtIn(List<String> values) {
            addCriterion("DCWFQZHM_QT in", values, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtNotIn(List<String> values) {
            addCriterion("DCWFQZHM_QT not in", values, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_QT between", value1, value2, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andDcwfqzhmQtNotBetween(String value1, String value2) {
            addCriterion("DCWFQZHM_QT not between", value1, value2, "dcwfqzhmQt");
            return (Criteria) this;
        }

        public Criteria andCfnrIsNull() {
            addCriterion("CFNR is null");
            return (Criteria) this;
        }

        public Criteria andCfnrIsNotNull() {
            addCriterion("CFNR is not null");
            return (Criteria) this;
        }

        public Criteria andCfnrEqualTo(String value) {
            addCriterion("CFNR =", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrNotEqualTo(String value) {
            addCriterion("CFNR <>", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrGreaterThan(String value) {
            addCriterion("CFNR >", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrGreaterThanOrEqualTo(String value) {
            addCriterion("CFNR >=", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrLessThan(String value) {
            addCriterion("CFNR <", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrLessThanOrEqualTo(String value) {
            addCriterion("CFNR <=", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrLike(String value) {
            addCriterion("CFNR like", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrNotLike(String value) {
            addCriterion("CFNR not like", value, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrIn(List<String> values) {
            addCriterion("CFNR in", values, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrNotIn(List<String> values) {
            addCriterion("CFNR not in", values, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrBetween(String value1, String value2) {
            addCriterion("CFNR between", value1, value2, "cfnr");
            return (Criteria) this;
        }

        public Criteria andCfnrNotBetween(String value1, String value2) {
            addCriterion("CFNR not between", value1, value2, "cfnr");
            return (Criteria) this;
        }

        public Criteria andQzhmIsNull() {
            addCriterion("QZHM is null");
            return (Criteria) this;
        }

        public Criteria andQzhmIsNotNull() {
            addCriterion("QZHM is not null");
            return (Criteria) this;
        }

        public Criteria andQzhmEqualTo(String value) {
            addCriterion("QZHM =", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotEqualTo(String value) {
            addCriterion("QZHM <>", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmGreaterThan(String value) {
            addCriterion("QZHM >", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmGreaterThanOrEqualTo(String value) {
            addCriterion("QZHM >=", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmLessThan(String value) {
            addCriterion("QZHM <", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmLessThanOrEqualTo(String value) {
            addCriterion("QZHM <=", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmLike(String value) {
            addCriterion("QZHM like", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotLike(String value) {
            addCriterion("QZHM not like", value, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmIn(List<String> values) {
            addCriterion("QZHM in", values, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotIn(List<String> values) {
            addCriterion("QZHM not in", values, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmBetween(String value1, String value2) {
            addCriterion("QZHM between", value1, value2, "qzhm");
            return (Criteria) this;
        }

        public Criteria andQzhmNotBetween(String value1, String value2) {
            addCriterion("QZHM not between", value1, value2, "qzhm");
            return (Criteria) this;
        }

        public Criteria andGhsjIsNull() {
            addCriterion("GHSJ is null");
            return (Criteria) this;
        }

        public Criteria andGhsjIsNotNull() {
            addCriterion("GHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andGhsjEqualTo(Date value) {
            addCriterion("GHSJ =", value, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjNotEqualTo(Date value) {
            addCriterion("GHSJ <>", value, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjGreaterThan(Date value) {
            addCriterion("GHSJ >", value, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjGreaterThanOrEqualTo(Date value) {
            addCriterion("GHSJ >=", value, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjLessThan(Date value) {
            addCriterion("GHSJ <", value, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjLessThanOrEqualTo(Date value) {
            addCriterion("GHSJ <=", value, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjIn(List<Date> values) {
            addCriterion("GHSJ in", values, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjNotIn(List<Date> values) {
            addCriterion("GHSJ not in", values, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjBetween(Date value1, Date value2) {
            addCriterion("GHSJ between", value1, value2, "ghsj");
            return (Criteria) this;
        }

        public Criteria andGhsjNotBetween(Date value1, Date value2) {
            addCriterion("GHSJ not between", value1, value2, "ghsj");
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
     * T_HZ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZ 2018-11-21
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