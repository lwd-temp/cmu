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
     * @mbggenerated 2018-09-22
     */
    public ForeignTeacherParams() {
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
     * T_FOREIGN_TEACHER 2018-09-22
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andLanguageIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("LANGUAGE <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("LANGUAGE like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("LANGUAGE not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNull() {
            addCriterion("GZDW is null");
            return (Criteria) this;
        }

        public Criteria andGzdwIsNotNull() {
            addCriterion("GZDW is not null");
            return (Criteria) this;
        }

        public Criteria andGzdwEqualTo(String value) {
            addCriterion("GZDW =", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotEqualTo(String value) {
            addCriterion("GZDW <>", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThan(String value) {
            addCriterion("GZDW >", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwGreaterThanOrEqualTo(String value) {
            addCriterion("GZDW >=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThan(String value) {
            addCriterion("GZDW <", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLessThanOrEqualTo(String value) {
            addCriterion("GZDW <=", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwLike(String value) {
            addCriterion("GZDW like", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotLike(String value) {
            addCriterion("GZDW not like", value, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwIn(List<String> values) {
            addCriterion("GZDW in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotIn(List<String> values) {
            addCriterion("GZDW not in", values, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwBetween(String value1, String value2) {
            addCriterion("GZDW between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andGzdwNotBetween(String value1, String value2) {
            addCriterion("GZDW not between", value1, value2, "gzdw");
            return (Criteria) this;
        }

        public Criteria andZylyIsNull() {
            addCriterion("ZYLY is null");
            return (Criteria) this;
        }

        public Criteria andZylyIsNotNull() {
            addCriterion("ZYLY is not null");
            return (Criteria) this;
        }

        public Criteria andZylyEqualTo(String value) {
            addCriterion("ZYLY =", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyNotEqualTo(String value) {
            addCriterion("ZYLY <>", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyGreaterThan(String value) {
            addCriterion("ZYLY >", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyGreaterThanOrEqualTo(String value) {
            addCriterion("ZYLY >=", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyLessThan(String value) {
            addCriterion("ZYLY <", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyLessThanOrEqualTo(String value) {
            addCriterion("ZYLY <=", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyLike(String value) {
            addCriterion("ZYLY like", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyNotLike(String value) {
            addCriterion("ZYLY not like", value, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyIn(List<String> values) {
            addCriterion("ZYLY in", values, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyNotIn(List<String> values) {
            addCriterion("ZYLY not in", values, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyBetween(String value1, String value2) {
            addCriterion("ZYLY between", value1, value2, "zyly");
            return (Criteria) this;
        }

        public Criteria andZylyNotBetween(String value1, String value2) {
            addCriterion("ZYLY not between", value1, value2, "zyly");
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

        public Criteria andZwzcIsNull() {
            addCriterion("ZWZC is null");
            return (Criteria) this;
        }

        public Criteria andZwzcIsNotNull() {
            addCriterion("ZWZC is not null");
            return (Criteria) this;
        }

        public Criteria andZwzcEqualTo(String value) {
            addCriterion("ZWZC =", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcNotEqualTo(String value) {
            addCriterion("ZWZC <>", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcGreaterThan(String value) {
            addCriterion("ZWZC >", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcGreaterThanOrEqualTo(String value) {
            addCriterion("ZWZC >=", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcLessThan(String value) {
            addCriterion("ZWZC <", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcLessThanOrEqualTo(String value) {
            addCriterion("ZWZC <=", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcLike(String value) {
            addCriterion("ZWZC like", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcNotLike(String value) {
            addCriterion("ZWZC not like", value, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcIn(List<String> values) {
            addCriterion("ZWZC in", values, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcNotIn(List<String> values) {
            addCriterion("ZWZC not in", values, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcBetween(String value1, String value2) {
            addCriterion("ZWZC between", value1, value2, "zwzc");
            return (Criteria) this;
        }

        public Criteria andZwzcNotBetween(String value1, String value2) {
            addCriterion("ZWZC not between", value1, value2, "zwzc");
            return (Criteria) this;
        }

        public Criteria andGlxmIsNull() {
            addCriterion("GLXM is null");
            return (Criteria) this;
        }

        public Criteria andGlxmIsNotNull() {
            addCriterion("GLXM is not null");
            return (Criteria) this;
        }

        public Criteria andGlxmEqualTo(String value) {
            addCriterion("GLXM =", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmNotEqualTo(String value) {
            addCriterion("GLXM <>", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmGreaterThan(String value) {
            addCriterion("GLXM >", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmGreaterThanOrEqualTo(String value) {
            addCriterion("GLXM >=", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmLessThan(String value) {
            addCriterion("GLXM <", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmLessThanOrEqualTo(String value) {
            addCriterion("GLXM <=", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmLike(String value) {
            addCriterion("GLXM like", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmNotLike(String value) {
            addCriterion("GLXM not like", value, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmIn(List<String> values) {
            addCriterion("GLXM in", values, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmNotIn(List<String> values) {
            addCriterion("GLXM not in", values, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmBetween(String value1, String value2) {
            addCriterion("GLXM between", value1, value2, "glxm");
            return (Criteria) this;
        }

        public Criteria andGlxmNotBetween(String value1, String value2) {
            addCriterion("GLXM not between", value1, value2, "glxm");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("CZ is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("CZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(String value) {
            addCriterion("CZ =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(String value) {
            addCriterion("CZ <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(String value) {
            addCriterion("CZ >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(String value) {
            addCriterion("CZ >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(String value) {
            addCriterion("CZ <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(String value) {
            addCriterion("CZ <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLike(String value) {
            addCriterion("CZ like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotLike(String value) {
            addCriterion("CZ not like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<String> values) {
            addCriterion("CZ in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<String> values) {
            addCriterion("CZ not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(String value1, String value2) {
            addCriterion("CZ between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(String value1, String value2) {
            addCriterion("CZ not between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNull() {
            addCriterion("TXDZ is null");
            return (Criteria) this;
        }

        public Criteria andTxdzIsNotNull() {
            addCriterion("TXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andTxdzEqualTo(String value) {
            addCriterion("TXDZ =", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotEqualTo(String value) {
            addCriterion("TXDZ <>", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThan(String value) {
            addCriterion("TXDZ >", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzGreaterThanOrEqualTo(String value) {
            addCriterion("TXDZ >=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThan(String value) {
            addCriterion("TXDZ <", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLessThanOrEqualTo(String value) {
            addCriterion("TXDZ <=", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzLike(String value) {
            addCriterion("TXDZ like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotLike(String value) {
            addCriterion("TXDZ not like", value, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzIn(List<String> values) {
            addCriterion("TXDZ in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotIn(List<String> values) {
            addCriterion("TXDZ not in", values, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzBetween(String value1, String value2) {
            addCriterion("TXDZ between", value1, value2, "txdz");
            return (Criteria) this;
        }

        public Criteria andTxdzNotBetween(String value1, String value2) {
            addCriterion("TXDZ not between", value1, value2, "txdz");
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

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
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
     * T_FOREIGN_TEACHER 2018-09-22
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