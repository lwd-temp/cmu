package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HyShenbParams {
    /**
     * T_HY_SHENB
     */
    protected String orderByClause;

    /**
     * T_HY_SHENB
     */
    protected boolean distinct;

    /**
     * T_HY_SHENB
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-18
     */
    public HyShenbParams() {
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
     * T_HY_SHENB 2018-09-18
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

        public Criteria andJhidIsNull() {
            addCriterion("JHID is null");
            return (Criteria) this;
        }

        public Criteria andJhidIsNotNull() {
            addCriterion("JHID is not null");
            return (Criteria) this;
        }

        public Criteria andJhidEqualTo(String value) {
            addCriterion("JHID =", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidNotEqualTo(String value) {
            addCriterion("JHID <>", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidGreaterThan(String value) {
            addCriterion("JHID >", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidGreaterThanOrEqualTo(String value) {
            addCriterion("JHID >=", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidLessThan(String value) {
            addCriterion("JHID <", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidLessThanOrEqualTo(String value) {
            addCriterion("JHID <=", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidLike(String value) {
            addCriterion("JHID like", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidNotLike(String value) {
            addCriterion("JHID not like", value, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidIn(List<String> values) {
            addCriterion("JHID in", values, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidNotIn(List<String> values) {
            addCriterion("JHID not in", values, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidBetween(String value1, String value2) {
            addCriterion("JHID between", value1, value2, "jhid");
            return (Criteria) this;
        }

        public Criteria andJhidNotBetween(String value1, String value2) {
            addCriterion("JHID not between", value1, value2, "jhid");
            return (Criteria) this;
        }

        public Criteria andHylxIsNull() {
            addCriterion("HYLX is null");
            return (Criteria) this;
        }

        public Criteria andHylxIsNotNull() {
            addCriterion("HYLX is not null");
            return (Criteria) this;
        }

        public Criteria andHylxEqualTo(String value) {
            addCriterion("HYLX =", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxNotEqualTo(String value) {
            addCriterion("HYLX <>", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxGreaterThan(String value) {
            addCriterion("HYLX >", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxGreaterThanOrEqualTo(String value) {
            addCriterion("HYLX >=", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxLessThan(String value) {
            addCriterion("HYLX <", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxLessThanOrEqualTo(String value) {
            addCriterion("HYLX <=", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxLike(String value) {
            addCriterion("HYLX like", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxNotLike(String value) {
            addCriterion("HYLX not like", value, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxIn(List<String> values) {
            addCriterion("HYLX in", values, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxNotIn(List<String> values) {
            addCriterion("HYLX not in", values, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxBetween(String value1, String value2) {
            addCriterion("HYLX between", value1, value2, "hylx");
            return (Criteria) this;
        }

        public Criteria andHylxNotBetween(String value1, String value2) {
            addCriterion("HYLX not between", value1, value2, "hylx");
            return (Criteria) this;
        }

        public Criteria andHymcIsNull() {
            addCriterion("HYMC is null");
            return (Criteria) this;
        }

        public Criteria andHymcIsNotNull() {
            addCriterion("HYMC is not null");
            return (Criteria) this;
        }

        public Criteria andHymcEqualTo(String value) {
            addCriterion("HYMC =", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotEqualTo(String value) {
            addCriterion("HYMC <>", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcGreaterThan(String value) {
            addCriterion("HYMC >", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcGreaterThanOrEqualTo(String value) {
            addCriterion("HYMC >=", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLessThan(String value) {
            addCriterion("HYMC <", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLessThanOrEqualTo(String value) {
            addCriterion("HYMC <=", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLike(String value) {
            addCriterion("HYMC like", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotLike(String value) {
            addCriterion("HYMC not like", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcIn(List<String> values) {
            addCriterion("HYMC in", values, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotIn(List<String> values) {
            addCriterion("HYMC not in", values, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcBetween(String value1, String value2) {
            addCriterion("HYMC between", value1, value2, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotBetween(String value1, String value2) {
            addCriterion("HYMC not between", value1, value2, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcEnIsNull() {
            addCriterion("HYMC_EN is null");
            return (Criteria) this;
        }

        public Criteria andHymcEnIsNotNull() {
            addCriterion("HYMC_EN is not null");
            return (Criteria) this;
        }

        public Criteria andHymcEnEqualTo(String value) {
            addCriterion("HYMC_EN =", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnNotEqualTo(String value) {
            addCriterion("HYMC_EN <>", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnGreaterThan(String value) {
            addCriterion("HYMC_EN >", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnGreaterThanOrEqualTo(String value) {
            addCriterion("HYMC_EN >=", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnLessThan(String value) {
            addCriterion("HYMC_EN <", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnLessThanOrEqualTo(String value) {
            addCriterion("HYMC_EN <=", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnLike(String value) {
            addCriterion("HYMC_EN like", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnNotLike(String value) {
            addCriterion("HYMC_EN not like", value, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnIn(List<String> values) {
            addCriterion("HYMC_EN in", values, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnNotIn(List<String> values) {
            addCriterion("HYMC_EN not in", values, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnBetween(String value1, String value2) {
            addCriterion("HYMC_EN between", value1, value2, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andHymcEnNotBetween(String value1, String value2) {
            addCriterion("HYMC_EN not between", value1, value2, "hymcEn");
            return (Criteria) this;
        }

        public Criteria andJbrqIsNull() {
            addCriterion("JBRQ is null");
            return (Criteria) this;
        }

        public Criteria andJbrqIsNotNull() {
            addCriterion("JBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJbrqEqualTo(Date value) {
            addCriterion("JBRQ =", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqNotEqualTo(Date value) {
            addCriterion("JBRQ <>", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqGreaterThan(Date value) {
            addCriterion("JBRQ >", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("JBRQ >=", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqLessThan(Date value) {
            addCriterion("JBRQ <", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqLessThanOrEqualTo(Date value) {
            addCriterion("JBRQ <=", value, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqIn(List<Date> values) {
            addCriterion("JBRQ in", values, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqNotIn(List<Date> values) {
            addCriterion("JBRQ not in", values, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqBetween(Date value1, Date value2) {
            addCriterion("JBRQ between", value1, value2, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbrqNotBetween(Date value1, Date value2) {
            addCriterion("JBRQ not between", value1, value2, "jbrq");
            return (Criteria) this;
        }

        public Criteria andJbdwIsNull() {
            addCriterion("JBDW is null");
            return (Criteria) this;
        }

        public Criteria andJbdwIsNotNull() {
            addCriterion("JBDW is not null");
            return (Criteria) this;
        }

        public Criteria andJbdwEqualTo(String value) {
            addCriterion("JBDW =", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotEqualTo(String value) {
            addCriterion("JBDW <>", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwGreaterThan(String value) {
            addCriterion("JBDW >", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwGreaterThanOrEqualTo(String value) {
            addCriterion("JBDW >=", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwLessThan(String value) {
            addCriterion("JBDW <", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwLessThanOrEqualTo(String value) {
            addCriterion("JBDW <=", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwLike(String value) {
            addCriterion("JBDW like", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotLike(String value) {
            addCriterion("JBDW not like", value, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwIn(List<String> values) {
            addCriterion("JBDW in", values, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotIn(List<String> values) {
            addCriterion("JBDW not in", values, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwBetween(String value1, String value2) {
            addCriterion("JBDW between", value1, value2, "jbdw");
            return (Criteria) this;
        }

        public Criteria andJbdwNotBetween(String value1, String value2) {
            addCriterion("JBDW not between", value1, value2, "jbdw");
            return (Criteria) this;
        }

        public Criteria andHyddIsNull() {
            addCriterion("HYDD is null");
            return (Criteria) this;
        }

        public Criteria andHyddIsNotNull() {
            addCriterion("HYDD is not null");
            return (Criteria) this;
        }

        public Criteria andHyddEqualTo(String value) {
            addCriterion("HYDD =", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddNotEqualTo(String value) {
            addCriterion("HYDD <>", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddGreaterThan(String value) {
            addCriterion("HYDD >", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddGreaterThanOrEqualTo(String value) {
            addCriterion("HYDD >=", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddLessThan(String value) {
            addCriterion("HYDD <", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddLessThanOrEqualTo(String value) {
            addCriterion("HYDD <=", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddLike(String value) {
            addCriterion("HYDD like", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddNotLike(String value) {
            addCriterion("HYDD not like", value, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddIn(List<String> values) {
            addCriterion("HYDD in", values, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddNotIn(List<String> values) {
            addCriterion("HYDD not in", values, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddBetween(String value1, String value2) {
            addCriterion("HYDD between", value1, value2, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyddNotBetween(String value1, String value2) {
            addCriterion("HYDD not between", value1, value2, "hydd");
            return (Criteria) this;
        }

        public Criteria andHyjbxxIsNull() {
            addCriterion("HYJBXX is null");
            return (Criteria) this;
        }

        public Criteria andHyjbxxIsNotNull() {
            addCriterion("HYJBXX is not null");
            return (Criteria) this;
        }

        public Criteria andHyjbxxEqualTo(String value) {
            addCriterion("HYJBXX =", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxNotEqualTo(String value) {
            addCriterion("HYJBXX <>", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxGreaterThan(String value) {
            addCriterion("HYJBXX >", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxGreaterThanOrEqualTo(String value) {
            addCriterion("HYJBXX >=", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxLessThan(String value) {
            addCriterion("HYJBXX <", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxLessThanOrEqualTo(String value) {
            addCriterion("HYJBXX <=", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxLike(String value) {
            addCriterion("HYJBXX like", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxNotLike(String value) {
            addCriterion("HYJBXX not like", value, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxIn(List<String> values) {
            addCriterion("HYJBXX in", values, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxNotIn(List<String> values) {
            addCriterion("HYJBXX not in", values, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxBetween(String value1, String value2) {
            addCriterion("HYJBXX between", value1, value2, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHyjbxxNotBetween(String value1, String value2) {
            addCriterion("HYJBXX not between", value1, value2, "hyjbxx");
            return (Criteria) this;
        }

        public Criteria andHygmIsNull() {
            addCriterion("HYGM is null");
            return (Criteria) this;
        }

        public Criteria andHygmIsNotNull() {
            addCriterion("HYGM is not null");
            return (Criteria) this;
        }

        public Criteria andHygmEqualTo(String value) {
            addCriterion("HYGM =", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmNotEqualTo(String value) {
            addCriterion("HYGM <>", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmGreaterThan(String value) {
            addCriterion("HYGM >", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmGreaterThanOrEqualTo(String value) {
            addCriterion("HYGM >=", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmLessThan(String value) {
            addCriterion("HYGM <", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmLessThanOrEqualTo(String value) {
            addCriterion("HYGM <=", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmLike(String value) {
            addCriterion("HYGM like", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmNotLike(String value) {
            addCriterion("HYGM not like", value, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmIn(List<String> values) {
            addCriterion("HYGM in", values, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmNotIn(List<String> values) {
            addCriterion("HYGM not in", values, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmBetween(String value1, String value2) {
            addCriterion("HYGM between", value1, value2, "hygm");
            return (Criteria) this;
        }

        public Criteria andHygmNotBetween(String value1, String value2) {
            addCriterion("HYGM not between", value1, value2, "hygm");
            return (Criteria) this;
        }

        public Criteria andBjjbyxIsNull() {
            addCriterion("BJJBYX is null");
            return (Criteria) this;
        }

        public Criteria andBjjbyxIsNotNull() {
            addCriterion("BJJBYX is not null");
            return (Criteria) this;
        }

        public Criteria andBjjbyxEqualTo(String value) {
            addCriterion("BJJBYX =", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxNotEqualTo(String value) {
            addCriterion("BJJBYX <>", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxGreaterThan(String value) {
            addCriterion("BJJBYX >", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxGreaterThanOrEqualTo(String value) {
            addCriterion("BJJBYX >=", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxLessThan(String value) {
            addCriterion("BJJBYX <", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxLessThanOrEqualTo(String value) {
            addCriterion("BJJBYX <=", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxLike(String value) {
            addCriterion("BJJBYX like", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxNotLike(String value) {
            addCriterion("BJJBYX not like", value, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxIn(List<String> values) {
            addCriterion("BJJBYX in", values, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxNotIn(List<String> values) {
            addCriterion("BJJBYX not in", values, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxBetween(String value1, String value2) {
            addCriterion("BJJBYX between", value1, value2, "bjjbyx");
            return (Criteria) this;
        }

        public Criteria andBjjbyxNotBetween(String value1, String value2) {
            addCriterion("BJJBYX not between", value1, value2, "bjjbyx");
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

        public Criteria andZrrIsNull() {
            addCriterion("ZRR is null");
            return (Criteria) this;
        }

        public Criteria andZrrIsNotNull() {
            addCriterion("ZRR is not null");
            return (Criteria) this;
        }

        public Criteria andZrrEqualTo(String value) {
            addCriterion("ZRR =", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrNotEqualTo(String value) {
            addCriterion("ZRR <>", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrGreaterThan(String value) {
            addCriterion("ZRR >", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrGreaterThanOrEqualTo(String value) {
            addCriterion("ZRR >=", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrLessThan(String value) {
            addCriterion("ZRR <", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrLessThanOrEqualTo(String value) {
            addCriterion("ZRR <=", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrLike(String value) {
            addCriterion("ZRR like", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrNotLike(String value) {
            addCriterion("ZRR not like", value, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrIn(List<String> values) {
            addCriterion("ZRR in", values, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrNotIn(List<String> values) {
            addCriterion("ZRR not in", values, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrBetween(String value1, String value2) {
            addCriterion("ZRR between", value1, value2, "zrr");
            return (Criteria) this;
        }

        public Criteria andZrrNotBetween(String value1, String value2) {
            addCriterion("ZRR not between", value1, value2, "zrr");
            return (Criteria) this;
        }

        public Criteria andSfbbIsNull() {
            addCriterion("SFBB is null");
            return (Criteria) this;
        }

        public Criteria andSfbbIsNotNull() {
            addCriterion("SFBB is not null");
            return (Criteria) this;
        }

        public Criteria andSfbbEqualTo(String value) {
            addCriterion("SFBB =", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbNotEqualTo(String value) {
            addCriterion("SFBB <>", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbGreaterThan(String value) {
            addCriterion("SFBB >", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbGreaterThanOrEqualTo(String value) {
            addCriterion("SFBB >=", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbLessThan(String value) {
            addCriterion("SFBB <", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbLessThanOrEqualTo(String value) {
            addCriterion("SFBB <=", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbLike(String value) {
            addCriterion("SFBB like", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbNotLike(String value) {
            addCriterion("SFBB not like", value, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbIn(List<String> values) {
            addCriterion("SFBB in", values, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbNotIn(List<String> values) {
            addCriterion("SFBB not in", values, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbBetween(String value1, String value2) {
            addCriterion("SFBB between", value1, value2, "sfbb");
            return (Criteria) this;
        }

        public Criteria andSfbbNotBetween(String value1, String value2) {
            addCriterion("SFBB not between", value1, value2, "sfbb");
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
     * T_HY_SHENB
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HY_SHENB 2018-09-18
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