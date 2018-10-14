package cn.edu.cmu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnicUnitParams {
    /**
     * V_UICM_UNIT
     */
    protected String orderByClause;

    /**
     * V_UICM_UNIT
     */
    protected boolean distinct;

    /**
     * V_UICM_UNIT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2018-10-14
     */
    public UnicUnitParams() {
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
     * V_UICM_UNIT 2018-10-14
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

        public Criteria andUnitIdIsNull() {
            addCriterion("UNIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("UNIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(String value) {
            addCriterion("UNIT_ID =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(String value) {
            addCriterion("UNIT_ID <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(String value) {
            addCriterion("UNIT_ID >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_ID >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(String value) {
            addCriterion("UNIT_ID <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(String value) {
            addCriterion("UNIT_ID <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLike(String value) {
            addCriterion("UNIT_ID like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotLike(String value) {
            addCriterion("UNIT_ID not like", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<String> values) {
            addCriterion("UNIT_ID in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<String> values) {
            addCriterion("UNIT_ID not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(String value1, String value2) {
            addCriterion("UNIT_ID between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(String value1, String value2) {
            addCriterion("UNIT_ID not between", value1, value2, "unitId");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("SORT like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("SORT not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIsNull() {
            addCriterion("BELONG_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIsNotNull() {
            addCriterion("BELONG_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBelongUnitEqualTo(String value) {
            addCriterion("BELONG_UNIT =", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotEqualTo(String value) {
            addCriterion("BELONG_UNIT <>", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitGreaterThan(String value) {
            addCriterion("BELONG_UNIT >", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_UNIT >=", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLessThan(String value) {
            addCriterion("BELONG_UNIT <", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLessThanOrEqualTo(String value) {
            addCriterion("BELONG_UNIT <=", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLike(String value) {
            addCriterion("BELONG_UNIT like", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotLike(String value) {
            addCriterion("BELONG_UNIT not like", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIn(List<String> values) {
            addCriterion("BELONG_UNIT in", values, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotIn(List<String> values) {
            addCriterion("BELONG_UNIT not in", values, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitBetween(String value1, String value2) {
            addCriterion("BELONG_UNIT between", value1, value2, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotBetween(String value1, String value2) {
            addCriterion("BELONG_UNIT not between", value1, value2, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andIsEntityIsNull() {
            addCriterion("IS_ENTITY is null");
            return (Criteria) this;
        }

        public Criteria andIsEntityIsNotNull() {
            addCriterion("IS_ENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEntityEqualTo(String value) {
            addCriterion("IS_ENTITY =", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityNotEqualTo(String value) {
            addCriterion("IS_ENTITY <>", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityGreaterThan(String value) {
            addCriterion("IS_ENTITY >", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ENTITY >=", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityLessThan(String value) {
            addCriterion("IS_ENTITY <", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityLessThanOrEqualTo(String value) {
            addCriterion("IS_ENTITY <=", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityLike(String value) {
            addCriterion("IS_ENTITY like", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityNotLike(String value) {
            addCriterion("IS_ENTITY not like", value, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityIn(List<String> values) {
            addCriterion("IS_ENTITY in", values, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityNotIn(List<String> values) {
            addCriterion("IS_ENTITY not in", values, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityBetween(String value1, String value2) {
            addCriterion("IS_ENTITY between", value1, value2, "isEntity");
            return (Criteria) this;
        }

        public Criteria andIsEntityNotBetween(String value1, String value2) {
            addCriterion("IS_ENTITY not between", value1, value2, "isEntity");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("NAME_EN =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("NAME_EN <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("NAME_EN >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("NAME_EN <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("NAME_EN like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("NAME_EN not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("NAME_EN in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("NAME_EN not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("NAME_EN between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("NAME_EN not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameAbbrIsNull() {
            addCriterion("NAME_ABBR is null");
            return (Criteria) this;
        }

        public Criteria andNameAbbrIsNotNull() {
            addCriterion("NAME_ABBR is not null");
            return (Criteria) this;
        }

        public Criteria andNameAbbrEqualTo(String value) {
            addCriterion("NAME_ABBR =", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrNotEqualTo(String value) {
            addCriterion("NAME_ABBR <>", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrGreaterThan(String value) {
            addCriterion("NAME_ABBR >", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_ABBR >=", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrLessThan(String value) {
            addCriterion("NAME_ABBR <", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrLessThanOrEqualTo(String value) {
            addCriterion("NAME_ABBR <=", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrLike(String value) {
            addCriterion("NAME_ABBR like", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrNotLike(String value) {
            addCriterion("NAME_ABBR not like", value, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrIn(List<String> values) {
            addCriterion("NAME_ABBR in", values, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrNotIn(List<String> values) {
            addCriterion("NAME_ABBR not in", values, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrBetween(String value1, String value2) {
            addCriterion("NAME_ABBR between", value1, value2, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andNameAbbrNotBetween(String value1, String value2) {
            addCriterion("NAME_ABBR not between", value1, value2, "nameAbbr");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNull() {
            addCriterion("VISIT_URL is null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIsNotNull() {
            addCriterion("VISIT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVisitUrlEqualTo(String value) {
            addCriterion("VISIT_URL =", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotEqualTo(String value) {
            addCriterion("VISIT_URL <>", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThan(String value) {
            addCriterion("VISIT_URL >", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_URL >=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThan(String value) {
            addCriterion("VISIT_URL <", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLessThanOrEqualTo(String value) {
            addCriterion("VISIT_URL <=", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlLike(String value) {
            addCriterion("VISIT_URL like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotLike(String value) {
            addCriterion("VISIT_URL not like", value, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlIn(List<String> values) {
            addCriterion("VISIT_URL in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotIn(List<String> values) {
            addCriterion("VISIT_URL not in", values, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlBetween(String value1, String value2) {
            addCriterion("VISIT_URL between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andVisitUrlNotBetween(String value1, String value2) {
            addCriterion("VISIT_URL not between", value1, value2, "visitUrl");
            return (Criteria) this;
        }

        public Criteria andDescpIsNull() {
            addCriterion("DESCP is null");
            return (Criteria) this;
        }

        public Criteria andDescpIsNotNull() {
            addCriterion("DESCP is not null");
            return (Criteria) this;
        }

        public Criteria andDescpEqualTo(String value) {
            addCriterion("DESCP =", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpNotEqualTo(String value) {
            addCriterion("DESCP <>", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpGreaterThan(String value) {
            addCriterion("DESCP >", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpGreaterThanOrEqualTo(String value) {
            addCriterion("DESCP >=", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpLessThan(String value) {
            addCriterion("DESCP <", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpLessThanOrEqualTo(String value) {
            addCriterion("DESCP <=", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpLike(String value) {
            addCriterion("DESCP like", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpNotLike(String value) {
            addCriterion("DESCP not like", value, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpIn(List<String> values) {
            addCriterion("DESCP in", values, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpNotIn(List<String> values) {
            addCriterion("DESCP not in", values, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpBetween(String value1, String value2) {
            addCriterion("DESCP between", value1, value2, "descp");
            return (Criteria) this;
        }

        public Criteria andDescpNotBetween(String value1, String value2) {
            addCriterion("DESCP not between", value1, value2, "descp");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("OFFICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("OFFICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("OFFICE_PHONE =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("OFFICE_PHONE <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("OFFICE_PHONE >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_PHONE >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("OFFICE_PHONE <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_PHONE <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("OFFICE_PHONE like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("OFFICE_PHONE not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("OFFICE_PHONE in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("OFFICE_PHONE not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("OFFICE_PHONE between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("OFFICE_PHONE not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("IS_VALID like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("IS_VALID not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andUnitLogoIsNull() {
            addCriterion("UNIT_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andUnitLogoIsNotNull() {
            addCriterion("UNIT_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andUnitLogoEqualTo(String value) {
            addCriterion("UNIT_LOGO =", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotEqualTo(String value) {
            addCriterion("UNIT_LOGO <>", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoGreaterThan(String value) {
            addCriterion("UNIT_LOGO >", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_LOGO >=", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoLessThan(String value) {
            addCriterion("UNIT_LOGO <", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoLessThanOrEqualTo(String value) {
            addCriterion("UNIT_LOGO <=", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoLike(String value) {
            addCriterion("UNIT_LOGO like", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotLike(String value) {
            addCriterion("UNIT_LOGO not like", value, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoIn(List<String> values) {
            addCriterion("UNIT_LOGO in", values, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotIn(List<String> values) {
            addCriterion("UNIT_LOGO not in", values, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoBetween(String value1, String value2) {
            addCriterion("UNIT_LOGO between", value1, value2, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andUnitLogoNotBetween(String value1, String value2) {
            addCriterion("UNIT_LOGO not between", value1, value2, "unitLogo");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberIsNull() {
            addCriterion("HEADUSER_ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberIsNotNull() {
            addCriterion("HEADUSER_ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberEqualTo(String value) {
            addCriterion("HEADUSER_ID_NUMBER =", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberNotEqualTo(String value) {
            addCriterion("HEADUSER_ID_NUMBER <>", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberGreaterThan(String value) {
            addCriterion("HEADUSER_ID_NUMBER >", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("HEADUSER_ID_NUMBER >=", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberLessThan(String value) {
            addCriterion("HEADUSER_ID_NUMBER <", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberLessThanOrEqualTo(String value) {
            addCriterion("HEADUSER_ID_NUMBER <=", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberLike(String value) {
            addCriterion("HEADUSER_ID_NUMBER like", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberNotLike(String value) {
            addCriterion("HEADUSER_ID_NUMBER not like", value, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberIn(List<String> values) {
            addCriterion("HEADUSER_ID_NUMBER in", values, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberNotIn(List<String> values) {
            addCriterion("HEADUSER_ID_NUMBER not in", values, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberBetween(String value1, String value2) {
            addCriterion("HEADUSER_ID_NUMBER between", value1, value2, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andHeaduserIdNumberNotBetween(String value1, String value2) {
            addCriterion("HEADUSER_ID_NUMBER not between", value1, value2, "headuserIdNumber");
            return (Criteria) this;
        }

        public Criteria andIsOfficeIsNull() {
            addCriterion("IS_OFFICE is null");
            return (Criteria) this;
        }

        public Criteria andIsOfficeIsNotNull() {
            addCriterion("IS_OFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOfficeEqualTo(String value) {
            addCriterion("IS_OFFICE =", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeNotEqualTo(String value) {
            addCriterion("IS_OFFICE <>", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeGreaterThan(String value) {
            addCriterion("IS_OFFICE >", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OFFICE >=", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeLessThan(String value) {
            addCriterion("IS_OFFICE <", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeLessThanOrEqualTo(String value) {
            addCriterion("IS_OFFICE <=", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeLike(String value) {
            addCriterion("IS_OFFICE like", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeNotLike(String value) {
            addCriterion("IS_OFFICE not like", value, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeIn(List<String> values) {
            addCriterion("IS_OFFICE in", values, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeNotIn(List<String> values) {
            addCriterion("IS_OFFICE not in", values, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeBetween(String value1, String value2) {
            addCriterion("IS_OFFICE between", value1, value2, "isOffice");
            return (Criteria) this;
        }

        public Criteria andIsOfficeNotBetween(String value1, String value2) {
            addCriterion("IS_OFFICE not between", value1, value2, "isOffice");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdIsNull() {
            addCriterion("OFFICE_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdIsNotNull() {
            addCriterion("OFFICE_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdEqualTo(String value) {
            addCriterion("OFFICE_ORDER_ID =", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdNotEqualTo(String value) {
            addCriterion("OFFICE_ORDER_ID <>", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdGreaterThan(String value) {
            addCriterion("OFFICE_ORDER_ID >", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_ORDER_ID >=", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdLessThan(String value) {
            addCriterion("OFFICE_ORDER_ID <", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_ORDER_ID <=", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdLike(String value) {
            addCriterion("OFFICE_ORDER_ID like", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdNotLike(String value) {
            addCriterion("OFFICE_ORDER_ID not like", value, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdIn(List<String> values) {
            addCriterion("OFFICE_ORDER_ID in", values, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdNotIn(List<String> values) {
            addCriterion("OFFICE_ORDER_ID not in", values, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdBetween(String value1, String value2) {
            addCriterion("OFFICE_ORDER_ID between", value1, value2, "officeOrderId");
            return (Criteria) this;
        }

        public Criteria andOfficeOrderIdNotBetween(String value1, String value2) {
            addCriterion("OFFICE_ORDER_ID not between", value1, value2, "officeOrderId");
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

        public Criteria andEditTimeIsNull() {
            addCriterion("EDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("EDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("EDIT_TIME =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("EDIT_TIME <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("EDIT_TIME >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EDIT_TIME >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("EDIT_TIME <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("EDIT_TIME <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("EDIT_TIME in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("EDIT_TIME not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("EDIT_TIME between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("EDIT_TIME not between", value1, value2, "editTime");
            return (Criteria) this;
        }
    }

    /**
     * V_UICM_UNIT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * V_UICM_UNIT 2018-10-14
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