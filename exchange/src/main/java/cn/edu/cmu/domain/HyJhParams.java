package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HyJhParams {
    /**
     * T_HY_JH
     */
    protected String orderByClause;

    /**
     * T_HY_JH
     */
    protected boolean distinct;

    /**
     * T_HY_JH
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public HyJhParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-20
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
     * @mbggenerated 2018-09-20
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-20
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_HY_JH 2018-09-20
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

        public Criteria andHybhIsNull() {
            addCriterion("HYBH is null");
            return (Criteria) this;
        }

        public Criteria andHybhIsNotNull() {
            addCriterion("HYBH is not null");
            return (Criteria) this;
        }

        public Criteria andHybhEqualTo(String value) {
            addCriterion("HYBH =", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhNotEqualTo(String value) {
            addCriterion("HYBH <>", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhGreaterThan(String value) {
            addCriterion("HYBH >", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhGreaterThanOrEqualTo(String value) {
            addCriterion("HYBH >=", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhLessThan(String value) {
            addCriterion("HYBH <", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhLessThanOrEqualTo(String value) {
            addCriterion("HYBH <=", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhLike(String value) {
            addCriterion("HYBH like", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhNotLike(String value) {
            addCriterion("HYBH not like", value, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhIn(List<String> values) {
            addCriterion("HYBH in", values, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhNotIn(List<String> values) {
            addCriterion("HYBH not in", values, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhBetween(String value1, String value2) {
            addCriterion("HYBH between", value1, value2, "hybh");
            return (Criteria) this;
        }

        public Criteria andHybhNotBetween(String value1, String value2) {
            addCriterion("HYBH not between", value1, value2, "hybh");
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

        public Criteria andZbdwIsNull() {
            addCriterion("ZBDW is null");
            return (Criteria) this;
        }

        public Criteria andZbdwIsNotNull() {
            addCriterion("ZBDW is not null");
            return (Criteria) this;
        }

        public Criteria andZbdwEqualTo(String value) {
            addCriterion("ZBDW =", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwNotEqualTo(String value) {
            addCriterion("ZBDW <>", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwGreaterThan(String value) {
            addCriterion("ZBDW >", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwGreaterThanOrEqualTo(String value) {
            addCriterion("ZBDW >=", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwLessThan(String value) {
            addCriterion("ZBDW <", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwLessThanOrEqualTo(String value) {
            addCriterion("ZBDW <=", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwLike(String value) {
            addCriterion("ZBDW like", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwNotLike(String value) {
            addCriterion("ZBDW not like", value, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwIn(List<String> values) {
            addCriterion("ZBDW in", values, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwNotIn(List<String> values) {
            addCriterion("ZBDW not in", values, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwBetween(String value1, String value2) {
            addCriterion("ZBDW between", value1, value2, "zbdw");
            return (Criteria) this;
        }

        public Criteria andZbdwNotBetween(String value1, String value2) {
            addCriterion("ZBDW not between", value1, value2, "zbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwIsNull() {
            addCriterion("CBDW is null");
            return (Criteria) this;
        }

        public Criteria andCbdwIsNotNull() {
            addCriterion("CBDW is not null");
            return (Criteria) this;
        }

        public Criteria andCbdwEqualTo(String value) {
            addCriterion("CBDW =", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwNotEqualTo(String value) {
            addCriterion("CBDW <>", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwGreaterThan(String value) {
            addCriterion("CBDW >", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwGreaterThanOrEqualTo(String value) {
            addCriterion("CBDW >=", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwLessThan(String value) {
            addCriterion("CBDW <", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwLessThanOrEqualTo(String value) {
            addCriterion("CBDW <=", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwLike(String value) {
            addCriterion("CBDW like", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwNotLike(String value) {
            addCriterion("CBDW not like", value, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwIn(List<String> values) {
            addCriterion("CBDW in", values, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwNotIn(List<String> values) {
            addCriterion("CBDW not in", values, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwBetween(String value1, String value2) {
            addCriterion("CBDW between", value1, value2, "cbdw");
            return (Criteria) this;
        }

        public Criteria andCbdwNotBetween(String value1, String value2) {
            addCriterion("CBDW not between", value1, value2, "cbdw");
            return (Criteria) this;
        }

        public Criteria andJxrqIsNull() {
            addCriterion("JXRQ is null");
            return (Criteria) this;
        }

        public Criteria andJxrqIsNotNull() {
            addCriterion("JXRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJxrqEqualTo(Date value) {
            addCriterion("JXRQ =", value, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqNotEqualTo(Date value) {
            addCriterion("JXRQ <>", value, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqGreaterThan(Date value) {
            addCriterion("JXRQ >", value, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqGreaterThanOrEqualTo(Date value) {
            addCriterion("JXRQ >=", value, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqLessThan(Date value) {
            addCriterion("JXRQ <", value, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqLessThanOrEqualTo(Date value) {
            addCriterion("JXRQ <=", value, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqIn(List<Date> values) {
            addCriterion("JXRQ in", values, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqNotIn(List<Date> values) {
            addCriterion("JXRQ not in", values, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqBetween(Date value1, Date value2) {
            addCriterion("JXRQ between", value1, value2, "jxrq");
            return (Criteria) this;
        }

        public Criteria andJxrqNotBetween(Date value1, Date value2) {
            addCriterion("JXRQ not between", value1, value2, "jxrq");
            return (Criteria) this;
        }

        public Criteria andDdIsNull() {
            addCriterion("DD is null");
            return (Criteria) this;
        }

        public Criteria andDdIsNotNull() {
            addCriterion("DD is not null");
            return (Criteria) this;
        }

        public Criteria andDdEqualTo(String value) {
            addCriterion("DD =", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotEqualTo(String value) {
            addCriterion("DD <>", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdGreaterThan(String value) {
            addCriterion("DD >", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdGreaterThanOrEqualTo(String value) {
            addCriterion("DD >=", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdLessThan(String value) {
            addCriterion("DD <", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdLessThanOrEqualTo(String value) {
            addCriterion("DD <=", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdLike(String value) {
            addCriterion("DD like", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotLike(String value) {
            addCriterion("DD not like", value, "dd");
            return (Criteria) this;
        }

        public Criteria andDdIn(List<String> values) {
            addCriterion("DD in", values, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotIn(List<String> values) {
            addCriterion("DD not in", values, "dd");
            return (Criteria) this;
        }

        public Criteria andDdBetween(String value1, String value2) {
            addCriterion("DD between", value1, value2, "dd");
            return (Criteria) this;
        }

        public Criteria andDdNotBetween(String value1, String value2) {
            addCriterion("DD not between", value1, value2, "dd");
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

        public Criteria andFzrIsNull() {
            addCriterion("FZR is null");
            return (Criteria) this;
        }

        public Criteria andFzrIsNotNull() {
            addCriterion("FZR is not null");
            return (Criteria) this;
        }

        public Criteria andFzrEqualTo(String value) {
            addCriterion("FZR =", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotEqualTo(String value) {
            addCriterion("FZR <>", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThan(String value) {
            addCriterion("FZR >", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThanOrEqualTo(String value) {
            addCriterion("FZR >=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThan(String value) {
            addCriterion("FZR <", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThanOrEqualTo(String value) {
            addCriterion("FZR <=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLike(String value) {
            addCriterion("FZR like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotLike(String value) {
            addCriterion("FZR not like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrIn(List<String> values) {
            addCriterion("FZR in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotIn(List<String> values) {
            addCriterion("FZR not in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrBetween(String value1, String value2) {
            addCriterion("FZR between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotBetween(String value1, String value2) {
            addCriterion("FZR not between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
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
     * T_HY_JH
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_HY_JH 2018-09-20
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