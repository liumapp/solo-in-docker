package com.liumapp.solo.transporter.domain;

import java.util.ArrayList;
import java.util.List;

public class B3SoloArchivedateArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B3SoloArchivedateArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOIdIsNull() {
            addCriterion("oId is null");
            return (Criteria) this;
        }

        public Criteria andOIdIsNotNull() {
            addCriterion("oId is not null");
            return (Criteria) this;
        }

        public Criteria andOIdEqualTo(String value) {
            addCriterion("oId =", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotEqualTo(String value) {
            addCriterion("oId <>", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThan(String value) {
            addCriterion("oId >", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdGreaterThanOrEqualTo(String value) {
            addCriterion("oId >=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThan(String value) {
            addCriterion("oId <", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLessThanOrEqualTo(String value) {
            addCriterion("oId <=", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdLike(String value) {
            addCriterion("oId like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotLike(String value) {
            addCriterion("oId not like", value, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdIn(List<String> values) {
            addCriterion("oId in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotIn(List<String> values) {
            addCriterion("oId not in", values, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdBetween(String value1, String value2) {
            addCriterion("oId between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andOIdNotBetween(String value1, String value2) {
            addCriterion("oId not between", value1, value2, "oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdIsNull() {
            addCriterion("archiveDate_oId is null");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdIsNotNull() {
            addCriterion("archiveDate_oId is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdEqualTo(String value) {
            addCriterion("archiveDate_oId =", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdNotEqualTo(String value) {
            addCriterion("archiveDate_oId <>", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdGreaterThan(String value) {
            addCriterion("archiveDate_oId >", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdGreaterThanOrEqualTo(String value) {
            addCriterion("archiveDate_oId >=", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdLessThan(String value) {
            addCriterion("archiveDate_oId <", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdLessThanOrEqualTo(String value) {
            addCriterion("archiveDate_oId <=", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdLike(String value) {
            addCriterion("archiveDate_oId like", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdNotLike(String value) {
            addCriterion("archiveDate_oId not like", value, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdIn(List<String> values) {
            addCriterion("archiveDate_oId in", values, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdNotIn(List<String> values) {
            addCriterion("archiveDate_oId not in", values, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdBetween(String value1, String value2) {
            addCriterion("archiveDate_oId between", value1, value2, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArchiveDate_oIdNotBetween(String value1, String value2) {
            addCriterion("archiveDate_oId not between", value1, value2, "archiveDate_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdIsNull() {
            addCriterion("article_oId is null");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdIsNotNull() {
            addCriterion("article_oId is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdEqualTo(String value) {
            addCriterion("article_oId =", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdNotEqualTo(String value) {
            addCriterion("article_oId <>", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdGreaterThan(String value) {
            addCriterion("article_oId >", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdGreaterThanOrEqualTo(String value) {
            addCriterion("article_oId >=", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdLessThan(String value) {
            addCriterion("article_oId <", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdLessThanOrEqualTo(String value) {
            addCriterion("article_oId <=", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdLike(String value) {
            addCriterion("article_oId like", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdNotLike(String value) {
            addCriterion("article_oId not like", value, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdIn(List<String> values) {
            addCriterion("article_oId in", values, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdNotIn(List<String> values) {
            addCriterion("article_oId not in", values, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdBetween(String value1, String value2) {
            addCriterion("article_oId between", value1, value2, "article_oId");
            return (Criteria) this;
        }

        public Criteria andArticle_oIdNotBetween(String value1, String value2) {
            addCriterion("article_oId not between", value1, value2, "article_oId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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