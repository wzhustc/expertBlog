package cn.ustc.eb.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SponsorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SponsorExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyIsNull() {
            addCriterion("sposonr_money is null");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyIsNotNull() {
            addCriterion("sposonr_money is not null");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyEqualTo(Long value) {
            addCriterion("sposonr_money =", value, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyNotEqualTo(Long value) {
            addCriterion("sposonr_money <>", value, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyGreaterThan(Long value) {
            addCriterion("sposonr_money >", value, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("sposonr_money >=", value, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyLessThan(Long value) {
            addCriterion("sposonr_money <", value, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyLessThanOrEqualTo(Long value) {
            addCriterion("sposonr_money <=", value, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyIn(List<Long> values) {
            addCriterion("sposonr_money in", values, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyNotIn(List<Long> values) {
            addCriterion("sposonr_money not in", values, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyBetween(Long value1, Long value2) {
            addCriterion("sposonr_money between", value1, value2, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrMoneyNotBetween(Long value1, Long value2) {
            addCriterion("sposonr_money not between", value1, value2, "sposonrMoney");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeIsNull() {
            addCriterion("sposonr_time is null");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeIsNotNull() {
            addCriterion("sposonr_time is not null");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeEqualTo(Date value) {
            addCriterion("sposonr_time =", value, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeNotEqualTo(Date value) {
            addCriterion("sposonr_time <>", value, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeGreaterThan(Date value) {
            addCriterion("sposonr_time >", value, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sposonr_time >=", value, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeLessThan(Date value) {
            addCriterion("sposonr_time <", value, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeLessThanOrEqualTo(Date value) {
            addCriterion("sposonr_time <=", value, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeIn(List<Date> values) {
            addCriterion("sposonr_time in", values, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeNotIn(List<Date> values) {
            addCriterion("sposonr_time not in", values, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeBetween(Date value1, Date value2) {
            addCriterion("sposonr_time between", value1, value2, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrTimeNotBetween(Date value1, Date value2) {
            addCriterion("sposonr_time not between", value1, value2, "sposonrTime");
            return (Criteria) this;
        }

        public Criteria andSposonrWayIsNull() {
            addCriterion("sposonr_way is null");
            return (Criteria) this;
        }

        public Criteria andSposonrWayIsNotNull() {
            addCriterion("sposonr_way is not null");
            return (Criteria) this;
        }

        public Criteria andSposonrWayEqualTo(String value) {
            addCriterion("sposonr_way =", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayNotEqualTo(String value) {
            addCriterion("sposonr_way <>", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayGreaterThan(String value) {
            addCriterion("sposonr_way >", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayGreaterThanOrEqualTo(String value) {
            addCriterion("sposonr_way >=", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayLessThan(String value) {
            addCriterion("sposonr_way <", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayLessThanOrEqualTo(String value) {
            addCriterion("sposonr_way <=", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayLike(String value) {
            addCriterion("sposonr_way like", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayNotLike(String value) {
            addCriterion("sposonr_way not like", value, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayIn(List<String> values) {
            addCriterion("sposonr_way in", values, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayNotIn(List<String> values) {
            addCriterion("sposonr_way not in", values, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayBetween(String value1, String value2) {
            addCriterion("sposonr_way between", value1, value2, "sposonrWay");
            return (Criteria) this;
        }

        public Criteria andSposonrWayNotBetween(String value1, String value2) {
            addCriterion("sposonr_way not between", value1, value2, "sposonrWay");
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