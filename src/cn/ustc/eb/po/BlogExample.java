package cn.ustc.eb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdIsNull() {
            addCriterion("blogcategory_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdIsNotNull() {
            addCriterion("blogcategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdEqualTo(Integer value) {
            addCriterion("blogcategory_id =", value, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdNotEqualTo(Integer value) {
            addCriterion("blogcategory_id <>", value, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdGreaterThan(Integer value) {
            addCriterion("blogcategory_id >", value, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogcategory_id >=", value, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdLessThan(Integer value) {
            addCriterion("blogcategory_id <", value, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogcategory_id <=", value, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdIn(List<Integer> values) {
            addCriterion("blogcategory_id in", values, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdNotIn(List<Integer> values) {
            addCriterion("blogcategory_id not in", values, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("blogcategory_id between", value1, value2, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogcategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogcategory_id not between", value1, value2, "blogcategoryId");
            return (Criteria) this;
        }

        public Criteria andBlogTagIsNull() {
            addCriterion("blog_tag is null");
            return (Criteria) this;
        }

        public Criteria andBlogTagIsNotNull() {
            addCriterion("blog_tag is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTagEqualTo(String value) {
            addCriterion("blog_tag =", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagNotEqualTo(String value) {
            addCriterion("blog_tag <>", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagGreaterThan(String value) {
            addCriterion("blog_tag >", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagGreaterThanOrEqualTo(String value) {
            addCriterion("blog_tag >=", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagLessThan(String value) {
            addCriterion("blog_tag <", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagLessThanOrEqualTo(String value) {
            addCriterion("blog_tag <=", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagLike(String value) {
            addCriterion("blog_tag like", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagNotLike(String value) {
            addCriterion("blog_tag not like", value, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagIn(List<String> values) {
            addCriterion("blog_tag in", values, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagNotIn(List<String> values) {
            addCriterion("blog_tag not in", values, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagBetween(String value1, String value2) {
            addCriterion("blog_tag between", value1, value2, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTagNotBetween(String value1, String value2) {
            addCriterion("blog_tag not between", value1, value2, "blogTag");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNull() {
            addCriterion("blog_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNotNull() {
            addCriterion("blog_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeEqualTo(String value) {
            addCriterion("blog_type =", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotEqualTo(String value) {
            addCriterion("blog_type <>", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThan(String value) {
            addCriterion("blog_type >", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blog_type >=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThan(String value) {
            addCriterion("blog_type <", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThanOrEqualTo(String value) {
            addCriterion("blog_type <=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLike(String value) {
            addCriterion("blog_type like", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotLike(String value) {
            addCriterion("blog_type not like", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIn(List<String> values) {
            addCriterion("blog_type in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotIn(List<String> values) {
            addCriterion("blog_type not in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeBetween(String value1, String value2) {
            addCriterion("blog_type between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotBetween(String value1, String value2) {
            addCriterion("blog_type not between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNull() {
            addCriterion("page_view is null");
            return (Criteria) this;
        }

        public Criteria andPageViewIsNotNull() {
            addCriterion("page_view is not null");
            return (Criteria) this;
        }

        public Criteria andPageViewEqualTo(Integer value) {
            addCriterion("page_view =", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotEqualTo(Integer value) {
            addCriterion("page_view <>", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThan(Integer value) {
            addCriterion("page_view >", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_view >=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThan(Integer value) {
            addCriterion("page_view <", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("page_view <=", value, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewIn(List<Integer> values) {
            addCriterion("page_view in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotIn(List<Integer> values) {
            addCriterion("page_view not in", values, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewBetween(Integer value1, Integer value2) {
            addCriterion("page_view between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("page_view not between", value1, value2, "pageView");
            return (Criteria) this;
        }

        public Criteria andPreparedIsNull() {
            addCriterion("prepared is null");
            return (Criteria) this;
        }

        public Criteria andPreparedIsNotNull() {
            addCriterion("prepared is not null");
            return (Criteria) this;
        }

        public Criteria andPreparedEqualTo(String value) {
            addCriterion("prepared =", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedNotEqualTo(String value) {
            addCriterion("prepared <>", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedGreaterThan(String value) {
            addCriterion("prepared >", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedGreaterThanOrEqualTo(String value) {
            addCriterion("prepared >=", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedLessThan(String value) {
            addCriterion("prepared <", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedLessThanOrEqualTo(String value) {
            addCriterion("prepared <=", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedLike(String value) {
            addCriterion("prepared like", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedNotLike(String value) {
            addCriterion("prepared not like", value, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedIn(List<String> values) {
            addCriterion("prepared in", values, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedNotIn(List<String> values) {
            addCriterion("prepared not in", values, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedBetween(String value1, String value2) {
            addCriterion("prepared between", value1, value2, "prepared");
            return (Criteria) this;
        }

        public Criteria andPreparedNotBetween(String value1, String value2) {
            addCriterion("prepared not between", value1, value2, "prepared");
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