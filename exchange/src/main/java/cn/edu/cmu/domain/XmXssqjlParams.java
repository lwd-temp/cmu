package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XmXssqjlParams {
    /**
     * T_XM_XSSQJL
     */
    protected String orderByClause;

    /**
     * T_XM_XSSQJL
     */
    protected boolean distinct;

    /**
     * T_XM_XSSQJL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-22
     */
    public XmXssqjlParams() {
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
     * T_XM_XSSQJL 2018-09-22
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

        public Criteria andSqjlIdIsNull() {
            addCriterion("SQJL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqjlIdIsNotNull() {
            addCriterion("SQJL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqjlIdEqualTo(String value) {
            addCriterion("SQJL_ID =", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotEqualTo(String value) {
            addCriterion("SQJL_ID <>", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdGreaterThan(String value) {
            addCriterion("SQJL_ID >", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdGreaterThanOrEqualTo(String value) {
            addCriterion("SQJL_ID >=", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdLessThan(String value) {
            addCriterion("SQJL_ID <", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdLessThanOrEqualTo(String value) {
            addCriterion("SQJL_ID <=", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdLike(String value) {
            addCriterion("SQJL_ID like", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotLike(String value) {
            addCriterion("SQJL_ID not like", value, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdIn(List<String> values) {
            addCriterion("SQJL_ID in", values, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotIn(List<String> values) {
            addCriterion("SQJL_ID not in", values, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdBetween(String value1, String value2) {
            addCriterion("SQJL_ID between", value1, value2, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andSqjlIdNotBetween(String value1, String value2) {
            addCriterion("SQJL_ID not between", value1, value2, "sqjlId");
            return (Criteria) this;
        }

        public Criteria andXmIdIsNull() {
            addCriterion("XM_ID is null");
            return (Criteria) this;
        }

        public Criteria andXmIdIsNotNull() {
            addCriterion("XM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andXmIdEqualTo(String value) {
            addCriterion("XM_ID =", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotEqualTo(String value) {
            addCriterion("XM_ID <>", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdGreaterThan(String value) {
            addCriterion("XM_ID >", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdGreaterThanOrEqualTo(String value) {
            addCriterion("XM_ID >=", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdLessThan(String value) {
            addCriterion("XM_ID <", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdLessThanOrEqualTo(String value) {
            addCriterion("XM_ID <=", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdLike(String value) {
            addCriterion("XM_ID like", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotLike(String value) {
            addCriterion("XM_ID not like", value, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdIn(List<String> values) {
            addCriterion("XM_ID in", values, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotIn(List<String> values) {
            addCriterion("XM_ID not in", values, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdBetween(String value1, String value2) {
            addCriterion("XM_ID between", value1, value2, "xmId");
            return (Criteria) this;
        }

        public Criteria andXmIdNotBetween(String value1, String value2) {
            addCriterion("XM_ID not between", value1, value2, "xmId");
            return (Criteria) this;
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

        public Criteria andYcdmIsNull() {
            addCriterion("YCDM is null");
            return (Criteria) this;
        }

        public Criteria andYcdmIsNotNull() {
            addCriterion("YCDM is not null");
            return (Criteria) this;
        }

        public Criteria andYcdmEqualTo(String value) {
            addCriterion("YCDM =", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmNotEqualTo(String value) {
            addCriterion("YCDM <>", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmGreaterThan(String value) {
            addCriterion("YCDM >", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmGreaterThanOrEqualTo(String value) {
            addCriterion("YCDM >=", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmLessThan(String value) {
            addCriterion("YCDM <", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmLessThanOrEqualTo(String value) {
            addCriterion("YCDM <=", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmLike(String value) {
            addCriterion("YCDM like", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmNotLike(String value) {
            addCriterion("YCDM not like", value, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmIn(List<String> values) {
            addCriterion("YCDM in", values, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmNotIn(List<String> values) {
            addCriterion("YCDM not in", values, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmBetween(String value1, String value2) {
            addCriterion("YCDM between", value1, value2, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYcdmNotBetween(String value1, String value2) {
            addCriterion("YCDM not between", value1, value2, "ycdm");
            return (Criteria) this;
        }

        public Criteria andYxmcIsNull() {
            addCriterion("YXMC is null");
            return (Criteria) this;
        }

        public Criteria andYxmcIsNotNull() {
            addCriterion("YXMC is not null");
            return (Criteria) this;
        }

        public Criteria andYxmcEqualTo(String value) {
            addCriterion("YXMC =", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcNotEqualTo(String value) {
            addCriterion("YXMC <>", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcGreaterThan(String value) {
            addCriterion("YXMC >", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcGreaterThanOrEqualTo(String value) {
            addCriterion("YXMC >=", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcLessThan(String value) {
            addCriterion("YXMC <", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcLessThanOrEqualTo(String value) {
            addCriterion("YXMC <=", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcLike(String value) {
            addCriterion("YXMC like", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcNotLike(String value) {
            addCriterion("YXMC not like", value, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcIn(List<String> values) {
            addCriterion("YXMC in", values, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcNotIn(List<String> values) {
            addCriterion("YXMC not in", values, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcBetween(String value1, String value2) {
            addCriterion("YXMC between", value1, value2, "yxmc");
            return (Criteria) this;
        }

        public Criteria andYxmcNotBetween(String value1, String value2) {
            addCriterion("YXMC not between", value1, value2, "yxmc");
            return (Criteria) this;
        }

        public Criteria andRxnIsNull() {
            addCriterion("RXN is null");
            return (Criteria) this;
        }

        public Criteria andRxnIsNotNull() {
            addCriterion("RXN is not null");
            return (Criteria) this;
        }

        public Criteria andRxnEqualTo(String value) {
            addCriterion("RXN =", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnNotEqualTo(String value) {
            addCriterion("RXN <>", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnGreaterThan(String value) {
            addCriterion("RXN >", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnGreaterThanOrEqualTo(String value) {
            addCriterion("RXN >=", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnLessThan(String value) {
            addCriterion("RXN <", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnLessThanOrEqualTo(String value) {
            addCriterion("RXN <=", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnLike(String value) {
            addCriterion("RXN like", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnNotLike(String value) {
            addCriterion("RXN not like", value, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnIn(List<String> values) {
            addCriterion("RXN in", values, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnNotIn(List<String> values) {
            addCriterion("RXN not in", values, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnBetween(String value1, String value2) {
            addCriterion("RXN between", value1, value2, "rxn");
            return (Criteria) this;
        }

        public Criteria andRxnNotBetween(String value1, String value2) {
            addCriterion("RXN not between", value1, value2, "rxn");
            return (Criteria) this;
        }

        public Criteria andNjIsNull() {
            addCriterion("NJ is null");
            return (Criteria) this;
        }

        public Criteria andNjIsNotNull() {
            addCriterion("NJ is not null");
            return (Criteria) this;
        }

        public Criteria andNjEqualTo(String value) {
            addCriterion("NJ =", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotEqualTo(String value) {
            addCriterion("NJ <>", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThan(String value) {
            addCriterion("NJ >", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjGreaterThanOrEqualTo(String value) {
            addCriterion("NJ >=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThan(String value) {
            addCriterion("NJ <", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLessThanOrEqualTo(String value) {
            addCriterion("NJ <=", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjLike(String value) {
            addCriterion("NJ like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotLike(String value) {
            addCriterion("NJ not like", value, "nj");
            return (Criteria) this;
        }

        public Criteria andNjIn(List<String> values) {
            addCriterion("NJ in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotIn(List<String> values) {
            addCriterion("NJ not in", values, "nj");
            return (Criteria) this;
        }

        public Criteria andNjBetween(String value1, String value2) {
            addCriterion("NJ between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andNjNotBetween(String value1, String value2) {
            addCriterion("NJ not between", value1, value2, "nj");
            return (Criteria) this;
        }

        public Criteria andZyIsNull() {
            addCriterion("ZY is null");
            return (Criteria) this;
        }

        public Criteria andZyIsNotNull() {
            addCriterion("ZY is not null");
            return (Criteria) this;
        }

        public Criteria andZyEqualTo(String value) {
            addCriterion("ZY =", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotEqualTo(String value) {
            addCriterion("ZY <>", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThan(String value) {
            addCriterion("ZY >", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyGreaterThanOrEqualTo(String value) {
            addCriterion("ZY >=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThan(String value) {
            addCriterion("ZY <", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLessThanOrEqualTo(String value) {
            addCriterion("ZY <=", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyLike(String value) {
            addCriterion("ZY like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotLike(String value) {
            addCriterion("ZY not like", value, "zy");
            return (Criteria) this;
        }

        public Criteria andZyIn(List<String> values) {
            addCriterion("ZY in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotIn(List<String> values) {
            addCriterion("ZY not in", values, "zy");
            return (Criteria) this;
        }

        public Criteria andZyBetween(String value1, String value2) {
            addCriterion("ZY between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andZyNotBetween(String value1, String value2) {
            addCriterion("ZY not between", value1, value2, "zy");
            return (Criteria) this;
        }

        public Criteria andBjIsNull() {
            addCriterion("BJ is null");
            return (Criteria) this;
        }

        public Criteria andBjIsNotNull() {
            addCriterion("BJ is not null");
            return (Criteria) this;
        }

        public Criteria andBjEqualTo(String value) {
            addCriterion("BJ =", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotEqualTo(String value) {
            addCriterion("BJ <>", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThan(String value) {
            addCriterion("BJ >", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjGreaterThanOrEqualTo(String value) {
            addCriterion("BJ >=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThan(String value) {
            addCriterion("BJ <", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLessThanOrEqualTo(String value) {
            addCriterion("BJ <=", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjLike(String value) {
            addCriterion("BJ like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotLike(String value) {
            addCriterion("BJ not like", value, "bj");
            return (Criteria) this;
        }

        public Criteria andBjIn(List<String> values) {
            addCriterion("BJ in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotIn(List<String> values) {
            addCriterion("BJ not in", values, "bj");
            return (Criteria) this;
        }

        public Criteria andBjBetween(String value1, String value2) {
            addCriterion("BJ between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andBjNotBetween(String value1, String value2) {
            addCriterion("BJ not between", value1, value2, "bj");
            return (Criteria) this;
        }

        public Criteria andChpmIsNull() {
            addCriterion("CHPM is null");
            return (Criteria) this;
        }

        public Criteria andChpmIsNotNull() {
            addCriterion("CHPM is not null");
            return (Criteria) this;
        }

        public Criteria andChpmEqualTo(String value) {
            addCriterion("CHPM =", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmNotEqualTo(String value) {
            addCriterion("CHPM <>", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmGreaterThan(String value) {
            addCriterion("CHPM >", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmGreaterThanOrEqualTo(String value) {
            addCriterion("CHPM >=", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmLessThan(String value) {
            addCriterion("CHPM <", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmLessThanOrEqualTo(String value) {
            addCriterion("CHPM <=", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmLike(String value) {
            addCriterion("CHPM like", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmNotLike(String value) {
            addCriterion("CHPM not like", value, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmIn(List<String> values) {
            addCriterion("CHPM in", values, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmNotIn(List<String> values) {
            addCriterion("CHPM not in", values, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmBetween(String value1, String value2) {
            addCriterion("CHPM between", value1, value2, "chpm");
            return (Criteria) this;
        }

        public Criteria andChpmNotBetween(String value1, String value2) {
            addCriterion("CHPM not between", value1, value2, "chpm");
            return (Criteria) this;
        }

        public Criteria andZhpjIsNull() {
            addCriterion("ZHPJ is null");
            return (Criteria) this;
        }

        public Criteria andZhpjIsNotNull() {
            addCriterion("ZHPJ is not null");
            return (Criteria) this;
        }

        public Criteria andZhpjEqualTo(String value) {
            addCriterion("ZHPJ =", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjNotEqualTo(String value) {
            addCriterion("ZHPJ <>", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjGreaterThan(String value) {
            addCriterion("ZHPJ >", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjGreaterThanOrEqualTo(String value) {
            addCriterion("ZHPJ >=", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjLessThan(String value) {
            addCriterion("ZHPJ <", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjLessThanOrEqualTo(String value) {
            addCriterion("ZHPJ <=", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjLike(String value) {
            addCriterion("ZHPJ like", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjNotLike(String value) {
            addCriterion("ZHPJ not like", value, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjIn(List<String> values) {
            addCriterion("ZHPJ in", values, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjNotIn(List<String> values) {
            addCriterion("ZHPJ not in", values, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjBetween(String value1, String value2) {
            addCriterion("ZHPJ between", value1, value2, "zhpj");
            return (Criteria) this;
        }

        public Criteria andZhpjNotBetween(String value1, String value2) {
            addCriterion("ZHPJ not between", value1, value2, "zhpj");
            return (Criteria) this;
        }

        public Criteria andYyspIsNull() {
            addCriterion("YYSP is null");
            return (Criteria) this;
        }

        public Criteria andYyspIsNotNull() {
            addCriterion("YYSP is not null");
            return (Criteria) this;
        }

        public Criteria andYyspEqualTo(String value) {
            addCriterion("YYSP =", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotEqualTo(String value) {
            addCriterion("YYSP <>", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspGreaterThan(String value) {
            addCriterion("YYSP >", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspGreaterThanOrEqualTo(String value) {
            addCriterion("YYSP >=", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspLessThan(String value) {
            addCriterion("YYSP <", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspLessThanOrEqualTo(String value) {
            addCriterion("YYSP <=", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspLike(String value) {
            addCriterion("YYSP like", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotLike(String value) {
            addCriterion("YYSP not like", value, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspIn(List<String> values) {
            addCriterion("YYSP in", values, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotIn(List<String> values) {
            addCriterion("YYSP not in", values, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspBetween(String value1, String value2) {
            addCriterion("YYSP between", value1, value2, "yysp");
            return (Criteria) this;
        }

        public Criteria andYyspNotBetween(String value1, String value2) {
            addCriterion("YYSP not between", value1, value2, "yysp");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andZzjeIsNull() {
            addCriterion("ZZJE is null");
            return (Criteria) this;
        }

        public Criteria andZzjeIsNotNull() {
            addCriterion("ZZJE is not null");
            return (Criteria) this;
        }

        public Criteria andZzjeEqualTo(BigDecimal value) {
            addCriterion("ZZJE =", value, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeNotEqualTo(BigDecimal value) {
            addCriterion("ZZJE <>", value, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeGreaterThan(BigDecimal value) {
            addCriterion("ZZJE >", value, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZZJE >=", value, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeLessThan(BigDecimal value) {
            addCriterion("ZZJE <", value, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZZJE <=", value, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeIn(List<BigDecimal> values) {
            addCriterion("ZZJE in", values, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeNotIn(List<BigDecimal> values) {
            addCriterion("ZZJE not in", values, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZZJE between", value1, value2, "zzje");
            return (Criteria) this;
        }

        public Criteria andZzjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZZJE not between", value1, value2, "zzje");
            return (Criteria) this;
        }

        public Criteria andSelftPayIsNull() {
            addCriterion("SELFT_PAY is null");
            return (Criteria) this;
        }

        public Criteria andSelftPayIsNotNull() {
            addCriterion("SELFT_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andSelftPayEqualTo(String value) {
            addCriterion("SELFT_PAY =", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayNotEqualTo(String value) {
            addCriterion("SELFT_PAY <>", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayGreaterThan(String value) {
            addCriterion("SELFT_PAY >", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayGreaterThanOrEqualTo(String value) {
            addCriterion("SELFT_PAY >=", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayLessThan(String value) {
            addCriterion("SELFT_PAY <", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayLessThanOrEqualTo(String value) {
            addCriterion("SELFT_PAY <=", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayLike(String value) {
            addCriterion("SELFT_PAY like", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayNotLike(String value) {
            addCriterion("SELFT_PAY not like", value, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayIn(List<String> values) {
            addCriterion("SELFT_PAY in", values, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayNotIn(List<String> values) {
            addCriterion("SELFT_PAY not in", values, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayBetween(String value1, String value2) {
            addCriterion("SELFT_PAY between", value1, value2, "selftPay");
            return (Criteria) this;
        }

        public Criteria andSelftPayNotBetween(String value1, String value2) {
            addCriterion("SELFT_PAY not between", value1, value2, "selftPay");
            return (Criteria) this;
        }

        public Criteria andXlcpIsNull() {
            addCriterion("XLCP is null");
            return (Criteria) this;
        }

        public Criteria andXlcpIsNotNull() {
            addCriterion("XLCP is not null");
            return (Criteria) this;
        }

        public Criteria andXlcpEqualTo(String value) {
            addCriterion("XLCP =", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpNotEqualTo(String value) {
            addCriterion("XLCP <>", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpGreaterThan(String value) {
            addCriterion("XLCP >", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpGreaterThanOrEqualTo(String value) {
            addCriterion("XLCP >=", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpLessThan(String value) {
            addCriterion("XLCP <", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpLessThanOrEqualTo(String value) {
            addCriterion("XLCP <=", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpLike(String value) {
            addCriterion("XLCP like", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpNotLike(String value) {
            addCriterion("XLCP not like", value, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpIn(List<String> values) {
            addCriterion("XLCP in", values, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpNotIn(List<String> values) {
            addCriterion("XLCP not in", values, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpBetween(String value1, String value2) {
            addCriterion("XLCP between", value1, value2, "xlcp");
            return (Criteria) this;
        }

        public Criteria andXlcpNotBetween(String value1, String value2) {
            addCriterion("XLCP not between", value1, value2, "xlcp");
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

        public Criteria andConfirmStatusIsNull() {
            addCriterion("CONFIRM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNotNull() {
            addCriterion("CONFIRM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusEqualTo(String value) {
            addCriterion("CONFIRM_STATUS =", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotEqualTo(String value) {
            addCriterion("CONFIRM_STATUS <>", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThan(String value) {
            addCriterion("CONFIRM_STATUS >", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_STATUS >=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThan(String value) {
            addCriterion("CONFIRM_STATUS <", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_STATUS <=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLike(String value) {
            addCriterion("CONFIRM_STATUS like", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotLike(String value) {
            addCriterion("CONFIRM_STATUS not like", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIn(List<String> values) {
            addCriterion("CONFIRM_STATUS in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotIn(List<String> values) {
            addCriterion("CONFIRM_STATUS not in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusBetween(String value1, String value2) {
            addCriterion("CONFIRM_STATUS between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_STATUS not between", value1, value2, "confirmStatus");
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
     * T_XM_XSSQJL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_XM_XSSQJL 2018-09-22
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