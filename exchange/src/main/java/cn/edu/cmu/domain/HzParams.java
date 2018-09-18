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
     * @mbggenerated 2018-09-18
     */
    public HzParams() {
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
     * T_HZ 2018-09-18
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
     * T_HZ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HZ 2018-09-18
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