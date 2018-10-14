package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BksXjjbsjxxParams {
    /**
     * V_BKS_XJJBSJXX
     */
    protected String orderByClause;

    /**
     * V_BKS_XJJBSJXX
     */
    protected boolean distinct;

    /**
     * V_BKS_XJJBSJXX
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public BksXjjbsjxxParams() {
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
     * V_BKS_XJJBSJXX 2018-10-14
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

        public Criteria andYxshIsNull() {
            addCriterion("YXSH is null");
            return (Criteria) this;
        }

        public Criteria andYxshIsNotNull() {
            addCriterion("YXSH is not null");
            return (Criteria) this;
        }

        public Criteria andYxshEqualTo(String value) {
            addCriterion("YXSH =", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotEqualTo(String value) {
            addCriterion("YXSH <>", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshGreaterThan(String value) {
            addCriterion("YXSH >", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshGreaterThanOrEqualTo(String value) {
            addCriterion("YXSH >=", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshLessThan(String value) {
            addCriterion("YXSH <", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshLessThanOrEqualTo(String value) {
            addCriterion("YXSH <=", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshLike(String value) {
            addCriterion("YXSH like", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotLike(String value) {
            addCriterion("YXSH not like", value, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshIn(List<String> values) {
            addCriterion("YXSH in", values, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotIn(List<String> values) {
            addCriterion("YXSH not in", values, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshBetween(String value1, String value2) {
            addCriterion("YXSH between", value1, value2, "yxsh");
            return (Criteria) this;
        }

        public Criteria andYxshNotBetween(String value1, String value2) {
            addCriterion("YXSH not between", value1, value2, "yxsh");
            return (Criteria) this;
        }

        public Criteria andZymIsNull() {
            addCriterion("ZYM is null");
            return (Criteria) this;
        }

        public Criteria andZymIsNotNull() {
            addCriterion("ZYM is not null");
            return (Criteria) this;
        }

        public Criteria andZymEqualTo(String value) {
            addCriterion("ZYM =", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymNotEqualTo(String value) {
            addCriterion("ZYM <>", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymGreaterThan(String value) {
            addCriterion("ZYM >", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymGreaterThanOrEqualTo(String value) {
            addCriterion("ZYM >=", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymLessThan(String value) {
            addCriterion("ZYM <", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymLessThanOrEqualTo(String value) {
            addCriterion("ZYM <=", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymLike(String value) {
            addCriterion("ZYM like", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymNotLike(String value) {
            addCriterion("ZYM not like", value, "zym");
            return (Criteria) this;
        }

        public Criteria andZymIn(List<String> values) {
            addCriterion("ZYM in", values, "zym");
            return (Criteria) this;
        }

        public Criteria andZymNotIn(List<String> values) {
            addCriterion("ZYM not in", values, "zym");
            return (Criteria) this;
        }

        public Criteria andZymBetween(String value1, String value2) {
            addCriterion("ZYM between", value1, value2, "zym");
            return (Criteria) this;
        }

        public Criteria andZymNotBetween(String value1, String value2) {
            addCriterion("ZYM not between", value1, value2, "zym");
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

        public Criteria andPyfsmIsNull() {
            addCriterion("PYFSM is null");
            return (Criteria) this;
        }

        public Criteria andPyfsmIsNotNull() {
            addCriterion("PYFSM is not null");
            return (Criteria) this;
        }

        public Criteria andPyfsmEqualTo(String value) {
            addCriterion("PYFSM =", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmNotEqualTo(String value) {
            addCriterion("PYFSM <>", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmGreaterThan(String value) {
            addCriterion("PYFSM >", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmGreaterThanOrEqualTo(String value) {
            addCriterion("PYFSM >=", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmLessThan(String value) {
            addCriterion("PYFSM <", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmLessThanOrEqualTo(String value) {
            addCriterion("PYFSM <=", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmLike(String value) {
            addCriterion("PYFSM like", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmNotLike(String value) {
            addCriterion("PYFSM not like", value, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmIn(List<String> values) {
            addCriterion("PYFSM in", values, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmNotIn(List<String> values) {
            addCriterion("PYFSM not in", values, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmBetween(String value1, String value2) {
            addCriterion("PYFSM between", value1, value2, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andPyfsmNotBetween(String value1, String value2) {
            addCriterion("PYFSM not between", value1, value2, "pyfsm");
            return (Criteria) this;
        }

        public Criteria andXslbmIsNull() {
            addCriterion("XSLBM is null");
            return (Criteria) this;
        }

        public Criteria andXslbmIsNotNull() {
            addCriterion("XSLBM is not null");
            return (Criteria) this;
        }

        public Criteria andXslbmEqualTo(String value) {
            addCriterion("XSLBM =", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmNotEqualTo(String value) {
            addCriterion("XSLBM <>", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmGreaterThan(String value) {
            addCriterion("XSLBM >", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmGreaterThanOrEqualTo(String value) {
            addCriterion("XSLBM >=", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmLessThan(String value) {
            addCriterion("XSLBM <", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmLessThanOrEqualTo(String value) {
            addCriterion("XSLBM <=", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmLike(String value) {
            addCriterion("XSLBM like", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmNotLike(String value) {
            addCriterion("XSLBM not like", value, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmIn(List<String> values) {
            addCriterion("XSLBM in", values, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmNotIn(List<String> values) {
            addCriterion("XSLBM not in", values, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmBetween(String value1, String value2) {
            addCriterion("XSLBM between", value1, value2, "xslbm");
            return (Criteria) this;
        }

        public Criteria andXslbmNotBetween(String value1, String value2) {
            addCriterion("XSLBM not between", value1, value2, "xslbm");
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

        public Criteria andDshIsNull() {
            addCriterion("DSH is null");
            return (Criteria) this;
        }

        public Criteria andDshIsNotNull() {
            addCriterion("DSH is not null");
            return (Criteria) this;
        }

        public Criteria andDshEqualTo(String value) {
            addCriterion("DSH =", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshNotEqualTo(String value) {
            addCriterion("DSH <>", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshGreaterThan(String value) {
            addCriterion("DSH >", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshGreaterThanOrEqualTo(String value) {
            addCriterion("DSH >=", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshLessThan(String value) {
            addCriterion("DSH <", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshLessThanOrEqualTo(String value) {
            addCriterion("DSH <=", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshLike(String value) {
            addCriterion("DSH like", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshNotLike(String value) {
            addCriterion("DSH not like", value, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshIn(List<String> values) {
            addCriterion("DSH in", values, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshNotIn(List<String> values) {
            addCriterion("DSH not in", values, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshBetween(String value1, String value2) {
            addCriterion("DSH between", value1, value2, "dsh");
            return (Criteria) this;
        }

        public Criteria andDshNotBetween(String value1, String value2) {
            addCriterion("DSH not between", value1, value2, "dsh");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmIsNull() {
            addCriterion("HDXLFSM is null");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmIsNotNull() {
            addCriterion("HDXLFSM is not null");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmEqualTo(String value) {
            addCriterion("HDXLFSM =", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmNotEqualTo(String value) {
            addCriterion("HDXLFSM <>", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmGreaterThan(String value) {
            addCriterion("HDXLFSM >", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmGreaterThanOrEqualTo(String value) {
            addCriterion("HDXLFSM >=", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmLessThan(String value) {
            addCriterion("HDXLFSM <", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmLessThanOrEqualTo(String value) {
            addCriterion("HDXLFSM <=", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmLike(String value) {
            addCriterion("HDXLFSM like", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmNotLike(String value) {
            addCriterion("HDXLFSM not like", value, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmIn(List<String> values) {
            addCriterion("HDXLFSM in", values, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmNotIn(List<String> values) {
            addCriterion("HDXLFSM not in", values, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmBetween(String value1, String value2) {
            addCriterion("HDXLFSM between", value1, value2, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andHdxlfsmNotBetween(String value1, String value2) {
            addCriterion("HDXLFSM not between", value1, value2, "hdxlfsm");
            return (Criteria) this;
        }

        public Criteria andSfxfzIsNull() {
            addCriterion("SFXFZ is null");
            return (Criteria) this;
        }

        public Criteria andSfxfzIsNotNull() {
            addCriterion("SFXFZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfxfzEqualTo(String value) {
            addCriterion("SFXFZ =", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzNotEqualTo(String value) {
            addCriterion("SFXFZ <>", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzGreaterThan(String value) {
            addCriterion("SFXFZ >", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzGreaterThanOrEqualTo(String value) {
            addCriterion("SFXFZ >=", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzLessThan(String value) {
            addCriterion("SFXFZ <", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzLessThanOrEqualTo(String value) {
            addCriterion("SFXFZ <=", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzLike(String value) {
            addCriterion("SFXFZ like", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzNotLike(String value) {
            addCriterion("SFXFZ not like", value, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzIn(List<String> values) {
            addCriterion("SFXFZ in", values, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzNotIn(List<String> values) {
            addCriterion("SFXFZ not in", values, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzBetween(String value1, String value2) {
            addCriterion("SFXFZ between", value1, value2, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSfxfzNotBetween(String value1, String value2) {
            addCriterion("SFXFZ not between", value1, value2, "sfxfz");
            return (Criteria) this;
        }

        public Criteria andSznjIsNull() {
            addCriterion("SZNJ is null");
            return (Criteria) this;
        }

        public Criteria andSznjIsNotNull() {
            addCriterion("SZNJ is not null");
            return (Criteria) this;
        }

        public Criteria andSznjEqualTo(String value) {
            addCriterion("SZNJ =", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjNotEqualTo(String value) {
            addCriterion("SZNJ <>", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjGreaterThan(String value) {
            addCriterion("SZNJ >", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjGreaterThanOrEqualTo(String value) {
            addCriterion("SZNJ >=", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjLessThan(String value) {
            addCriterion("SZNJ <", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjLessThanOrEqualTo(String value) {
            addCriterion("SZNJ <=", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjLike(String value) {
            addCriterion("SZNJ like", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjNotLike(String value) {
            addCriterion("SZNJ not like", value, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjIn(List<String> values) {
            addCriterion("SZNJ in", values, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjNotIn(List<String> values) {
            addCriterion("SZNJ not in", values, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjBetween(String value1, String value2) {
            addCriterion("SZNJ between", value1, value2, "sznj");
            return (Criteria) this;
        }

        public Criteria andSznjNotBetween(String value1, String value2) {
            addCriterion("SZNJ not between", value1, value2, "sznj");
            return (Criteria) this;
        }

        public Criteria andPyccmIsNull() {
            addCriterion("PYCCM is null");
            return (Criteria) this;
        }

        public Criteria andPyccmIsNotNull() {
            addCriterion("PYCCM is not null");
            return (Criteria) this;
        }

        public Criteria andPyccmEqualTo(String value) {
            addCriterion("PYCCM =", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmNotEqualTo(String value) {
            addCriterion("PYCCM <>", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmGreaterThan(String value) {
            addCriterion("PYCCM >", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmGreaterThanOrEqualTo(String value) {
            addCriterion("PYCCM >=", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmLessThan(String value) {
            addCriterion("PYCCM <", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmLessThanOrEqualTo(String value) {
            addCriterion("PYCCM <=", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmLike(String value) {
            addCriterion("PYCCM like", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmNotLike(String value) {
            addCriterion("PYCCM not like", value, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmIn(List<String> values) {
            addCriterion("PYCCM in", values, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmNotIn(List<String> values) {
            addCriterion("PYCCM not in", values, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmBetween(String value1, String value2) {
            addCriterion("PYCCM between", value1, value2, "pyccm");
            return (Criteria) this;
        }

        public Criteria andPyccmNotBetween(String value1, String value2) {
            addCriterion("PYCCM not between", value1, value2, "pyccm");
            return (Criteria) this;
        }

        public Criteria andLdfsmIsNull() {
            addCriterion("LDFSM is null");
            return (Criteria) this;
        }

        public Criteria andLdfsmIsNotNull() {
            addCriterion("LDFSM is not null");
            return (Criteria) this;
        }

        public Criteria andLdfsmEqualTo(String value) {
            addCriterion("LDFSM =", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmNotEqualTo(String value) {
            addCriterion("LDFSM <>", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmGreaterThan(String value) {
            addCriterion("LDFSM >", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmGreaterThanOrEqualTo(String value) {
            addCriterion("LDFSM >=", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmLessThan(String value) {
            addCriterion("LDFSM <", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmLessThanOrEqualTo(String value) {
            addCriterion("LDFSM <=", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmLike(String value) {
            addCriterion("LDFSM like", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmNotLike(String value) {
            addCriterion("LDFSM not like", value, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmIn(List<String> values) {
            addCriterion("LDFSM in", values, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmNotIn(List<String> values) {
            addCriterion("LDFSM not in", values, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmBetween(String value1, String value2) {
            addCriterion("LDFSM between", value1, value2, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andLdfsmNotBetween(String value1, String value2) {
            addCriterion("LDFSM not between", value1, value2, "ldfsm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmIsNull() {
            addCriterion("XSDQZTM is null");
            return (Criteria) this;
        }

        public Criteria andXsdqztmIsNotNull() {
            addCriterion("XSDQZTM is not null");
            return (Criteria) this;
        }

        public Criteria andXsdqztmEqualTo(String value) {
            addCriterion("XSDQZTM =", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmNotEqualTo(String value) {
            addCriterion("XSDQZTM <>", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmGreaterThan(String value) {
            addCriterion("XSDQZTM >", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmGreaterThanOrEqualTo(String value) {
            addCriterion("XSDQZTM >=", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmLessThan(String value) {
            addCriterion("XSDQZTM <", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmLessThanOrEqualTo(String value) {
            addCriterion("XSDQZTM <=", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmLike(String value) {
            addCriterion("XSDQZTM like", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmNotLike(String value) {
            addCriterion("XSDQZTM not like", value, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmIn(List<String> values) {
            addCriterion("XSDQZTM in", values, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmNotIn(List<String> values) {
            addCriterion("XSDQZTM not in", values, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmBetween(String value1, String value2) {
            addCriterion("XSDQZTM between", value1, value2, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsdqztmNotBetween(String value1, String value2) {
            addCriterion("XSDQZTM not between", value1, value2, "xsdqztm");
            return (Criteria) this;
        }

        public Criteria andXsccmIsNull() {
            addCriterion("XSCCM is null");
            return (Criteria) this;
        }

        public Criteria andXsccmIsNotNull() {
            addCriterion("XSCCM is not null");
            return (Criteria) this;
        }

        public Criteria andXsccmEqualTo(String value) {
            addCriterion("XSCCM =", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmNotEqualTo(String value) {
            addCriterion("XSCCM <>", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmGreaterThan(String value) {
            addCriterion("XSCCM >", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmGreaterThanOrEqualTo(String value) {
            addCriterion("XSCCM >=", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmLessThan(String value) {
            addCriterion("XSCCM <", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmLessThanOrEqualTo(String value) {
            addCriterion("XSCCM <=", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmLike(String value) {
            addCriterion("XSCCM like", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmNotLike(String value) {
            addCriterion("XSCCM not like", value, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmIn(List<String> values) {
            addCriterion("XSCCM in", values, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmNotIn(List<String> values) {
            addCriterion("XSCCM not in", values, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmBetween(String value1, String value2) {
            addCriterion("XSCCM between", value1, value2, "xsccm");
            return (Criteria) this;
        }

        public Criteria andXsccmNotBetween(String value1, String value2) {
            addCriterion("XSCCM not between", value1, value2, "xsccm");
            return (Criteria) this;
        }

        public Criteria andSzbhIsNull() {
            addCriterion("SZBH is null");
            return (Criteria) this;
        }

        public Criteria andSzbhIsNotNull() {
            addCriterion("SZBH is not null");
            return (Criteria) this;
        }

        public Criteria andSzbhEqualTo(String value) {
            addCriterion("SZBH =", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhNotEqualTo(String value) {
            addCriterion("SZBH <>", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhGreaterThan(String value) {
            addCriterion("SZBH >", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhGreaterThanOrEqualTo(String value) {
            addCriterion("SZBH >=", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhLessThan(String value) {
            addCriterion("SZBH <", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhLessThanOrEqualTo(String value) {
            addCriterion("SZBH <=", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhLike(String value) {
            addCriterion("SZBH like", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhNotLike(String value) {
            addCriterion("SZBH not like", value, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhIn(List<String> values) {
            addCriterion("SZBH in", values, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhNotIn(List<String> values) {
            addCriterion("SZBH not in", values, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhBetween(String value1, String value2) {
            addCriterion("SZBH between", value1, value2, "szbh");
            return (Criteria) this;
        }

        public Criteria andSzbhNotBetween(String value1, String value2) {
            addCriterion("SZBH not between", value1, value2, "szbh");
            return (Criteria) this;
        }

        public Criteria andXjbhIsNull() {
            addCriterion("XJBH is null");
            return (Criteria) this;
        }

        public Criteria andXjbhIsNotNull() {
            addCriterion("XJBH is not null");
            return (Criteria) this;
        }

        public Criteria andXjbhEqualTo(String value) {
            addCriterion("XJBH =", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhNotEqualTo(String value) {
            addCriterion("XJBH <>", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhGreaterThan(String value) {
            addCriterion("XJBH >", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhGreaterThanOrEqualTo(String value) {
            addCriterion("XJBH >=", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhLessThan(String value) {
            addCriterion("XJBH <", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhLessThanOrEqualTo(String value) {
            addCriterion("XJBH <=", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhLike(String value) {
            addCriterion("XJBH like", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhNotLike(String value) {
            addCriterion("XJBH not like", value, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhIn(List<String> values) {
            addCriterion("XJBH in", values, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhNotIn(List<String> values) {
            addCriterion("XJBH not in", values, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhBetween(String value1, String value2) {
            addCriterion("XJBH between", value1, value2, "xjbh");
            return (Criteria) this;
        }

        public Criteria andXjbhNotBetween(String value1, String value2) {
            addCriterion("XJBH not between", value1, value2, "xjbh");
            return (Criteria) this;
        }

        public Criteria andRxnyIsNull() {
            addCriterion("RXNY is null");
            return (Criteria) this;
        }

        public Criteria andRxnyIsNotNull() {
            addCriterion("RXNY is not null");
            return (Criteria) this;
        }

        public Criteria andRxnyEqualTo(String value) {
            addCriterion("RXNY =", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotEqualTo(String value) {
            addCriterion("RXNY <>", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyGreaterThan(String value) {
            addCriterion("RXNY >", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyGreaterThanOrEqualTo(String value) {
            addCriterion("RXNY >=", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyLessThan(String value) {
            addCriterion("RXNY <", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyLessThanOrEqualTo(String value) {
            addCriterion("RXNY <=", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyLike(String value) {
            addCriterion("RXNY like", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotLike(String value) {
            addCriterion("RXNY not like", value, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyIn(List<String> values) {
            addCriterion("RXNY in", values, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotIn(List<String> values) {
            addCriterion("RXNY not in", values, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyBetween(String value1, String value2) {
            addCriterion("RXNY between", value1, value2, "rxny");
            return (Criteria) this;
        }

        public Criteria andRxnyNotBetween(String value1, String value2) {
            addCriterion("RXNY not between", value1, value2, "rxny");
            return (Criteria) this;
        }

        public Criteria andGjxslbmIsNull() {
            addCriterion("GJXSLBM is null");
            return (Criteria) this;
        }

        public Criteria andGjxslbmIsNotNull() {
            addCriterion("GJXSLBM is not null");
            return (Criteria) this;
        }

        public Criteria andGjxslbmEqualTo(String value) {
            addCriterion("GJXSLBM =", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmNotEqualTo(String value) {
            addCriterion("GJXSLBM <>", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmGreaterThan(String value) {
            addCriterion("GJXSLBM >", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmGreaterThanOrEqualTo(String value) {
            addCriterion("GJXSLBM >=", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmLessThan(String value) {
            addCriterion("GJXSLBM <", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmLessThanOrEqualTo(String value) {
            addCriterion("GJXSLBM <=", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmLike(String value) {
            addCriterion("GJXSLBM like", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmNotLike(String value) {
            addCriterion("GJXSLBM not like", value, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmIn(List<String> values) {
            addCriterion("GJXSLBM in", values, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmNotIn(List<String> values) {
            addCriterion("GJXSLBM not in", values, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmBetween(String value1, String value2) {
            addCriterion("GJXSLBM between", value1, value2, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andGjxslbmNotBetween(String value1, String value2) {
            addCriterion("GJXSLBM not between", value1, value2, "gjxslbm");
            return (Criteria) this;
        }

        public Criteria andCmuXslbIsNull() {
            addCriterion("CMU_XSLB is null");
            return (Criteria) this;
        }

        public Criteria andCmuXslbIsNotNull() {
            addCriterion("CMU_XSLB is not null");
            return (Criteria) this;
        }

        public Criteria andCmuXslbEqualTo(String value) {
            addCriterion("CMU_XSLB =", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbNotEqualTo(String value) {
            addCriterion("CMU_XSLB <>", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbGreaterThan(String value) {
            addCriterion("CMU_XSLB >", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbGreaterThanOrEqualTo(String value) {
            addCriterion("CMU_XSLB >=", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbLessThan(String value) {
            addCriterion("CMU_XSLB <", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbLessThanOrEqualTo(String value) {
            addCriterion("CMU_XSLB <=", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbLike(String value) {
            addCriterion("CMU_XSLB like", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbNotLike(String value) {
            addCriterion("CMU_XSLB not like", value, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbIn(List<String> values) {
            addCriterion("CMU_XSLB in", values, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbNotIn(List<String> values) {
            addCriterion("CMU_XSLB not in", values, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbBetween(String value1, String value2) {
            addCriterion("CMU_XSLB between", value1, value2, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andCmuXslbNotBetween(String value1, String value2) {
            addCriterion("CMU_XSLB not between", value1, value2, "cmuXslb");
            return (Criteria) this;
        }

        public Criteria andYjbynyrIsNull() {
            addCriterion("YJBYNYR is null");
            return (Criteria) this;
        }

        public Criteria andYjbynyrIsNotNull() {
            addCriterion("YJBYNYR is not null");
            return (Criteria) this;
        }

        public Criteria andYjbynyrEqualTo(Date value) {
            addCriterion("YJBYNYR =", value, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrNotEqualTo(Date value) {
            addCriterion("YJBYNYR <>", value, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrGreaterThan(Date value) {
            addCriterion("YJBYNYR >", value, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrGreaterThanOrEqualTo(Date value) {
            addCriterion("YJBYNYR >=", value, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrLessThan(Date value) {
            addCriterion("YJBYNYR <", value, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrLessThanOrEqualTo(Date value) {
            addCriterion("YJBYNYR <=", value, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrIn(List<Date> values) {
            addCriterion("YJBYNYR in", values, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrNotIn(List<Date> values) {
            addCriterion("YJBYNYR not in", values, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrBetween(Date value1, Date value2) {
            addCriterion("YJBYNYR between", value1, value2, "yjbynyr");
            return (Criteria) this;
        }

        public Criteria andYjbynyrNotBetween(Date value1, Date value2) {
            addCriterion("YJBYNYR not between", value1, value2, "yjbynyr");
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
    }

    /**
     * V_BKS_XJJBSJXX
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * V_BKS_XJJBSJXX 2018-10-14
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