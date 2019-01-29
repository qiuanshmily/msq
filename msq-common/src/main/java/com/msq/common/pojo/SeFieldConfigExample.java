package com.msq.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeFieldConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    public SeFieldConfigExample() {
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

        public Criteria andFieldConfigIdIsNull() {
            addCriterion("field_config_id is null");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdIsNotNull() {
            addCriterion("field_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdEqualTo(Long value) {
            addCriterion("field_config_id =", value, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdNotEqualTo(Long value) {
            addCriterion("field_config_id <>", value, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdGreaterThan(Long value) {
            addCriterion("field_config_id >", value, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("field_config_id >=", value, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdLessThan(Long value) {
            addCriterion("field_config_id <", value, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("field_config_id <=", value, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdIn(List<Long> values) {
            addCriterion("field_config_id in", values, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdNotIn(List<Long> values) {
            addCriterion("field_config_id not in", values, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdBetween(Long value1, Long value2) {
            addCriterion("field_config_id between", value1, value2, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("field_config_id not between", value1, value2, "fieldConfigId");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameIsNull() {
            addCriterion("field_config_name is null");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameIsNotNull() {
            addCriterion("field_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameEqualTo(String value) {
            addCriterion("field_config_name =", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameNotEqualTo(String value) {
            addCriterion("field_config_name <>", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameGreaterThan(String value) {
            addCriterion("field_config_name >", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("field_config_name >=", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameLessThan(String value) {
            addCriterion("field_config_name <", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameLessThanOrEqualTo(String value) {
            addCriterion("field_config_name <=", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameLike(String value) {
            addCriterion("field_config_name like", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameNotLike(String value) {
            addCriterion("field_config_name not like", value, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameIn(List<String> values) {
            addCriterion("field_config_name in", values, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameNotIn(List<String> values) {
            addCriterion("field_config_name not in", values, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameBetween(String value1, String value2) {
            addCriterion("field_config_name between", value1, value2, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigNameNotBetween(String value1, String value2) {
            addCriterion("field_config_name not between", value1, value2, "fieldConfigName");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeIsNull() {
            addCriterion("field_config_code is null");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeIsNotNull() {
            addCriterion("field_config_code is not null");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeEqualTo(String value) {
            addCriterion("field_config_code =", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeNotEqualTo(String value) {
            addCriterion("field_config_code <>", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeGreaterThan(String value) {
            addCriterion("field_config_code >", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("field_config_code >=", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeLessThan(String value) {
            addCriterion("field_config_code <", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeLessThanOrEqualTo(String value) {
            addCriterion("field_config_code <=", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeLike(String value) {
            addCriterion("field_config_code like", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeNotLike(String value) {
            addCriterion("field_config_code not like", value, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeIn(List<String> values) {
            addCriterion("field_config_code in", values, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeNotIn(List<String> values) {
            addCriterion("field_config_code not in", values, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeBetween(String value1, String value2) {
            addCriterion("field_config_code between", value1, value2, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andFieldConfigCodeNotBetween(String value1, String value2) {
            addCriterion("field_config_code not between", value1, value2, "fieldConfigCode");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIsNull() {
            addCriterion("data_source_id is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIsNotNull() {
            addCriterion("data_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdEqualTo(Long value) {
            addCriterion("data_source_id =", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotEqualTo(Long value) {
            addCriterion("data_source_id <>", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThan(Long value) {
            addCriterion("data_source_id >", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("data_source_id >=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThan(Long value) {
            addCriterion("data_source_id <", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThanOrEqualTo(Long value) {
            addCriterion("data_source_id <=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIn(List<Long> values) {
            addCriterion("data_source_id in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotIn(List<Long> values) {
            addCriterion("data_source_id not in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdBetween(Long value1, Long value2) {
            addCriterion("data_source_id between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotBetween(Long value1, Long value2) {
            addCriterion("data_source_id not between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("delete_flag like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("delete_flag not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
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

        public  Criterion (){

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