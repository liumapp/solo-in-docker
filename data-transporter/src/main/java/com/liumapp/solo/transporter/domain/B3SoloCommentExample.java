package com.liumapp.solo.transporter.domain;

import java.util.ArrayList;
import java.util.List;

public class B3SoloCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B3SoloCommentExample() {
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

        public Criteria andCommentCreatedIsNull() {
            addCriterion("commentCreated is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedIsNotNull() {
            addCriterion("commentCreated is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedEqualTo(Long value) {
            addCriterion("commentCreated =", value, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedNotEqualTo(Long value) {
            addCriterion("commentCreated <>", value, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedGreaterThan(Long value) {
            addCriterion("commentCreated >", value, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedGreaterThanOrEqualTo(Long value) {
            addCriterion("commentCreated >=", value, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedLessThan(Long value) {
            addCriterion("commentCreated <", value, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedLessThanOrEqualTo(Long value) {
            addCriterion("commentCreated <=", value, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedIn(List<Long> values) {
            addCriterion("commentCreated in", values, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedNotIn(List<Long> values) {
            addCriterion("commentCreated not in", values, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedBetween(Long value1, Long value2) {
            addCriterion("commentCreated between", value1, value2, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentCreatedNotBetween(Long value1, Long value2) {
            addCriterion("commentCreated not between", value1, value2, "commentCreated");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNull() {
            addCriterion("commentName is null");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNotNull() {
            addCriterion("commentName is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNameEqualTo(String value) {
            addCriterion("commentName =", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotEqualTo(String value) {
            addCriterion("commentName <>", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThan(String value) {
            addCriterion("commentName >", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThanOrEqualTo(String value) {
            addCriterion("commentName >=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThan(String value) {
            addCriterion("commentName <", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThanOrEqualTo(String value) {
            addCriterion("commentName <=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLike(String value) {
            addCriterion("commentName like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotLike(String value) {
            addCriterion("commentName not like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameIn(List<String> values) {
            addCriterion("commentName in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotIn(List<String> values) {
            addCriterion("commentName not in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameBetween(String value1, String value2) {
            addCriterion("commentName between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotBetween(String value1, String value2) {
            addCriterion("commentName not between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdIsNull() {
            addCriterion("commentOnId is null");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdIsNotNull() {
            addCriterion("commentOnId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdEqualTo(String value) {
            addCriterion("commentOnId =", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdNotEqualTo(String value) {
            addCriterion("commentOnId <>", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdGreaterThan(String value) {
            addCriterion("commentOnId >", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdGreaterThanOrEqualTo(String value) {
            addCriterion("commentOnId >=", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdLessThan(String value) {
            addCriterion("commentOnId <", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdLessThanOrEqualTo(String value) {
            addCriterion("commentOnId <=", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdLike(String value) {
            addCriterion("commentOnId like", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdNotLike(String value) {
            addCriterion("commentOnId not like", value, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdIn(List<String> values) {
            addCriterion("commentOnId in", values, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdNotIn(List<String> values) {
            addCriterion("commentOnId not in", values, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdBetween(String value1, String value2) {
            addCriterion("commentOnId between", value1, value2, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnIdNotBetween(String value1, String value2) {
            addCriterion("commentOnId not between", value1, value2, "commentOnId");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeIsNull() {
            addCriterion("commentOnType is null");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeIsNotNull() {
            addCriterion("commentOnType is not null");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeEqualTo(String value) {
            addCriterion("commentOnType =", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeNotEqualTo(String value) {
            addCriterion("commentOnType <>", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeGreaterThan(String value) {
            addCriterion("commentOnType >", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("commentOnType >=", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeLessThan(String value) {
            addCriterion("commentOnType <", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeLessThanOrEqualTo(String value) {
            addCriterion("commentOnType <=", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeLike(String value) {
            addCriterion("commentOnType like", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeNotLike(String value) {
            addCriterion("commentOnType not like", value, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeIn(List<String> values) {
            addCriterion("commentOnType in", values, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeNotIn(List<String> values) {
            addCriterion("commentOnType not in", values, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeBetween(String value1, String value2) {
            addCriterion("commentOnType between", value1, value2, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentOnTypeNotBetween(String value1, String value2) {
            addCriterion("commentOnType not between", value1, value2, "commentOnType");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLIsNull() {
            addCriterion("commentSharpURL is null");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLIsNotNull() {
            addCriterion("commentSharpURL is not null");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLEqualTo(String value) {
            addCriterion("commentSharpURL =", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLNotEqualTo(String value) {
            addCriterion("commentSharpURL <>", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLGreaterThan(String value) {
            addCriterion("commentSharpURL >", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLGreaterThanOrEqualTo(String value) {
            addCriterion("commentSharpURL >=", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLLessThan(String value) {
            addCriterion("commentSharpURL <", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLLessThanOrEqualTo(String value) {
            addCriterion("commentSharpURL <=", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLLike(String value) {
            addCriterion("commentSharpURL like", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLNotLike(String value) {
            addCriterion("commentSharpURL not like", value, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLIn(List<String> values) {
            addCriterion("commentSharpURL in", values, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLNotIn(List<String> values) {
            addCriterion("commentSharpURL not in", values, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLBetween(String value1, String value2) {
            addCriterion("commentSharpURL between", value1, value2, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentSharpURLNotBetween(String value1, String value2) {
            addCriterion("commentSharpURL not between", value1, value2, "commentSharpURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLIsNull() {
            addCriterion("commentURL is null");
            return (Criteria) this;
        }

        public Criteria andCommentURLIsNotNull() {
            addCriterion("commentURL is not null");
            return (Criteria) this;
        }

        public Criteria andCommentURLEqualTo(String value) {
            addCriterion("commentURL =", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLNotEqualTo(String value) {
            addCriterion("commentURL <>", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLGreaterThan(String value) {
            addCriterion("commentURL >", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLGreaterThanOrEqualTo(String value) {
            addCriterion("commentURL >=", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLLessThan(String value) {
            addCriterion("commentURL <", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLLessThanOrEqualTo(String value) {
            addCriterion("commentURL <=", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLLike(String value) {
            addCriterion("commentURL like", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLNotLike(String value) {
            addCriterion("commentURL not like", value, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLIn(List<String> values) {
            addCriterion("commentURL in", values, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLNotIn(List<String> values) {
            addCriterion("commentURL not in", values, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLBetween(String value1, String value2) {
            addCriterion("commentURL between", value1, value2, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentURLNotBetween(String value1, String value2) {
            addCriterion("commentURL not between", value1, value2, "commentURL");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdIsNull() {
            addCriterion("commentOriginalCommentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdIsNotNull() {
            addCriterion("commentOriginalCommentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdEqualTo(String value) {
            addCriterion("commentOriginalCommentId =", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdNotEqualTo(String value) {
            addCriterion("commentOriginalCommentId <>", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdGreaterThan(String value) {
            addCriterion("commentOriginalCommentId >", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("commentOriginalCommentId >=", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdLessThan(String value) {
            addCriterion("commentOriginalCommentId <", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdLessThanOrEqualTo(String value) {
            addCriterion("commentOriginalCommentId <=", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdLike(String value) {
            addCriterion("commentOriginalCommentId like", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdNotLike(String value) {
            addCriterion("commentOriginalCommentId not like", value, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdIn(List<String> values) {
            addCriterion("commentOriginalCommentId in", values, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdNotIn(List<String> values) {
            addCriterion("commentOriginalCommentId not in", values, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdBetween(String value1, String value2) {
            addCriterion("commentOriginalCommentId between", value1, value2, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentIdNotBetween(String value1, String value2) {
            addCriterion("commentOriginalCommentId not between", value1, value2, "commentOriginalCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameIsNull() {
            addCriterion("commentOriginalCommentName is null");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameIsNotNull() {
            addCriterion("commentOriginalCommentName is not null");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameEqualTo(String value) {
            addCriterion("commentOriginalCommentName =", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameNotEqualTo(String value) {
            addCriterion("commentOriginalCommentName <>", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameGreaterThan(String value) {
            addCriterion("commentOriginalCommentName >", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameGreaterThanOrEqualTo(String value) {
            addCriterion("commentOriginalCommentName >=", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameLessThan(String value) {
            addCriterion("commentOriginalCommentName <", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameLessThanOrEqualTo(String value) {
            addCriterion("commentOriginalCommentName <=", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameLike(String value) {
            addCriterion("commentOriginalCommentName like", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameNotLike(String value) {
            addCriterion("commentOriginalCommentName not like", value, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameIn(List<String> values) {
            addCriterion("commentOriginalCommentName in", values, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameNotIn(List<String> values) {
            addCriterion("commentOriginalCommentName not in", values, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameBetween(String value1, String value2) {
            addCriterion("commentOriginalCommentName between", value1, value2, "commentOriginalCommentName");
            return (Criteria) this;
        }

        public Criteria andCommentOriginalCommentNameNotBetween(String value1, String value2) {
            addCriterion("commentOriginalCommentName not between", value1, value2, "commentOriginalCommentName");
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