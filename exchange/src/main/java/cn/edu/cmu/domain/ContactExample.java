package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.List;

public class ContactExample {
    /**
     * T_CMU_CONTACT
     */
    protected String orderByClause;

    /**
     * T_CMU_CONTACT
     */
    protected boolean distinct;

    /**
     * T_CMU_CONTACT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public ContactExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-17
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
     * @mbggenerated 2018-09-17
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2018-09-17
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * T_CMU_CONTACT 2018-09-17
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

        public Criteria andLxrIdIsNull() {
            addCriterion("LXR_ID is null");
            return (Criteria) this;
        }

        public Criteria andLxrIdIsNotNull() {
            addCriterion("LXR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLxrIdEqualTo(String value) {
            addCriterion("LXR_ID =", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdNotEqualTo(String value) {
            addCriterion("LXR_ID <>", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdGreaterThan(String value) {
            addCriterion("LXR_ID >", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdGreaterThanOrEqualTo(String value) {
            addCriterion("LXR_ID >=", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdLessThan(String value) {
            addCriterion("LXR_ID <", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdLessThanOrEqualTo(String value) {
            addCriterion("LXR_ID <=", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdLike(String value) {
            addCriterion("LXR_ID like", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdNotLike(String value) {
            addCriterion("LXR_ID not like", value, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdIn(List<String> values) {
            addCriterion("LXR_ID in", values, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdNotIn(List<String> values) {
            addCriterion("LXR_ID not in", values, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdBetween(String value1, String value2) {
            addCriterion("LXR_ID between", value1, value2, "lxrId");
            return (Criteria) this;
        }

        public Criteria andLxrIdNotBetween(String value1, String value2) {
            addCriterion("LXR_ID not between", value1, value2, "lxrId");
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

        public Criteria andYzIsNull() {
            addCriterion("YZ is null");
            return (Criteria) this;
        }

        public Criteria andYzIsNotNull() {
            addCriterion("YZ is not null");
            return (Criteria) this;
        }

        public Criteria andYzEqualTo(String value) {
            addCriterion("YZ =", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzNotEqualTo(String value) {
            addCriterion("YZ <>", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzGreaterThan(String value) {
            addCriterion("YZ >", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzGreaterThanOrEqualTo(String value) {
            addCriterion("YZ >=", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzLessThan(String value) {
            addCriterion("YZ <", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzLessThanOrEqualTo(String value) {
            addCriterion("YZ <=", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzLike(String value) {
            addCriterion("YZ like", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzNotLike(String value) {
            addCriterion("YZ not like", value, "yz");
            return (Criteria) this;
        }

        public Criteria andYzIn(List<String> values) {
            addCriterion("YZ in", values, "yz");
            return (Criteria) this;
        }

        public Criteria andYzNotIn(List<String> values) {
            addCriterion("YZ not in", values, "yz");
            return (Criteria) this;
        }

        public Criteria andYzBetween(String value1, String value2) {
            addCriterion("YZ between", value1, value2, "yz");
            return (Criteria) this;
        }

        public Criteria andYzNotBetween(String value1, String value2) {
            addCriterion("YZ not between", value1, value2, "yz");
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

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("TELPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("TELPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("TELPHONE =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("TELPHONE <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("TELPHONE >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELPHONE >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("TELPHONE <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("TELPHONE <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("TELPHONE like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("TELPHONE not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("TELPHONE in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("TELPHONE not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("TELPHONE between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("TELPHONE not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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
     * T_CMU_CONTACT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * T_CMU_CONTACT 2018-09-17
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