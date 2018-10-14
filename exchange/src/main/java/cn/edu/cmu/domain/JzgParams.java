package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JzgParams {
    /**
     * V_JZGJCSJXX
     */
    protected String orderByClause;

    /**
     * V_JZGJCSJXX
     */
    protected boolean distinct;

    /**
     * V_JZGJCSJXX
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public JzgParams() {
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
     * V_JZGJCSJXX 2018-10-14
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

        public Criteria andGhIsNull() {
            addCriterion("GH is null");
            return (Criteria) this;
        }

        public Criteria andGhIsNotNull() {
            addCriterion("GH is not null");
            return (Criteria) this;
        }

        public Criteria andGhEqualTo(String value) {
            addCriterion("GH =", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotEqualTo(String value) {
            addCriterion("GH <>", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThan(String value) {
            addCriterion("GH >", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhGreaterThanOrEqualTo(String value) {
            addCriterion("GH >=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThan(String value) {
            addCriterion("GH <", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLessThanOrEqualTo(String value) {
            addCriterion("GH <=", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhLike(String value) {
            addCriterion("GH like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotLike(String value) {
            addCriterion("GH not like", value, "gh");
            return (Criteria) this;
        }

        public Criteria andGhIn(List<String> values) {
            addCriterion("GH in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotIn(List<String> values) {
            addCriterion("GH not in", values, "gh");
            return (Criteria) this;
        }

        public Criteria andGhBetween(String value1, String value2) {
            addCriterion("GH between", value1, value2, "gh");
            return (Criteria) this;
        }

        public Criteria andGhNotBetween(String value1, String value2) {
            addCriterion("GH not between", value1, value2, "gh");
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

        public Criteria andZgxlmIsNull() {
            addCriterion("ZGXLM is null");
            return (Criteria) this;
        }

        public Criteria andZgxlmIsNotNull() {
            addCriterion("ZGXLM is not null");
            return (Criteria) this;
        }

        public Criteria andZgxlmEqualTo(String value) {
            addCriterion("ZGXLM =", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmNotEqualTo(String value) {
            addCriterion("ZGXLM <>", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmGreaterThan(String value) {
            addCriterion("ZGXLM >", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmGreaterThanOrEqualTo(String value) {
            addCriterion("ZGXLM >=", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmLessThan(String value) {
            addCriterion("ZGXLM <", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmLessThanOrEqualTo(String value) {
            addCriterion("ZGXLM <=", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmLike(String value) {
            addCriterion("ZGXLM like", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmNotLike(String value) {
            addCriterion("ZGXLM not like", value, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmIn(List<String> values) {
            addCriterion("ZGXLM in", values, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmNotIn(List<String> values) {
            addCriterion("ZGXLM not in", values, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmBetween(String value1, String value2) {
            addCriterion("ZGXLM between", value1, value2, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andZgxlmNotBetween(String value1, String value2) {
            addCriterion("ZGXLM not between", value1, value2, "zgxlm");
            return (Criteria) this;
        }

        public Criteria andWhcdmIsNull() {
            addCriterion("WHCDM is null");
            return (Criteria) this;
        }

        public Criteria andWhcdmIsNotNull() {
            addCriterion("WHCDM is not null");
            return (Criteria) this;
        }

        public Criteria andWhcdmEqualTo(String value) {
            addCriterion("WHCDM =", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmNotEqualTo(String value) {
            addCriterion("WHCDM <>", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmGreaterThan(String value) {
            addCriterion("WHCDM >", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmGreaterThanOrEqualTo(String value) {
            addCriterion("WHCDM >=", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmLessThan(String value) {
            addCriterion("WHCDM <", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmLessThanOrEqualTo(String value) {
            addCriterion("WHCDM <=", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmLike(String value) {
            addCriterion("WHCDM like", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmNotLike(String value) {
            addCriterion("WHCDM not like", value, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmIn(List<String> values) {
            addCriterion("WHCDM in", values, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmNotIn(List<String> values) {
            addCriterion("WHCDM not in", values, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmBetween(String value1, String value2) {
            addCriterion("WHCDM between", value1, value2, "whcdm");
            return (Criteria) this;
        }

        public Criteria andWhcdmNotBetween(String value1, String value2) {
            addCriterion("WHCDM not between", value1, value2, "whcdm");
            return (Criteria) this;
        }

        public Criteria andCjgznyIsNull() {
            addCriterion("CJGZNY is null");
            return (Criteria) this;
        }

        public Criteria andCjgznyIsNotNull() {
            addCriterion("CJGZNY is not null");
            return (Criteria) this;
        }

        public Criteria andCjgznyEqualTo(String value) {
            addCriterion("CJGZNY =", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyNotEqualTo(String value) {
            addCriterion("CJGZNY <>", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyGreaterThan(String value) {
            addCriterion("CJGZNY >", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyGreaterThanOrEqualTo(String value) {
            addCriterion("CJGZNY >=", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyLessThan(String value) {
            addCriterion("CJGZNY <", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyLessThanOrEqualTo(String value) {
            addCriterion("CJGZNY <=", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyLike(String value) {
            addCriterion("CJGZNY like", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyNotLike(String value) {
            addCriterion("CJGZNY not like", value, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyIn(List<String> values) {
            addCriterion("CJGZNY in", values, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyNotIn(List<String> values) {
            addCriterion("CJGZNY not in", values, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyBetween(String value1, String value2) {
            addCriterion("CJGZNY between", value1, value2, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andCjgznyNotBetween(String value1, String value2) {
            addCriterion("CJGZNY not between", value1, value2, "cjgzny");
            return (Criteria) this;
        }

        public Criteria andLxrqIsNull() {
            addCriterion("LXRQ is null");
            return (Criteria) this;
        }

        public Criteria andLxrqIsNotNull() {
            addCriterion("LXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andLxrqEqualTo(String value) {
            addCriterion("LXRQ =", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqNotEqualTo(String value) {
            addCriterion("LXRQ <>", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqGreaterThan(String value) {
            addCriterion("LXRQ >", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqGreaterThanOrEqualTo(String value) {
            addCriterion("LXRQ >=", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqLessThan(String value) {
            addCriterion("LXRQ <", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqLessThanOrEqualTo(String value) {
            addCriterion("LXRQ <=", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqLike(String value) {
            addCriterion("LXRQ like", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqNotLike(String value) {
            addCriterion("LXRQ not like", value, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqIn(List<String> values) {
            addCriterion("LXRQ in", values, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqNotIn(List<String> values) {
            addCriterion("LXRQ not in", values, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqBetween(String value1, String value2) {
            addCriterion("LXRQ between", value1, value2, "lxrq");
            return (Criteria) this;
        }

        public Criteria andLxrqNotBetween(String value1, String value2) {
            addCriterion("LXRQ not between", value1, value2, "lxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqIsNull() {
            addCriterion("QXRQ is null");
            return (Criteria) this;
        }

        public Criteria andQxrqIsNotNull() {
            addCriterion("QXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andQxrqEqualTo(String value) {
            addCriterion("QXRQ =", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqNotEqualTo(String value) {
            addCriterion("QXRQ <>", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqGreaterThan(String value) {
            addCriterion("QXRQ >", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqGreaterThanOrEqualTo(String value) {
            addCriterion("QXRQ >=", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqLessThan(String value) {
            addCriterion("QXRQ <", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqLessThanOrEqualTo(String value) {
            addCriterion("QXRQ <=", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqLike(String value) {
            addCriterion("QXRQ like", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqNotLike(String value) {
            addCriterion("QXRQ not like", value, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqIn(List<String> values) {
            addCriterion("QXRQ in", values, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqNotIn(List<String> values) {
            addCriterion("QXRQ not in", values, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqBetween(String value1, String value2) {
            addCriterion("QXRQ between", value1, value2, "qxrq");
            return (Criteria) this;
        }

        public Criteria andQxrqNotBetween(String value1, String value2) {
            addCriterion("QXRQ not between", value1, value2, "qxrq");
            return (Criteria) this;
        }

        public Criteria andCjnyIsNull() {
            addCriterion("CJNY is null");
            return (Criteria) this;
        }

        public Criteria andCjnyIsNotNull() {
            addCriterion("CJNY is not null");
            return (Criteria) this;
        }

        public Criteria andCjnyEqualTo(String value) {
            addCriterion("CJNY =", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyNotEqualTo(String value) {
            addCriterion("CJNY <>", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyGreaterThan(String value) {
            addCriterion("CJNY >", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyGreaterThanOrEqualTo(String value) {
            addCriterion("CJNY >=", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyLessThan(String value) {
            addCriterion("CJNY <", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyLessThanOrEqualTo(String value) {
            addCriterion("CJNY <=", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyLike(String value) {
            addCriterion("CJNY like", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyNotLike(String value) {
            addCriterion("CJNY not like", value, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyIn(List<String> values) {
            addCriterion("CJNY in", values, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyNotIn(List<String> values) {
            addCriterion("CJNY not in", values, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyBetween(String value1, String value2) {
            addCriterion("CJNY between", value1, value2, "cjny");
            return (Criteria) this;
        }

        public Criteria andCjnyNotBetween(String value1, String value2) {
            addCriterion("CJNY not between", value1, value2, "cjny");
            return (Criteria) this;
        }

        public Criteria andBzlbmIsNull() {
            addCriterion("BZLBM is null");
            return (Criteria) this;
        }

        public Criteria andBzlbmIsNotNull() {
            addCriterion("BZLBM is not null");
            return (Criteria) this;
        }

        public Criteria andBzlbmEqualTo(String value) {
            addCriterion("BZLBM =", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmNotEqualTo(String value) {
            addCriterion("BZLBM <>", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmGreaterThan(String value) {
            addCriterion("BZLBM >", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmGreaterThanOrEqualTo(String value) {
            addCriterion("BZLBM >=", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmLessThan(String value) {
            addCriterion("BZLBM <", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmLessThanOrEqualTo(String value) {
            addCriterion("BZLBM <=", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmLike(String value) {
            addCriterion("BZLBM like", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmNotLike(String value) {
            addCriterion("BZLBM not like", value, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmIn(List<String> values) {
            addCriterion("BZLBM in", values, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmNotIn(List<String> values) {
            addCriterion("BZLBM not in", values, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmBetween(String value1, String value2) {
            addCriterion("BZLBM between", value1, value2, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andBzlbmNotBetween(String value1, String value2) {
            addCriterion("BZLBM not between", value1, value2, "bzlbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmIsNull() {
            addCriterion("JZGLBM is null");
            return (Criteria) this;
        }

        public Criteria andJzglbmIsNotNull() {
            addCriterion("JZGLBM is not null");
            return (Criteria) this;
        }

        public Criteria andJzglbmEqualTo(String value) {
            addCriterion("JZGLBM =", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmNotEqualTo(String value) {
            addCriterion("JZGLBM <>", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmGreaterThan(String value) {
            addCriterion("JZGLBM >", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmGreaterThanOrEqualTo(String value) {
            addCriterion("JZGLBM >=", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmLessThan(String value) {
            addCriterion("JZGLBM <", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmLessThanOrEqualTo(String value) {
            addCriterion("JZGLBM <=", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmLike(String value) {
            addCriterion("JZGLBM like", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmNotLike(String value) {
            addCriterion("JZGLBM not like", value, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmIn(List<String> values) {
            addCriterion("JZGLBM in", values, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmNotIn(List<String> values) {
            addCriterion("JZGLBM not in", values, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmBetween(String value1, String value2) {
            addCriterion("JZGLBM between", value1, value2, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andJzglbmNotBetween(String value1, String value2) {
            addCriterion("JZGLBM not between", value1, value2, "jzglbm");
            return (Criteria) this;
        }

        public Criteria andRkzkmIsNull() {
            addCriterion("RKZKM is null");
            return (Criteria) this;
        }

        public Criteria andRkzkmIsNotNull() {
            addCriterion("RKZKM is not null");
            return (Criteria) this;
        }

        public Criteria andRkzkmEqualTo(String value) {
            addCriterion("RKZKM =", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmNotEqualTo(String value) {
            addCriterion("RKZKM <>", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmGreaterThan(String value) {
            addCriterion("RKZKM >", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmGreaterThanOrEqualTo(String value) {
            addCriterion("RKZKM >=", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmLessThan(String value) {
            addCriterion("RKZKM <", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmLessThanOrEqualTo(String value) {
            addCriterion("RKZKM <=", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmLike(String value) {
            addCriterion("RKZKM like", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmNotLike(String value) {
            addCriterion("RKZKM not like", value, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmIn(List<String> values) {
            addCriterion("RKZKM in", values, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmNotIn(List<String> values) {
            addCriterion("RKZKM not in", values, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmBetween(String value1, String value2) {
            addCriterion("RKZKM between", value1, value2, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andRkzkmNotBetween(String value1, String value2) {
            addCriterion("RKZKM not between", value1, value2, "rkzkm");
            return (Criteria) this;
        }

        public Criteria andDabhIsNull() {
            addCriterion("DABH is null");
            return (Criteria) this;
        }

        public Criteria andDabhIsNotNull() {
            addCriterion("DABH is not null");
            return (Criteria) this;
        }

        public Criteria andDabhEqualTo(String value) {
            addCriterion("DABH =", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotEqualTo(String value) {
            addCriterion("DABH <>", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhGreaterThan(String value) {
            addCriterion("DABH >", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhGreaterThanOrEqualTo(String value) {
            addCriterion("DABH >=", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLessThan(String value) {
            addCriterion("DABH <", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLessThanOrEqualTo(String value) {
            addCriterion("DABH <=", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhLike(String value) {
            addCriterion("DABH like", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotLike(String value) {
            addCriterion("DABH not like", value, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhIn(List<String> values) {
            addCriterion("DABH in", values, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotIn(List<String> values) {
            addCriterion("DABH not in", values, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhBetween(String value1, String value2) {
            addCriterion("DABH between", value1, value2, "dabh");
            return (Criteria) this;
        }

        public Criteria andDabhNotBetween(String value1, String value2) {
            addCriterion("DABH not between", value1, value2, "dabh");
            return (Criteria) this;
        }

        public Criteria andDqztmIsNull() {
            addCriterion("DQZTM is null");
            return (Criteria) this;
        }

        public Criteria andDqztmIsNotNull() {
            addCriterion("DQZTM is not null");
            return (Criteria) this;
        }

        public Criteria andDqztmEqualTo(String value) {
            addCriterion("DQZTM =", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmNotEqualTo(String value) {
            addCriterion("DQZTM <>", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmGreaterThan(String value) {
            addCriterion("DQZTM >", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmGreaterThanOrEqualTo(String value) {
            addCriterion("DQZTM >=", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmLessThan(String value) {
            addCriterion("DQZTM <", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmLessThanOrEqualTo(String value) {
            addCriterion("DQZTM <=", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmLike(String value) {
            addCriterion("DQZTM like", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmNotLike(String value) {
            addCriterion("DQZTM not like", value, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmIn(List<String> values) {
            addCriterion("DQZTM in", values, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmNotIn(List<String> values) {
            addCriterion("DQZTM not in", values, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmBetween(String value1, String value2) {
            addCriterion("DQZTM between", value1, value2, "dqztm");
            return (Criteria) this;
        }

        public Criteria andDqztmNotBetween(String value1, String value2) {
            addCriterion("DQZTM not between", value1, value2, "dqztm");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzIsNull() {
            addCriterion("SFJTSYZ is null");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzIsNotNull() {
            addCriterion("SFJTSYZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzEqualTo(String value) {
            addCriterion("SFJTSYZ =", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzNotEqualTo(String value) {
            addCriterion("SFJTSYZ <>", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzGreaterThan(String value) {
            addCriterion("SFJTSYZ >", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzGreaterThanOrEqualTo(String value) {
            addCriterion("SFJTSYZ >=", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzLessThan(String value) {
            addCriterion("SFJTSYZ <", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzLessThanOrEqualTo(String value) {
            addCriterion("SFJTSYZ <=", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzLike(String value) {
            addCriterion("SFJTSYZ like", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzNotLike(String value) {
            addCriterion("SFJTSYZ not like", value, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzIn(List<String> values) {
            addCriterion("SFJTSYZ in", values, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzNotIn(List<String> values) {
            addCriterion("SFJTSYZ not in", values, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzBetween(String value1, String value2) {
            addCriterion("SFJTSYZ between", value1, value2, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfjtsyzNotBetween(String value1, String value2) {
            addCriterion("SFJTSYZ not between", value1, value2, "sfjtsyz");
            return (Criteria) this;
        }

        public Criteria andSfwpIsNull() {
            addCriterion("SFWP is null");
            return (Criteria) this;
        }

        public Criteria andSfwpIsNotNull() {
            addCriterion("SFWP is not null");
            return (Criteria) this;
        }

        public Criteria andSfwpEqualTo(String value) {
            addCriterion("SFWP =", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpNotEqualTo(String value) {
            addCriterion("SFWP <>", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpGreaterThan(String value) {
            addCriterion("SFWP >", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpGreaterThanOrEqualTo(String value) {
            addCriterion("SFWP >=", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpLessThan(String value) {
            addCriterion("SFWP <", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpLessThanOrEqualTo(String value) {
            addCriterion("SFWP <=", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpLike(String value) {
            addCriterion("SFWP like", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpNotLike(String value) {
            addCriterion("SFWP not like", value, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpIn(List<String> values) {
            addCriterion("SFWP in", values, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpNotIn(List<String> values) {
            addCriterion("SFWP not in", values, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpBetween(String value1, String value2) {
            addCriterion("SFWP between", value1, value2, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfwpNotBetween(String value1, String value2) {
            addCriterion("SFWP not between", value1, value2, "sfwp");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgIsNull() {
            addCriterion("SFZXXYEYJZG is null");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgIsNotNull() {
            addCriterion("SFZXXYEYJZG is not null");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgEqualTo(String value) {
            addCriterion("SFZXXYEYJZG =", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgNotEqualTo(String value) {
            addCriterion("SFZXXYEYJZG <>", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgGreaterThan(String value) {
            addCriterion("SFZXXYEYJZG >", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgGreaterThanOrEqualTo(String value) {
            addCriterion("SFZXXYEYJZG >=", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgLessThan(String value) {
            addCriterion("SFZXXYEYJZG <", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgLessThanOrEqualTo(String value) {
            addCriterion("SFZXXYEYJZG <=", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgLike(String value) {
            addCriterion("SFZXXYEYJZG like", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgNotLike(String value) {
            addCriterion("SFZXXYEYJZG not like", value, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgIn(List<String> values) {
            addCriterion("SFZXXYEYJZG in", values, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgNotIn(List<String> values) {
            addCriterion("SFZXXYEYJZG not in", values, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgBetween(String value1, String value2) {
            addCriterion("SFZXXYEYJZG between", value1, value2, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andSfzxxyeyjzgNotBetween(String value1, String value2) {
            addCriterion("SFZXXYEYJZG not between", value1, value2, "sfzxxyeyjzg");
            return (Criteria) this;
        }

        public Criteria andXyjgmIsNull() {
            addCriterion("XYJGM is null");
            return (Criteria) this;
        }

        public Criteria andXyjgmIsNotNull() {
            addCriterion("XYJGM is not null");
            return (Criteria) this;
        }

        public Criteria andXyjgmEqualTo(String value) {
            addCriterion("XYJGM =", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmNotEqualTo(String value) {
            addCriterion("XYJGM <>", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmGreaterThan(String value) {
            addCriterion("XYJGM >", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmGreaterThanOrEqualTo(String value) {
            addCriterion("XYJGM >=", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmLessThan(String value) {
            addCriterion("XYJGM <", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmLessThanOrEqualTo(String value) {
            addCriterion("XYJGM <=", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmLike(String value) {
            addCriterion("XYJGM like", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmNotLike(String value) {
            addCriterion("XYJGM not like", value, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmIn(List<String> values) {
            addCriterion("XYJGM in", values, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmNotIn(List<String> values) {
            addCriterion("XYJGM not in", values, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmBetween(String value1, String value2) {
            addCriterion("XYJGM between", value1, value2, "xyjgm");
            return (Criteria) this;
        }

        public Criteria andXyjgmNotBetween(String value1, String value2) {
            addCriterion("XYJGM not between", value1, value2, "xyjgm");
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

        public Criteria andXqhIsNull() {
            addCriterion("XQH is null");
            return (Criteria) this;
        }

        public Criteria andXqhIsNotNull() {
            addCriterion("XQH is not null");
            return (Criteria) this;
        }

        public Criteria andXqhEqualTo(String value) {
            addCriterion("XQH =", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotEqualTo(String value) {
            addCriterion("XQH <>", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhGreaterThan(String value) {
            addCriterion("XQH >", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhGreaterThanOrEqualTo(String value) {
            addCriterion("XQH >=", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhLessThan(String value) {
            addCriterion("XQH <", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhLessThanOrEqualTo(String value) {
            addCriterion("XQH <=", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhLike(String value) {
            addCriterion("XQH like", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotLike(String value) {
            addCriterion("XQH not like", value, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhIn(List<String> values) {
            addCriterion("XQH in", values, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotIn(List<String> values) {
            addCriterion("XQH not in", values, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhBetween(String value1, String value2) {
            addCriterion("XQH between", value1, value2, "xqh");
            return (Criteria) this;
        }

        public Criteria andXqhNotBetween(String value1, String value2) {
            addCriterion("XQH not between", value1, value2, "xqh");
            return (Criteria) this;
        }

        public Criteria andTcIsNull() {
            addCriterion("TC is null");
            return (Criteria) this;
        }

        public Criteria andTcIsNotNull() {
            addCriterion("TC is not null");
            return (Criteria) this;
        }

        public Criteria andTcEqualTo(String value) {
            addCriterion("TC =", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotEqualTo(String value) {
            addCriterion("TC <>", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThan(String value) {
            addCriterion("TC >", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcGreaterThanOrEqualTo(String value) {
            addCriterion("TC >=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThan(String value) {
            addCriterion("TC <", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLessThanOrEqualTo(String value) {
            addCriterion("TC <=", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcLike(String value) {
            addCriterion("TC like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotLike(String value) {
            addCriterion("TC not like", value, "tc");
            return (Criteria) this;
        }

        public Criteria andTcIn(List<String> values) {
            addCriterion("TC in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotIn(List<String> values) {
            addCriterion("TC not in", values, "tc");
            return (Criteria) this;
        }

        public Criteria andTcBetween(String value1, String value2) {
            addCriterion("TC between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andTcNotBetween(String value1, String value2) {
            addCriterion("TC not between", value1, value2, "tc");
            return (Criteria) this;
        }

        public Criteria andXklbmIsNull() {
            addCriterion("XKLBM is null");
            return (Criteria) this;
        }

        public Criteria andXklbmIsNotNull() {
            addCriterion("XKLBM is not null");
            return (Criteria) this;
        }

        public Criteria andXklbmEqualTo(String value) {
            addCriterion("XKLBM =", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmNotEqualTo(String value) {
            addCriterion("XKLBM <>", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmGreaterThan(String value) {
            addCriterion("XKLBM >", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmGreaterThanOrEqualTo(String value) {
            addCriterion("XKLBM >=", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmLessThan(String value) {
            addCriterion("XKLBM <", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmLessThanOrEqualTo(String value) {
            addCriterion("XKLBM <=", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmLike(String value) {
            addCriterion("XKLBM like", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmNotLike(String value) {
            addCriterion("XKLBM not like", value, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmIn(List<String> values) {
            addCriterion("XKLBM in", values, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmNotIn(List<String> values) {
            addCriterion("XKLBM not in", values, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmBetween(String value1, String value2) {
            addCriterion("XKLBM between", value1, value2, "xklbm");
            return (Criteria) this;
        }

        public Criteria andXklbmNotBetween(String value1, String value2) {
            addCriterion("XKLBM not between", value1, value2, "xklbm");
            return (Criteria) this;
        }

        public Criteria andYjxkmIsNull() {
            addCriterion("YJXKM is null");
            return (Criteria) this;
        }

        public Criteria andYjxkmIsNotNull() {
            addCriterion("YJXKM is not null");
            return (Criteria) this;
        }

        public Criteria andYjxkmEqualTo(String value) {
            addCriterion("YJXKM =", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmNotEqualTo(String value) {
            addCriterion("YJXKM <>", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmGreaterThan(String value) {
            addCriterion("YJXKM >", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmGreaterThanOrEqualTo(String value) {
            addCriterion("YJXKM >=", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmLessThan(String value) {
            addCriterion("YJXKM <", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmLessThanOrEqualTo(String value) {
            addCriterion("YJXKM <=", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmLike(String value) {
            addCriterion("YJXKM like", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmNotLike(String value) {
            addCriterion("YJXKM not like", value, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmIn(List<String> values) {
            addCriterion("YJXKM in", values, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmNotIn(List<String> values) {
            addCriterion("YJXKM not in", values, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmBetween(String value1, String value2) {
            addCriterion("YJXKM between", value1, value2, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andYjxkmNotBetween(String value1, String value2) {
            addCriterion("YJXKM not between", value1, value2, "yjxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmIsNull() {
            addCriterion("EJXKM is null");
            return (Criteria) this;
        }

        public Criteria andEjxkmIsNotNull() {
            addCriterion("EJXKM is not null");
            return (Criteria) this;
        }

        public Criteria andEjxkmEqualTo(String value) {
            addCriterion("EJXKM =", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmNotEqualTo(String value) {
            addCriterion("EJXKM <>", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmGreaterThan(String value) {
            addCriterion("EJXKM >", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmGreaterThanOrEqualTo(String value) {
            addCriterion("EJXKM >=", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmLessThan(String value) {
            addCriterion("EJXKM <", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmLessThanOrEqualTo(String value) {
            addCriterion("EJXKM <=", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmLike(String value) {
            addCriterion("EJXKM like", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmNotLike(String value) {
            addCriterion("EJXKM not like", value, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmIn(List<String> values) {
            addCriterion("EJXKM in", values, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmNotIn(List<String> values) {
            addCriterion("EJXKM not in", values, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmBetween(String value1, String value2) {
            addCriterion("EJXKM between", value1, value2, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andEjxkmNotBetween(String value1, String value2) {
            addCriterion("EJXKM not between", value1, value2, "ejxkm");
            return (Criteria) this;
        }

        public Criteria andYjfxIsNull() {
            addCriterion("YJFX is null");
            return (Criteria) this;
        }

        public Criteria andYjfxIsNotNull() {
            addCriterion("YJFX is not null");
            return (Criteria) this;
        }

        public Criteria andYjfxEqualTo(String value) {
            addCriterion("YJFX =", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotEqualTo(String value) {
            addCriterion("YJFX <>", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxGreaterThan(String value) {
            addCriterion("YJFX >", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxGreaterThanOrEqualTo(String value) {
            addCriterion("YJFX >=", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxLessThan(String value) {
            addCriterion("YJFX <", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxLessThanOrEqualTo(String value) {
            addCriterion("YJFX <=", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxLike(String value) {
            addCriterion("YJFX like", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotLike(String value) {
            addCriterion("YJFX not like", value, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxIn(List<String> values) {
            addCriterion("YJFX in", values, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotIn(List<String> values) {
            addCriterion("YJFX not in", values, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxBetween(String value1, String value2) {
            addCriterion("YJFX between", value1, value2, "yjfx");
            return (Criteria) this;
        }

        public Criteria andYjfxNotBetween(String value1, String value2) {
            addCriterion("YJFX not between", value1, value2, "yjfx");
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

        public Criteria andDqzcm1IsNull() {
            addCriterion("DQZCM1 is null");
            return (Criteria) this;
        }

        public Criteria andDqzcm1IsNotNull() {
            addCriterion("DQZCM1 is not null");
            return (Criteria) this;
        }

        public Criteria andDqzcm1EqualTo(String value) {
            addCriterion("DQZCM1 =", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1NotEqualTo(String value) {
            addCriterion("DQZCM1 <>", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1GreaterThan(String value) {
            addCriterion("DQZCM1 >", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1GreaterThanOrEqualTo(String value) {
            addCriterion("DQZCM1 >=", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1LessThan(String value) {
            addCriterion("DQZCM1 <", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1LessThanOrEqualTo(String value) {
            addCriterion("DQZCM1 <=", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1Like(String value) {
            addCriterion("DQZCM1 like", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1NotLike(String value) {
            addCriterion("DQZCM1 not like", value, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1In(List<String> values) {
            addCriterion("DQZCM1 in", values, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1NotIn(List<String> values) {
            addCriterion("DQZCM1 not in", values, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1Between(String value1, String value2) {
            addCriterion("DQZCM1 between", value1, value2, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzcm1NotBetween(String value1, String value2) {
            addCriterion("DQZCM1 not between", value1, value2, "dqzcm1");
            return (Criteria) this;
        }

        public Criteria andDqzwmIsNull() {
            addCriterion("DQZWM is null");
            return (Criteria) this;
        }

        public Criteria andDqzwmIsNotNull() {
            addCriterion("DQZWM is not null");
            return (Criteria) this;
        }

        public Criteria andDqzwmEqualTo(String value) {
            addCriterion("DQZWM =", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmNotEqualTo(String value) {
            addCriterion("DQZWM <>", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmGreaterThan(String value) {
            addCriterion("DQZWM >", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmGreaterThanOrEqualTo(String value) {
            addCriterion("DQZWM >=", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmLessThan(String value) {
            addCriterion("DQZWM <", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmLessThanOrEqualTo(String value) {
            addCriterion("DQZWM <=", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmLike(String value) {
            addCriterion("DQZWM like", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmNotLike(String value) {
            addCriterion("DQZWM not like", value, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmIn(List<String> values) {
            addCriterion("DQZWM in", values, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmNotIn(List<String> values) {
            addCriterion("DQZWM not in", values, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmBetween(String value1, String value2) {
            addCriterion("DQZWM between", value1, value2, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwmNotBetween(String value1, String value2) {
            addCriterion("DQZWM not between", value1, value2, "dqzwm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmIsNull() {
            addCriterion("DQZWJBM is null");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmIsNotNull() {
            addCriterion("DQZWJBM is not null");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmEqualTo(String value) {
            addCriterion("DQZWJBM =", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmNotEqualTo(String value) {
            addCriterion("DQZWJBM <>", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmGreaterThan(String value) {
            addCriterion("DQZWJBM >", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmGreaterThanOrEqualTo(String value) {
            addCriterion("DQZWJBM >=", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmLessThan(String value) {
            addCriterion("DQZWJBM <", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmLessThanOrEqualTo(String value) {
            addCriterion("DQZWJBM <=", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmLike(String value) {
            addCriterion("DQZWJBM like", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmNotLike(String value) {
            addCriterion("DQZWJBM not like", value, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmIn(List<String> values) {
            addCriterion("DQZWJBM in", values, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmNotIn(List<String> values) {
            addCriterion("DQZWJBM not in", values, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmBetween(String value1, String value2) {
            addCriterion("DQZWJBM between", value1, value2, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andDqzwjbmNotBetween(String value1, String value2) {
            addCriterion("DQZWJBM not between", value1, value2, "dqzwjbm");
            return (Criteria) this;
        }

        public Criteria andZgxwmIsNull() {
            addCriterion("ZGXWM is null");
            return (Criteria) this;
        }

        public Criteria andZgxwmIsNotNull() {
            addCriterion("ZGXWM is not null");
            return (Criteria) this;
        }

        public Criteria andZgxwmEqualTo(String value) {
            addCriterion("ZGXWM =", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmNotEqualTo(String value) {
            addCriterion("ZGXWM <>", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmGreaterThan(String value) {
            addCriterion("ZGXWM >", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmGreaterThanOrEqualTo(String value) {
            addCriterion("ZGXWM >=", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmLessThan(String value) {
            addCriterion("ZGXWM <", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmLessThanOrEqualTo(String value) {
            addCriterion("ZGXWM <=", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmLike(String value) {
            addCriterion("ZGXWM like", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmNotLike(String value) {
            addCriterion("ZGXWM not like", value, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmIn(List<String> values) {
            addCriterion("ZGXWM in", values, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmNotIn(List<String> values) {
            addCriterion("ZGXWM not in", values, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmBetween(String value1, String value2) {
            addCriterion("ZGXWM between", value1, value2, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andZgxwmNotBetween(String value1, String value2) {
            addCriterion("ZGXWM not between", value1, value2, "zgxwm");
            return (Criteria) this;
        }

        public Criteria andBzlxmIsNull() {
            addCriterion("BZLXM is null");
            return (Criteria) this;
        }

        public Criteria andBzlxmIsNotNull() {
            addCriterion("BZLXM is not null");
            return (Criteria) this;
        }

        public Criteria andBzlxmEqualTo(String value) {
            addCriterion("BZLXM =", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmNotEqualTo(String value) {
            addCriterion("BZLXM <>", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmGreaterThan(String value) {
            addCriterion("BZLXM >", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmGreaterThanOrEqualTo(String value) {
            addCriterion("BZLXM >=", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmLessThan(String value) {
            addCriterion("BZLXM <", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmLessThanOrEqualTo(String value) {
            addCriterion("BZLXM <=", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmLike(String value) {
            addCriterion("BZLXM like", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmNotLike(String value) {
            addCriterion("BZLXM not like", value, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmIn(List<String> values) {
            addCriterion("BZLXM in", values, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmNotIn(List<String> values) {
            addCriterion("BZLXM not in", values, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmBetween(String value1, String value2) {
            addCriterion("BZLXM between", value1, value2, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andBzlxmNotBetween(String value1, String value2) {
            addCriterion("BZLXM not between", value1, value2, "bzlxm");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNull() {
            addCriterion("XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNotNull() {
            addCriterion("XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXgsjEqualTo(String value) {
            addCriterion("XGSJ =", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotEqualTo(String value) {
            addCriterion("XGSJ <>", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThan(String value) {
            addCriterion("XGSJ >", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThanOrEqualTo(String value) {
            addCriterion("XGSJ >=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThan(String value) {
            addCriterion("XGSJ <", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThanOrEqualTo(String value) {
            addCriterion("XGSJ <=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLike(String value) {
            addCriterion("XGSJ like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotLike(String value) {
            addCriterion("XGSJ not like", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjIn(List<String> values) {
            addCriterion("XGSJ in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotIn(List<String> values) {
            addCriterion("XGSJ not in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjBetween(String value1, String value2) {
            addCriterion("XGSJ between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotBetween(String value1, String value2) {
            addCriterion("XGSJ not between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andRylxdmIsNull() {
            addCriterion("RYLXDM is null");
            return (Criteria) this;
        }

        public Criteria andRylxdmIsNotNull() {
            addCriterion("RYLXDM is not null");
            return (Criteria) this;
        }

        public Criteria andRylxdmEqualTo(String value) {
            addCriterion("RYLXDM =", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmNotEqualTo(String value) {
            addCriterion("RYLXDM <>", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmGreaterThan(String value) {
            addCriterion("RYLXDM >", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmGreaterThanOrEqualTo(String value) {
            addCriterion("RYLXDM >=", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmLessThan(String value) {
            addCriterion("RYLXDM <", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmLessThanOrEqualTo(String value) {
            addCriterion("RYLXDM <=", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmLike(String value) {
            addCriterion("RYLXDM like", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmNotLike(String value) {
            addCriterion("RYLXDM not like", value, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmIn(List<String> values) {
            addCriterion("RYLXDM in", values, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmNotIn(List<String> values) {
            addCriterion("RYLXDM not in", values, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmBetween(String value1, String value2) {
            addCriterion("RYLXDM between", value1, value2, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andRylxdmNotBetween(String value1, String value2) {
            addCriterion("RYLXDM not between", value1, value2, "rylxdm");
            return (Criteria) this;
        }

        public Criteria andDqzcm2IsNull() {
            addCriterion("DQZCM2 is null");
            return (Criteria) this;
        }

        public Criteria andDqzcm2IsNotNull() {
            addCriterion("DQZCM2 is not null");
            return (Criteria) this;
        }

        public Criteria andDqzcm2EqualTo(String value) {
            addCriterion("DQZCM2 =", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2NotEqualTo(String value) {
            addCriterion("DQZCM2 <>", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2GreaterThan(String value) {
            addCriterion("DQZCM2 >", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2GreaterThanOrEqualTo(String value) {
            addCriterion("DQZCM2 >=", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2LessThan(String value) {
            addCriterion("DQZCM2 <", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2LessThanOrEqualTo(String value) {
            addCriterion("DQZCM2 <=", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2Like(String value) {
            addCriterion("DQZCM2 like", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2NotLike(String value) {
            addCriterion("DQZCM2 not like", value, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2In(List<String> values) {
            addCriterion("DQZCM2 in", values, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2NotIn(List<String> values) {
            addCriterion("DQZCM2 not in", values, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2Between(String value1, String value2) {
            addCriterion("DQZCM2 between", value1, value2, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andDqzcm2NotBetween(String value1, String value2) {
            addCriterion("DQZCM2 not between", value1, value2, "dqzcm2");
            return (Criteria) this;
        }

        public Criteria andZcjbIsNull() {
            addCriterion("ZCJB is null");
            return (Criteria) this;
        }

        public Criteria andZcjbIsNotNull() {
            addCriterion("ZCJB is not null");
            return (Criteria) this;
        }

        public Criteria andZcjbEqualTo(String value) {
            addCriterion("ZCJB =", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotEqualTo(String value) {
            addCriterion("ZCJB <>", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbGreaterThan(String value) {
            addCriterion("ZCJB >", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbGreaterThanOrEqualTo(String value) {
            addCriterion("ZCJB >=", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbLessThan(String value) {
            addCriterion("ZCJB <", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbLessThanOrEqualTo(String value) {
            addCriterion("ZCJB <=", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbLike(String value) {
            addCriterion("ZCJB like", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotLike(String value) {
            addCriterion("ZCJB not like", value, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbIn(List<String> values) {
            addCriterion("ZCJB in", values, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotIn(List<String> values) {
            addCriterion("ZCJB not in", values, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbBetween(String value1, String value2) {
            addCriterion("ZCJB between", value1, value2, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZcjbNotBetween(String value1, String value2) {
            addCriterion("ZCJB not between", value1, value2, "zcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1IsNull() {
            addCriterion("ZYJSZW_ZC1 is null");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1IsNotNull() {
            addCriterion("ZYJSZW_ZC1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1EqualTo(String value) {
            addCriterion("ZYJSZW_ZC1 =", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1NotEqualTo(String value) {
            addCriterion("ZYJSZW_ZC1 <>", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1GreaterThan(String value) {
            addCriterion("ZYJSZW_ZC1 >", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYJSZW_ZC1 >=", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1LessThan(String value) {
            addCriterion("ZYJSZW_ZC1 <", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1LessThanOrEqualTo(String value) {
            addCriterion("ZYJSZW_ZC1 <=", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1Like(String value) {
            addCriterion("ZYJSZW_ZC1 like", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1NotLike(String value) {
            addCriterion("ZYJSZW_ZC1 not like", value, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1In(List<String> values) {
            addCriterion("ZYJSZW_ZC1 in", values, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1NotIn(List<String> values) {
            addCriterion("ZYJSZW_ZC1 not in", values, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1Between(String value1, String value2) {
            addCriterion("ZYJSZW_ZC1 between", value1, value2, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc1NotBetween(String value1, String value2) {
            addCriterion("ZYJSZW_ZC1 not between", value1, value2, "zyjszwZc1");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2IsNull() {
            addCriterion("ZYJSZW_ZC2 is null");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2IsNotNull() {
            addCriterion("ZYJSZW_ZC2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2EqualTo(String value) {
            addCriterion("ZYJSZW_ZC2 =", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2NotEqualTo(String value) {
            addCriterion("ZYJSZW_ZC2 <>", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2GreaterThan(String value) {
            addCriterion("ZYJSZW_ZC2 >", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYJSZW_ZC2 >=", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2LessThan(String value) {
            addCriterion("ZYJSZW_ZC2 <", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2LessThanOrEqualTo(String value) {
            addCriterion("ZYJSZW_ZC2 <=", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2Like(String value) {
            addCriterion("ZYJSZW_ZC2 like", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2NotLike(String value) {
            addCriterion("ZYJSZW_ZC2 not like", value, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2In(List<String> values) {
            addCriterion("ZYJSZW_ZC2 in", values, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2NotIn(List<String> values) {
            addCriterion("ZYJSZW_ZC2 not in", values, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2Between(String value1, String value2) {
            addCriterion("ZYJSZW_ZC2 between", value1, value2, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZc2NotBetween(String value1, String value2) {
            addCriterion("ZYJSZW_ZC2 not between", value1, value2, "zyjszwZc2");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbIsNull() {
            addCriterion("ZYJSZW_ZCJB is null");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbIsNotNull() {
            addCriterion("ZYJSZW_ZCJB is not null");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbEqualTo(String value) {
            addCriterion("ZYJSZW_ZCJB =", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbNotEqualTo(String value) {
            addCriterion("ZYJSZW_ZCJB <>", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbGreaterThan(String value) {
            addCriterion("ZYJSZW_ZCJB >", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbGreaterThanOrEqualTo(String value) {
            addCriterion("ZYJSZW_ZCJB >=", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbLessThan(String value) {
            addCriterion("ZYJSZW_ZCJB <", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbLessThanOrEqualTo(String value) {
            addCriterion("ZYJSZW_ZCJB <=", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbLike(String value) {
            addCriterion("ZYJSZW_ZCJB like", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbNotLike(String value) {
            addCriterion("ZYJSZW_ZCJB not like", value, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbIn(List<String> values) {
            addCriterion("ZYJSZW_ZCJB in", values, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbNotIn(List<String> values) {
            addCriterion("ZYJSZW_ZCJB not in", values, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbBetween(String value1, String value2) {
            addCriterion("ZYJSZW_ZCJB between", value1, value2, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwZcjbNotBetween(String value1, String value2) {
            addCriterion("ZYJSZW_ZCJB not between", value1, value2, "zyjszwZcjb");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjIsNull() {
            addCriterion("ZYJSZW_PRSJ is null");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjIsNotNull() {
            addCriterion("ZYJSZW_PRSJ is not null");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjEqualTo(Date value) {
            addCriterion("ZYJSZW_PRSJ =", value, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjNotEqualTo(Date value) {
            addCriterion("ZYJSZW_PRSJ <>", value, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjGreaterThan(Date value) {
            addCriterion("ZYJSZW_PRSJ >", value, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjGreaterThanOrEqualTo(Date value) {
            addCriterion("ZYJSZW_PRSJ >=", value, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjLessThan(Date value) {
            addCriterion("ZYJSZW_PRSJ <", value, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjLessThanOrEqualTo(Date value) {
            addCriterion("ZYJSZW_PRSJ <=", value, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjIn(List<Date> values) {
            addCriterion("ZYJSZW_PRSJ in", values, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjNotIn(List<Date> values) {
            addCriterion("ZYJSZW_PRSJ not in", values, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjBetween(Date value1, Date value2) {
            addCriterion("ZYJSZW_PRSJ between", value1, value2, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andZyjszwPrsjNotBetween(Date value1, Date value2) {
            addCriterion("ZYJSZW_PRSJ not between", value1, value2, "zyjszwPrsj");
            return (Criteria) this;
        }

        public Criteria andXzzwMcIsNull() {
            addCriterion("XZZW_MC is null");
            return (Criteria) this;
        }

        public Criteria andXzzwMcIsNotNull() {
            addCriterion("XZZW_MC is not null");
            return (Criteria) this;
        }

        public Criteria andXzzwMcEqualTo(String value) {
            addCriterion("XZZW_MC =", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcNotEqualTo(String value) {
            addCriterion("XZZW_MC <>", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcGreaterThan(String value) {
            addCriterion("XZZW_MC >", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcGreaterThanOrEqualTo(String value) {
            addCriterion("XZZW_MC >=", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcLessThan(String value) {
            addCriterion("XZZW_MC <", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcLessThanOrEqualTo(String value) {
            addCriterion("XZZW_MC <=", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcLike(String value) {
            addCriterion("XZZW_MC like", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcNotLike(String value) {
            addCriterion("XZZW_MC not like", value, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcIn(List<String> values) {
            addCriterion("XZZW_MC in", values, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcNotIn(List<String> values) {
            addCriterion("XZZW_MC not in", values, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcBetween(String value1, String value2) {
            addCriterion("XZZW_MC between", value1, value2, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwMcNotBetween(String value1, String value2) {
            addCriterion("XZZW_MC not between", value1, value2, "xzzwMc");
            return (Criteria) this;
        }

        public Criteria andXzzwJbIsNull() {
            addCriterion("XZZW_JB is null");
            return (Criteria) this;
        }

        public Criteria andXzzwJbIsNotNull() {
            addCriterion("XZZW_JB is not null");
            return (Criteria) this;
        }

        public Criteria andXzzwJbEqualTo(String value) {
            addCriterion("XZZW_JB =", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbNotEqualTo(String value) {
            addCriterion("XZZW_JB <>", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbGreaterThan(String value) {
            addCriterion("XZZW_JB >", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbGreaterThanOrEqualTo(String value) {
            addCriterion("XZZW_JB >=", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbLessThan(String value) {
            addCriterion("XZZW_JB <", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbLessThanOrEqualTo(String value) {
            addCriterion("XZZW_JB <=", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbLike(String value) {
            addCriterion("XZZW_JB like", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbNotLike(String value) {
            addCriterion("XZZW_JB not like", value, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbIn(List<String> values) {
            addCriterion("XZZW_JB in", values, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbNotIn(List<String> values) {
            addCriterion("XZZW_JB not in", values, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbBetween(String value1, String value2) {
            addCriterion("XZZW_JB between", value1, value2, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwJbNotBetween(String value1, String value2) {
            addCriterion("XZZW_JB not between", value1, value2, "xzzwJb");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjIsNull() {
            addCriterion("XZZW_KSSJ is null");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjIsNotNull() {
            addCriterion("XZZW_KSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjEqualTo(Date value) {
            addCriterion("XZZW_KSSJ =", value, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjNotEqualTo(Date value) {
            addCriterion("XZZW_KSSJ <>", value, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjGreaterThan(Date value) {
            addCriterion("XZZW_KSSJ >", value, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjGreaterThanOrEqualTo(Date value) {
            addCriterion("XZZW_KSSJ >=", value, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjLessThan(Date value) {
            addCriterion("XZZW_KSSJ <", value, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjLessThanOrEqualTo(Date value) {
            addCriterion("XZZW_KSSJ <=", value, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjIn(List<Date> values) {
            addCriterion("XZZW_KSSJ in", values, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjNotIn(List<Date> values) {
            addCriterion("XZZW_KSSJ not in", values, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjBetween(Date value1, Date value2) {
            addCriterion("XZZW_KSSJ between", value1, value2, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andXzzwKssjNotBetween(Date value1, Date value2) {
            addCriterion("XZZW_KSSJ not between", value1, value2, "xzzwKssj");
            return (Criteria) this;
        }

        public Criteria andGlgwLxIsNull() {
            addCriterion("GLGW_LX is null");
            return (Criteria) this;
        }

        public Criteria andGlgwLxIsNotNull() {
            addCriterion("GLGW_LX is not null");
            return (Criteria) this;
        }

        public Criteria andGlgwLxEqualTo(String value) {
            addCriterion("GLGW_LX =", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxNotEqualTo(String value) {
            addCriterion("GLGW_LX <>", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxGreaterThan(String value) {
            addCriterion("GLGW_LX >", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxGreaterThanOrEqualTo(String value) {
            addCriterion("GLGW_LX >=", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxLessThan(String value) {
            addCriterion("GLGW_LX <", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxLessThanOrEqualTo(String value) {
            addCriterion("GLGW_LX <=", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxLike(String value) {
            addCriterion("GLGW_LX like", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxNotLike(String value) {
            addCriterion("GLGW_LX not like", value, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxIn(List<String> values) {
            addCriterion("GLGW_LX in", values, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxNotIn(List<String> values) {
            addCriterion("GLGW_LX not in", values, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxBetween(String value1, String value2) {
            addCriterion("GLGW_LX between", value1, value2, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwLxNotBetween(String value1, String value2) {
            addCriterion("GLGW_LX not between", value1, value2, "glgwLx");
            return (Criteria) this;
        }

        public Criteria andGlgwJbIsNull() {
            addCriterion("GLGW_JB is null");
            return (Criteria) this;
        }

        public Criteria andGlgwJbIsNotNull() {
            addCriterion("GLGW_JB is not null");
            return (Criteria) this;
        }

        public Criteria andGlgwJbEqualTo(String value) {
            addCriterion("GLGW_JB =", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbNotEqualTo(String value) {
            addCriterion("GLGW_JB <>", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbGreaterThan(String value) {
            addCriterion("GLGW_JB >", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbGreaterThanOrEqualTo(String value) {
            addCriterion("GLGW_JB >=", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbLessThan(String value) {
            addCriterion("GLGW_JB <", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbLessThanOrEqualTo(String value) {
            addCriterion("GLGW_JB <=", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbLike(String value) {
            addCriterion("GLGW_JB like", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbNotLike(String value) {
            addCriterion("GLGW_JB not like", value, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbIn(List<String> values) {
            addCriterion("GLGW_JB in", values, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbNotIn(List<String> values) {
            addCriterion("GLGW_JB not in", values, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbBetween(String value1, String value2) {
            addCriterion("GLGW_JB between", value1, value2, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andGlgwJbNotBetween(String value1, String value2) {
            addCriterion("GLGW_JB not between", value1, value2, "glgwJb");
            return (Criteria) this;
        }

        public Criteria andEjdwhIsNull() {
            addCriterion("EJDWH is null");
            return (Criteria) this;
        }

        public Criteria andEjdwhIsNotNull() {
            addCriterion("EJDWH is not null");
            return (Criteria) this;
        }

        public Criteria andEjdwhEqualTo(String value) {
            addCriterion("EJDWH =", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhNotEqualTo(String value) {
            addCriterion("EJDWH <>", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhGreaterThan(String value) {
            addCriterion("EJDWH >", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhGreaterThanOrEqualTo(String value) {
            addCriterion("EJDWH >=", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhLessThan(String value) {
            addCriterion("EJDWH <", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhLessThanOrEqualTo(String value) {
            addCriterion("EJDWH <=", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhLike(String value) {
            addCriterion("EJDWH like", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhNotLike(String value) {
            addCriterion("EJDWH not like", value, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhIn(List<String> values) {
            addCriterion("EJDWH in", values, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhNotIn(List<String> values) {
            addCriterion("EJDWH not in", values, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhBetween(String value1, String value2) {
            addCriterion("EJDWH between", value1, value2, "ejdwh");
            return (Criteria) this;
        }

        public Criteria andEjdwhNotBetween(String value1, String value2) {
            addCriterion("EJDWH not between", value1, value2, "ejdwh");
            return (Criteria) this;
        }
    }

    /**
     * V_JZGJCSJXX
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * V_JZGJCSJXX 2018-10-14
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