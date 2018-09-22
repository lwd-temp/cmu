package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WbjdZjParams {
    /**
     * T_WBJD_ZJ
     */
    protected String orderByClause;

    /**
     * T_WBJD_ZJ
     */
    protected boolean distinct;

    /**
     * T_WBJD_ZJ
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public WbjdZjParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-22
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
     * @mbggenerated 2018-09-22
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_WBJD_ZJ 2018-09-22
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

        public Criteria andDbtmcIsNull() {
            addCriterion("DBTMC is null");
            return (Criteria) this;
        }

        public Criteria andDbtmcIsNotNull() {
            addCriterion("DBTMC is not null");
            return (Criteria) this;
        }

        public Criteria andDbtmcEqualTo(String value) {
            addCriterion("DBTMC =", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcNotEqualTo(String value) {
            addCriterion("DBTMC <>", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcGreaterThan(String value) {
            addCriterion("DBTMC >", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcGreaterThanOrEqualTo(String value) {
            addCriterion("DBTMC >=", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcLessThan(String value) {
            addCriterion("DBTMC <", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcLessThanOrEqualTo(String value) {
            addCriterion("DBTMC <=", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcLike(String value) {
            addCriterion("DBTMC like", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcNotLike(String value) {
            addCriterion("DBTMC not like", value, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcIn(List<String> values) {
            addCriterion("DBTMC in", values, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcNotIn(List<String> values) {
            addCriterion("DBTMC not in", values, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcBetween(String value1, String value2) {
            addCriterion("DBTMC between", value1, value2, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andDbtmcNotBetween(String value1, String value2) {
            addCriterion("DBTMC not between", value1, value2, "dbtmc");
            return (Criteria) this;
        }

        public Criteria andLfrsIsNull() {
            addCriterion("LFRS is null");
            return (Criteria) this;
        }

        public Criteria andLfrsIsNotNull() {
            addCriterion("LFRS is not null");
            return (Criteria) this;
        }

        public Criteria andLfrsEqualTo(BigDecimal value) {
            addCriterion("LFRS =", value, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsNotEqualTo(BigDecimal value) {
            addCriterion("LFRS <>", value, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsGreaterThan(BigDecimal value) {
            addCriterion("LFRS >", value, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LFRS >=", value, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsLessThan(BigDecimal value) {
            addCriterion("LFRS <", value, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LFRS <=", value, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsIn(List<BigDecimal> values) {
            addCriterion("LFRS in", values, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsNotIn(List<BigDecimal> values) {
            addCriterion("LFRS not in", values, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LFRS between", value1, value2, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LFRS not between", value1, value2, "lfrs");
            return (Criteria) this;
        }

        public Criteria andLfsjIsNull() {
            addCriterion("LFSJ is null");
            return (Criteria) this;
        }

        public Criteria andLfsjIsNotNull() {
            addCriterion("LFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andLfsjEqualTo(String value) {
            addCriterion("LFSJ =", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjNotEqualTo(String value) {
            addCriterion("LFSJ <>", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjGreaterThan(String value) {
            addCriterion("LFSJ >", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjGreaterThanOrEqualTo(String value) {
            addCriterion("LFSJ >=", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjLessThan(String value) {
            addCriterion("LFSJ <", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjLessThanOrEqualTo(String value) {
            addCriterion("LFSJ <=", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjLike(String value) {
            addCriterion("LFSJ like", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjNotLike(String value) {
            addCriterion("LFSJ not like", value, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjIn(List<String> values) {
            addCriterion("LFSJ in", values, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjNotIn(List<String> values) {
            addCriterion("LFSJ not in", values, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjBetween(String value1, String value2) {
            addCriterion("LFSJ between", value1, value2, "lfsj");
            return (Criteria) this;
        }

        public Criteria andLfsjNotBetween(String value1, String value2) {
            addCriterion("LFSJ not between", value1, value2, "lfsj");
            return (Criteria) this;
        }

        public Criteria andTlsjStartIsNull() {
            addCriterion("TLSJ_START is null");
            return (Criteria) this;
        }

        public Criteria andTlsjStartIsNotNull() {
            addCriterion("TLSJ_START is not null");
            return (Criteria) this;
        }

        public Criteria andTlsjStartEqualTo(Date value) {
            addCriterion("TLSJ_START =", value, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartNotEqualTo(Date value) {
            addCriterion("TLSJ_START <>", value, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartGreaterThan(Date value) {
            addCriterion("TLSJ_START >", value, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartGreaterThanOrEqualTo(Date value) {
            addCriterion("TLSJ_START >=", value, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartLessThan(Date value) {
            addCriterion("TLSJ_START <", value, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartLessThanOrEqualTo(Date value) {
            addCriterion("TLSJ_START <=", value, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartIn(List<Date> values) {
            addCriterion("TLSJ_START in", values, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartNotIn(List<Date> values) {
            addCriterion("TLSJ_START not in", values, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartBetween(Date value1, Date value2) {
            addCriterion("TLSJ_START between", value1, value2, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjStartNotBetween(Date value1, Date value2) {
            addCriterion("TLSJ_START not between", value1, value2, "tlsjStart");
            return (Criteria) this;
        }

        public Criteria andTlsjEndIsNull() {
            addCriterion("TLSJ_END is null");
            return (Criteria) this;
        }

        public Criteria andTlsjEndIsNotNull() {
            addCriterion("TLSJ_END is not null");
            return (Criteria) this;
        }

        public Criteria andTlsjEndEqualTo(Date value) {
            addCriterion("TLSJ_END =", value, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndNotEqualTo(Date value) {
            addCriterion("TLSJ_END <>", value, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndGreaterThan(Date value) {
            addCriterion("TLSJ_END >", value, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndGreaterThanOrEqualTo(Date value) {
            addCriterion("TLSJ_END >=", value, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndLessThan(Date value) {
            addCriterion("TLSJ_END <", value, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndLessThanOrEqualTo(Date value) {
            addCriterion("TLSJ_END <=", value, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndIn(List<Date> values) {
            addCriterion("TLSJ_END in", values, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndNotIn(List<Date> values) {
            addCriterion("TLSJ_END not in", values, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndBetween(Date value1, Date value2) {
            addCriterion("TLSJ_END between", value1, value2, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andTlsjEndNotBetween(Date value1, Date value2) {
            addCriterion("TLSJ_END not between", value1, value2, "tlsjEnd");
            return (Criteria) this;
        }

        public Criteria andLfmdIsNull() {
            addCriterion("LFMD is null");
            return (Criteria) this;
        }

        public Criteria andLfmdIsNotNull() {
            addCriterion("LFMD is not null");
            return (Criteria) this;
        }

        public Criteria andLfmdEqualTo(String value) {
            addCriterion("LFMD =", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdNotEqualTo(String value) {
            addCriterion("LFMD <>", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdGreaterThan(String value) {
            addCriterion("LFMD >", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdGreaterThanOrEqualTo(String value) {
            addCriterion("LFMD >=", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdLessThan(String value) {
            addCriterion("LFMD <", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdLessThanOrEqualTo(String value) {
            addCriterion("LFMD <=", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdLike(String value) {
            addCriterion("LFMD like", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdNotLike(String value) {
            addCriterion("LFMD not like", value, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdIn(List<String> values) {
            addCriterion("LFMD in", values, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdNotIn(List<String> values) {
            addCriterion("LFMD not in", values, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdBetween(String value1, String value2) {
            addCriterion("LFMD between", value1, value2, "lfmd");
            return (Criteria) this;
        }

        public Criteria andLfmdNotBetween(String value1, String value2) {
            addCriterion("LFMD not between", value1, value2, "lfmd");
            return (Criteria) this;
        }

        public Criteria andYjtmIsNull() {
            addCriterion("YJTM is null");
            return (Criteria) this;
        }

        public Criteria andYjtmIsNotNull() {
            addCriterion("YJTM is not null");
            return (Criteria) this;
        }

        public Criteria andYjtmEqualTo(String value) {
            addCriterion("YJTM =", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmNotEqualTo(String value) {
            addCriterion("YJTM <>", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmGreaterThan(String value) {
            addCriterion("YJTM >", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmGreaterThanOrEqualTo(String value) {
            addCriterion("YJTM >=", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmLessThan(String value) {
            addCriterion("YJTM <", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmLessThanOrEqualTo(String value) {
            addCriterion("YJTM <=", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmLike(String value) {
            addCriterion("YJTM like", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmNotLike(String value) {
            addCriterion("YJTM not like", value, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmIn(List<String> values) {
            addCriterion("YJTM in", values, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmNotIn(List<String> values) {
            addCriterion("YJTM not in", values, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmBetween(String value1, String value2) {
            addCriterion("YJTM between", value1, value2, "yjtm");
            return (Criteria) this;
        }

        public Criteria andYjtmNotBetween(String value1, String value2) {
            addCriterion("YJTM not between", value1, value2, "yjtm");
            return (Criteria) this;
        }

        public Criteria andLfmdQtIsNull() {
            addCriterion("LFMD_QT is null");
            return (Criteria) this;
        }

        public Criteria andLfmdQtIsNotNull() {
            addCriterion("LFMD_QT is not null");
            return (Criteria) this;
        }

        public Criteria andLfmdQtEqualTo(String value) {
            addCriterion("LFMD_QT =", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtNotEqualTo(String value) {
            addCriterion("LFMD_QT <>", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtGreaterThan(String value) {
            addCriterion("LFMD_QT >", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtGreaterThanOrEqualTo(String value) {
            addCriterion("LFMD_QT >=", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtLessThan(String value) {
            addCriterion("LFMD_QT <", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtLessThanOrEqualTo(String value) {
            addCriterion("LFMD_QT <=", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtLike(String value) {
            addCriterion("LFMD_QT like", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtNotLike(String value) {
            addCriterion("LFMD_QT not like", value, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtIn(List<String> values) {
            addCriterion("LFMD_QT in", values, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtNotIn(List<String> values) {
            addCriterion("LFMD_QT not in", values, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtBetween(String value1, String value2) {
            addCriterion("LFMD_QT between", value1, value2, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andLfmdQtNotBetween(String value1, String value2) {
            addCriterion("LFMD_QT not between", value1, value2, "lfmdQt");
            return (Criteria) this;
        }

        public Criteria andYqxxIsNull() {
            addCriterion("YQXX is null");
            return (Criteria) this;
        }

        public Criteria andYqxxIsNotNull() {
            addCriterion("YQXX is not null");
            return (Criteria) this;
        }

        public Criteria andYqxxEqualTo(String value) {
            addCriterion("YQXX =", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxNotEqualTo(String value) {
            addCriterion("YQXX <>", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxGreaterThan(String value) {
            addCriterion("YQXX >", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxGreaterThanOrEqualTo(String value) {
            addCriterion("YQXX >=", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxLessThan(String value) {
            addCriterion("YQXX <", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxLessThanOrEqualTo(String value) {
            addCriterion("YQXX <=", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxLike(String value) {
            addCriterion("YQXX like", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxNotLike(String value) {
            addCriterion("YQXX not like", value, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxIn(List<String> values) {
            addCriterion("YQXX in", values, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxNotIn(List<String> values) {
            addCriterion("YQXX not in", values, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxBetween(String value1, String value2) {
            addCriterion("YQXX between", value1, value2, "yqxx");
            return (Criteria) this;
        }

        public Criteria andYqxxNotBetween(String value1, String value2) {
            addCriterion("YQXX not between", value1, value2, "yqxx");
            return (Criteria) this;
        }

        public Criteria andJflyIsNull() {
            addCriterion("JFLY is null");
            return (Criteria) this;
        }

        public Criteria andJflyIsNotNull() {
            addCriterion("JFLY is not null");
            return (Criteria) this;
        }

        public Criteria andJflyEqualTo(String value) {
            addCriterion("JFLY =", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotEqualTo(String value) {
            addCriterion("JFLY <>", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyGreaterThan(String value) {
            addCriterion("JFLY >", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyGreaterThanOrEqualTo(String value) {
            addCriterion("JFLY >=", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyLessThan(String value) {
            addCriterion("JFLY <", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyLessThanOrEqualTo(String value) {
            addCriterion("JFLY <=", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyLike(String value) {
            addCriterion("JFLY like", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotLike(String value) {
            addCriterion("JFLY not like", value, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyIn(List<String> values) {
            addCriterion("JFLY in", values, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotIn(List<String> values) {
            addCriterion("JFLY not in", values, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyBetween(String value1, String value2) {
            addCriterion("JFLY between", value1, value2, "jfly");
            return (Criteria) this;
        }

        public Criteria andJflyNotBetween(String value1, String value2) {
            addCriterion("JFLY not between", value1, value2, "jfly");
            return (Criteria) this;
        }

        public Criteria andLpIsNull() {
            addCriterion("LP is null");
            return (Criteria) this;
        }

        public Criteria andLpIsNotNull() {
            addCriterion("LP is not null");
            return (Criteria) this;
        }

        public Criteria andLpEqualTo(String value) {
            addCriterion("LP =", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpNotEqualTo(String value) {
            addCriterion("LP <>", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpGreaterThan(String value) {
            addCriterion("LP >", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpGreaterThanOrEqualTo(String value) {
            addCriterion("LP >=", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpLessThan(String value) {
            addCriterion("LP <", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpLessThanOrEqualTo(String value) {
            addCriterion("LP <=", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpLike(String value) {
            addCriterion("LP like", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpNotLike(String value) {
            addCriterion("LP not like", value, "lp");
            return (Criteria) this;
        }

        public Criteria andLpIn(List<String> values) {
            addCriterion("LP in", values, "lp");
            return (Criteria) this;
        }

        public Criteria andLpNotIn(List<String> values) {
            addCriterion("LP not in", values, "lp");
            return (Criteria) this;
        }

        public Criteria andLpBetween(String value1, String value2) {
            addCriterion("LP between", value1, value2, "lp");
            return (Criteria) this;
        }

        public Criteria andLpNotBetween(String value1, String value2) {
            addCriterion("LP not between", value1, value2, "lp");
            return (Criteria) this;
        }

        public Criteria andLpslIsNull() {
            addCriterion("LPSL is null");
            return (Criteria) this;
        }

        public Criteria andLpslIsNotNull() {
            addCriterion("LPSL is not null");
            return (Criteria) this;
        }

        public Criteria andLpslEqualTo(BigDecimal value) {
            addCriterion("LPSL =", value, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslNotEqualTo(BigDecimal value) {
            addCriterion("LPSL <>", value, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslGreaterThan(BigDecimal value) {
            addCriterion("LPSL >", value, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LPSL >=", value, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslLessThan(BigDecimal value) {
            addCriterion("LPSL <", value, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LPSL <=", value, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslIn(List<BigDecimal> values) {
            addCriterion("LPSL in", values, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslNotIn(List<BigDecimal> values) {
            addCriterion("LPSL not in", values, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LPSL between", value1, value2, "lpsl");
            return (Criteria) this;
        }

        public Criteria andLpslNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LPSL not between", value1, value2, "lpsl");
            return (Criteria) this;
        }

        public Criteria andQkjlIsNull() {
            addCriterion("QKJL is null");
            return (Criteria) this;
        }

        public Criteria andQkjlIsNotNull() {
            addCriterion("QKJL is not null");
            return (Criteria) this;
        }

        public Criteria andQkjlEqualTo(String value) {
            addCriterion("QKJL =", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlNotEqualTo(String value) {
            addCriterion("QKJL <>", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlGreaterThan(String value) {
            addCriterion("QKJL >", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlGreaterThanOrEqualTo(String value) {
            addCriterion("QKJL >=", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlLessThan(String value) {
            addCriterion("QKJL <", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlLessThanOrEqualTo(String value) {
            addCriterion("QKJL <=", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlLike(String value) {
            addCriterion("QKJL like", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlNotLike(String value) {
            addCriterion("QKJL not like", value, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlIn(List<String> values) {
            addCriterion("QKJL in", values, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlNotIn(List<String> values) {
            addCriterion("QKJL not in", values, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlBetween(String value1, String value2) {
            addCriterion("QKJL between", value1, value2, "qkjl");
            return (Criteria) this;
        }

        public Criteria andQkjlNotBetween(String value1, String value2) {
            addCriterion("QKJL not between", value1, value2, "qkjl");
            return (Criteria) this;
        }

        public Criteria andFwcgIsNull() {
            addCriterion("FWCG is null");
            return (Criteria) this;
        }

        public Criteria andFwcgIsNotNull() {
            addCriterion("FWCG is not null");
            return (Criteria) this;
        }

        public Criteria andFwcgEqualTo(String value) {
            addCriterion("FWCG =", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgNotEqualTo(String value) {
            addCriterion("FWCG <>", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgGreaterThan(String value) {
            addCriterion("FWCG >", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgGreaterThanOrEqualTo(String value) {
            addCriterion("FWCG >=", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgLessThan(String value) {
            addCriterion("FWCG <", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgLessThanOrEqualTo(String value) {
            addCriterion("FWCG <=", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgLike(String value) {
            addCriterion("FWCG like", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgNotLike(String value) {
            addCriterion("FWCG not like", value, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgIn(List<String> values) {
            addCriterion("FWCG in", values, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgNotIn(List<String> values) {
            addCriterion("FWCG not in", values, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgBetween(String value1, String value2) {
            addCriterion("FWCG between", value1, value2, "fwcg");
            return (Criteria) this;
        }

        public Criteria andFwcgNotBetween(String value1, String value2) {
            addCriterion("FWCG not between", value1, value2, "fwcg");
            return (Criteria) this;
        }

        public Criteria andTzxmIsNull() {
            addCriterion("TZXM is null");
            return (Criteria) this;
        }

        public Criteria andTzxmIsNotNull() {
            addCriterion("TZXM is not null");
            return (Criteria) this;
        }

        public Criteria andTzxmEqualTo(String value) {
            addCriterion("TZXM =", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotEqualTo(String value) {
            addCriterion("TZXM <>", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmGreaterThan(String value) {
            addCriterion("TZXM >", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmGreaterThanOrEqualTo(String value) {
            addCriterion("TZXM >=", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmLessThan(String value) {
            addCriterion("TZXM <", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmLessThanOrEqualTo(String value) {
            addCriterion("TZXM <=", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmLike(String value) {
            addCriterion("TZXM like", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotLike(String value) {
            addCriterion("TZXM not like", value, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmIn(List<String> values) {
            addCriterion("TZXM in", values, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotIn(List<String> values) {
            addCriterion("TZXM not in", values, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmBetween(String value1, String value2) {
            addCriterion("TZXM between", value1, value2, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzxmNotBetween(String value1, String value2) {
            addCriterion("TZXM not between", value1, value2, "tzxm");
            return (Criteria) this;
        }

        public Criteria andTzgjIsNull() {
            addCriterion("TZGJ is null");
            return (Criteria) this;
        }

        public Criteria andTzgjIsNotNull() {
            addCriterion("TZGJ is not null");
            return (Criteria) this;
        }

        public Criteria andTzgjEqualTo(String value) {
            addCriterion("TZGJ =", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjNotEqualTo(String value) {
            addCriterion("TZGJ <>", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjGreaterThan(String value) {
            addCriterion("TZGJ >", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjGreaterThanOrEqualTo(String value) {
            addCriterion("TZGJ >=", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjLessThan(String value) {
            addCriterion("TZGJ <", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjLessThanOrEqualTo(String value) {
            addCriterion("TZGJ <=", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjLike(String value) {
            addCriterion("TZGJ like", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjNotLike(String value) {
            addCriterion("TZGJ not like", value, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjIn(List<String> values) {
            addCriterion("TZGJ in", values, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjNotIn(List<String> values) {
            addCriterion("TZGJ not in", values, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjBetween(String value1, String value2) {
            addCriterion("TZGJ between", value1, value2, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzgjNotBetween(String value1, String value2) {
            addCriterion("TZGJ not between", value1, value2, "tzgj");
            return (Criteria) this;
        }

        public Criteria andTzxbIsNull() {
            addCriterion("TZXB is null");
            return (Criteria) this;
        }

        public Criteria andTzxbIsNotNull() {
            addCriterion("TZXB is not null");
            return (Criteria) this;
        }

        public Criteria andTzxbEqualTo(Date value) {
            addCriterion("TZXB =", value, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbNotEqualTo(Date value) {
            addCriterion("TZXB <>", value, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbGreaterThan(Date value) {
            addCriterion("TZXB >", value, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbGreaterThanOrEqualTo(Date value) {
            addCriterion("TZXB >=", value, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbLessThan(Date value) {
            addCriterion("TZXB <", value, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbLessThanOrEqualTo(Date value) {
            addCriterion("TZXB <=", value, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbIn(List<Date> values) {
            addCriterion("TZXB in", values, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbNotIn(List<Date> values) {
            addCriterion("TZXB not in", values, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbBetween(Date value1, Date value2) {
            addCriterion("TZXB between", value1, value2, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzxbNotBetween(Date value1, Date value2) {
            addCriterion("TZXB not between", value1, value2, "tzxb");
            return (Criteria) this;
        }

        public Criteria andTzcsrqIsNull() {
            addCriterion("TZCSRQ is null");
            return (Criteria) this;
        }

        public Criteria andTzcsrqIsNotNull() {
            addCriterion("TZCSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andTzcsrqEqualTo(String value) {
            addCriterion("TZCSRQ =", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqNotEqualTo(String value) {
            addCriterion("TZCSRQ <>", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqGreaterThan(String value) {
            addCriterion("TZCSRQ >", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqGreaterThanOrEqualTo(String value) {
            addCriterion("TZCSRQ >=", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqLessThan(String value) {
            addCriterion("TZCSRQ <", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqLessThanOrEqualTo(String value) {
            addCriterion("TZCSRQ <=", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqLike(String value) {
            addCriterion("TZCSRQ like", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqNotLike(String value) {
            addCriterion("TZCSRQ not like", value, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqIn(List<String> values) {
            addCriterion("TZCSRQ in", values, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqNotIn(List<String> values) {
            addCriterion("TZCSRQ not in", values, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqBetween(String value1, String value2) {
            addCriterion("TZCSRQ between", value1, value2, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzcsrqNotBetween(String value1, String value2) {
            addCriterion("TZCSRQ not between", value1, value2, "tzcsrq");
            return (Criteria) this;
        }

        public Criteria andTzgzdwIsNull() {
            addCriterion("TZGZDW is null");
            return (Criteria) this;
        }

        public Criteria andTzgzdwIsNotNull() {
            addCriterion("TZGZDW is not null");
            return (Criteria) this;
        }

        public Criteria andTzgzdwEqualTo(String value) {
            addCriterion("TZGZDW =", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwNotEqualTo(String value) {
            addCriterion("TZGZDW <>", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwGreaterThan(String value) {
            addCriterion("TZGZDW >", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwGreaterThanOrEqualTo(String value) {
            addCriterion("TZGZDW >=", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwLessThan(String value) {
            addCriterion("TZGZDW <", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwLessThanOrEqualTo(String value) {
            addCriterion("TZGZDW <=", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwLike(String value) {
            addCriterion("TZGZDW like", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwNotLike(String value) {
            addCriterion("TZGZDW not like", value, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwIn(List<String> values) {
            addCriterion("TZGZDW in", values, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwNotIn(List<String> values) {
            addCriterion("TZGZDW not in", values, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwBetween(String value1, String value2) {
            addCriterion("TZGZDW between", value1, value2, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzgzdwNotBetween(String value1, String value2) {
            addCriterion("TZGZDW not between", value1, value2, "tzgzdw");
            return (Criteria) this;
        }

        public Criteria andTzzwIsNull() {
            addCriterion("TZZW is null");
            return (Criteria) this;
        }

        public Criteria andTzzwIsNotNull() {
            addCriterion("TZZW is not null");
            return (Criteria) this;
        }

        public Criteria andTzzwEqualTo(String value) {
            addCriterion("TZZW =", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotEqualTo(String value) {
            addCriterion("TZZW <>", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwGreaterThan(String value) {
            addCriterion("TZZW >", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwGreaterThanOrEqualTo(String value) {
            addCriterion("TZZW >=", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwLessThan(String value) {
            addCriterion("TZZW <", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwLessThanOrEqualTo(String value) {
            addCriterion("TZZW <=", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwLike(String value) {
            addCriterion("TZZW like", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotLike(String value) {
            addCriterion("TZZW not like", value, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwIn(List<String> values) {
            addCriterion("TZZW in", values, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotIn(List<String> values) {
            addCriterion("TZZW not in", values, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwBetween(String value1, String value2) {
            addCriterion("TZZW between", value1, value2, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzwNotBetween(String value1, String value2) {
            addCriterion("TZZW not between", value1, value2, "tzzw");
            return (Criteria) this;
        }

        public Criteria andTzzyIsNull() {
            addCriterion("TZZY is null");
            return (Criteria) this;
        }

        public Criteria andTzzyIsNotNull() {
            addCriterion("TZZY is not null");
            return (Criteria) this;
        }

        public Criteria andTzzyEqualTo(String value) {
            addCriterion("TZZY =", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyNotEqualTo(String value) {
            addCriterion("TZZY <>", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyGreaterThan(String value) {
            addCriterion("TZZY >", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyGreaterThanOrEqualTo(String value) {
            addCriterion("TZZY >=", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyLessThan(String value) {
            addCriterion("TZZY <", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyLessThanOrEqualTo(String value) {
            addCriterion("TZZY <=", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyLike(String value) {
            addCriterion("TZZY like", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyNotLike(String value) {
            addCriterion("TZZY not like", value, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyIn(List<String> values) {
            addCriterion("TZZY in", values, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyNotIn(List<String> values) {
            addCriterion("TZZY not in", values, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyBetween(String value1, String value2) {
            addCriterion("TZZY between", value1, value2, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzzyNotBetween(String value1, String value2) {
            addCriterion("TZZY not between", value1, value2, "tzzy");
            return (Criteria) this;
        }

        public Criteria andTzxslyIsNull() {
            addCriterion("TZXSLY is null");
            return (Criteria) this;
        }

        public Criteria andTzxslyIsNotNull() {
            addCriterion("TZXSLY is not null");
            return (Criteria) this;
        }

        public Criteria andTzxslyEqualTo(String value) {
            addCriterion("TZXSLY =", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyNotEqualTo(String value) {
            addCriterion("TZXSLY <>", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyGreaterThan(String value) {
            addCriterion("TZXSLY >", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyGreaterThanOrEqualTo(String value) {
            addCriterion("TZXSLY >=", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyLessThan(String value) {
            addCriterion("TZXSLY <", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyLessThanOrEqualTo(String value) {
            addCriterion("TZXSLY <=", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyLike(String value) {
            addCriterion("TZXSLY like", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyNotLike(String value) {
            addCriterion("TZXSLY not like", value, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyIn(List<String> values) {
            addCriterion("TZXSLY in", values, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyNotIn(List<String> values) {
            addCriterion("TZXSLY not in", values, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyBetween(String value1, String value2) {
            addCriterion("TZXSLY between", value1, value2, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andTzxslyNotBetween(String value1, String value2) {
            addCriterion("TZXSLY not between", value1, value2, "tzxsly");
            return (Criteria) this;
        }

        public Criteria andYqcgIsNull() {
            addCriterion("YQCG is null");
            return (Criteria) this;
        }

        public Criteria andYqcgIsNotNull() {
            addCriterion("YQCG is not null");
            return (Criteria) this;
        }

        public Criteria andYqcgEqualTo(String value) {
            addCriterion("YQCG =", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgNotEqualTo(String value) {
            addCriterion("YQCG <>", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgGreaterThan(String value) {
            addCriterion("YQCG >", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgGreaterThanOrEqualTo(String value) {
            addCriterion("YQCG >=", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgLessThan(String value) {
            addCriterion("YQCG <", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgLessThanOrEqualTo(String value) {
            addCriterion("YQCG <=", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgLike(String value) {
            addCriterion("YQCG like", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgNotLike(String value) {
            addCriterion("YQCG not like", value, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgIn(List<String> values) {
            addCriterion("YQCG in", values, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgNotIn(List<String> values) {
            addCriterion("YQCG not in", values, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgBetween(String value1, String value2) {
            addCriterion("YQCG between", value1, value2, "yqcg");
            return (Criteria) this;
        }

        public Criteria andYqcgNotBetween(String value1, String value2) {
            addCriterion("YQCG not between", value1, value2, "yqcg");
            return (Criteria) this;
        }

        public Criteria andZqrxmIsNull() {
            addCriterion("ZQRXM is null");
            return (Criteria) this;
        }

        public Criteria andZqrxmIsNotNull() {
            addCriterion("ZQRXM is not null");
            return (Criteria) this;
        }

        public Criteria andZqrxmEqualTo(String value) {
            addCriterion("ZQRXM =", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmNotEqualTo(String value) {
            addCriterion("ZQRXM <>", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmGreaterThan(String value) {
            addCriterion("ZQRXM >", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmGreaterThanOrEqualTo(String value) {
            addCriterion("ZQRXM >=", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmLessThan(String value) {
            addCriterion("ZQRXM <", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmLessThanOrEqualTo(String value) {
            addCriterion("ZQRXM <=", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmLike(String value) {
            addCriterion("ZQRXM like", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmNotLike(String value) {
            addCriterion("ZQRXM not like", value, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmIn(List<String> values) {
            addCriterion("ZQRXM in", values, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmNotIn(List<String> values) {
            addCriterion("ZQRXM not in", values, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmBetween(String value1, String value2) {
            addCriterion("ZQRXM between", value1, value2, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrxmNotBetween(String value1, String value2) {
            addCriterion("ZQRXM not between", value1, value2, "zqrxm");
            return (Criteria) this;
        }

        public Criteria andZqrdhIsNull() {
            addCriterion("ZQRDH is null");
            return (Criteria) this;
        }

        public Criteria andZqrdhIsNotNull() {
            addCriterion("ZQRDH is not null");
            return (Criteria) this;
        }

        public Criteria andZqrdhEqualTo(String value) {
            addCriterion("ZQRDH =", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhNotEqualTo(String value) {
            addCriterion("ZQRDH <>", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhGreaterThan(String value) {
            addCriterion("ZQRDH >", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhGreaterThanOrEqualTo(String value) {
            addCriterion("ZQRDH >=", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhLessThan(String value) {
            addCriterion("ZQRDH <", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhLessThanOrEqualTo(String value) {
            addCriterion("ZQRDH <=", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhLike(String value) {
            addCriterion("ZQRDH like", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhNotLike(String value) {
            addCriterion("ZQRDH not like", value, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhIn(List<String> values) {
            addCriterion("ZQRDH in", values, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhNotIn(List<String> values) {
            addCriterion("ZQRDH not in", values, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhBetween(String value1, String value2) {
            addCriterion("ZQRDH between", value1, value2, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqrdhNotBetween(String value1, String value2) {
            addCriterion("ZQRDH not between", value1, value2, "zqrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmIsNull() {
            addCriterion("ZQLXRXM is null");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmIsNotNull() {
            addCriterion("ZQLXRXM is not null");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmEqualTo(String value) {
            addCriterion("ZQLXRXM =", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmNotEqualTo(String value) {
            addCriterion("ZQLXRXM <>", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmGreaterThan(String value) {
            addCriterion("ZQLXRXM >", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmGreaterThanOrEqualTo(String value) {
            addCriterion("ZQLXRXM >=", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmLessThan(String value) {
            addCriterion("ZQLXRXM <", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmLessThanOrEqualTo(String value) {
            addCriterion("ZQLXRXM <=", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmLike(String value) {
            addCriterion("ZQLXRXM like", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmNotLike(String value) {
            addCriterion("ZQLXRXM not like", value, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmIn(List<String> values) {
            addCriterion("ZQLXRXM in", values, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmNotIn(List<String> values) {
            addCriterion("ZQLXRXM not in", values, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmBetween(String value1, String value2) {
            addCriterion("ZQLXRXM between", value1, value2, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrxmNotBetween(String value1, String value2) {
            addCriterion("ZQLXRXM not between", value1, value2, "zqlxrxm");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhIsNull() {
            addCriterion("ZQLXRDH is null");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhIsNotNull() {
            addCriterion("ZQLXRDH is not null");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhEqualTo(String value) {
            addCriterion("ZQLXRDH =", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhNotEqualTo(String value) {
            addCriterion("ZQLXRDH <>", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhGreaterThan(String value) {
            addCriterion("ZQLXRDH >", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhGreaterThanOrEqualTo(String value) {
            addCriterion("ZQLXRDH >=", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhLessThan(String value) {
            addCriterion("ZQLXRDH <", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhLessThanOrEqualTo(String value) {
            addCriterion("ZQLXRDH <=", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhLike(String value) {
            addCriterion("ZQLXRDH like", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhNotLike(String value) {
            addCriterion("ZQLXRDH not like", value, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhIn(List<String> values) {
            addCriterion("ZQLXRDH in", values, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhNotIn(List<String> values) {
            addCriterion("ZQLXRDH not in", values, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhBetween(String value1, String value2) {
            addCriterion("ZQLXRDH between", value1, value2, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andZqlxrdhNotBetween(String value1, String value2) {
            addCriterion("ZQLXRDH not between", value1, value2, "zqlxrdh");
            return (Criteria) this;
        }

        public Criteria andJdbmIsNull() {
            addCriterion("JDBM is null");
            return (Criteria) this;
        }

        public Criteria andJdbmIsNotNull() {
            addCriterion("JDBM is not null");
            return (Criteria) this;
        }

        public Criteria andJdbmEqualTo(String value) {
            addCriterion("JDBM =", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmNotEqualTo(String value) {
            addCriterion("JDBM <>", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmGreaterThan(String value) {
            addCriterion("JDBM >", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmGreaterThanOrEqualTo(String value) {
            addCriterion("JDBM >=", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmLessThan(String value) {
            addCriterion("JDBM <", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmLessThanOrEqualTo(String value) {
            addCriterion("JDBM <=", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmLike(String value) {
            addCriterion("JDBM like", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmNotLike(String value) {
            addCriterion("JDBM not like", value, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmIn(List<String> values) {
            addCriterion("JDBM in", values, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmNotIn(List<String> values) {
            addCriterion("JDBM not in", values, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmBetween(String value1, String value2) {
            addCriterion("JDBM between", value1, value2, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdbmNotBetween(String value1, String value2) {
            addCriterion("JDBM not between", value1, value2, "jdbm");
            return (Criteria) this;
        }

        public Criteria andJdlxIsNull() {
            addCriterion("JDLX is null");
            return (Criteria) this;
        }

        public Criteria andJdlxIsNotNull() {
            addCriterion("JDLX is not null");
            return (Criteria) this;
        }

        public Criteria andJdlxEqualTo(String value) {
            addCriterion("JDLX =", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxNotEqualTo(String value) {
            addCriterion("JDLX <>", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxGreaterThan(String value) {
            addCriterion("JDLX >", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxGreaterThanOrEqualTo(String value) {
            addCriterion("JDLX >=", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxLessThan(String value) {
            addCriterion("JDLX <", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxLessThanOrEqualTo(String value) {
            addCriterion("JDLX <=", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxLike(String value) {
            addCriterion("JDLX like", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxNotLike(String value) {
            addCriterion("JDLX not like", value, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxIn(List<String> values) {
            addCriterion("JDLX in", values, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxNotIn(List<String> values) {
            addCriterion("JDLX not in", values, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxBetween(String value1, String value2) {
            addCriterion("JDLX between", value1, value2, "jdlx");
            return (Criteria) this;
        }

        public Criteria andJdlxNotBetween(String value1, String value2) {
            addCriterion("JDLX not between", value1, value2, "jdlx");
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
     * T_WBJD_ZJ
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_WBJD_ZJ 2018-09-22
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