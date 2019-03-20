package com.liumapp.solo.transporter.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class B3SoloArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public B3SoloArticleExample() {
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("articleTitle is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("articleTitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("articleTitle =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("articleTitle <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("articleTitle >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("articleTitle >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("articleTitle <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("articleTitle <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("articleTitle like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("articleTitle not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("articleTitle in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("articleTitle not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("articleTitle between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("articleTitle not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailIsNull() {
            addCriterion("articleAuthorEmail is null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailIsNotNull() {
            addCriterion("articleAuthorEmail is not null");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailEqualTo(String value) {
            addCriterion("articleAuthorEmail =", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailNotEqualTo(String value) {
            addCriterion("articleAuthorEmail <>", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailGreaterThan(String value) {
            addCriterion("articleAuthorEmail >", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("articleAuthorEmail >=", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailLessThan(String value) {
            addCriterion("articleAuthorEmail <", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailLessThanOrEqualTo(String value) {
            addCriterion("articleAuthorEmail <=", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailLike(String value) {
            addCriterion("articleAuthorEmail like", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailNotLike(String value) {
            addCriterion("articleAuthorEmail not like", value, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailIn(List<String> values) {
            addCriterion("articleAuthorEmail in", values, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailNotIn(List<String> values) {
            addCriterion("articleAuthorEmail not in", values, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailBetween(String value1, String value2) {
            addCriterion("articleAuthorEmail between", value1, value2, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleAuthorEmailNotBetween(String value1, String value2) {
            addCriterion("articleAuthorEmail not between", value1, value2, "articleAuthorEmail");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIsNull() {
            addCriterion("articleCommentCount is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIsNotNull() {
            addCriterion("articleCommentCount is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountEqualTo(Integer value) {
            addCriterion("articleCommentCount =", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotEqualTo(Integer value) {
            addCriterion("articleCommentCount <>", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountGreaterThan(Integer value) {
            addCriterion("articleCommentCount >", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleCommentCount >=", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountLessThan(Integer value) {
            addCriterion("articleCommentCount <", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("articleCommentCount <=", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIn(List<Integer> values) {
            addCriterion("articleCommentCount in", values, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotIn(List<Integer> values) {
            addCriterion("articleCommentCount not in", values, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("articleCommentCount between", value1, value2, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("articleCommentCount not between", value1, value2, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountIsNull() {
            addCriterion("articleViewCount is null");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountIsNotNull() {
            addCriterion("articleViewCount is not null");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountEqualTo(Integer value) {
            addCriterion("articleViewCount =", value, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountNotEqualTo(Integer value) {
            addCriterion("articleViewCount <>", value, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountGreaterThan(Integer value) {
            addCriterion("articleViewCount >", value, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleViewCount >=", value, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountLessThan(Integer value) {
            addCriterion("articleViewCount <", value, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountLessThanOrEqualTo(Integer value) {
            addCriterion("articleViewCount <=", value, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountIn(List<Integer> values) {
            addCriterion("articleViewCount in", values, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountNotIn(List<Integer> values) {
            addCriterion("articleViewCount not in", values, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountBetween(Integer value1, Integer value2) {
            addCriterion("articleViewCount between", value1, value2, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticleViewCountNotBetween(Integer value1, Integer value2) {
            addCriterion("articleViewCount not between", value1, value2, "articleViewCount");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkIsNull() {
            addCriterion("articlePermalink is null");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkIsNotNull() {
            addCriterion("articlePermalink is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkEqualTo(String value) {
            addCriterion("articlePermalink =", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkNotEqualTo(String value) {
            addCriterion("articlePermalink <>", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkGreaterThan(String value) {
            addCriterion("articlePermalink >", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkGreaterThanOrEqualTo(String value) {
            addCriterion("articlePermalink >=", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkLessThan(String value) {
            addCriterion("articlePermalink <", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkLessThanOrEqualTo(String value) {
            addCriterion("articlePermalink <=", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkLike(String value) {
            addCriterion("articlePermalink like", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkNotLike(String value) {
            addCriterion("articlePermalink not like", value, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkIn(List<String> values) {
            addCriterion("articlePermalink in", values, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkNotIn(List<String> values) {
            addCriterion("articlePermalink not in", values, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkBetween(String value1, String value2) {
            addCriterion("articlePermalink between", value1, value2, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticlePermalinkNotBetween(String value1, String value2) {
            addCriterion("articlePermalink not between", value1, value2, "articlePermalink");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedIsNull() {
            addCriterion("articleHadBeenPublished is null");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedIsNotNull() {
            addCriterion("articleHadBeenPublished is not null");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedEqualTo(String value) {
            addCriterion("articleHadBeenPublished =", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedNotEqualTo(String value) {
            addCriterion("articleHadBeenPublished <>", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedGreaterThan(String value) {
            addCriterion("articleHadBeenPublished >", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedGreaterThanOrEqualTo(String value) {
            addCriterion("articleHadBeenPublished >=", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedLessThan(String value) {
            addCriterion("articleHadBeenPublished <", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedLessThanOrEqualTo(String value) {
            addCriterion("articleHadBeenPublished <=", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedLike(String value) {
            addCriterion("articleHadBeenPublished like", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedNotLike(String value) {
            addCriterion("articleHadBeenPublished not like", value, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedIn(List<String> values) {
            addCriterion("articleHadBeenPublished in", values, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedNotIn(List<String> values) {
            addCriterion("articleHadBeenPublished not in", values, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedBetween(String value1, String value2) {
            addCriterion("articleHadBeenPublished between", value1, value2, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleHadBeenPublishedNotBetween(String value1, String value2) {
            addCriterion("articleHadBeenPublished not between", value1, value2, "articleHadBeenPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedIsNull() {
            addCriterion("articleIsPublished is null");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedIsNotNull() {
            addCriterion("articleIsPublished is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedEqualTo(String value) {
            addCriterion("articleIsPublished =", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedNotEqualTo(String value) {
            addCriterion("articleIsPublished <>", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedGreaterThan(String value) {
            addCriterion("articleIsPublished >", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedGreaterThanOrEqualTo(String value) {
            addCriterion("articleIsPublished >=", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedLessThan(String value) {
            addCriterion("articleIsPublished <", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedLessThanOrEqualTo(String value) {
            addCriterion("articleIsPublished <=", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedLike(String value) {
            addCriterion("articleIsPublished like", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedNotLike(String value) {
            addCriterion("articleIsPublished not like", value, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedIn(List<String> values) {
            addCriterion("articleIsPublished in", values, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedNotIn(List<String> values) {
            addCriterion("articleIsPublished not in", values, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedBetween(String value1, String value2) {
            addCriterion("articleIsPublished between", value1, value2, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticleIsPublishedNotBetween(String value1, String value2) {
            addCriterion("articleIsPublished not between", value1, value2, "articleIsPublished");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopIsNull() {
            addCriterion("articlePutTop is null");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopIsNotNull() {
            addCriterion("articlePutTop is not null");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopEqualTo(String value) {
            addCriterion("articlePutTop =", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopNotEqualTo(String value) {
            addCriterion("articlePutTop <>", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopGreaterThan(String value) {
            addCriterion("articlePutTop >", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopGreaterThanOrEqualTo(String value) {
            addCriterion("articlePutTop >=", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopLessThan(String value) {
            addCriterion("articlePutTop <", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopLessThanOrEqualTo(String value) {
            addCriterion("articlePutTop <=", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopLike(String value) {
            addCriterion("articlePutTop like", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopNotLike(String value) {
            addCriterion("articlePutTop not like", value, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopIn(List<String> values) {
            addCriterion("articlePutTop in", values, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopNotIn(List<String> values) {
            addCriterion("articlePutTop not in", values, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopBetween(String value1, String value2) {
            addCriterion("articlePutTop between", value1, value2, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticlePutTopNotBetween(String value1, String value2) {
            addCriterion("articlePutTop not between", value1, value2, "articlePutTop");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateIsNull() {
            addCriterion("articleCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateIsNotNull() {
            addCriterion("articleCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateEqualTo(Date value) {
            addCriterion("articleCreateDate =", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateNotEqualTo(Date value) {
            addCriterion("articleCreateDate <>", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateGreaterThan(Date value) {
            addCriterion("articleCreateDate >", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("articleCreateDate >=", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateLessThan(Date value) {
            addCriterion("articleCreateDate <", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("articleCreateDate <=", value, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateIn(List<Date> values) {
            addCriterion("articleCreateDate in", values, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateNotIn(List<Date> values) {
            addCriterion("articleCreateDate not in", values, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateBetween(Date value1, Date value2) {
            addCriterion("articleCreateDate between", value1, value2, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("articleCreateDate not between", value1, value2, "articleCreateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateIsNull() {
            addCriterion("articleUpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateIsNotNull() {
            addCriterion("articleUpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateEqualTo(Date value) {
            addCriterion("articleUpdateDate =", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateNotEqualTo(Date value) {
            addCriterion("articleUpdateDate <>", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateGreaterThan(Date value) {
            addCriterion("articleUpdateDate >", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("articleUpdateDate >=", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateLessThan(Date value) {
            addCriterion("articleUpdateDate <", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("articleUpdateDate <=", value, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateIn(List<Date> values) {
            addCriterion("articleUpdateDate in", values, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateNotIn(List<Date> values) {
            addCriterion("articleUpdateDate not in", values, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateBetween(Date value1, Date value2) {
            addCriterion("articleUpdateDate between", value1, value2, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("articleUpdateDate not between", value1, value2, "articleUpdateDate");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleIsNull() {
            addCriterion("articleRandomDouble is null");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleIsNotNull() {
            addCriterion("articleRandomDouble is not null");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleEqualTo(Double value) {
            addCriterion("articleRandomDouble =", value, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleNotEqualTo(Double value) {
            addCriterion("articleRandomDouble <>", value, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleGreaterThan(Double value) {
            addCriterion("articleRandomDouble >", value, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleGreaterThanOrEqualTo(Double value) {
            addCriterion("articleRandomDouble >=", value, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleLessThan(Double value) {
            addCriterion("articleRandomDouble <", value, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleLessThanOrEqualTo(Double value) {
            addCriterion("articleRandomDouble <=", value, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleIn(List<Double> values) {
            addCriterion("articleRandomDouble in", values, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleNotIn(List<Double> values) {
            addCriterion("articleRandomDouble not in", values, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleBetween(Double value1, Double value2) {
            addCriterion("articleRandomDouble between", value1, value2, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleRandomDoubleNotBetween(Double value1, Double value2) {
            addCriterion("articleRandomDouble not between", value1, value2, "articleRandomDouble");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdIsNull() {
            addCriterion("articleSignId is null");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdIsNotNull() {
            addCriterion("articleSignId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdEqualTo(String value) {
            addCriterion("articleSignId =", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdNotEqualTo(String value) {
            addCriterion("articleSignId <>", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdGreaterThan(String value) {
            addCriterion("articleSignId >", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdGreaterThanOrEqualTo(String value) {
            addCriterion("articleSignId >=", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdLessThan(String value) {
            addCriterion("articleSignId <", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdLessThanOrEqualTo(String value) {
            addCriterion("articleSignId <=", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdLike(String value) {
            addCriterion("articleSignId like", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdNotLike(String value) {
            addCriterion("articleSignId not like", value, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdIn(List<String> values) {
            addCriterion("articleSignId in", values, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdNotIn(List<String> values) {
            addCriterion("articleSignId not in", values, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdBetween(String value1, String value2) {
            addCriterion("articleSignId between", value1, value2, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleSignIdNotBetween(String value1, String value2) {
            addCriterion("articleSignId not between", value1, value2, "articleSignId");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableIsNull() {
            addCriterion("articleCommentable is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableIsNotNull() {
            addCriterion("articleCommentable is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableEqualTo(String value) {
            addCriterion("articleCommentable =", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableNotEqualTo(String value) {
            addCriterion("articleCommentable <>", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableGreaterThan(String value) {
            addCriterion("articleCommentable >", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableGreaterThanOrEqualTo(String value) {
            addCriterion("articleCommentable >=", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableLessThan(String value) {
            addCriterion("articleCommentable <", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableLessThanOrEqualTo(String value) {
            addCriterion("articleCommentable <=", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableLike(String value) {
            addCriterion("articleCommentable like", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableNotLike(String value) {
            addCriterion("articleCommentable not like", value, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableIn(List<String> values) {
            addCriterion("articleCommentable in", values, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableNotIn(List<String> values) {
            addCriterion("articleCommentable not in", values, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableBetween(String value1, String value2) {
            addCriterion("articleCommentable between", value1, value2, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleCommentableNotBetween(String value1, String value2) {
            addCriterion("articleCommentable not between", value1, value2, "articleCommentable");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdIsNull() {
            addCriterion("articleViewPwd is null");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdIsNotNull() {
            addCriterion("articleViewPwd is not null");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdEqualTo(String value) {
            addCriterion("articleViewPwd =", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdNotEqualTo(String value) {
            addCriterion("articleViewPwd <>", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdGreaterThan(String value) {
            addCriterion("articleViewPwd >", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdGreaterThanOrEqualTo(String value) {
            addCriterion("articleViewPwd >=", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdLessThan(String value) {
            addCriterion("articleViewPwd <", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdLessThanOrEqualTo(String value) {
            addCriterion("articleViewPwd <=", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdLike(String value) {
            addCriterion("articleViewPwd like", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdNotLike(String value) {
            addCriterion("articleViewPwd not like", value, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdIn(List<String> values) {
            addCriterion("articleViewPwd in", values, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdNotIn(List<String> values) {
            addCriterion("articleViewPwd not in", values, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdBetween(String value1, String value2) {
            addCriterion("articleViewPwd between", value1, value2, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleViewPwdNotBetween(String value1, String value2) {
            addCriterion("articleViewPwd not between", value1, value2, "articleViewPwd");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeIsNull() {
            addCriterion("articleEditorType is null");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeIsNotNull() {
            addCriterion("articleEditorType is not null");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeEqualTo(String value) {
            addCriterion("articleEditorType =", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeNotEqualTo(String value) {
            addCriterion("articleEditorType <>", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeGreaterThan(String value) {
            addCriterion("articleEditorType >", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("articleEditorType >=", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeLessThan(String value) {
            addCriterion("articleEditorType <", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeLessThanOrEqualTo(String value) {
            addCriterion("articleEditorType <=", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeLike(String value) {
            addCriterion("articleEditorType like", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeNotLike(String value) {
            addCriterion("articleEditorType not like", value, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeIn(List<String> values) {
            addCriterion("articleEditorType in", values, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeNotIn(List<String> values) {
            addCriterion("articleEditorType not in", values, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeBetween(String value1, String value2) {
            addCriterion("articleEditorType between", value1, value2, "articleEditorType");
            return (Criteria) this;
        }

        public Criteria andArticleEditorTypeNotBetween(String value1, String value2) {
            addCriterion("articleEditorType not between", value1, value2, "articleEditorType");
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