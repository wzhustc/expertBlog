package cn.ustc.eb.po;

import java.util.ArrayList;
import java.util.List;

public class APIContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public APIContentExample() {
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

        public Criteria andContentNameIsNull() {
            addCriterion("content_name is null");
            return (Criteria) this;
        }

        public Criteria andContentNameIsNotNull() {
            addCriterion("content_name is not null");
            return (Criteria) this;
        }

        public Criteria andContentNameEqualTo(String value) {
            addCriterion("content_name =", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotEqualTo(String value) {
            addCriterion("content_name <>", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameGreaterThan(String value) {
            addCriterion("content_name >", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameGreaterThanOrEqualTo(String value) {
            addCriterion("content_name >=", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLessThan(String value) {
            addCriterion("content_name <", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLessThanOrEqualTo(String value) {
            addCriterion("content_name <=", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameLike(String value) {
            addCriterion("content_name like", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotLike(String value) {
            addCriterion("content_name not like", value, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameIn(List<String> values) {
            addCriterion("content_name in", values, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotIn(List<String> values) {
            addCriterion("content_name not in", values, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameBetween(String value1, String value2) {
            addCriterion("content_name between", value1, value2, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentNameNotBetween(String value1, String value2) {
            addCriterion("content_name not between", value1, value2, "contentName");
            return (Criteria) this;
        }

        public Criteria andContentUrlIsNull() {
            addCriterion("content_url is null");
            return (Criteria) this;
        }

        public Criteria andContentUrlIsNotNull() {
            addCriterion("content_url is not null");
            return (Criteria) this;
        }

        public Criteria andContentUrlEqualTo(String value) {
            addCriterion("content_url =", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotEqualTo(String value) {
            addCriterion("content_url <>", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlGreaterThan(String value) {
            addCriterion("content_url >", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlGreaterThanOrEqualTo(String value) {
            addCriterion("content_url >=", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLessThan(String value) {
            addCriterion("content_url <", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLessThanOrEqualTo(String value) {
            addCriterion("content_url <=", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlLike(String value) {
            addCriterion("content_url like", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotLike(String value) {
            addCriterion("content_url not like", value, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlIn(List<String> values) {
            addCriterion("content_url in", values, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotIn(List<String> values) {
            addCriterion("content_url not in", values, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlBetween(String value1, String value2) {
            addCriterion("content_url between", value1, value2, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andContentUrlNotBetween(String value1, String value2) {
            addCriterion("content_url not between", value1, value2, "contentUrl");
            return (Criteria) this;
        }

        public Criteria andApitextIdIsNull() {
            addCriterion("apitext_id is null");
            return (Criteria) this;
        }

        public Criteria andApitextIdIsNotNull() {
            addCriterion("apitext_id is not null");
            return (Criteria) this;
        }

        public Criteria andApitextIdEqualTo(Integer value) {
            addCriterion("apitext_id =", value, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdNotEqualTo(Integer value) {
            addCriterion("apitext_id <>", value, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdGreaterThan(Integer value) {
            addCriterion("apitext_id >", value, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apitext_id >=", value, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdLessThan(Integer value) {
            addCriterion("apitext_id <", value, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdLessThanOrEqualTo(Integer value) {
            addCriterion("apitext_id <=", value, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdIn(List<Integer> values) {
            addCriterion("apitext_id in", values, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdNotIn(List<Integer> values) {
            addCriterion("apitext_id not in", values, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdBetween(Integer value1, Integer value2) {
            addCriterion("apitext_id between", value1, value2, "apitextId");
            return (Criteria) this;
        }

        public Criteria andApitextIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apitext_id not between", value1, value2, "apitextId");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdIsNull() {
            addCriterion("apicategory_id is null");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdIsNotNull() {
            addCriterion("apicategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdEqualTo(Integer value) {
            addCriterion("apicategory_id =", value, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdNotEqualTo(Integer value) {
            addCriterion("apicategory_id <>", value, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdGreaterThan(Integer value) {
            addCriterion("apicategory_id >", value, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apicategory_id >=", value, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdLessThan(Integer value) {
            addCriterion("apicategory_id <", value, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("apicategory_id <=", value, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdIn(List<Integer> values) {
            addCriterion("apicategory_id in", values, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdNotIn(List<Integer> values) {
            addCriterion("apicategory_id not in", values, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("apicategory_id between", value1, value2, "apicategoryId");
            return (Criteria) this;
        }

        public Criteria andApicategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apicategory_id not between", value1, value2, "apicategoryId");
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