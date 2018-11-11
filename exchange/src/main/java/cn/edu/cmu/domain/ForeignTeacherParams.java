package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForeignTeacherParams {
    /**
     * T_FOREIGN_TEACHER
     */
    protected String orderByClause;

    /**
     * T_FOREIGN_TEACHER
     */
    protected boolean distinct;

    /**
     * T_FOREIGN_TEACHER
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public ForeignTeacherParams() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-12
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
     * @mbggenerated 2018-11-12
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-11-12
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_FOREIGN_TEACHER 2018-11-12
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

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("TID like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("TID not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
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

        public Criteria andJsxIsNull() {
            addCriterion("JSX is null");
            return (Criteria) this;
        }

        public Criteria andJsxIsNotNull() {
            addCriterion("JSX is not null");
            return (Criteria) this;
        }

        public Criteria andJsxEqualTo(String value) {
            addCriterion("JSX =", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxNotEqualTo(String value) {
            addCriterion("JSX <>", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxGreaterThan(String value) {
            addCriterion("JSX >", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxGreaterThanOrEqualTo(String value) {
            addCriterion("JSX >=", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxLessThan(String value) {
            addCriterion("JSX <", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxLessThanOrEqualTo(String value) {
            addCriterion("JSX <=", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxLike(String value) {
            addCriterion("JSX like", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxNotLike(String value) {
            addCriterion("JSX not like", value, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxIn(List<String> values) {
            addCriterion("JSX in", values, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxNotIn(List<String> values) {
            addCriterion("JSX not in", values, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxBetween(String value1, String value2) {
            addCriterion("JSX between", value1, value2, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsxNotBetween(String value1, String value2) {
            addCriterion("JSX not between", value1, value2, "jsx");
            return (Criteria) this;
        }

        public Criteria andJsmIsNull() {
            addCriterion("JSM is null");
            return (Criteria) this;
        }

        public Criteria andJsmIsNotNull() {
            addCriterion("JSM is not null");
            return (Criteria) this;
        }

        public Criteria andJsmEqualTo(String value) {
            addCriterion("JSM =", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotEqualTo(String value) {
            addCriterion("JSM <>", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmGreaterThan(String value) {
            addCriterion("JSM >", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmGreaterThanOrEqualTo(String value) {
            addCriterion("JSM >=", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmLessThan(String value) {
            addCriterion("JSM <", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmLessThanOrEqualTo(String value) {
            addCriterion("JSM <=", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmLike(String value) {
            addCriterion("JSM like", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotLike(String value) {
            addCriterion("JSM not like", value, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmIn(List<String> values) {
            addCriterion("JSM in", values, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotIn(List<String> values) {
            addCriterion("JSM not in", values, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmBetween(String value1, String value2) {
            addCriterion("JSM between", value1, value2, "jsm");
            return (Criteria) this;
        }

        public Criteria andJsmNotBetween(String value1, String value2) {
            addCriterion("JSM not between", value1, value2, "jsm");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNull() {
            addCriterion("CHINESE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNotNull() {
            addCriterion("CHINESE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChineseNameEqualTo(String value) {
            addCriterion("CHINESE_NAME =", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotEqualTo(String value) {
            addCriterion("CHINESE_NAME <>", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThan(String value) {
            addCriterion("CHINESE_NAME >", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHINESE_NAME >=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThan(String value) {
            addCriterion("CHINESE_NAME <", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThanOrEqualTo(String value) {
            addCriterion("CHINESE_NAME <=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLike(String value) {
            addCriterion("CHINESE_NAME like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLike(String value) {
            addCriterion("CHINESE_NAME not like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameIn(List<String> values) {
            addCriterion("CHINESE_NAME in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotIn(List<String> values) {
            addCriterion("CHINESE_NAME not in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameBetween(String value1, String value2) {
            addCriterion("CHINESE_NAME between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotBetween(String value1, String value2) {
            addCriterion("CHINESE_NAME not between", value1, value2, "chineseName");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNull() {
            addCriterion("HYZK is null");
            return (Criteria) this;
        }

        public Criteria andHyzkIsNotNull() {
            addCriterion("HYZK is not null");
            return (Criteria) this;
        }

        public Criteria andHyzkEqualTo(String value) {
            addCriterion("HYZK =", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotEqualTo(String value) {
            addCriterion("HYZK <>", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThan(String value) {
            addCriterion("HYZK >", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkGreaterThanOrEqualTo(String value) {
            addCriterion("HYZK >=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThan(String value) {
            addCriterion("HYZK <", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLessThanOrEqualTo(String value) {
            addCriterion("HYZK <=", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkLike(String value) {
            addCriterion("HYZK like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotLike(String value) {
            addCriterion("HYZK not like", value, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkIn(List<String> values) {
            addCriterion("HYZK in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotIn(List<String> values) {
            addCriterion("HYZK not in", values, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkBetween(String value1, String value2) {
            addCriterion("HYZK between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHyzkNotBetween(String value1, String value2) {
            addCriterion("HYZK not between", value1, value2, "hyzk");
            return (Criteria) this;
        }

        public Criteria andHzlxIsNull() {
            addCriterion("HZLX is null");
            return (Criteria) this;
        }

        public Criteria andHzlxIsNotNull() {
            addCriterion("HZLX is not null");
            return (Criteria) this;
        }

        public Criteria andHzlxEqualTo(String value) {
            addCriterion("HZLX =", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotEqualTo(String value) {
            addCriterion("HZLX <>", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxGreaterThan(String value) {
            addCriterion("HZLX >", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxGreaterThanOrEqualTo(String value) {
            addCriterion("HZLX >=", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxLessThan(String value) {
            addCriterion("HZLX <", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxLessThanOrEqualTo(String value) {
            addCriterion("HZLX <=", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxLike(String value) {
            addCriterion("HZLX like", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotLike(String value) {
            addCriterion("HZLX not like", value, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxIn(List<String> values) {
            addCriterion("HZLX in", values, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotIn(List<String> values) {
            addCriterion("HZLX not in", values, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxBetween(String value1, String value2) {
            addCriterion("HZLX between", value1, value2, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzlxNotBetween(String value1, String value2) {
            addCriterion("HZLX not between", value1, value2, "hzlx");
            return (Criteria) this;
        }

        public Criteria andHzhIsNull() {
            addCriterion("HZH is null");
            return (Criteria) this;
        }

        public Criteria andHzhIsNotNull() {
            addCriterion("HZH is not null");
            return (Criteria) this;
        }

        public Criteria andHzhEqualTo(String value) {
            addCriterion("HZH =", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhNotEqualTo(String value) {
            addCriterion("HZH <>", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhGreaterThan(String value) {
            addCriterion("HZH >", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhGreaterThanOrEqualTo(String value) {
            addCriterion("HZH >=", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhLessThan(String value) {
            addCriterion("HZH <", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhLessThanOrEqualTo(String value) {
            addCriterion("HZH <=", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhLike(String value) {
            addCriterion("HZH like", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhNotLike(String value) {
            addCriterion("HZH not like", value, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhIn(List<String> values) {
            addCriterion("HZH in", values, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhNotIn(List<String> values) {
            addCriterion("HZH not in", values, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhBetween(String value1, String value2) {
            addCriterion("HZH between", value1, value2, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzhNotBetween(String value1, String value2) {
            addCriterion("HZH not between", value1, value2, "hzh");
            return (Criteria) this;
        }

        public Criteria andHzqfrqIsNull() {
            addCriterion("HZQFRQ is null");
            return (Criteria) this;
        }

        public Criteria andHzqfrqIsNotNull() {
            addCriterion("HZQFRQ is not null");
            return (Criteria) this;
        }

        public Criteria andHzqfrqEqualTo(Date value) {
            addCriterion("HZQFRQ =", value, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqNotEqualTo(Date value) {
            addCriterion("HZQFRQ <>", value, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqGreaterThan(Date value) {
            addCriterion("HZQFRQ >", value, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqGreaterThanOrEqualTo(Date value) {
            addCriterion("HZQFRQ >=", value, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqLessThan(Date value) {
            addCriterion("HZQFRQ <", value, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqLessThanOrEqualTo(Date value) {
            addCriterion("HZQFRQ <=", value, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqIn(List<Date> values) {
            addCriterion("HZQFRQ in", values, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqNotIn(List<Date> values) {
            addCriterion("HZQFRQ not in", values, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqBetween(Date value1, Date value2) {
            addCriterion("HZQFRQ between", value1, value2, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzqfrqNotBetween(Date value1, Date value2) {
            addCriterion("HZQFRQ not between", value1, value2, "hzqfrq");
            return (Criteria) this;
        }

        public Criteria andHzyxqIsNull() {
            addCriterion("HZYXQ is null");
            return (Criteria) this;
        }

        public Criteria andHzyxqIsNotNull() {
            addCriterion("HZYXQ is not null");
            return (Criteria) this;
        }

        public Criteria andHzyxqEqualTo(Date value) {
            addCriterion("HZYXQ =", value, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqNotEqualTo(Date value) {
            addCriterion("HZYXQ <>", value, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqGreaterThan(Date value) {
            addCriterion("HZYXQ >", value, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqGreaterThanOrEqualTo(Date value) {
            addCriterion("HZYXQ >=", value, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqLessThan(Date value) {
            addCriterion("HZYXQ <", value, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqLessThanOrEqualTo(Date value) {
            addCriterion("HZYXQ <=", value, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqIn(List<Date> values) {
            addCriterion("HZYXQ in", values, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqNotIn(List<Date> values) {
            addCriterion("HZYXQ not in", values, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqBetween(Date value1, Date value2) {
            addCriterion("HZYXQ between", value1, value2, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andHzyxqNotBetween(Date value1, Date value2) {
            addCriterion("HZYXQ not between", value1, value2, "hzyxq");
            return (Criteria) this;
        }

        public Criteria andZgxwIsNull() {
            addCriterion("ZGXW is null");
            return (Criteria) this;
        }

        public Criteria andZgxwIsNotNull() {
            addCriterion("ZGXW is not null");
            return (Criteria) this;
        }

        public Criteria andZgxwEqualTo(String value) {
            addCriterion("ZGXW =", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwNotEqualTo(String value) {
            addCriterion("ZGXW <>", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwGreaterThan(String value) {
            addCriterion("ZGXW >", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwGreaterThanOrEqualTo(String value) {
            addCriterion("ZGXW >=", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwLessThan(String value) {
            addCriterion("ZGXW <", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwLessThanOrEqualTo(String value) {
            addCriterion("ZGXW <=", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwLike(String value) {
            addCriterion("ZGXW like", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwNotLike(String value) {
            addCriterion("ZGXW not like", value, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwIn(List<String> values) {
            addCriterion("ZGXW in", values, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwNotIn(List<String> values) {
            addCriterion("ZGXW not in", values, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwBetween(String value1, String value2) {
            addCriterion("ZGXW between", value1, value2, "zgxw");
            return (Criteria) this;
        }

        public Criteria andZgxwNotBetween(String value1, String value2) {
            addCriterion("ZGXW not between", value1, value2, "zgxw");
            return (Criteria) this;
        }

        public Criteria andHyspIsNull() {
            addCriterion("HYSP is null");
            return (Criteria) this;
        }

        public Criteria andHyspIsNotNull() {
            addCriterion("HYSP is not null");
            return (Criteria) this;
        }

        public Criteria andHyspEqualTo(String value) {
            addCriterion("HYSP =", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspNotEqualTo(String value) {
            addCriterion("HYSP <>", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspGreaterThan(String value) {
            addCriterion("HYSP >", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspGreaterThanOrEqualTo(String value) {
            addCriterion("HYSP >=", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspLessThan(String value) {
            addCriterion("HYSP <", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspLessThanOrEqualTo(String value) {
            addCriterion("HYSP <=", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspLike(String value) {
            addCriterion("HYSP like", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspNotLike(String value) {
            addCriterion("HYSP not like", value, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspIn(List<String> values) {
            addCriterion("HYSP in", values, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspNotIn(List<String> values) {
            addCriterion("HYSP not in", values, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspBetween(String value1, String value2) {
            addCriterion("HYSP between", value1, value2, "hysp");
            return (Criteria) this;
        }

        public Criteria andHyspNotBetween(String value1, String value2) {
            addCriterion("HYSP not between", value1, value2, "hysp");
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

        public Criteria andSyccsyhzgjIsNull() {
            addCriterion("SYCCSYHZGJ is null");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjIsNotNull() {
            addCriterion("SYCCSYHZGJ is not null");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjEqualTo(String value) {
            addCriterion("SYCCSYHZGJ =", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjNotEqualTo(String value) {
            addCriterion("SYCCSYHZGJ <>", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjGreaterThan(String value) {
            addCriterion("SYCCSYHZGJ >", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjGreaterThanOrEqualTo(String value) {
            addCriterion("SYCCSYHZGJ >=", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjLessThan(String value) {
            addCriterion("SYCCSYHZGJ <", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjLessThanOrEqualTo(String value) {
            addCriterion("SYCCSYHZGJ <=", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjLike(String value) {
            addCriterion("SYCCSYHZGJ like", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjNotLike(String value) {
            addCriterion("SYCCSYHZGJ not like", value, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjIn(List<String> values) {
            addCriterion("SYCCSYHZGJ in", values, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjNotIn(List<String> values) {
            addCriterion("SYCCSYHZGJ not in", values, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjBetween(String value1, String value2) {
            addCriterion("SYCCSYHZGJ between", value1, value2, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andSyccsyhzgjNotBetween(String value1, String value2) {
            addCriterion("SYCCSYHZGJ not between", value1, value2, "syccsyhzgj");
            return (Criteria) this;
        }

        public Criteria andGzgwIsNull() {
            addCriterion("GZGW is null");
            return (Criteria) this;
        }

        public Criteria andGzgwIsNotNull() {
            addCriterion("GZGW is not null");
            return (Criteria) this;
        }

        public Criteria andGzgwEqualTo(String value) {
            addCriterion("GZGW =", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwNotEqualTo(String value) {
            addCriterion("GZGW <>", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwGreaterThan(String value) {
            addCriterion("GZGW >", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwGreaterThanOrEqualTo(String value) {
            addCriterion("GZGW >=", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwLessThan(String value) {
            addCriterion("GZGW <", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwLessThanOrEqualTo(String value) {
            addCriterion("GZGW <=", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwLike(String value) {
            addCriterion("GZGW like", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwNotLike(String value) {
            addCriterion("GZGW not like", value, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwIn(List<String> values) {
            addCriterion("GZGW in", values, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwNotIn(List<String> values) {
            addCriterion("GZGW not in", values, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwBetween(String value1, String value2) {
            addCriterion("GZGW between", value1, value2, "gzgw");
            return (Criteria) this;
        }

        public Criteria andGzgwNotBetween(String value1, String value2) {
            addCriterion("GZGW not between", value1, value2, "gzgw");
            return (Criteria) this;
        }

        public Criteria andRzzmsjIsNull() {
            addCriterion("RZZMSJ is null");
            return (Criteria) this;
        }

        public Criteria andRzzmsjIsNotNull() {
            addCriterion("RZZMSJ is not null");
            return (Criteria) this;
        }

        public Criteria andRzzmsjEqualTo(Date value) {
            addCriterion("RZZMSJ =", value, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjNotEqualTo(Date value) {
            addCriterion("RZZMSJ <>", value, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjGreaterThan(Date value) {
            addCriterion("RZZMSJ >", value, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjGreaterThanOrEqualTo(Date value) {
            addCriterion("RZZMSJ >=", value, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjLessThan(Date value) {
            addCriterion("RZZMSJ <", value, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjLessThanOrEqualTo(Date value) {
            addCriterion("RZZMSJ <=", value, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjIn(List<Date> values) {
            addCriterion("RZZMSJ in", values, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjNotIn(List<Date> values) {
            addCriterion("RZZMSJ not in", values, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjBetween(Date value1, Date value2) {
            addCriterion("RZZMSJ between", value1, value2, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andRzzmsjNotBetween(Date value1, Date value2) {
            addCriterion("RZZMSJ not between", value1, value2, "rzzmsj");
            return (Criteria) this;
        }

        public Criteria andGzzwIsNull() {
            addCriterion("GZZW is null");
            return (Criteria) this;
        }

        public Criteria andGzzwIsNotNull() {
            addCriterion("GZZW is not null");
            return (Criteria) this;
        }

        public Criteria andGzzwEqualTo(String value) {
            addCriterion("GZZW =", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwNotEqualTo(String value) {
            addCriterion("GZZW <>", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwGreaterThan(String value) {
            addCriterion("GZZW >", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwGreaterThanOrEqualTo(String value) {
            addCriterion("GZZW >=", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwLessThan(String value) {
            addCriterion("GZZW <", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwLessThanOrEqualTo(String value) {
            addCriterion("GZZW <=", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwLike(String value) {
            addCriterion("GZZW like", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwNotLike(String value) {
            addCriterion("GZZW not like", value, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwIn(List<String> values) {
            addCriterion("GZZW in", values, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwNotIn(List<String> values) {
            addCriterion("GZZW not in", values, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwBetween(String value1, String value2) {
            addCriterion("GZZW between", value1, value2, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzzwNotBetween(String value1, String value2) {
            addCriterion("GZZW not between", value1, value2, "gzzw");
            return (Criteria) this;
        }

        public Criteria andGzsjStartIsNull() {
            addCriterion("GZSJ_START is null");
            return (Criteria) this;
        }

        public Criteria andGzsjStartIsNotNull() {
            addCriterion("GZSJ_START is not null");
            return (Criteria) this;
        }

        public Criteria andGzsjStartEqualTo(Date value) {
            addCriterion("GZSJ_START =", value, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartNotEqualTo(Date value) {
            addCriterion("GZSJ_START <>", value, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartGreaterThan(Date value) {
            addCriterion("GZSJ_START >", value, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartGreaterThanOrEqualTo(Date value) {
            addCriterion("GZSJ_START >=", value, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartLessThan(Date value) {
            addCriterion("GZSJ_START <", value, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartLessThanOrEqualTo(Date value) {
            addCriterion("GZSJ_START <=", value, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartIn(List<Date> values) {
            addCriterion("GZSJ_START in", values, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartNotIn(List<Date> values) {
            addCriterion("GZSJ_START not in", values, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartBetween(Date value1, Date value2) {
            addCriterion("GZSJ_START between", value1, value2, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjStartNotBetween(Date value1, Date value2) {
            addCriterion("GZSJ_START not between", value1, value2, "gzsjStart");
            return (Criteria) this;
        }

        public Criteria andGzsjEndIsNull() {
            addCriterion("GZSJ_END is null");
            return (Criteria) this;
        }

        public Criteria andGzsjEndIsNotNull() {
            addCriterion("GZSJ_END is not null");
            return (Criteria) this;
        }

        public Criteria andGzsjEndEqualTo(Date value) {
            addCriterion("GZSJ_END =", value, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndNotEqualTo(Date value) {
            addCriterion("GZSJ_END <>", value, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndGreaterThan(Date value) {
            addCriterion("GZSJ_END >", value, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndGreaterThanOrEqualTo(Date value) {
            addCriterion("GZSJ_END >=", value, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndLessThan(Date value) {
            addCriterion("GZSJ_END <", value, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndLessThanOrEqualTo(Date value) {
            addCriterion("GZSJ_END <=", value, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndIn(List<Date> values) {
            addCriterion("GZSJ_END in", values, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndNotIn(List<Date> values) {
            addCriterion("GZSJ_END not in", values, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndBetween(Date value1, Date value2) {
            addCriterion("GZSJ_END between", value1, value2, "gzsjEnd");
            return (Criteria) this;
        }

        public Criteria andGzsjEndNotBetween(Date value1, Date value2) {
            addCriterion("GZSJ_END not between", value1, value2, "gzsjEnd");
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

        public Criteria andHrIsNull() {
            addCriterion("HR is null");
            return (Criteria) this;
        }

        public Criteria andHrIsNotNull() {
            addCriterion("HR is not null");
            return (Criteria) this;
        }

        public Criteria andHrEqualTo(String value) {
            addCriterion("HR =", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotEqualTo(String value) {
            addCriterion("HR <>", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrGreaterThan(String value) {
            addCriterion("HR >", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrGreaterThanOrEqualTo(String value) {
            addCriterion("HR >=", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLessThan(String value) {
            addCriterion("HR <", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLessThanOrEqualTo(String value) {
            addCriterion("HR <=", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrLike(String value) {
            addCriterion("HR like", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotLike(String value) {
            addCriterion("HR not like", value, "hr");
            return (Criteria) this;
        }

        public Criteria andHrIn(List<String> values) {
            addCriterion("HR in", values, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotIn(List<String> values) {
            addCriterion("HR not in", values, "hr");
            return (Criteria) this;
        }

        public Criteria andHrBetween(String value1, String value2) {
            addCriterion("HR between", value1, value2, "hr");
            return (Criteria) this;
        }

        public Criteria andHrNotBetween(String value1, String value2) {
            addCriterion("HR not between", value1, value2, "hr");
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
     * T_FOREIGN_TEACHER
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_FOREIGN_TEACHER 2018-11-12
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