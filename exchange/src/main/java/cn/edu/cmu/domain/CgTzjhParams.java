package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CgTzjhParams {
    /**
     * T_CG_TZJH
     */
    protected String orderByClause;

    /**
     * T_CG_TZJH
     */
    protected boolean distinct;

    /**
     * T_CG_TZJH
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-22
     */
    public CgTzjhParams() {
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
     * T_CG_TZJH 2018-11-22
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

        public Criteria andTzhIsNull() {
            addCriterion("TZH is null");
            return (Criteria) this;
        }

        public Criteria andTzhIsNotNull() {
            addCriterion("TZH is not null");
            return (Criteria) this;
        }

        public Criteria andTzhEqualTo(String value) {
            addCriterion("TZH =", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhNotEqualTo(String value) {
            addCriterion("TZH <>", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhGreaterThan(String value) {
            addCriterion("TZH >", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhGreaterThanOrEqualTo(String value) {
            addCriterion("TZH >=", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhLessThan(String value) {
            addCriterion("TZH <", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhLessThanOrEqualTo(String value) {
            addCriterion("TZH <=", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhLike(String value) {
            addCriterion("TZH like", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhNotLike(String value) {
            addCriterion("TZH not like", value, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhIn(List<String> values) {
            addCriterion("TZH in", values, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhNotIn(List<String> values) {
            addCriterion("TZH not in", values, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhBetween(String value1, String value2) {
            addCriterion("TZH between", value1, value2, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzhNotBetween(String value1, String value2) {
            addCriterion("TZH not between", value1, value2, "tzh");
            return (Criteria) this;
        }

        public Criteria andTzmcIsNull() {
            addCriterion("TZMC is null");
            return (Criteria) this;
        }

        public Criteria andTzmcIsNotNull() {
            addCriterion("TZMC is not null");
            return (Criteria) this;
        }

        public Criteria andTzmcEqualTo(String value) {
            addCriterion("TZMC =", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcNotEqualTo(String value) {
            addCriterion("TZMC <>", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcGreaterThan(String value) {
            addCriterion("TZMC >", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcGreaterThanOrEqualTo(String value) {
            addCriterion("TZMC >=", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcLessThan(String value) {
            addCriterion("TZMC <", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcLessThanOrEqualTo(String value) {
            addCriterion("TZMC <=", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcLike(String value) {
            addCriterion("TZMC like", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcNotLike(String value) {
            addCriterion("TZMC not like", value, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcIn(List<String> values) {
            addCriterion("TZMC in", values, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcNotIn(List<String> values) {
            addCriterion("TZMC not in", values, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcBetween(String value1, String value2) {
            addCriterion("TZMC between", value1, value2, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzmcNotBetween(String value1, String value2) {
            addCriterion("TZMC not between", value1, value2, "tzmc");
            return (Criteria) this;
        }

        public Criteria andTzlbIsNull() {
            addCriterion("TZLB is null");
            return (Criteria) this;
        }

        public Criteria andTzlbIsNotNull() {
            addCriterion("TZLB is not null");
            return (Criteria) this;
        }

        public Criteria andTzlbEqualTo(String value) {
            addCriterion("TZLB =", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbNotEqualTo(String value) {
            addCriterion("TZLB <>", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbGreaterThan(String value) {
            addCriterion("TZLB >", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbGreaterThanOrEqualTo(String value) {
            addCriterion("TZLB >=", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbLessThan(String value) {
            addCriterion("TZLB <", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbLessThanOrEqualTo(String value) {
            addCriterion("TZLB <=", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbLike(String value) {
            addCriterion("TZLB like", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbNotLike(String value) {
            addCriterion("TZLB not like", value, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbIn(List<String> values) {
            addCriterion("TZLB in", values, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbNotIn(List<String> values) {
            addCriterion("TZLB not in", values, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbBetween(String value1, String value2) {
            addCriterion("TZLB between", value1, value2, "tzlb");
            return (Criteria) this;
        }

        public Criteria andTzlbNotBetween(String value1, String value2) {
            addCriterion("TZLB not between", value1, value2, "tzlb");
            return (Criteria) this;
        }

        public Criteria andJhlxIsNull() {
            addCriterion("JHLX is null");
            return (Criteria) this;
        }

        public Criteria andJhlxIsNotNull() {
            addCriterion("JHLX is not null");
            return (Criteria) this;
        }

        public Criteria andJhlxEqualTo(String value) {
            addCriterion("JHLX =", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxNotEqualTo(String value) {
            addCriterion("JHLX <>", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxGreaterThan(String value) {
            addCriterion("JHLX >", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxGreaterThanOrEqualTo(String value) {
            addCriterion("JHLX >=", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxLessThan(String value) {
            addCriterion("JHLX <", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxLessThanOrEqualTo(String value) {
            addCriterion("JHLX <=", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxLike(String value) {
            addCriterion("JHLX like", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxNotLike(String value) {
            addCriterion("JHLX not like", value, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxIn(List<String> values) {
            addCriterion("JHLX in", values, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxNotIn(List<String> values) {
            addCriterion("JHLX not in", values, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxBetween(String value1, String value2) {
            addCriterion("JHLX between", value1, value2, "jhlx");
            return (Criteria) this;
        }

        public Criteria andJhlxNotBetween(String value1, String value2) {
            addCriterion("JHLX not between", value1, value2, "jhlx");
            return (Criteria) this;
        }

        public Criteria andCfdwIsNull() {
            addCriterion("CFDW is null");
            return (Criteria) this;
        }

        public Criteria andCfdwIsNotNull() {
            addCriterion("CFDW is not null");
            return (Criteria) this;
        }

        public Criteria andCfdwEqualTo(String value) {
            addCriterion("CFDW =", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwNotEqualTo(String value) {
            addCriterion("CFDW <>", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwGreaterThan(String value) {
            addCriterion("CFDW >", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwGreaterThanOrEqualTo(String value) {
            addCriterion("CFDW >=", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwLessThan(String value) {
            addCriterion("CFDW <", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwLessThanOrEqualTo(String value) {
            addCriterion("CFDW <=", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwLike(String value) {
            addCriterion("CFDW like", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwNotLike(String value) {
            addCriterion("CFDW not like", value, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwIn(List<String> values) {
            addCriterion("CFDW in", values, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwNotIn(List<String> values) {
            addCriterion("CFDW not in", values, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwBetween(String value1, String value2) {
            addCriterion("CFDW between", value1, value2, "cfdw");
            return (Criteria) this;
        }

        public Criteria andCfdwNotBetween(String value1, String value2) {
            addCriterion("CFDW not between", value1, value2, "cfdw");
            return (Criteria) this;
        }

        public Criteria andTzjbIsNull() {
            addCriterion("TZJB is null");
            return (Criteria) this;
        }

        public Criteria andTzjbIsNotNull() {
            addCriterion("TZJB is not null");
            return (Criteria) this;
        }

        public Criteria andTzjbEqualTo(String value) {
            addCriterion("TZJB =", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbNotEqualTo(String value) {
            addCriterion("TZJB <>", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbGreaterThan(String value) {
            addCriterion("TZJB >", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbGreaterThanOrEqualTo(String value) {
            addCriterion("TZJB >=", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbLessThan(String value) {
            addCriterion("TZJB <", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbLessThanOrEqualTo(String value) {
            addCriterion("TZJB <=", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbLike(String value) {
            addCriterion("TZJB like", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbNotLike(String value) {
            addCriterion("TZJB not like", value, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbIn(List<String> values) {
            addCriterion("TZJB in", values, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbNotIn(List<String> values) {
            addCriterion("TZJB not in", values, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbBetween(String value1, String value2) {
            addCriterion("TZJB between", value1, value2, "tzjb");
            return (Criteria) this;
        }

        public Criteria andTzjbNotBetween(String value1, String value2) {
            addCriterion("TZJB not between", value1, value2, "tzjb");
            return (Criteria) this;
        }

        public Criteria andZzhskIsNull() {
            addCriterion("ZZHSK is null");
            return (Criteria) this;
        }

        public Criteria andZzhskIsNotNull() {
            addCriterion("ZZHSK is not null");
            return (Criteria) this;
        }

        public Criteria andZzhskEqualTo(String value) {
            addCriterion("ZZHSK =", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskNotEqualTo(String value) {
            addCriterion("ZZHSK <>", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskGreaterThan(String value) {
            addCriterion("ZZHSK >", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskGreaterThanOrEqualTo(String value) {
            addCriterion("ZZHSK >=", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskLessThan(String value) {
            addCriterion("ZZHSK <", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskLessThanOrEqualTo(String value) {
            addCriterion("ZZHSK <=", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskLike(String value) {
            addCriterion("ZZHSK like", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskNotLike(String value) {
            addCriterion("ZZHSK not like", value, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskIn(List<String> values) {
            addCriterion("ZZHSK in", values, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskNotIn(List<String> values) {
            addCriterion("ZZHSK not in", values, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskBetween(String value1, String value2) {
            addCriterion("ZZHSK between", value1, value2, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andZzhskNotBetween(String value1, String value2) {
            addCriterion("ZZHSK not between", value1, value2, "zzhsk");
            return (Criteria) this;
        }

        public Criteria andFzrxmIsNull() {
            addCriterion("FZRXM is null");
            return (Criteria) this;
        }

        public Criteria andFzrxmIsNotNull() {
            addCriterion("FZRXM is not null");
            return (Criteria) this;
        }

        public Criteria andFzrxmEqualTo(String value) {
            addCriterion("FZRXM =", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmNotEqualTo(String value) {
            addCriterion("FZRXM <>", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmGreaterThan(String value) {
            addCriterion("FZRXM >", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmGreaterThanOrEqualTo(String value) {
            addCriterion("FZRXM >=", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmLessThan(String value) {
            addCriterion("FZRXM <", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmLessThanOrEqualTo(String value) {
            addCriterion("FZRXM <=", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmLike(String value) {
            addCriterion("FZRXM like", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmNotLike(String value) {
            addCriterion("FZRXM not like", value, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmIn(List<String> values) {
            addCriterion("FZRXM in", values, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmNotIn(List<String> values) {
            addCriterion("FZRXM not in", values, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmBetween(String value1, String value2) {
            addCriterion("FZRXM between", value1, value2, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andFzrxmNotBetween(String value1, String value2) {
            addCriterion("FZRXM not between", value1, value2, "fzrxm");
            return (Criteria) this;
        }

        public Criteria andXzzwIsNull() {
            addCriterion("XZZW is null");
            return (Criteria) this;
        }

        public Criteria andXzzwIsNotNull() {
            addCriterion("XZZW is not null");
            return (Criteria) this;
        }

        public Criteria andXzzwEqualTo(String value) {
            addCriterion("XZZW =", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwNotEqualTo(String value) {
            addCriterion("XZZW <>", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwGreaterThan(String value) {
            addCriterion("XZZW >", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwGreaterThanOrEqualTo(String value) {
            addCriterion("XZZW >=", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwLessThan(String value) {
            addCriterion("XZZW <", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwLessThanOrEqualTo(String value) {
            addCriterion("XZZW <=", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwLike(String value) {
            addCriterion("XZZW like", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwNotLike(String value) {
            addCriterion("XZZW not like", value, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwIn(List<String> values) {
            addCriterion("XZZW in", values, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwNotIn(List<String> values) {
            addCriterion("XZZW not in", values, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwBetween(String value1, String value2) {
            addCriterion("XZZW between", value1, value2, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzzwNotBetween(String value1, String value2) {
            addCriterion("XZZW not between", value1, value2, "xzzw");
            return (Criteria) this;
        }

        public Criteria andXzjbIsNull() {
            addCriterion("XZJB is null");
            return (Criteria) this;
        }

        public Criteria andXzjbIsNotNull() {
            addCriterion("XZJB is not null");
            return (Criteria) this;
        }

        public Criteria andXzjbEqualTo(String value) {
            addCriterion("XZJB =", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbNotEqualTo(String value) {
            addCriterion("XZJB <>", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbGreaterThan(String value) {
            addCriterion("XZJB >", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbGreaterThanOrEqualTo(String value) {
            addCriterion("XZJB >=", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbLessThan(String value) {
            addCriterion("XZJB <", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbLessThanOrEqualTo(String value) {
            addCriterion("XZJB <=", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbLike(String value) {
            addCriterion("XZJB like", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbNotLike(String value) {
            addCriterion("XZJB not like", value, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbIn(List<String> values) {
            addCriterion("XZJB in", values, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbNotIn(List<String> values) {
            addCriterion("XZJB not in", values, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbBetween(String value1, String value2) {
            addCriterion("XZJB between", value1, value2, "xzjb");
            return (Criteria) this;
        }

        public Criteria andXzjbNotBetween(String value1, String value2) {
            addCriterion("XZJB not between", value1, value2, "xzjb");
            return (Criteria) this;
        }

        public Criteria andJszwIsNull() {
            addCriterion("JSZW is null");
            return (Criteria) this;
        }

        public Criteria andJszwIsNotNull() {
            addCriterion("JSZW is not null");
            return (Criteria) this;
        }

        public Criteria andJszwEqualTo(String value) {
            addCriterion("JSZW =", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwNotEqualTo(String value) {
            addCriterion("JSZW <>", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwGreaterThan(String value) {
            addCriterion("JSZW >", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwGreaterThanOrEqualTo(String value) {
            addCriterion("JSZW >=", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwLessThan(String value) {
            addCriterion("JSZW <", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwLessThanOrEqualTo(String value) {
            addCriterion("JSZW <=", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwLike(String value) {
            addCriterion("JSZW like", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwNotLike(String value) {
            addCriterion("JSZW not like", value, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwIn(List<String> values) {
            addCriterion("JSZW in", values, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwNotIn(List<String> values) {
            addCriterion("JSZW not in", values, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwBetween(String value1, String value2) {
            addCriterion("JSZW between", value1, value2, "jszw");
            return (Criteria) this;
        }

        public Criteria andJszwNotBetween(String value1, String value2) {
            addCriterion("JSZW not between", value1, value2, "jszw");
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

        public Criteria andZjIsNull() {
            addCriterion("ZJ is null");
            return (Criteria) this;
        }

        public Criteria andZjIsNotNull() {
            addCriterion("ZJ is not null");
            return (Criteria) this;
        }

        public Criteria andZjEqualTo(String value) {
            addCriterion("ZJ =", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotEqualTo(String value) {
            addCriterion("ZJ <>", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThan(String value) {
            addCriterion("ZJ >", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjGreaterThanOrEqualTo(String value) {
            addCriterion("ZJ >=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThan(String value) {
            addCriterion("ZJ <", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLessThanOrEqualTo(String value) {
            addCriterion("ZJ <=", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjLike(String value) {
            addCriterion("ZJ like", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotLike(String value) {
            addCriterion("ZJ not like", value, "zj");
            return (Criteria) this;
        }

        public Criteria andZjIn(List<String> values) {
            addCriterion("ZJ in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotIn(List<String> values) {
            addCriterion("ZJ not in", values, "zj");
            return (Criteria) this;
        }

        public Criteria andZjBetween(String value1, String value2) {
            addCriterion("ZJ between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andZjNotBetween(String value1, String value2) {
            addCriterion("ZJ not between", value1, value2, "zj");
            return (Criteria) this;
        }

        public Criteria andCfgj1IsNull() {
            addCriterion("CFGJ1 is null");
            return (Criteria) this;
        }

        public Criteria andCfgj1IsNotNull() {
            addCriterion("CFGJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andCfgj1EqualTo(String value) {
            addCriterion("CFGJ1 =", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1NotEqualTo(String value) {
            addCriterion("CFGJ1 <>", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1GreaterThan(String value) {
            addCriterion("CFGJ1 >", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1GreaterThanOrEqualTo(String value) {
            addCriterion("CFGJ1 >=", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1LessThan(String value) {
            addCriterion("CFGJ1 <", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1LessThanOrEqualTo(String value) {
            addCriterion("CFGJ1 <=", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1Like(String value) {
            addCriterion("CFGJ1 like", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1NotLike(String value) {
            addCriterion("CFGJ1 not like", value, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1In(List<String> values) {
            addCriterion("CFGJ1 in", values, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1NotIn(List<String> values) {
            addCriterion("CFGJ1 not in", values, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1Between(String value1, String value2) {
            addCriterion("CFGJ1 between", value1, value2, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj1NotBetween(String value1, String value2) {
            addCriterion("CFGJ1 not between", value1, value2, "cfgj1");
            return (Criteria) this;
        }

        public Criteria andCfgj2IsNull() {
            addCriterion("CFGJ2 is null");
            return (Criteria) this;
        }

        public Criteria andCfgj2IsNotNull() {
            addCriterion("CFGJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andCfgj2EqualTo(String value) {
            addCriterion("CFGJ2 =", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2NotEqualTo(String value) {
            addCriterion("CFGJ2 <>", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2GreaterThan(String value) {
            addCriterion("CFGJ2 >", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2GreaterThanOrEqualTo(String value) {
            addCriterion("CFGJ2 >=", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2LessThan(String value) {
            addCriterion("CFGJ2 <", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2LessThanOrEqualTo(String value) {
            addCriterion("CFGJ2 <=", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2Like(String value) {
            addCriterion("CFGJ2 like", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2NotLike(String value) {
            addCriterion("CFGJ2 not like", value, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2In(List<String> values) {
            addCriterion("CFGJ2 in", values, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2NotIn(List<String> values) {
            addCriterion("CFGJ2 not in", values, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2Between(String value1, String value2) {
            addCriterion("CFGJ2 between", value1, value2, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj2NotBetween(String value1, String value2) {
            addCriterion("CFGJ2 not between", value1, value2, "cfgj2");
            return (Criteria) this;
        }

        public Criteria andCfgj3IsNull() {
            addCriterion("CFGJ3 is null");
            return (Criteria) this;
        }

        public Criteria andCfgj3IsNotNull() {
            addCriterion("CFGJ3 is not null");
            return (Criteria) this;
        }

        public Criteria andCfgj3EqualTo(String value) {
            addCriterion("CFGJ3 =", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3NotEqualTo(String value) {
            addCriterion("CFGJ3 <>", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3GreaterThan(String value) {
            addCriterion("CFGJ3 >", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3GreaterThanOrEqualTo(String value) {
            addCriterion("CFGJ3 >=", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3LessThan(String value) {
            addCriterion("CFGJ3 <", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3LessThanOrEqualTo(String value) {
            addCriterion("CFGJ3 <=", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3Like(String value) {
            addCriterion("CFGJ3 like", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3NotLike(String value) {
            addCriterion("CFGJ3 not like", value, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3In(List<String> values) {
            addCriterion("CFGJ3 in", values, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3NotIn(List<String> values) {
            addCriterion("CFGJ3 not in", values, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3Between(String value1, String value2) {
            addCriterion("CFGJ3 between", value1, value2, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj3NotBetween(String value1, String value2) {
            addCriterion("CFGJ3 not between", value1, value2, "cfgj3");
            return (Criteria) this;
        }

        public Criteria andCfgj4IsNull() {
            addCriterion("CFGJ4 is null");
            return (Criteria) this;
        }

        public Criteria andCfgj4IsNotNull() {
            addCriterion("CFGJ4 is not null");
            return (Criteria) this;
        }

        public Criteria andCfgj4EqualTo(String value) {
            addCriterion("CFGJ4 =", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4NotEqualTo(String value) {
            addCriterion("CFGJ4 <>", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4GreaterThan(String value) {
            addCriterion("CFGJ4 >", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4GreaterThanOrEqualTo(String value) {
            addCriterion("CFGJ4 >=", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4LessThan(String value) {
            addCriterion("CFGJ4 <", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4LessThanOrEqualTo(String value) {
            addCriterion("CFGJ4 <=", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4Like(String value) {
            addCriterion("CFGJ4 like", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4NotLike(String value) {
            addCriterion("CFGJ4 not like", value, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4In(List<String> values) {
            addCriterion("CFGJ4 in", values, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4NotIn(List<String> values) {
            addCriterion("CFGJ4 not in", values, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4Between(String value1, String value2) {
            addCriterion("CFGJ4 between", value1, value2, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj4NotBetween(String value1, String value2) {
            addCriterion("CFGJ4 not between", value1, value2, "cfgj4");
            return (Criteria) this;
        }

        public Criteria andCfgj5IsNull() {
            addCriterion("CFGJ5 is null");
            return (Criteria) this;
        }

        public Criteria andCfgj5IsNotNull() {
            addCriterion("CFGJ5 is not null");
            return (Criteria) this;
        }

        public Criteria andCfgj5EqualTo(String value) {
            addCriterion("CFGJ5 =", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5NotEqualTo(String value) {
            addCriterion("CFGJ5 <>", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5GreaterThan(String value) {
            addCriterion("CFGJ5 >", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5GreaterThanOrEqualTo(String value) {
            addCriterion("CFGJ5 >=", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5LessThan(String value) {
            addCriterion("CFGJ5 <", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5LessThanOrEqualTo(String value) {
            addCriterion("CFGJ5 <=", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5Like(String value) {
            addCriterion("CFGJ5 like", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5NotLike(String value) {
            addCriterion("CFGJ5 not like", value, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5In(List<String> values) {
            addCriterion("CFGJ5 in", values, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5NotIn(List<String> values) {
            addCriterion("CFGJ5 not in", values, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5Between(String value1, String value2) {
            addCriterion("CFGJ5 between", value1, value2, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andCfgj5NotBetween(String value1, String value2) {
            addCriterion("CFGJ5 not between", value1, value2, "cfgj5");
            return (Criteria) this;
        }

        public Criteria andFfgzIsNull() {
            addCriterion("FFGZ is null");
            return (Criteria) this;
        }

        public Criteria andFfgzIsNotNull() {
            addCriterion("FFGZ is not null");
            return (Criteria) this;
        }

        public Criteria andFfgzEqualTo(String value) {
            addCriterion("FFGZ =", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzNotEqualTo(String value) {
            addCriterion("FFGZ <>", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzGreaterThan(String value) {
            addCriterion("FFGZ >", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzGreaterThanOrEqualTo(String value) {
            addCriterion("FFGZ >=", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzLessThan(String value) {
            addCriterion("FFGZ <", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzLessThanOrEqualTo(String value) {
            addCriterion("FFGZ <=", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzLike(String value) {
            addCriterion("FFGZ like", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzNotLike(String value) {
            addCriterion("FFGZ not like", value, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzIn(List<String> values) {
            addCriterion("FFGZ in", values, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzNotIn(List<String> values) {
            addCriterion("FFGZ not in", values, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzBetween(String value1, String value2) {
            addCriterion("FFGZ between", value1, value2, "ffgz");
            return (Criteria) this;
        }

        public Criteria andFfgzNotBetween(String value1, String value2) {
            addCriterion("FFGZ not between", value1, value2, "ffgz");
            return (Criteria) this;
        }

        public Criteria andTzrsIsNull() {
            addCriterion("TZRS is null");
            return (Criteria) this;
        }

        public Criteria andTzrsIsNotNull() {
            addCriterion("TZRS is not null");
            return (Criteria) this;
        }

        public Criteria andTzrsEqualTo(BigDecimal value) {
            addCriterion("TZRS =", value, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsNotEqualTo(BigDecimal value) {
            addCriterion("TZRS <>", value, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsGreaterThan(BigDecimal value) {
            addCriterion("TZRS >", value, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TZRS >=", value, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsLessThan(BigDecimal value) {
            addCriterion("TZRS <", value, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TZRS <=", value, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsIn(List<BigDecimal> values) {
            addCriterion("TZRS in", values, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsNotIn(List<BigDecimal> values) {
            addCriterion("TZRS not in", values, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TZRS between", value1, value2, "tzrs");
            return (Criteria) this;
        }

        public Criteria andTzrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TZRS not between", value1, value2, "tzrs");
            return (Criteria) this;
        }

        public Criteria andCfrwIsNull() {
            addCriterion("CFRW is null");
            return (Criteria) this;
        }

        public Criteria andCfrwIsNotNull() {
            addCriterion("CFRW is not null");
            return (Criteria) this;
        }

        public Criteria andCfrwEqualTo(String value) {
            addCriterion("CFRW =", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwNotEqualTo(String value) {
            addCriterion("CFRW <>", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwGreaterThan(String value) {
            addCriterion("CFRW >", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwGreaterThanOrEqualTo(String value) {
            addCriterion("CFRW >=", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwLessThan(String value) {
            addCriterion("CFRW <", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwLessThanOrEqualTo(String value) {
            addCriterion("CFRW <=", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwLike(String value) {
            addCriterion("CFRW like", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwNotLike(String value) {
            addCriterion("CFRW not like", value, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwIn(List<String> values) {
            addCriterion("CFRW in", values, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwNotIn(List<String> values) {
            addCriterion("CFRW not in", values, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwBetween(String value1, String value2) {
            addCriterion("CFRW between", value1, value2, "cfrw");
            return (Criteria) this;
        }

        public Criteria andCfrwNotBetween(String value1, String value2) {
            addCriterion("CFRW not between", value1, value2, "cfrw");
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

        public Criteria andCftsIsNull() {
            addCriterion("CFTS is null");
            return (Criteria) this;
        }

        public Criteria andCftsIsNotNull() {
            addCriterion("CFTS is not null");
            return (Criteria) this;
        }

        public Criteria andCftsEqualTo(BigDecimal value) {
            addCriterion("CFTS =", value, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsNotEqualTo(BigDecimal value) {
            addCriterion("CFTS <>", value, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsGreaterThan(BigDecimal value) {
            addCriterion("CFTS >", value, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CFTS >=", value, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsLessThan(BigDecimal value) {
            addCriterion("CFTS <", value, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CFTS <=", value, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsIn(List<BigDecimal> values) {
            addCriterion("CFTS in", values, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsNotIn(List<BigDecimal> values) {
            addCriterion("CFTS not in", values, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CFTS between", value1, value2, "cfts");
            return (Criteria) this;
        }

        public Criteria andCftsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CFTS not between", value1, value2, "cfts");
            return (Criteria) this;
        }

        public Criteria andSjysIsNull() {
            addCriterion("SJYS is null");
            return (Criteria) this;
        }

        public Criteria andSjysIsNotNull() {
            addCriterion("SJYS is not null");
            return (Criteria) this;
        }

        public Criteria andSjysEqualTo(BigDecimal value) {
            addCriterion("SJYS =", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotEqualTo(BigDecimal value) {
            addCriterion("SJYS <>", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysGreaterThan(BigDecimal value) {
            addCriterion("SJYS >", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SJYS >=", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysLessThan(BigDecimal value) {
            addCriterion("SJYS <", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SJYS <=", value, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysIn(List<BigDecimal> values) {
            addCriterion("SJYS in", values, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotIn(List<BigDecimal> values) {
            addCriterion("SJYS not in", values, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJYS between", value1, value2, "sjys");
            return (Criteria) this;
        }

        public Criteria andSjysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJYS not between", value1, value2, "sjys");
            return (Criteria) this;
        }

        public Criteria andQtysIsNull() {
            addCriterion("QTYS is null");
            return (Criteria) this;
        }

        public Criteria andQtysIsNotNull() {
            addCriterion("QTYS is not null");
            return (Criteria) this;
        }

        public Criteria andQtysEqualTo(BigDecimal value) {
            addCriterion("QTYS =", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysNotEqualTo(BigDecimal value) {
            addCriterion("QTYS <>", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysGreaterThan(BigDecimal value) {
            addCriterion("QTYS >", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTYS >=", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysLessThan(BigDecimal value) {
            addCriterion("QTYS <", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTYS <=", value, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysIn(List<BigDecimal> values) {
            addCriterion("QTYS in", values, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysNotIn(List<BigDecimal> values) {
            addCriterion("QTYS not in", values, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTYS between", value1, value2, "qtys");
            return (Criteria) this;
        }

        public Criteria andQtysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTYS not between", value1, value2, "qtys");
            return (Criteria) this;
        }

        public Criteria andYshjIsNull() {
            addCriterion("YSHJ is null");
            return (Criteria) this;
        }

        public Criteria andYshjIsNotNull() {
            addCriterion("YSHJ is not null");
            return (Criteria) this;
        }

        public Criteria andYshjEqualTo(BigDecimal value) {
            addCriterion("YSHJ =", value, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjNotEqualTo(BigDecimal value) {
            addCriterion("YSHJ <>", value, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjGreaterThan(BigDecimal value) {
            addCriterion("YSHJ >", value, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YSHJ >=", value, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjLessThan(BigDecimal value) {
            addCriterion("YSHJ <", value, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YSHJ <=", value, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjIn(List<BigDecimal> values) {
            addCriterion("YSHJ in", values, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjNotIn(List<BigDecimal> values) {
            addCriterion("YSHJ not in", values, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSHJ between", value1, value2, "yshj");
            return (Criteria) this;
        }

        public Criteria andYshjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YSHJ not between", value1, value2, "yshj");
            return (Criteria) this;
        }

        public Criteria andRwpjwhIsNull() {
            addCriterion("RWPJWH is null");
            return (Criteria) this;
        }

        public Criteria andRwpjwhIsNotNull() {
            addCriterion("RWPJWH is not null");
            return (Criteria) this;
        }

        public Criteria andRwpjwhEqualTo(String value) {
            addCriterion("RWPJWH =", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotEqualTo(String value) {
            addCriterion("RWPJWH <>", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhGreaterThan(String value) {
            addCriterion("RWPJWH >", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhGreaterThanOrEqualTo(String value) {
            addCriterion("RWPJWH >=", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhLessThan(String value) {
            addCriterion("RWPJWH <", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhLessThanOrEqualTo(String value) {
            addCriterion("RWPJWH <=", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhLike(String value) {
            addCriterion("RWPJWH like", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotLike(String value) {
            addCriterion("RWPJWH not like", value, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhIn(List<String> values) {
            addCriterion("RWPJWH in", values, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotIn(List<String> values) {
            addCriterion("RWPJWH not in", values, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhBetween(String value1, String value2) {
            addCriterion("RWPJWH between", value1, value2, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpjwhNotBetween(String value1, String value2) {
            addCriterion("RWPJWH not between", value1, value2, "rwpjwh");
            return (Criteria) this;
        }

        public Criteria andRwpfsjIsNull() {
            addCriterion("RWPFSJ is null");
            return (Criteria) this;
        }

        public Criteria andRwpfsjIsNotNull() {
            addCriterion("RWPFSJ is not null");
            return (Criteria) this;
        }

        public Criteria andRwpfsjEqualTo(Date value) {
            addCriterion("RWPFSJ =", value, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjNotEqualTo(Date value) {
            addCriterion("RWPFSJ <>", value, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjGreaterThan(Date value) {
            addCriterion("RWPFSJ >", value, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjGreaterThanOrEqualTo(Date value) {
            addCriterion("RWPFSJ >=", value, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjLessThan(Date value) {
            addCriterion("RWPFSJ <", value, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjLessThanOrEqualTo(Date value) {
            addCriterion("RWPFSJ <=", value, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjIn(List<Date> values) {
            addCriterion("RWPFSJ in", values, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjNotIn(List<Date> values) {
            addCriterion("RWPFSJ not in", values, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjBetween(Date value1, Date value2) {
            addCriterion("RWPFSJ between", value1, value2, "rwpfsj");
            return (Criteria) this;
        }

        public Criteria andRwpfsjNotBetween(Date value1, Date value2) {
            addCriterion("RWPFSJ not between", value1, value2, "rwpfsj");
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
     * T_CG_TZJH
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CG_TZJH 2018-11-22
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