package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HySbrymdParams {
    /**
     * T_HY_SBRYMD
     */
    protected String orderByClause;

    /**
     * T_HY_SBRYMD
     */
    protected boolean distinct;

    /**
     * T_HY_SBRYMD
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public HySbrymdParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-06-12
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
     * @mbggenerated 2019-06-12
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-06-12
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_HY_SBRYMD 2019-06-12
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

        public Criteria andMdidIsNull() {
            addCriterion("MDID is null");
            return (Criteria) this;
        }

        public Criteria andMdidIsNotNull() {
            addCriterion("MDID is not null");
            return (Criteria) this;
        }

        public Criteria andMdidEqualTo(String value) {
            addCriterion("MDID =", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotEqualTo(String value) {
            addCriterion("MDID <>", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidGreaterThan(String value) {
            addCriterion("MDID >", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidGreaterThanOrEqualTo(String value) {
            addCriterion("MDID >=", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidLessThan(String value) {
            addCriterion("MDID <", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidLessThanOrEqualTo(String value) {
            addCriterion("MDID <=", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidLike(String value) {
            addCriterion("MDID like", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotLike(String value) {
            addCriterion("MDID not like", value, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidIn(List<String> values) {
            addCriterion("MDID in", values, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotIn(List<String> values) {
            addCriterion("MDID not in", values, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidBetween(String value1, String value2) {
            addCriterion("MDID between", value1, value2, "mdid");
            return (Criteria) this;
        }

        public Criteria andMdidNotBetween(String value1, String value2) {
            addCriterion("MDID not between", value1, value2, "mdid");
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

        public Criteria andDwIsNull() {
            addCriterion("DW is null");
            return (Criteria) this;
        }

        public Criteria andDwIsNotNull() {
            addCriterion("DW is not null");
            return (Criteria) this;
        }

        public Criteria andDwEqualTo(String value) {
            addCriterion("DW =", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotEqualTo(String value) {
            addCriterion("DW <>", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThan(String value) {
            addCriterion("DW >", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwGreaterThanOrEqualTo(String value) {
            addCriterion("DW >=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThan(String value) {
            addCriterion("DW <", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLessThanOrEqualTo(String value) {
            addCriterion("DW <=", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwLike(String value) {
            addCriterion("DW like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotLike(String value) {
            addCriterion("DW not like", value, "dw");
            return (Criteria) this;
        }

        public Criteria andDwIn(List<String> values) {
            addCriterion("DW in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotIn(List<String> values) {
            addCriterion("DW not in", values, "dw");
            return (Criteria) this;
        }

        public Criteria andDwBetween(String value1, String value2) {
            addCriterion("DW between", value1, value2, "dw");
            return (Criteria) this;
        }

        public Criteria andDwNotBetween(String value1, String value2) {
            addCriterion("DW not between", value1, value2, "dw");
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

        public Criteria andXmEnIsNull() {
            addCriterion("XM_EN is null");
            return (Criteria) this;
        }

        public Criteria andXmEnIsNotNull() {
            addCriterion("XM_EN is not null");
            return (Criteria) this;
        }

        public Criteria andXmEnEqualTo(String value) {
            addCriterion("XM_EN =", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnNotEqualTo(String value) {
            addCriterion("XM_EN <>", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnGreaterThan(String value) {
            addCriterion("XM_EN >", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnGreaterThanOrEqualTo(String value) {
            addCriterion("XM_EN >=", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnLessThan(String value) {
            addCriterion("XM_EN <", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnLessThanOrEqualTo(String value) {
            addCriterion("XM_EN <=", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnLike(String value) {
            addCriterion("XM_EN like", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnNotLike(String value) {
            addCriterion("XM_EN not like", value, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnIn(List<String> values) {
            addCriterion("XM_EN in", values, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnNotIn(List<String> values) {
            addCriterion("XM_EN not in", values, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnBetween(String value1, String value2) {
            addCriterion("XM_EN between", value1, value2, "xmEn");
            return (Criteria) this;
        }

        public Criteria andXmEnNotBetween(String value1, String value2) {
            addCriterion("XM_EN not between", value1, value2, "xmEn");
            return (Criteria) this;
        }

        public Criteria andGjEnIsNull() {
            addCriterion("GJ_EN is null");
            return (Criteria) this;
        }

        public Criteria andGjEnIsNotNull() {
            addCriterion("GJ_EN is not null");
            return (Criteria) this;
        }

        public Criteria andGjEnEqualTo(String value) {
            addCriterion("GJ_EN =", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnNotEqualTo(String value) {
            addCriterion("GJ_EN <>", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnGreaterThan(String value) {
            addCriterion("GJ_EN >", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnGreaterThanOrEqualTo(String value) {
            addCriterion("GJ_EN >=", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnLessThan(String value) {
            addCriterion("GJ_EN <", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnLessThanOrEqualTo(String value) {
            addCriterion("GJ_EN <=", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnLike(String value) {
            addCriterion("GJ_EN like", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnNotLike(String value) {
            addCriterion("GJ_EN not like", value, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnIn(List<String> values) {
            addCriterion("GJ_EN in", values, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnNotIn(List<String> values) {
            addCriterion("GJ_EN not in", values, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnBetween(String value1, String value2) {
            addCriterion("GJ_EN between", value1, value2, "gjEn");
            return (Criteria) this;
        }

        public Criteria andGjEnNotBetween(String value1, String value2) {
            addCriterion("GJ_EN not between", value1, value2, "gjEn");
            return (Criteria) this;
        }

        public Criteria andDwEnIsNull() {
            addCriterion("DW_EN is null");
            return (Criteria) this;
        }

        public Criteria andDwEnIsNotNull() {
            addCriterion("DW_EN is not null");
            return (Criteria) this;
        }

        public Criteria andDwEnEqualTo(String value) {
            addCriterion("DW_EN =", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnNotEqualTo(String value) {
            addCriterion("DW_EN <>", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnGreaterThan(String value) {
            addCriterion("DW_EN >", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnGreaterThanOrEqualTo(String value) {
            addCriterion("DW_EN >=", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnLessThan(String value) {
            addCriterion("DW_EN <", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnLessThanOrEqualTo(String value) {
            addCriterion("DW_EN <=", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnLike(String value) {
            addCriterion("DW_EN like", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnNotLike(String value) {
            addCriterion("DW_EN not like", value, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnIn(List<String> values) {
            addCriterion("DW_EN in", values, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnNotIn(List<String> values) {
            addCriterion("DW_EN not in", values, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnBetween(String value1, String value2) {
            addCriterion("DW_EN between", value1, value2, "dwEn");
            return (Criteria) this;
        }

        public Criteria andDwEnNotBetween(String value1, String value2) {
            addCriterion("DW_EN not between", value1, value2, "dwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnIsNull() {
            addCriterion("ZW_EN is null");
            return (Criteria) this;
        }

        public Criteria andZwEnIsNotNull() {
            addCriterion("ZW_EN is not null");
            return (Criteria) this;
        }

        public Criteria andZwEnEqualTo(String value) {
            addCriterion("ZW_EN =", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnNotEqualTo(String value) {
            addCriterion("ZW_EN <>", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnGreaterThan(String value) {
            addCriterion("ZW_EN >", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnGreaterThanOrEqualTo(String value) {
            addCriterion("ZW_EN >=", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnLessThan(String value) {
            addCriterion("ZW_EN <", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnLessThanOrEqualTo(String value) {
            addCriterion("ZW_EN <=", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnLike(String value) {
            addCriterion("ZW_EN like", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnNotLike(String value) {
            addCriterion("ZW_EN not like", value, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnIn(List<String> values) {
            addCriterion("ZW_EN in", values, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnNotIn(List<String> values) {
            addCriterion("ZW_EN not in", values, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnBetween(String value1, String value2) {
            addCriterion("ZW_EN between", value1, value2, "zwEn");
            return (Criteria) this;
        }

        public Criteria andZwEnNotBetween(String value1, String value2) {
            addCriterion("ZW_EN not between", value1, value2, "zwEn");
            return (Criteria) this;
        }

        public Criteria andSbidIsNull() {
            addCriterion("SBID is null");
            return (Criteria) this;
        }

        public Criteria andSbidIsNotNull() {
            addCriterion("SBID is not null");
            return (Criteria) this;
        }

        public Criteria andSbidEqualTo(String value) {
            addCriterion("SBID =", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotEqualTo(String value) {
            addCriterion("SBID <>", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThan(String value) {
            addCriterion("SBID >", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThanOrEqualTo(String value) {
            addCriterion("SBID >=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThan(String value) {
            addCriterion("SBID <", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThanOrEqualTo(String value) {
            addCriterion("SBID <=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLike(String value) {
            addCriterion("SBID like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotLike(String value) {
            addCriterion("SBID not like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidIn(List<String> values) {
            addCriterion("SBID in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotIn(List<String> values) {
            addCriterion("SBID not in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidBetween(String value1, String value2) {
            addCriterion("SBID between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotBetween(String value1, String value2) {
            addCriterion("SBID not between", value1, value2, "sbid");
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
     * T_HY_SBRYMD
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HY_SBRYMD 2019-06-12
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