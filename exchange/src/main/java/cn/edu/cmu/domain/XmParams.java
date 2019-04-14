package cn.edu.cmu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XmParams {
    /**
     * T_XM
     */
    protected String orderByClause;

    /**
     * T_XM
     */
    protected boolean distinct;

    /**
     * T_XM
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public XmParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-14
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
     * @mbggenerated 2019-04-14
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2019-04-14
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_XM 2019-04-14
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

        public Criteria andXmlxIsNull() {
            addCriterion("XMLX is null");
            return (Criteria) this;
        }

        public Criteria andXmlxIsNotNull() {
            addCriterion("XMLX is not null");
            return (Criteria) this;
        }

        public Criteria andXmlxEqualTo(String value) {
            addCriterion("XMLX =", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotEqualTo(String value) {
            addCriterion("XMLX <>", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxGreaterThan(String value) {
            addCriterion("XMLX >", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxGreaterThanOrEqualTo(String value) {
            addCriterion("XMLX >=", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxLessThan(String value) {
            addCriterion("XMLX <", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxLessThanOrEqualTo(String value) {
            addCriterion("XMLX <=", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxLike(String value) {
            addCriterion("XMLX like", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotLike(String value) {
            addCriterion("XMLX not like", value, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxIn(List<String> values) {
            addCriterion("XMLX in", values, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotIn(List<String> values) {
            addCriterion("XMLX not in", values, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxBetween(String value1, String value2) {
            addCriterion("XMLX between", value1, value2, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmlxNotBetween(String value1, String value2) {
            addCriterion("XMLX not between", value1, value2, "xmlx");
            return (Criteria) this;
        }

        public Criteria andXmzmIsNull() {
            addCriterion("XMZM is null");
            return (Criteria) this;
        }

        public Criteria andXmzmIsNotNull() {
            addCriterion("XMZM is not null");
            return (Criteria) this;
        }

        public Criteria andXmzmEqualTo(String value) {
            addCriterion("XMZM =", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmNotEqualTo(String value) {
            addCriterion("XMZM <>", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmGreaterThan(String value) {
            addCriterion("XMZM >", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmGreaterThanOrEqualTo(String value) {
            addCriterion("XMZM >=", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmLessThan(String value) {
            addCriterion("XMZM <", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmLessThanOrEqualTo(String value) {
            addCriterion("XMZM <=", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmLike(String value) {
            addCriterion("XMZM like", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmNotLike(String value) {
            addCriterion("XMZM not like", value, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmIn(List<String> values) {
            addCriterion("XMZM in", values, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmNotIn(List<String> values) {
            addCriterion("XMZM not in", values, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmBetween(String value1, String value2) {
            addCriterion("XMZM between", value1, value2, "xmzm");
            return (Criteria) this;
        }

        public Criteria andXmzmNotBetween(String value1, String value2) {
            addCriterion("XMZM not between", value1, value2, "xmzm");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidIsNull() {
            addCriterion("GLXMMCID is null");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidIsNotNull() {
            addCriterion("GLXMMCID is not null");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidEqualTo(String value) {
            addCriterion("GLXMMCID =", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidNotEqualTo(String value) {
            addCriterion("GLXMMCID <>", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidGreaterThan(String value) {
            addCriterion("GLXMMCID >", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidGreaterThanOrEqualTo(String value) {
            addCriterion("GLXMMCID >=", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidLessThan(String value) {
            addCriterion("GLXMMCID <", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidLessThanOrEqualTo(String value) {
            addCriterion("GLXMMCID <=", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidLike(String value) {
            addCriterion("GLXMMCID like", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidNotLike(String value) {
            addCriterion("GLXMMCID not like", value, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidIn(List<String> values) {
            addCriterion("GLXMMCID in", values, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidNotIn(List<String> values) {
            addCriterion("GLXMMCID not in", values, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidBetween(String value1, String value2) {
            addCriterion("GLXMMCID between", value1, value2, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andGlxmmcidNotBetween(String value1, String value2) {
            addCriterion("GLXMMCID not between", value1, value2, "glxmmcid");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNull() {
            addCriterion("XMMC is null");
            return (Criteria) this;
        }

        public Criteria andXmmcIsNotNull() {
            addCriterion("XMMC is not null");
            return (Criteria) this;
        }

        public Criteria andXmmcEqualTo(String value) {
            addCriterion("XMMC =", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotEqualTo(String value) {
            addCriterion("XMMC <>", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThan(String value) {
            addCriterion("XMMC >", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcGreaterThanOrEqualTo(String value) {
            addCriterion("XMMC >=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThan(String value) {
            addCriterion("XMMC <", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLessThanOrEqualTo(String value) {
            addCriterion("XMMC <=", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcLike(String value) {
            addCriterion("XMMC like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotLike(String value) {
            addCriterion("XMMC not like", value, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcIn(List<String> values) {
            addCriterion("XMMC in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotIn(List<String> values) {
            addCriterion("XMMC not in", values, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcBetween(String value1, String value2) {
            addCriterion("XMMC between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmmcNotBetween(String value1, String value2) {
            addCriterion("XMMC not between", value1, value2, "xmmc");
            return (Criteria) this;
        }

        public Criteria andXmbhIsNull() {
            addCriterion("XMBH is null");
            return (Criteria) this;
        }

        public Criteria andXmbhIsNotNull() {
            addCriterion("XMBH is not null");
            return (Criteria) this;
        }

        public Criteria andXmbhEqualTo(String value) {
            addCriterion("XMBH =", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotEqualTo(String value) {
            addCriterion("XMBH <>", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhGreaterThan(String value) {
            addCriterion("XMBH >", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhGreaterThanOrEqualTo(String value) {
            addCriterion("XMBH >=", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLessThan(String value) {
            addCriterion("XMBH <", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLessThanOrEqualTo(String value) {
            addCriterion("XMBH <=", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhLike(String value) {
            addCriterion("XMBH like", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotLike(String value) {
            addCriterion("XMBH not like", value, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhIn(List<String> values) {
            addCriterion("XMBH in", values, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotIn(List<String> values) {
            addCriterion("XMBH not in", values, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhBetween(String value1, String value2) {
            addCriterion("XMBH between", value1, value2, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmbhNotBetween(String value1, String value2) {
            addCriterion("XMBH not between", value1, value2, "xmbh");
            return (Criteria) this;
        }

        public Criteria andXmkssjIsNull() {
            addCriterion("XMKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andXmkssjIsNotNull() {
            addCriterion("XMKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXmkssjEqualTo(Date value) {
            addCriterion("XMKSSJ =", value, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjNotEqualTo(Date value) {
            addCriterion("XMKSSJ <>", value, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjGreaterThan(Date value) {
            addCriterion("XMKSSJ >", value, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjGreaterThanOrEqualTo(Date value) {
            addCriterion("XMKSSJ >=", value, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjLessThan(Date value) {
            addCriterion("XMKSSJ <", value, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjLessThanOrEqualTo(Date value) {
            addCriterion("XMKSSJ <=", value, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjIn(List<Date> values) {
            addCriterion("XMKSSJ in", values, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjNotIn(List<Date> values) {
            addCriterion("XMKSSJ not in", values, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjBetween(Date value1, Date value2) {
            addCriterion("XMKSSJ between", value1, value2, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andXmkssjNotBetween(Date value1, Date value2) {
            addCriterion("XMKSSJ not between", value1, value2, "xmkssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjIsNull() {
            addCriterion("SMJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andSmjssjIsNotNull() {
            addCriterion("SMJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andSmjssjEqualTo(Date value) {
            addCriterion("SMJSSJ =", value, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjNotEqualTo(Date value) {
            addCriterion("SMJSSJ <>", value, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjGreaterThan(Date value) {
            addCriterion("SMJSSJ >", value, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("SMJSSJ >=", value, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjLessThan(Date value) {
            addCriterion("SMJSSJ <", value, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjLessThanOrEqualTo(Date value) {
            addCriterion("SMJSSJ <=", value, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjIn(List<Date> values) {
            addCriterion("SMJSSJ in", values, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjNotIn(List<Date> values) {
            addCriterion("SMJSSJ not in", values, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjBetween(Date value1, Date value2) {
            addCriterion("SMJSSJ between", value1, value2, "smjssj");
            return (Criteria) this;
        }

        public Criteria andSmjssjNotBetween(Date value1, Date value2) {
            addCriterion("SMJSSJ not between", value1, value2, "smjssj");
            return (Criteria) this;
        }

        public Criteria andXmjltsIsNull() {
            addCriterion("XMJLTS is null");
            return (Criteria) this;
        }

        public Criteria andXmjltsIsNotNull() {
            addCriterion("XMJLTS is not null");
            return (Criteria) this;
        }

        public Criteria andXmjltsEqualTo(BigDecimal value) {
            addCriterion("XMJLTS =", value, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsNotEqualTo(BigDecimal value) {
            addCriterion("XMJLTS <>", value, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsGreaterThan(BigDecimal value) {
            addCriterion("XMJLTS >", value, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XMJLTS >=", value, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsLessThan(BigDecimal value) {
            addCriterion("XMJLTS <", value, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XMJLTS <=", value, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsIn(List<BigDecimal> values) {
            addCriterion("XMJLTS in", values, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsNotIn(List<BigDecimal> values) {
            addCriterion("XMJLTS not in", values, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMJLTS between", value1, value2, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmjltsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XMJLTS not between", value1, value2, "xmjlts");
            return (Criteria) this;
        }

        public Criteria andXmccIsNull() {
            addCriterion("XMCC is null");
            return (Criteria) this;
        }

        public Criteria andXmccIsNotNull() {
            addCriterion("XMCC is not null");
            return (Criteria) this;
        }

        public Criteria andXmccEqualTo(String value) {
            addCriterion("XMCC =", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccNotEqualTo(String value) {
            addCriterion("XMCC <>", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccGreaterThan(String value) {
            addCriterion("XMCC >", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccGreaterThanOrEqualTo(String value) {
            addCriterion("XMCC >=", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccLessThan(String value) {
            addCriterion("XMCC <", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccLessThanOrEqualTo(String value) {
            addCriterion("XMCC <=", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccLike(String value) {
            addCriterion("XMCC like", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccNotLike(String value) {
            addCriterion("XMCC not like", value, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccIn(List<String> values) {
            addCriterion("XMCC in", values, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccNotIn(List<String> values) {
            addCriterion("XMCC not in", values, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccBetween(String value1, String value2) {
            addCriterion("XMCC between", value1, value2, "xmcc");
            return (Criteria) this;
        }

        public Criteria andXmccNotBetween(String value1, String value2) {
            addCriterion("XMCC not between", value1, value2, "xmcc");
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

        public Criteria andZjjeIsNull() {
            addCriterion("ZJJE is null");
            return (Criteria) this;
        }

        public Criteria andZjjeIsNotNull() {
            addCriterion("ZJJE is not null");
            return (Criteria) this;
        }

        public Criteria andZjjeEqualTo(String value) {
            addCriterion("ZJJE =", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeNotEqualTo(String value) {
            addCriterion("ZJJE <>", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeGreaterThan(String value) {
            addCriterion("ZJJE >", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeGreaterThanOrEqualTo(String value) {
            addCriterion("ZJJE >=", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeLessThan(String value) {
            addCriterion("ZJJE <", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeLessThanOrEqualTo(String value) {
            addCriterion("ZJJE <=", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeLike(String value) {
            addCriterion("ZJJE like", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeNotLike(String value) {
            addCriterion("ZJJE not like", value, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeIn(List<String> values) {
            addCriterion("ZJJE in", values, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeNotIn(List<String> values) {
            addCriterion("ZJJE not in", values, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeBetween(String value1, String value2) {
            addCriterion("ZJJE between", value1, value2, "zjje");
            return (Criteria) this;
        }

        public Criteria andZjjeNotBetween(String value1, String value2) {
            addCriterion("ZJJE not between", value1, value2, "zjje");
            return (Criteria) this;
        }

        public Criteria andXmgkIsNull() {
            addCriterion("XMGK is null");
            return (Criteria) this;
        }

        public Criteria andXmgkIsNotNull() {
            addCriterion("XMGK is not null");
            return (Criteria) this;
        }

        public Criteria andXmgkEqualTo(String value) {
            addCriterion("XMGK =", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkNotEqualTo(String value) {
            addCriterion("XMGK <>", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkGreaterThan(String value) {
            addCriterion("XMGK >", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkGreaterThanOrEqualTo(String value) {
            addCriterion("XMGK >=", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkLessThan(String value) {
            addCriterion("XMGK <", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkLessThanOrEqualTo(String value) {
            addCriterion("XMGK <=", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkLike(String value) {
            addCriterion("XMGK like", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkNotLike(String value) {
            addCriterion("XMGK not like", value, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkIn(List<String> values) {
            addCriterion("XMGK in", values, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkNotIn(List<String> values) {
            addCriterion("XMGK not in", values, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkBetween(String value1, String value2) {
            addCriterion("XMGK between", value1, value2, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmgkNotBetween(String value1, String value2) {
            addCriterion("XMGK not between", value1, value2, "xmgk");
            return (Criteria) this;
        }

        public Criteria andXmzzjhIsNull() {
            addCriterion("XMZZJH is null");
            return (Criteria) this;
        }

        public Criteria andXmzzjhIsNotNull() {
            addCriterion("XMZZJH is not null");
            return (Criteria) this;
        }

        public Criteria andXmzzjhEqualTo(String value) {
            addCriterion("XMZZJH =", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhNotEqualTo(String value) {
            addCriterion("XMZZJH <>", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhGreaterThan(String value) {
            addCriterion("XMZZJH >", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhGreaterThanOrEqualTo(String value) {
            addCriterion("XMZZJH >=", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhLessThan(String value) {
            addCriterion("XMZZJH <", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhLessThanOrEqualTo(String value) {
            addCriterion("XMZZJH <=", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhLike(String value) {
            addCriterion("XMZZJH like", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhNotLike(String value) {
            addCriterion("XMZZJH not like", value, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhIn(List<String> values) {
            addCriterion("XMZZJH in", values, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhNotIn(List<String> values) {
            addCriterion("XMZZJH not in", values, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhBetween(String value1, String value2) {
            addCriterion("XMZZJH between", value1, value2, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andXmzzjhNotBetween(String value1, String value2) {
            addCriterion("XMZZJH not between", value1, value2, "xmzzjh");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcIsNull() {
            addCriterion("JLMBJGMC is null");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcIsNotNull() {
            addCriterion("JLMBJGMC is not null");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcEqualTo(String value) {
            addCriterion("JLMBJGMC =", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcNotEqualTo(String value) {
            addCriterion("JLMBJGMC <>", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcGreaterThan(String value) {
            addCriterion("JLMBJGMC >", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcGreaterThanOrEqualTo(String value) {
            addCriterion("JLMBJGMC >=", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcLessThan(String value) {
            addCriterion("JLMBJGMC <", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcLessThanOrEqualTo(String value) {
            addCriterion("JLMBJGMC <=", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcLike(String value) {
            addCriterion("JLMBJGMC like", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcNotLike(String value) {
            addCriterion("JLMBJGMC not like", value, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcIn(List<String> values) {
            addCriterion("JLMBJGMC in", values, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcNotIn(List<String> values) {
            addCriterion("JLMBJGMC not in", values, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcBetween(String value1, String value2) {
            addCriterion("JLMBJGMC between", value1, value2, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andJlmbjgmcNotBetween(String value1, String value2) {
            addCriterion("JLMBJGMC not between", value1, value2, "jlmbjgmc");
            return (Criteria) this;
        }

        public Criteria andFybzIsNull() {
            addCriterion("FYBZ is null");
            return (Criteria) this;
        }

        public Criteria andFybzIsNotNull() {
            addCriterion("FYBZ is not null");
            return (Criteria) this;
        }

        public Criteria andFybzEqualTo(BigDecimal value) {
            addCriterion("FYBZ =", value, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzNotEqualTo(BigDecimal value) {
            addCriterion("FYBZ <>", value, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzGreaterThan(BigDecimal value) {
            addCriterion("FYBZ >", value, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FYBZ >=", value, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzLessThan(BigDecimal value) {
            addCriterion("FYBZ <", value, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FYBZ <=", value, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzIn(List<BigDecimal> values) {
            addCriterion("FYBZ in", values, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzNotIn(List<BigDecimal> values) {
            addCriterion("FYBZ not in", values, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FYBZ between", value1, value2, "fybz");
            return (Criteria) this;
        }

        public Criteria andFybzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FYBZ not between", value1, value2, "fybz");
            return (Criteria) this;
        }

        public Criteria andZysmIsNull() {
            addCriterion("ZYSM is null");
            return (Criteria) this;
        }

        public Criteria andZysmIsNotNull() {
            addCriterion("ZYSM is not null");
            return (Criteria) this;
        }

        public Criteria andZysmEqualTo(String value) {
            addCriterion("ZYSM =", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmNotEqualTo(String value) {
            addCriterion("ZYSM <>", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmGreaterThan(String value) {
            addCriterion("ZYSM >", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmGreaterThanOrEqualTo(String value) {
            addCriterion("ZYSM >=", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmLessThan(String value) {
            addCriterion("ZYSM <", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmLessThanOrEqualTo(String value) {
            addCriterion("ZYSM <=", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmLike(String value) {
            addCriterion("ZYSM like", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmNotLike(String value) {
            addCriterion("ZYSM not like", value, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmIn(List<String> values) {
            addCriterion("ZYSM in", values, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmNotIn(List<String> values) {
            addCriterion("ZYSM not in", values, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmBetween(String value1, String value2) {
            addCriterion("ZYSM between", value1, value2, "zysm");
            return (Criteria) this;
        }

        public Criteria andZysmNotBetween(String value1, String value2) {
            addCriterion("ZYSM not between", value1, value2, "zysm");
            return (Criteria) this;
        }

        public Criteria andSfxzrsIsNull() {
            addCriterion("SFXZRS is null");
            return (Criteria) this;
        }

        public Criteria andSfxzrsIsNotNull() {
            addCriterion("SFXZRS is not null");
            return (Criteria) this;
        }

        public Criteria andSfxzrsEqualTo(String value) {
            addCriterion("SFXZRS =", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsNotEqualTo(String value) {
            addCriterion("SFXZRS <>", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsGreaterThan(String value) {
            addCriterion("SFXZRS >", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsGreaterThanOrEqualTo(String value) {
            addCriterion("SFXZRS >=", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsLessThan(String value) {
            addCriterion("SFXZRS <", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsLessThanOrEqualTo(String value) {
            addCriterion("SFXZRS <=", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsLike(String value) {
            addCriterion("SFXZRS like", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsNotLike(String value) {
            addCriterion("SFXZRS not like", value, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsIn(List<String> values) {
            addCriterion("SFXZRS in", values, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsNotIn(List<String> values) {
            addCriterion("SFXZRS not in", values, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsBetween(String value1, String value2) {
            addCriterion("SFXZRS between", value1, value2, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andSfxzrsNotBetween(String value1, String value2) {
            addCriterion("SFXZRS not between", value1, value2, "sfxzrs");
            return (Criteria) this;
        }

        public Criteria andJhrsIsNull() {
            addCriterion("JHRS is null");
            return (Criteria) this;
        }

        public Criteria andJhrsIsNotNull() {
            addCriterion("JHRS is not null");
            return (Criteria) this;
        }

        public Criteria andJhrsEqualTo(BigDecimal value) {
            addCriterion("JHRS =", value, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsNotEqualTo(BigDecimal value) {
            addCriterion("JHRS <>", value, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsGreaterThan(BigDecimal value) {
            addCriterion("JHRS >", value, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JHRS >=", value, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsLessThan(BigDecimal value) {
            addCriterion("JHRS <", value, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JHRS <=", value, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsIn(List<BigDecimal> values) {
            addCriterion("JHRS in", values, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsNotIn(List<BigDecimal> values) {
            addCriterion("JHRS not in", values, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JHRS between", value1, value2, "jhrs");
            return (Criteria) this;
        }

        public Criteria andJhrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JHRS not between", value1, value2, "jhrs");
            return (Criteria) this;
        }

        public Criteria andCcxzIsNull() {
            addCriterion("CCXZ is null");
            return (Criteria) this;
        }

        public Criteria andCcxzIsNotNull() {
            addCriterion("CCXZ is not null");
            return (Criteria) this;
        }

        public Criteria andCcxzEqualTo(String value) {
            addCriterion("CCXZ =", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzNotEqualTo(String value) {
            addCriterion("CCXZ <>", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzGreaterThan(String value) {
            addCriterion("CCXZ >", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzGreaterThanOrEqualTo(String value) {
            addCriterion("CCXZ >=", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzLessThan(String value) {
            addCriterion("CCXZ <", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzLessThanOrEqualTo(String value) {
            addCriterion("CCXZ <=", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzLike(String value) {
            addCriterion("CCXZ like", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzNotLike(String value) {
            addCriterion("CCXZ not like", value, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzIn(List<String> values) {
            addCriterion("CCXZ in", values, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzNotIn(List<String> values) {
            addCriterion("CCXZ not in", values, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzBetween(String value1, String value2) {
            addCriterion("CCXZ between", value1, value2, "ccxz");
            return (Criteria) this;
        }

        public Criteria andCcxzNotBetween(String value1, String value2) {
            addCriterion("CCXZ not between", value1, value2, "ccxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzIsNull() {
            addCriterion("XMNJXZ is null");
            return (Criteria) this;
        }

        public Criteria andXmnjxzIsNotNull() {
            addCriterion("XMNJXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXmnjxzEqualTo(String value) {
            addCriterion("XMNJXZ =", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzNotEqualTo(String value) {
            addCriterion("XMNJXZ <>", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzGreaterThan(String value) {
            addCriterion("XMNJXZ >", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzGreaterThanOrEqualTo(String value) {
            addCriterion("XMNJXZ >=", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzLessThan(String value) {
            addCriterion("XMNJXZ <", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzLessThanOrEqualTo(String value) {
            addCriterion("XMNJXZ <=", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzLike(String value) {
            addCriterion("XMNJXZ like", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzNotLike(String value) {
            addCriterion("XMNJXZ not like", value, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzIn(List<String> values) {
            addCriterion("XMNJXZ in", values, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzNotIn(List<String> values) {
            addCriterion("XMNJXZ not in", values, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzBetween(String value1, String value2) {
            addCriterion("XMNJXZ between", value1, value2, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andXmnjxzNotBetween(String value1, String value2) {
            addCriterion("XMNJXZ not between", value1, value2, "xmnjxz");
            return (Criteria) this;
        }

        public Criteria andYyyqIsNull() {
            addCriterion("YYYQ is null");
            return (Criteria) this;
        }

        public Criteria andYyyqIsNotNull() {
            addCriterion("YYYQ is not null");
            return (Criteria) this;
        }

        public Criteria andYyyqEqualTo(String value) {
            addCriterion("YYYQ =", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqNotEqualTo(String value) {
            addCriterion("YYYQ <>", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqGreaterThan(String value) {
            addCriterion("YYYQ >", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqGreaterThanOrEqualTo(String value) {
            addCriterion("YYYQ >=", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqLessThan(String value) {
            addCriterion("YYYQ <", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqLessThanOrEqualTo(String value) {
            addCriterion("YYYQ <=", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqLike(String value) {
            addCriterion("YYYQ like", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqNotLike(String value) {
            addCriterion("YYYQ not like", value, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqIn(List<String> values) {
            addCriterion("YYYQ in", values, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqNotIn(List<String> values) {
            addCriterion("YYYQ not in", values, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqBetween(String value1, String value2) {
            addCriterion("YYYQ between", value1, value2, "yyyq");
            return (Criteria) this;
        }

        public Criteria andYyyqNotBetween(String value1, String value2) {
            addCriterion("YYYQ not between", value1, value2, "yyyq");
            return (Criteria) this;
        }

        public Criteria andXmzyxzIsNull() {
            addCriterion("XMZYXZ is null");
            return (Criteria) this;
        }

        public Criteria andXmzyxzIsNotNull() {
            addCriterion("XMZYXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXmzyxzEqualTo(String value) {
            addCriterion("XMZYXZ =", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzNotEqualTo(String value) {
            addCriterion("XMZYXZ <>", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzGreaterThan(String value) {
            addCriterion("XMZYXZ >", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzGreaterThanOrEqualTo(String value) {
            addCriterion("XMZYXZ >=", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzLessThan(String value) {
            addCriterion("XMZYXZ <", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzLessThanOrEqualTo(String value) {
            addCriterion("XMZYXZ <=", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzLike(String value) {
            addCriterion("XMZYXZ like", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzNotLike(String value) {
            addCriterion("XMZYXZ not like", value, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzIn(List<String> values) {
            addCriterion("XMZYXZ in", values, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzNotIn(List<String> values) {
            addCriterion("XMZYXZ not in", values, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzBetween(String value1, String value2) {
            addCriterion("XMZYXZ between", value1, value2, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andXmzyxzNotBetween(String value1, String value2) {
            addCriterion("XMZYXZ not between", value1, value2, "xmzyxz");
            return (Criteria) this;
        }

        public Criteria andGsyxdmIsNull() {
            addCriterion("GSYXDM is null");
            return (Criteria) this;
        }

        public Criteria andGsyxdmIsNotNull() {
            addCriterion("GSYXDM is not null");
            return (Criteria) this;
        }

        public Criteria andGsyxdmEqualTo(String value) {
            addCriterion("GSYXDM =", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmNotEqualTo(String value) {
            addCriterion("GSYXDM <>", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmGreaterThan(String value) {
            addCriterion("GSYXDM >", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmGreaterThanOrEqualTo(String value) {
            addCriterion("GSYXDM >=", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmLessThan(String value) {
            addCriterion("GSYXDM <", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmLessThanOrEqualTo(String value) {
            addCriterion("GSYXDM <=", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmLike(String value) {
            addCriterion("GSYXDM like", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmNotLike(String value) {
            addCriterion("GSYXDM not like", value, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmIn(List<String> values) {
            addCriterion("GSYXDM in", values, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmNotIn(List<String> values) {
            addCriterion("GSYXDM not in", values, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmBetween(String value1, String value2) {
            addCriterion("GSYXDM between", value1, value2, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxdmNotBetween(String value1, String value2) {
            addCriterion("GSYXDM not between", value1, value2, "gsyxdm");
            return (Criteria) this;
        }

        public Criteria andGsyxmcIsNull() {
            addCriterion("GSYXMC is null");
            return (Criteria) this;
        }

        public Criteria andGsyxmcIsNotNull() {
            addCriterion("GSYXMC is not null");
            return (Criteria) this;
        }

        public Criteria andGsyxmcEqualTo(String value) {
            addCriterion("GSYXMC =", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcNotEqualTo(String value) {
            addCriterion("GSYXMC <>", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcGreaterThan(String value) {
            addCriterion("GSYXMC >", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcGreaterThanOrEqualTo(String value) {
            addCriterion("GSYXMC >=", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcLessThan(String value) {
            addCriterion("GSYXMC <", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcLessThanOrEqualTo(String value) {
            addCriterion("GSYXMC <=", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcLike(String value) {
            addCriterion("GSYXMC like", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcNotLike(String value) {
            addCriterion("GSYXMC not like", value, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcIn(List<String> values) {
            addCriterion("GSYXMC in", values, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcNotIn(List<String> values) {
            addCriterion("GSYXMC not in", values, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcBetween(String value1, String value2) {
            addCriterion("GSYXMC between", value1, value2, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsyxmcNotBetween(String value1, String value2) {
            addCriterion("GSYXMC not between", value1, value2, "gsyxmc");
            return (Criteria) this;
        }

        public Criteria andGsxsdmIsNull() {
            addCriterion("GSXSDM is null");
            return (Criteria) this;
        }

        public Criteria andGsxsdmIsNotNull() {
            addCriterion("GSXSDM is not null");
            return (Criteria) this;
        }

        public Criteria andGsxsdmEqualTo(String value) {
            addCriterion("GSXSDM =", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmNotEqualTo(String value) {
            addCriterion("GSXSDM <>", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmGreaterThan(String value) {
            addCriterion("GSXSDM >", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmGreaterThanOrEqualTo(String value) {
            addCriterion("GSXSDM >=", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmLessThan(String value) {
            addCriterion("GSXSDM <", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmLessThanOrEqualTo(String value) {
            addCriterion("GSXSDM <=", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmLike(String value) {
            addCriterion("GSXSDM like", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmNotLike(String value) {
            addCriterion("GSXSDM not like", value, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmIn(List<String> values) {
            addCriterion("GSXSDM in", values, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmNotIn(List<String> values) {
            addCriterion("GSXSDM not in", values, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmBetween(String value1, String value2) {
            addCriterion("GSXSDM between", value1, value2, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsdmNotBetween(String value1, String value2) {
            addCriterion("GSXSDM not between", value1, value2, "gsxsdm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmIsNull() {
            addCriterion("GSXSXM is null");
            return (Criteria) this;
        }

        public Criteria andGsxsxmIsNotNull() {
            addCriterion("GSXSXM is not null");
            return (Criteria) this;
        }

        public Criteria andGsxsxmEqualTo(String value) {
            addCriterion("GSXSXM =", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmNotEqualTo(String value) {
            addCriterion("GSXSXM <>", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmGreaterThan(String value) {
            addCriterion("GSXSXM >", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmGreaterThanOrEqualTo(String value) {
            addCriterion("GSXSXM >=", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmLessThan(String value) {
            addCriterion("GSXSXM <", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmLessThanOrEqualTo(String value) {
            addCriterion("GSXSXM <=", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmLike(String value) {
            addCriterion("GSXSXM like", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmNotLike(String value) {
            addCriterion("GSXSXM not like", value, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmIn(List<String> values) {
            addCriterion("GSXSXM in", values, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmNotIn(List<String> values) {
            addCriterion("GSXSXM not in", values, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmBetween(String value1, String value2) {
            addCriterion("GSXSXM between", value1, value2, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andGsxsxmNotBetween(String value1, String value2) {
            addCriterion("GSXSXM not between", value1, value2, "gsxsxm");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeIsNull() {
            addCriterion("OPERATOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeIsNotNull() {
            addCriterion("OPERATOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeEqualTo(String value) {
            addCriterion("OPERATOR_CODE =", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotEqualTo(String value) {
            addCriterion("OPERATOR_CODE <>", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeGreaterThan(String value) {
            addCriterion("OPERATOR_CODE >", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_CODE >=", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeLessThan(String value) {
            addCriterion("OPERATOR_CODE <", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_CODE <=", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeLike(String value) {
            addCriterion("OPERATOR_CODE like", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotLike(String value) {
            addCriterion("OPERATOR_CODE not like", value, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeIn(List<String> values) {
            addCriterion("OPERATOR_CODE in", values, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotIn(List<String> values) {
            addCriterion("OPERATOR_CODE not in", values, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeBetween(String value1, String value2) {
            addCriterion("OPERATOR_CODE between", value1, value2, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andOperatorCodeNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_CODE not between", value1, value2, "operatorCode");
            return (Criteria) this;
        }

        public Criteria andBmjzsjIsNull() {
            addCriterion("BMJZSJ is null");
            return (Criteria) this;
        }

        public Criteria andBmjzsjIsNotNull() {
            addCriterion("BMJZSJ is not null");
            return (Criteria) this;
        }

        public Criteria andBmjzsjEqualTo(Date value) {
            addCriterion("BMJZSJ =", value, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjNotEqualTo(Date value) {
            addCriterion("BMJZSJ <>", value, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjGreaterThan(Date value) {
            addCriterion("BMJZSJ >", value, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("BMJZSJ >=", value, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjLessThan(Date value) {
            addCriterion("BMJZSJ <", value, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjLessThanOrEqualTo(Date value) {
            addCriterion("BMJZSJ <=", value, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjIn(List<Date> values) {
            addCriterion("BMJZSJ in", values, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjNotIn(List<Date> values) {
            addCriterion("BMJZSJ not in", values, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjBetween(Date value1, Date value2) {
            addCriterion("BMJZSJ between", value1, value2, "bmjzsj");
            return (Criteria) this;
        }

        public Criteria andBmjzsjNotBetween(Date value1, Date value2) {
            addCriterion("BMJZSJ not between", value1, value2, "bmjzsj");
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
     * T_XM
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_XM 2019-04-14
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