package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YjsZyxxsjxxParams {
    /**
     * V_YJS_ZYXXSJXX
     */
    protected String orderByClause;

    /**
     * V_YJS_ZYXXSJXX
     */
    protected boolean distinct;

    /**
     * V_YJS_ZYXXSJXX
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public YjsZyxxsjxxParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-14
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
     * @mbggenerated 2018-10-14
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * V_YJS_ZYXXSJXX 2018-10-14
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

        public Criteria andZyhIsNull() {
            addCriterion("ZYH is null");
            return (Criteria) this;
        }

        public Criteria andZyhIsNotNull() {
            addCriterion("ZYH is not null");
            return (Criteria) this;
        }

        public Criteria andZyhEqualTo(String value) {
            addCriterion("ZYH =", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotEqualTo(String value) {
            addCriterion("ZYH <>", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhGreaterThan(String value) {
            addCriterion("ZYH >", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhGreaterThanOrEqualTo(String value) {
            addCriterion("ZYH >=", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhLessThan(String value) {
            addCriterion("ZYH <", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhLessThanOrEqualTo(String value) {
            addCriterion("ZYH <=", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhLike(String value) {
            addCriterion("ZYH like", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotLike(String value) {
            addCriterion("ZYH not like", value, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhIn(List<String> values) {
            addCriterion("ZYH in", values, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotIn(List<String> values) {
            addCriterion("ZYH not in", values, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhBetween(String value1, String value2) {
            addCriterion("ZYH between", value1, value2, "zyh");
            return (Criteria) this;
        }

        public Criteria andZyhNotBetween(String value1, String value2) {
            addCriterion("ZYH not between", value1, value2, "zyh");
            return (Criteria) this;
        }

        public Criteria andZymcIsNull() {
            addCriterion("ZYMC is null");
            return (Criteria) this;
        }

        public Criteria andZymcIsNotNull() {
            addCriterion("ZYMC is not null");
            return (Criteria) this;
        }

        public Criteria andZymcEqualTo(String value) {
            addCriterion("ZYMC =", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcNotEqualTo(String value) {
            addCriterion("ZYMC <>", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcGreaterThan(String value) {
            addCriterion("ZYMC >", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcGreaterThanOrEqualTo(String value) {
            addCriterion("ZYMC >=", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcLessThan(String value) {
            addCriterion("ZYMC <", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcLessThanOrEqualTo(String value) {
            addCriterion("ZYMC <=", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcLike(String value) {
            addCriterion("ZYMC like", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcNotLike(String value) {
            addCriterion("ZYMC not like", value, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcIn(List<String> values) {
            addCriterion("ZYMC in", values, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcNotIn(List<String> values) {
            addCriterion("ZYMC not in", values, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcBetween(String value1, String value2) {
            addCriterion("ZYMC between", value1, value2, "zymc");
            return (Criteria) this;
        }

        public Criteria andZymcNotBetween(String value1, String value2) {
            addCriterion("ZYMC not between", value1, value2, "zymc");
            return (Criteria) this;
        }

        public Criteria andZyjcIsNull() {
            addCriterion("ZYJC is null");
            return (Criteria) this;
        }

        public Criteria andZyjcIsNotNull() {
            addCriterion("ZYJC is not null");
            return (Criteria) this;
        }

        public Criteria andZyjcEqualTo(String value) {
            addCriterion("ZYJC =", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcNotEqualTo(String value) {
            addCriterion("ZYJC <>", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcGreaterThan(String value) {
            addCriterion("ZYJC >", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcGreaterThanOrEqualTo(String value) {
            addCriterion("ZYJC >=", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcLessThan(String value) {
            addCriterion("ZYJC <", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcLessThanOrEqualTo(String value) {
            addCriterion("ZYJC <=", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcLike(String value) {
            addCriterion("ZYJC like", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcNotLike(String value) {
            addCriterion("ZYJC not like", value, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcIn(List<String> values) {
            addCriterion("ZYJC in", values, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcNotIn(List<String> values) {
            addCriterion("ZYJC not in", values, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcBetween(String value1, String value2) {
            addCriterion("ZYJC between", value1, value2, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyjcNotBetween(String value1, String value2) {
            addCriterion("ZYJC not between", value1, value2, "zyjc");
            return (Criteria) this;
        }

        public Criteria andZyywmcIsNull() {
            addCriterion("ZYYWMC is null");
            return (Criteria) this;
        }

        public Criteria andZyywmcIsNotNull() {
            addCriterion("ZYYWMC is not null");
            return (Criteria) this;
        }

        public Criteria andZyywmcEqualTo(String value) {
            addCriterion("ZYYWMC =", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcNotEqualTo(String value) {
            addCriterion("ZYYWMC <>", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcGreaterThan(String value) {
            addCriterion("ZYYWMC >", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZYYWMC >=", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcLessThan(String value) {
            addCriterion("ZYYWMC <", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcLessThanOrEqualTo(String value) {
            addCriterion("ZYYWMC <=", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcLike(String value) {
            addCriterion("ZYYWMC like", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcNotLike(String value) {
            addCriterion("ZYYWMC not like", value, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcIn(List<String> values) {
            addCriterion("ZYYWMC in", values, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcNotIn(List<String> values) {
            addCriterion("ZYYWMC not in", values, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcBetween(String value1, String value2) {
            addCriterion("ZYYWMC between", value1, value2, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyywmcNotBetween(String value1, String value2) {
            addCriterion("ZYYWMC not between", value1, value2, "zyywmc");
            return (Criteria) this;
        }

        public Criteria andZyfxhIsNull() {
            addCriterion("ZYFXH is null");
            return (Criteria) this;
        }

        public Criteria andZyfxhIsNotNull() {
            addCriterion("ZYFXH is not null");
            return (Criteria) this;
        }

        public Criteria andZyfxhEqualTo(String value) {
            addCriterion("ZYFXH =", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhNotEqualTo(String value) {
            addCriterion("ZYFXH <>", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhGreaterThan(String value) {
            addCriterion("ZYFXH >", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhGreaterThanOrEqualTo(String value) {
            addCriterion("ZYFXH >=", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhLessThan(String value) {
            addCriterion("ZYFXH <", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhLessThanOrEqualTo(String value) {
            addCriterion("ZYFXH <=", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhLike(String value) {
            addCriterion("ZYFXH like", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhNotLike(String value) {
            addCriterion("ZYFXH not like", value, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhIn(List<String> values) {
            addCriterion("ZYFXH in", values, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhNotIn(List<String> values) {
            addCriterion("ZYFXH not in", values, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhBetween(String value1, String value2) {
            addCriterion("ZYFXH between", value1, value2, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andZyfxhNotBetween(String value1, String value2) {
            addCriterion("ZYFXH not between", value1, value2, "zyfxh");
            return (Criteria) this;
        }

        public Criteria andDwhIsNull() {
            addCriterion("DWH is null");
            return (Criteria) this;
        }

        public Criteria andDwhIsNotNull() {
            addCriterion("DWH is not null");
            return (Criteria) this;
        }

        public Criteria andDwhEqualTo(String value) {
            addCriterion("DWH =", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotEqualTo(String value) {
            addCriterion("DWH <>", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThan(String value) {
            addCriterion("DWH >", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhGreaterThanOrEqualTo(String value) {
            addCriterion("DWH >=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThan(String value) {
            addCriterion("DWH <", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLessThanOrEqualTo(String value) {
            addCriterion("DWH <=", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhLike(String value) {
            addCriterion("DWH like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotLike(String value) {
            addCriterion("DWH not like", value, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhIn(List<String> values) {
            addCriterion("DWH in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotIn(List<String> values) {
            addCriterion("DWH not in", values, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhBetween(String value1, String value2) {
            addCriterion("DWH between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andDwhNotBetween(String value1, String value2) {
            addCriterion("DWH not between", value1, value2, "dwh");
            return (Criteria) this;
        }

        public Criteria andXzIsNull() {
            addCriterion("XZ is null");
            return (Criteria) this;
        }

        public Criteria andXzIsNotNull() {
            addCriterion("XZ is not null");
            return (Criteria) this;
        }

        public Criteria andXzEqualTo(BigDecimal value) {
            addCriterion("XZ =", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotEqualTo(BigDecimal value) {
            addCriterion("XZ <>", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThan(BigDecimal value) {
            addCriterion("XZ >", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XZ >=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThan(BigDecimal value) {
            addCriterion("XZ <", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XZ <=", value, "xz");
            return (Criteria) this;
        }

        public Criteria andXzIn(List<BigDecimal> values) {
            addCriterion("XZ in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotIn(List<BigDecimal> values) {
            addCriterion("XZ not in", values, "xz");
            return (Criteria) this;
        }

        public Criteria andXzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XZ between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XZ not between", value1, value2, "xz");
            return (Criteria) this;
        }

        public Criteria andXkmlmIsNull() {
            addCriterion("XKMLM is null");
            return (Criteria) this;
        }

        public Criteria andXkmlmIsNotNull() {
            addCriterion("XKMLM is not null");
            return (Criteria) this;
        }

        public Criteria andXkmlmEqualTo(String value) {
            addCriterion("XKMLM =", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmNotEqualTo(String value) {
            addCriterion("XKMLM <>", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmGreaterThan(String value) {
            addCriterion("XKMLM >", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmGreaterThanOrEqualTo(String value) {
            addCriterion("XKMLM >=", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmLessThan(String value) {
            addCriterion("XKMLM <", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmLessThanOrEqualTo(String value) {
            addCriterion("XKMLM <=", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmLike(String value) {
            addCriterion("XKMLM like", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmNotLike(String value) {
            addCriterion("XKMLM not like", value, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmIn(List<String> values) {
            addCriterion("XKMLM in", values, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmNotIn(List<String> values) {
            addCriterion("XKMLM not in", values, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmBetween(String value1, String value2) {
            addCriterion("XKMLM between", value1, value2, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andXkmlmNotBetween(String value1, String value2) {
            addCriterion("XKMLM not between", value1, value2, "xkmlm");
            return (Criteria) this;
        }

        public Criteria andYjszymIsNull() {
            addCriterion("YJSZYM is null");
            return (Criteria) this;
        }

        public Criteria andYjszymIsNotNull() {
            addCriterion("YJSZYM is not null");
            return (Criteria) this;
        }

        public Criteria andYjszymEqualTo(String value) {
            addCriterion("YJSZYM =", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymNotEqualTo(String value) {
            addCriterion("YJSZYM <>", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymGreaterThan(String value) {
            addCriterion("YJSZYM >", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymGreaterThanOrEqualTo(String value) {
            addCriterion("YJSZYM >=", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymLessThan(String value) {
            addCriterion("YJSZYM <", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymLessThanOrEqualTo(String value) {
            addCriterion("YJSZYM <=", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymLike(String value) {
            addCriterion("YJSZYM like", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymNotLike(String value) {
            addCriterion("YJSZYM not like", value, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymIn(List<String> values) {
            addCriterion("YJSZYM in", values, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymNotIn(List<String> values) {
            addCriterion("YJSZYM not in", values, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymBetween(String value1, String value2) {
            addCriterion("YJSZYM between", value1, value2, "yjszym");
            return (Criteria) this;
        }

        public Criteria andYjszymNotBetween(String value1, String value2) {
            addCriterion("YJSZYM not between", value1, value2, "yjszym");
            return (Criteria) this;
        }

        public Criteria andJlnyIsNull() {
            addCriterion("JLNY is null");
            return (Criteria) this;
        }

        public Criteria andJlnyIsNotNull() {
            addCriterion("JLNY is not null");
            return (Criteria) this;
        }

        public Criteria andJlnyEqualTo(String value) {
            addCriterion("JLNY =", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotEqualTo(String value) {
            addCriterion("JLNY <>", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyGreaterThan(String value) {
            addCriterion("JLNY >", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyGreaterThanOrEqualTo(String value) {
            addCriterion("JLNY >=", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyLessThan(String value) {
            addCriterion("JLNY <", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyLessThanOrEqualTo(String value) {
            addCriterion("JLNY <=", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyLike(String value) {
            addCriterion("JLNY like", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotLike(String value) {
            addCriterion("JLNY not like", value, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyIn(List<String> values) {
            addCriterion("JLNY in", values, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotIn(List<String> values) {
            addCriterion("JLNY not in", values, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyBetween(String value1, String value2) {
            addCriterion("JLNY between", value1, value2, "jlny");
            return (Criteria) this;
        }

        public Criteria andJlnyNotBetween(String value1, String value2) {
            addCriterion("JLNY not between", value1, value2, "jlny");
            return (Criteria) this;
        }

        public Criteria andQsxqIsNull() {
            addCriterion("QSXQ is null");
            return (Criteria) this;
        }

        public Criteria andQsxqIsNotNull() {
            addCriterion("QSXQ is not null");
            return (Criteria) this;
        }

        public Criteria andQsxqEqualTo(String value) {
            addCriterion("QSXQ =", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqNotEqualTo(String value) {
            addCriterion("QSXQ <>", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqGreaterThan(String value) {
            addCriterion("QSXQ >", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqGreaterThanOrEqualTo(String value) {
            addCriterion("QSXQ >=", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqLessThan(String value) {
            addCriterion("QSXQ <", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqLessThanOrEqualTo(String value) {
            addCriterion("QSXQ <=", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqLike(String value) {
            addCriterion("QSXQ like", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqNotLike(String value) {
            addCriterion("QSXQ not like", value, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqIn(List<String> values) {
            addCriterion("QSXQ in", values, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqNotIn(List<String> values) {
            addCriterion("QSXQ not in", values, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqBetween(String value1, String value2) {
            addCriterion("QSXQ between", value1, value2, "qsxq");
            return (Criteria) this;
        }

        public Criteria andQsxqNotBetween(String value1, String value2) {
            addCriterion("QSXQ not between", value1, value2, "qsxq");
            return (Criteria) this;
        }

        public Criteria andBzkzymIsNull() {
            addCriterion("BZKZYM is null");
            return (Criteria) this;
        }

        public Criteria andBzkzymIsNotNull() {
            addCriterion("BZKZYM is not null");
            return (Criteria) this;
        }

        public Criteria andBzkzymEqualTo(String value) {
            addCriterion("BZKZYM =", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymNotEqualTo(String value) {
            addCriterion("BZKZYM <>", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymGreaterThan(String value) {
            addCriterion("BZKZYM >", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymGreaterThanOrEqualTo(String value) {
            addCriterion("BZKZYM >=", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymLessThan(String value) {
            addCriterion("BZKZYM <", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymLessThanOrEqualTo(String value) {
            addCriterion("BZKZYM <=", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymLike(String value) {
            addCriterion("BZKZYM like", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymNotLike(String value) {
            addCriterion("BZKZYM not like", value, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymIn(List<String> values) {
            addCriterion("BZKZYM in", values, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymNotIn(List<String> values) {
            addCriterion("BZKZYM not in", values, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymBetween(String value1, String value2) {
            addCriterion("BZKZYM between", value1, value2, "bzkzym");
            return (Criteria) this;
        }

        public Criteria andBzkzymNotBetween(String value1, String value2) {
            addCriterion("BZKZYM not between", value1, value2, "bzkzym");
            return (Criteria) this;
        }
    }

    /**
     * V_YJS_ZYXXSJXX
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * V_YJS_ZYXXSJXX 2018-10-14
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