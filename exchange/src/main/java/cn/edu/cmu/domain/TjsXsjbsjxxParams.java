package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.List;

public class TjsXsjbsjxxParams {
    /**
     * V_YJS_XSJBSJXX
     */
    protected String orderByClause;

    /**
     * V_YJS_XSJBSJXX
     */
    protected boolean distinct;

    /**
     * V_YJS_XSJBSJXX
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public TjsXsjbsjxxParams() {
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
     * V_YJS_XSJBSJXX 2018-10-14
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
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

        public Criteria andXmpyIsNull() {
            addCriterion("XMPY is null");
            return (Criteria) this;
        }

        public Criteria andXmpyIsNotNull() {
            addCriterion("XMPY is not null");
            return (Criteria) this;
        }

        public Criteria andXmpyEqualTo(String value) {
            addCriterion("XMPY =", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotEqualTo(String value) {
            addCriterion("XMPY <>", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyGreaterThan(String value) {
            addCriterion("XMPY >", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyGreaterThanOrEqualTo(String value) {
            addCriterion("XMPY >=", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLessThan(String value) {
            addCriterion("XMPY <", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLessThanOrEqualTo(String value) {
            addCriterion("XMPY <=", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyLike(String value) {
            addCriterion("XMPY like", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotLike(String value) {
            addCriterion("XMPY not like", value, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyIn(List<String> values) {
            addCriterion("XMPY in", values, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotIn(List<String> values) {
            addCriterion("XMPY not in", values, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyBetween(String value1, String value2) {
            addCriterion("XMPY between", value1, value2, "xmpy");
            return (Criteria) this;
        }

        public Criteria andXmpyNotBetween(String value1, String value2) {
            addCriterion("XMPY not between", value1, value2, "xmpy");
            return (Criteria) this;
        }

        public Criteria andCymIsNull() {
            addCriterion("CYM is null");
            return (Criteria) this;
        }

        public Criteria andCymIsNotNull() {
            addCriterion("CYM is not null");
            return (Criteria) this;
        }

        public Criteria andCymEqualTo(String value) {
            addCriterion("CYM =", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotEqualTo(String value) {
            addCriterion("CYM <>", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThan(String value) {
            addCriterion("CYM >", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThanOrEqualTo(String value) {
            addCriterion("CYM >=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThan(String value) {
            addCriterion("CYM <", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThanOrEqualTo(String value) {
            addCriterion("CYM <=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLike(String value) {
            addCriterion("CYM like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotLike(String value) {
            addCriterion("CYM not like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymIn(List<String> values) {
            addCriterion("CYM in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotIn(List<String> values) {
            addCriterion("CYM not in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymBetween(String value1, String value2) {
            addCriterion("CYM between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotBetween(String value1, String value2) {
            addCriterion("CYM not between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andXbmIsNull() {
            addCriterion("XBM is null");
            return (Criteria) this;
        }

        public Criteria andXbmIsNotNull() {
            addCriterion("XBM is not null");
            return (Criteria) this;
        }

        public Criteria andXbmEqualTo(String value) {
            addCriterion("XBM =", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotEqualTo(String value) {
            addCriterion("XBM <>", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmGreaterThan(String value) {
            addCriterion("XBM >", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmGreaterThanOrEqualTo(String value) {
            addCriterion("XBM >=", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLessThan(String value) {
            addCriterion("XBM <", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLessThanOrEqualTo(String value) {
            addCriterion("XBM <=", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmLike(String value) {
            addCriterion("XBM like", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotLike(String value) {
            addCriterion("XBM not like", value, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmIn(List<String> values) {
            addCriterion("XBM in", values, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotIn(List<String> values) {
            addCriterion("XBM not in", values, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmBetween(String value1, String value2) {
            addCriterion("XBM between", value1, value2, "xbm");
            return (Criteria) this;
        }

        public Criteria andXbmNotBetween(String value1, String value2) {
            addCriterion("XBM not between", value1, value2, "xbm");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNull() {
            addCriterion("CSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsrqIsNotNull() {
            addCriterion("CSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsrqEqualTo(String value) {
            addCriterion("CSRQ =", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotEqualTo(String value) {
            addCriterion("CSRQ <>", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThan(String value) {
            addCriterion("CSRQ >", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqGreaterThanOrEqualTo(String value) {
            addCriterion("CSRQ >=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThan(String value) {
            addCriterion("CSRQ <", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLessThanOrEqualTo(String value) {
            addCriterion("CSRQ <=", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqLike(String value) {
            addCriterion("CSRQ like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotLike(String value) {
            addCriterion("CSRQ not like", value, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqIn(List<String> values) {
            addCriterion("CSRQ in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotIn(List<String> values) {
            addCriterion("CSRQ not in", values, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqBetween(String value1, String value2) {
            addCriterion("CSRQ between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsrqNotBetween(String value1, String value2) {
            addCriterion("CSRQ not between", value1, value2, "csrq");
            return (Criteria) this;
        }

        public Criteria andCsdmIsNull() {
            addCriterion("CSDM is null");
            return (Criteria) this;
        }

        public Criteria andCsdmIsNotNull() {
            addCriterion("CSDM is not null");
            return (Criteria) this;
        }

        public Criteria andCsdmEqualTo(String value) {
            addCriterion("CSDM =", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmNotEqualTo(String value) {
            addCriterion("CSDM <>", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmGreaterThan(String value) {
            addCriterion("CSDM >", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmGreaterThanOrEqualTo(String value) {
            addCriterion("CSDM >=", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmLessThan(String value) {
            addCriterion("CSDM <", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmLessThanOrEqualTo(String value) {
            addCriterion("CSDM <=", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmLike(String value) {
            addCriterion("CSDM like", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmNotLike(String value) {
            addCriterion("CSDM not like", value, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmIn(List<String> values) {
            addCriterion("CSDM in", values, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmNotIn(List<String> values) {
            addCriterion("CSDM not in", values, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmBetween(String value1, String value2) {
            addCriterion("CSDM between", value1, value2, "csdm");
            return (Criteria) this;
        }

        public Criteria andCsdmNotBetween(String value1, String value2) {
            addCriterion("CSDM not between", value1, value2, "csdm");
            return (Criteria) this;
        }

        public Criteria andJgIsNull() {
            addCriterion("JG is null");
            return (Criteria) this;
        }

        public Criteria andJgIsNotNull() {
            addCriterion("JG is not null");
            return (Criteria) this;
        }

        public Criteria andJgEqualTo(String value) {
            addCriterion("JG =", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotEqualTo(String value) {
            addCriterion("JG <>", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThan(String value) {
            addCriterion("JG >", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgGreaterThanOrEqualTo(String value) {
            addCriterion("JG >=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThan(String value) {
            addCriterion("JG <", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLessThanOrEqualTo(String value) {
            addCriterion("JG <=", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgLike(String value) {
            addCriterion("JG like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotLike(String value) {
            addCriterion("JG not like", value, "jg");
            return (Criteria) this;
        }

        public Criteria andJgIn(List<String> values) {
            addCriterion("JG in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotIn(List<String> values) {
            addCriterion("JG not in", values, "jg");
            return (Criteria) this;
        }

        public Criteria andJgBetween(String value1, String value2) {
            addCriterion("JG between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andJgNotBetween(String value1, String value2) {
            addCriterion("JG not between", value1, value2, "jg");
            return (Criteria) this;
        }

        public Criteria andMzmIsNull() {
            addCriterion("MZM is null");
            return (Criteria) this;
        }

        public Criteria andMzmIsNotNull() {
            addCriterion("MZM is not null");
            return (Criteria) this;
        }

        public Criteria andMzmEqualTo(String value) {
            addCriterion("MZM =", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotEqualTo(String value) {
            addCriterion("MZM <>", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmGreaterThan(String value) {
            addCriterion("MZM >", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmGreaterThanOrEqualTo(String value) {
            addCriterion("MZM >=", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLessThan(String value) {
            addCriterion("MZM <", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLessThanOrEqualTo(String value) {
            addCriterion("MZM <=", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmLike(String value) {
            addCriterion("MZM like", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotLike(String value) {
            addCriterion("MZM not like", value, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmIn(List<String> values) {
            addCriterion("MZM in", values, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotIn(List<String> values) {
            addCriterion("MZM not in", values, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmBetween(String value1, String value2) {
            addCriterion("MZM between", value1, value2, "mzm");
            return (Criteria) this;
        }

        public Criteria andMzmNotBetween(String value1, String value2) {
            addCriterion("MZM not between", value1, value2, "mzm");
            return (Criteria) this;
        }

        public Criteria andGjdqmIsNull() {
            addCriterion("GJDQM is null");
            return (Criteria) this;
        }

        public Criteria andGjdqmIsNotNull() {
            addCriterion("GJDQM is not null");
            return (Criteria) this;
        }

        public Criteria andGjdqmEqualTo(String value) {
            addCriterion("GJDQM =", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotEqualTo(String value) {
            addCriterion("GJDQM <>", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmGreaterThan(String value) {
            addCriterion("GJDQM >", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmGreaterThanOrEqualTo(String value) {
            addCriterion("GJDQM >=", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmLessThan(String value) {
            addCriterion("GJDQM <", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmLessThanOrEqualTo(String value) {
            addCriterion("GJDQM <=", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmLike(String value) {
            addCriterion("GJDQM like", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotLike(String value) {
            addCriterion("GJDQM not like", value, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmIn(List<String> values) {
            addCriterion("GJDQM in", values, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotIn(List<String> values) {
            addCriterion("GJDQM not in", values, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmBetween(String value1, String value2) {
            addCriterion("GJDQM between", value1, value2, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andGjdqmNotBetween(String value1, String value2) {
            addCriterion("GJDQM not between", value1, value2, "gjdqm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmIsNull() {
            addCriterion("SFZJLXM is null");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmIsNotNull() {
            addCriterion("SFZJLXM is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmEqualTo(String value) {
            addCriterion("SFZJLXM =", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotEqualTo(String value) {
            addCriterion("SFZJLXM <>", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmGreaterThan(String value) {
            addCriterion("SFZJLXM >", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmGreaterThanOrEqualTo(String value) {
            addCriterion("SFZJLXM >=", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmLessThan(String value) {
            addCriterion("SFZJLXM <", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmLessThanOrEqualTo(String value) {
            addCriterion("SFZJLXM <=", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmLike(String value) {
            addCriterion("SFZJLXM like", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotLike(String value) {
            addCriterion("SFZJLXM not like", value, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmIn(List<String> values) {
            addCriterion("SFZJLXM in", values, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotIn(List<String> values) {
            addCriterion("SFZJLXM not in", values, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmBetween(String value1, String value2) {
            addCriterion("SFZJLXM between", value1, value2, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjlxmNotBetween(String value1, String value2) {
            addCriterion("SFZJLXM not between", value1, value2, "sfzjlxm");
            return (Criteria) this;
        }

        public Criteria andSfzjhIsNull() {
            addCriterion("SFZJH is null");
            return (Criteria) this;
        }

        public Criteria andSfzjhIsNotNull() {
            addCriterion("SFZJH is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjhEqualTo(String value) {
            addCriterion("SFZJH =", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotEqualTo(String value) {
            addCriterion("SFZJH <>", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhGreaterThan(String value) {
            addCriterion("SFZJH >", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhGreaterThanOrEqualTo(String value) {
            addCriterion("SFZJH >=", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLessThan(String value) {
            addCriterion("SFZJH <", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLessThanOrEqualTo(String value) {
            addCriterion("SFZJH <=", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhLike(String value) {
            addCriterion("SFZJH like", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotLike(String value) {
            addCriterion("SFZJH not like", value, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhIn(List<String> values) {
            addCriterion("SFZJH in", values, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotIn(List<String> values) {
            addCriterion("SFZJH not in", values, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhBetween(String value1, String value2) {
            addCriterion("SFZJH between", value1, value2, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andSfzjhNotBetween(String value1, String value2) {
            addCriterion("SFZJH not between", value1, value2, "sfzjh");
            return (Criteria) this;
        }

        public Criteria andHyzkmIsNull() {
            addCriterion("HYZKM is null");
            return (Criteria) this;
        }

        public Criteria andHyzkmIsNotNull() {
            addCriterion("HYZKM is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkmEqualTo(String value) {
            addCriterion("HYZKM =", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmNotEqualTo(String value) {
            addCriterion("HYZKM <>", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmGreaterThan(String value) {
            addCriterion("HYZKM >", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmGreaterThanOrEqualTo(String value) {
            addCriterion("HYZKM >=", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmLessThan(String value) {
            addCriterion("HYZKM <", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmLessThanOrEqualTo(String value) {
            addCriterion("HYZKM <=", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmLike(String value) {
            addCriterion("HYZKM like", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmNotLike(String value) {
            addCriterion("HYZKM not like", value, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmIn(List<String> values) {
            addCriterion("HYZKM in", values, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmNotIn(List<String> values) {
            addCriterion("HYZKM not in", values, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmBetween(String value1, String value2) {
            addCriterion("HYZKM between", value1, value2, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andHyzkmNotBetween(String value1, String value2) {
            addCriterion("HYZKM not between", value1, value2, "hyzkm");
            return (Criteria) this;
        }

        public Criteria andGatqwmIsNull() {
            addCriterion("GATQWM is null");
            return (Criteria) this;
        }

        public Criteria andGatqwmIsNotNull() {
            addCriterion("GATQWM is not null");
            return (Criteria) this;
        }

        public Criteria andGatqwmEqualTo(String value) {
            addCriterion("GATQWM =", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmNotEqualTo(String value) {
            addCriterion("GATQWM <>", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmGreaterThan(String value) {
            addCriterion("GATQWM >", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmGreaterThanOrEqualTo(String value) {
            addCriterion("GATQWM >=", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmLessThan(String value) {
            addCriterion("GATQWM <", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmLessThanOrEqualTo(String value) {
            addCriterion("GATQWM <=", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmLike(String value) {
            addCriterion("GATQWM like", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmNotLike(String value) {
            addCriterion("GATQWM not like", value, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmIn(List<String> values) {
            addCriterion("GATQWM in", values, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmNotIn(List<String> values) {
            addCriterion("GATQWM not in", values, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmBetween(String value1, String value2) {
            addCriterion("GATQWM between", value1, value2, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andGatqwmNotBetween(String value1, String value2) {
            addCriterion("GATQWM not between", value1, value2, "gatqwm");
            return (Criteria) this;
        }

        public Criteria andZzmmmIsNull() {
            addCriterion("ZZMMM is null");
            return (Criteria) this;
        }

        public Criteria andZzmmmIsNotNull() {
            addCriterion("ZZMMM is not null");
            return (Criteria) this;
        }

        public Criteria andZzmmmEqualTo(String value) {
            addCriterion("ZZMMM =", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmNotEqualTo(String value) {
            addCriterion("ZZMMM <>", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmGreaterThan(String value) {
            addCriterion("ZZMMM >", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZMMM >=", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmLessThan(String value) {
            addCriterion("ZZMMM <", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmLessThanOrEqualTo(String value) {
            addCriterion("ZZMMM <=", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmLike(String value) {
            addCriterion("ZZMMM like", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmNotLike(String value) {
            addCriterion("ZZMMM not like", value, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmIn(List<String> values) {
            addCriterion("ZZMMM in", values, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmNotIn(List<String> values) {
            addCriterion("ZZMMM not in", values, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmBetween(String value1, String value2) {
            addCriterion("ZZMMM between", value1, value2, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andZzmmmNotBetween(String value1, String value2) {
            addCriterion("ZZMMM not between", value1, value2, "zzmmm");
            return (Criteria) this;
        }

        public Criteria andJkzkmIsNull() {
            addCriterion("JKZKM is null");
            return (Criteria) this;
        }

        public Criteria andJkzkmIsNotNull() {
            addCriterion("JKZKM is not null");
            return (Criteria) this;
        }

        public Criteria andJkzkmEqualTo(String value) {
            addCriterion("JKZKM =", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmNotEqualTo(String value) {
            addCriterion("JKZKM <>", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmGreaterThan(String value) {
            addCriterion("JKZKM >", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmGreaterThanOrEqualTo(String value) {
            addCriterion("JKZKM >=", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmLessThan(String value) {
            addCriterion("JKZKM <", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmLessThanOrEqualTo(String value) {
            addCriterion("JKZKM <=", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmLike(String value) {
            addCriterion("JKZKM like", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmNotLike(String value) {
            addCriterion("JKZKM not like", value, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmIn(List<String> values) {
            addCriterion("JKZKM in", values, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmNotIn(List<String> values) {
            addCriterion("JKZKM not in", values, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmBetween(String value1, String value2) {
            addCriterion("JKZKM between", value1, value2, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andJkzkmNotBetween(String value1, String value2) {
            addCriterion("JKZKM not between", value1, value2, "jkzkm");
            return (Criteria) this;
        }

        public Criteria andXyzjmIsNull() {
            addCriterion("XYZJM is null");
            return (Criteria) this;
        }

        public Criteria andXyzjmIsNotNull() {
            addCriterion("XYZJM is not null");
            return (Criteria) this;
        }

        public Criteria andXyzjmEqualTo(String value) {
            addCriterion("XYZJM =", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmNotEqualTo(String value) {
            addCriterion("XYZJM <>", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmGreaterThan(String value) {
            addCriterion("XYZJM >", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmGreaterThanOrEqualTo(String value) {
            addCriterion("XYZJM >=", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmLessThan(String value) {
            addCriterion("XYZJM <", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmLessThanOrEqualTo(String value) {
            addCriterion("XYZJM <=", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmLike(String value) {
            addCriterion("XYZJM like", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmNotLike(String value) {
            addCriterion("XYZJM not like", value, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmIn(List<String> values) {
            addCriterion("XYZJM in", values, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmNotIn(List<String> values) {
            addCriterion("XYZJM not in", values, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmBetween(String value1, String value2) {
            addCriterion("XYZJM between", value1, value2, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXyzjmNotBetween(String value1, String value2) {
            addCriterion("XYZJM not between", value1, value2, "xyzjm");
            return (Criteria) this;
        }

        public Criteria andXxmIsNull() {
            addCriterion("XXM is null");
            return (Criteria) this;
        }

        public Criteria andXxmIsNotNull() {
            addCriterion("XXM is not null");
            return (Criteria) this;
        }

        public Criteria andXxmEqualTo(String value) {
            addCriterion("XXM =", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmNotEqualTo(String value) {
            addCriterion("XXM <>", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmGreaterThan(String value) {
            addCriterion("XXM >", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmGreaterThanOrEqualTo(String value) {
            addCriterion("XXM >=", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmLessThan(String value) {
            addCriterion("XXM <", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmLessThanOrEqualTo(String value) {
            addCriterion("XXM <=", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmLike(String value) {
            addCriterion("XXM like", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmNotLike(String value) {
            addCriterion("XXM not like", value, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmIn(List<String> values) {
            addCriterion("XXM in", values, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmNotIn(List<String> values) {
            addCriterion("XXM not in", values, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmBetween(String value1, String value2) {
            addCriterion("XXM between", value1, value2, "xxm");
            return (Criteria) this;
        }

        public Criteria andXxmNotBetween(String value1, String value2) {
            addCriterion("XXM not between", value1, value2, "xxm");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqIsNull() {
            addCriterion("SFZJYXQ is null");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqIsNotNull() {
            addCriterion("SFZJYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqEqualTo(String value) {
            addCriterion("SFZJYXQ =", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqNotEqualTo(String value) {
            addCriterion("SFZJYXQ <>", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqGreaterThan(String value) {
            addCriterion("SFZJYXQ >", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqGreaterThanOrEqualTo(String value) {
            addCriterion("SFZJYXQ >=", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqLessThan(String value) {
            addCriterion("SFZJYXQ <", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqLessThanOrEqualTo(String value) {
            addCriterion("SFZJYXQ <=", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqLike(String value) {
            addCriterion("SFZJYXQ like", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqNotLike(String value) {
            addCriterion("SFZJYXQ not like", value, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqIn(List<String> values) {
            addCriterion("SFZJYXQ in", values, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqNotIn(List<String> values) {
            addCriterion("SFZJYXQ not in", values, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqBetween(String value1, String value2) {
            addCriterion("SFZJYXQ between", value1, value2, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSfzjyxqNotBetween(String value1, String value2) {
            addCriterion("SFZJYXQ not between", value1, value2, "sfzjyxq");
            return (Criteria) this;
        }

        public Criteria andSflxsIsNull() {
            addCriterion("SFLXS is null");
            return (Criteria) this;
        }

        public Criteria andSflxsIsNotNull() {
            addCriterion("SFLXS is not null");
            return (Criteria) this;
        }

        public Criteria andSflxsEqualTo(String value) {
            addCriterion("SFLXS =", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsNotEqualTo(String value) {
            addCriterion("SFLXS <>", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsGreaterThan(String value) {
            addCriterion("SFLXS >", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsGreaterThanOrEqualTo(String value) {
            addCriterion("SFLXS >=", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsLessThan(String value) {
            addCriterion("SFLXS <", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsLessThanOrEqualTo(String value) {
            addCriterion("SFLXS <=", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsLike(String value) {
            addCriterion("SFLXS like", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsNotLike(String value) {
            addCriterion("SFLXS not like", value, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsIn(List<String> values) {
            addCriterion("SFLXS in", values, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsNotIn(List<String> values) {
            addCriterion("SFLXS not in", values, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsBetween(String value1, String value2) {
            addCriterion("SFLXS between", value1, value2, "sflxs");
            return (Criteria) this;
        }

        public Criteria andSflxsNotBetween(String value1, String value2) {
            addCriterion("SFLXS not between", value1, value2, "sflxs");
            return (Criteria) this;
        }

        public Criteria andYwxmIsNull() {
            addCriterion("YWXM is null");
            return (Criteria) this;
        }

        public Criteria andYwxmIsNotNull() {
            addCriterion("YWXM is not null");
            return (Criteria) this;
        }

        public Criteria andYwxmEqualTo(String value) {
            addCriterion("YWXM =", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotEqualTo(String value) {
            addCriterion("YWXM <>", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmGreaterThan(String value) {
            addCriterion("YWXM >", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmGreaterThanOrEqualTo(String value) {
            addCriterion("YWXM >=", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmLessThan(String value) {
            addCriterion("YWXM <", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmLessThanOrEqualTo(String value) {
            addCriterion("YWXM <=", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmLike(String value) {
            addCriterion("YWXM like", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotLike(String value) {
            addCriterion("YWXM not like", value, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmIn(List<String> values) {
            addCriterion("YWXM in", values, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotIn(List<String> values) {
            addCriterion("YWXM not in", values, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmBetween(String value1, String value2) {
            addCriterion("YWXM between", value1, value2, "ywxm");
            return (Criteria) this;
        }

        public Criteria andYwxmNotBetween(String value1, String value2) {
            addCriterion("YWXM not between", value1, value2, "ywxm");
            return (Criteria) this;
        }

        public Criteria andSfdsznIsNull() {
            addCriterion("SFDSZN is null");
            return (Criteria) this;
        }

        public Criteria andSfdsznIsNotNull() {
            addCriterion("SFDSZN is not null");
            return (Criteria) this;
        }

        public Criteria andSfdsznEqualTo(String value) {
            addCriterion("SFDSZN =", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotEqualTo(String value) {
            addCriterion("SFDSZN <>", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznGreaterThan(String value) {
            addCriterion("SFDSZN >", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznGreaterThanOrEqualTo(String value) {
            addCriterion("SFDSZN >=", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznLessThan(String value) {
            addCriterion("SFDSZN <", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznLessThanOrEqualTo(String value) {
            addCriterion("SFDSZN <=", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznLike(String value) {
            addCriterion("SFDSZN like", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotLike(String value) {
            addCriterion("SFDSZN not like", value, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznIn(List<String> values) {
            addCriterion("SFDSZN in", values, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotIn(List<String> values) {
            addCriterion("SFDSZN not in", values, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznBetween(String value1, String value2) {
            addCriterion("SFDSZN between", value1, value2, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfdsznNotBetween(String value1, String value2) {
            addCriterion("SFDSZN not between", value1, value2, "sfdszn");
            return (Criteria) this;
        }

        public Criteria andSfzzryIsNull() {
            addCriterion("SFZZRY is null");
            return (Criteria) this;
        }

        public Criteria andSfzzryIsNotNull() {
            addCriterion("SFZZRY is not null");
            return (Criteria) this;
        }

        public Criteria andSfzzryEqualTo(String value) {
            addCriterion("SFZZRY =", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryNotEqualTo(String value) {
            addCriterion("SFZZRY <>", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryGreaterThan(String value) {
            addCriterion("SFZZRY >", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryGreaterThanOrEqualTo(String value) {
            addCriterion("SFZZRY >=", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryLessThan(String value) {
            addCriterion("SFZZRY <", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryLessThanOrEqualTo(String value) {
            addCriterion("SFZZRY <=", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryLike(String value) {
            addCriterion("SFZZRY like", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryNotLike(String value) {
            addCriterion("SFZZRY not like", value, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryIn(List<String> values) {
            addCriterion("SFZZRY in", values, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryNotIn(List<String> values) {
            addCriterion("SFZZRY not in", values, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryBetween(String value1, String value2) {
            addCriterion("SFZZRY between", value1, value2, "sfzzry");
            return (Criteria) this;
        }

        public Criteria andSfzzryNotBetween(String value1, String value2) {
            addCriterion("SFZZRY not between", value1, value2, "sfzzry");
            return (Criteria) this;
        }
    }

    /**
     * V_YJS_XSJBSJXX
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * V_YJS_XSJBSJXX 2018-10-14
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