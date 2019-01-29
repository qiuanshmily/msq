package com.msq.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeDataSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    public SeDataSourceExample() {
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

        public Criteria andDataSourceNameIsNull() {
            addCriterion("data_source_name is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIsNotNull() {
            addCriterion("data_source_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameEqualTo(String value) {
            addCriterion("data_source_name =", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotEqualTo(String value) {
            addCriterion("data_source_name <>", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameGreaterThan(String value) {
            addCriterion("data_source_name >", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_name >=", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLessThan(String value) {
            addCriterion("data_source_name <", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLessThanOrEqualTo(String value) {
            addCriterion("data_source_name <=", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLike(String value) {
            addCriterion("data_source_name like", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotLike(String value) {
            addCriterion("data_source_name not like", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIn(List<String> values) {
            addCriterion("data_source_name in", values, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotIn(List<String> values) {
            addCriterion("data_source_name not in", values, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameBetween(String value1, String value2) {
            addCriterion("data_source_name between", value1, value2, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotBetween(String value1, String value2) {
            addCriterion("data_source_name not between", value1, value2, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIsNull() {
            addCriterion("data_source_type is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIsNotNull() {
            addCriterion("data_source_type is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeEqualTo(String value) {
            addCriterion("data_source_type =", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotEqualTo(String value) {
            addCriterion("data_source_type <>", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeGreaterThan(String value) {
            addCriterion("data_source_type >", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_type >=", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLessThan(String value) {
            addCriterion("data_source_type <", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("data_source_type <=", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeLike(String value) {
            addCriterion("data_source_type like", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotLike(String value) {
            addCriterion("data_source_type not like", value, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeIn(List<String> values) {
            addCriterion("data_source_type in", values, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotIn(List<String> values) {
            addCriterion("data_source_type not in", values, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeBetween(String value1, String value2) {
            addCriterion("data_source_type between", value1, value2, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceTypeNotBetween(String value1, String value2) {
            addCriterion("data_source_type not between", value1, value2, "dataSourceType");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressIsNull() {
            addCriterion("data_source_address is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressIsNotNull() {
            addCriterion("data_source_address is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressEqualTo(String value) {
            addCriterion("data_source_address =", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressNotEqualTo(String value) {
            addCriterion("data_source_address <>", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressGreaterThan(String value) {
            addCriterion("data_source_address >", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_address >=", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressLessThan(String value) {
            addCriterion("data_source_address <", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressLessThanOrEqualTo(String value) {
            addCriterion("data_source_address <=", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressLike(String value) {
            addCriterion("data_source_address like", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressNotLike(String value) {
            addCriterion("data_source_address not like", value, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressIn(List<String> values) {
            addCriterion("data_source_address in", values, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressNotIn(List<String> values) {
            addCriterion("data_source_address not in", values, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressBetween(String value1, String value2) {
            addCriterion("data_source_address between", value1, value2, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourceAddressNotBetween(String value1, String value2) {
            addCriterion("data_source_address not between", value1, value2, "dataSourceAddress");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortIsNull() {
            addCriterion("data_source_port is null");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortIsNotNull() {
            addCriterion("data_source_port is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortEqualTo(String value) {
            addCriterion("data_source_port =", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortNotEqualTo(String value) {
            addCriterion("data_source_port <>", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortGreaterThan(String value) {
            addCriterion("data_source_port >", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_port >=", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortLessThan(String value) {
            addCriterion("data_source_port <", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortLessThanOrEqualTo(String value) {
            addCriterion("data_source_port <=", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortLike(String value) {
            addCriterion("data_source_port like", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortNotLike(String value) {
            addCriterion("data_source_port not like", value, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortIn(List<String> values) {
            addCriterion("data_source_port in", values, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortNotIn(List<String> values) {
            addCriterion("data_source_port not in", values, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortBetween(String value1, String value2) {
            addCriterion("data_source_port between", value1, value2, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andDataSourcePortNotBetween(String value1, String value2) {
            addCriterion("data_source_port not between", value1, value2, "dataSourcePort");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("user_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("user_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("user_pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("user_pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("user_pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("user_pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("user_pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("user_pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("user_pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("user_pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("user_pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("user_pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("user_pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("user_pwd not between", value1, value2, "userPwd");
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

        public Criteria andDriverClassNameIsNull() {
            addCriterion("driver_class_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameIsNotNull() {
            addCriterion("driver_class_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameEqualTo(String value) {
            addCriterion("driver_class_name =", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameNotEqualTo(String value) {
            addCriterion("driver_class_name <>", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameGreaterThan(String value) {
            addCriterion("driver_class_name >", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_class_name >=", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameLessThan(String value) {
            addCriterion("driver_class_name <", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameLessThanOrEqualTo(String value) {
            addCriterion("driver_class_name <=", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameLike(String value) {
            addCriterion("driver_class_name like", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameNotLike(String value) {
            addCriterion("driver_class_name not like", value, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameIn(List<String> values) {
            addCriterion("driver_class_name in", values, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameNotIn(List<String> values) {
            addCriterion("driver_class_name not in", values, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameBetween(String value1, String value2) {
            addCriterion("driver_class_name between", value1, value2, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andDriverClassNameNotBetween(String value1, String value2) {
            addCriterion("driver_class_name not between", value1, value2, "driverClassName");
            return (Criteria) this;
        }

        public Criteria andLibraryIsNull() {
            addCriterion("library is null");
            return (Criteria) this;
        }

        public Criteria andLibraryIsNotNull() {
            addCriterion("library is not null");
            return (Criteria) this;
        }

        public Criteria andLibraryEqualTo(String value) {
            addCriterion("library =", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotEqualTo(String value) {
            addCriterion("library <>", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryGreaterThan(String value) {
            addCriterion("library >", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryGreaterThanOrEqualTo(String value) {
            addCriterion("library >=", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLessThan(String value) {
            addCriterion("library <", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLessThanOrEqualTo(String value) {
            addCriterion("library <=", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryLike(String value) {
            addCriterion("library like", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotLike(String value) {
            addCriterion("library not like", value, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryIn(List<String> values) {
            addCriterion("library in", values, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotIn(List<String> values) {
            addCriterion("library not in", values, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryBetween(String value1, String value2) {
            addCriterion("library between", value1, value2, "library");
            return (Criteria) this;
        }

        public Criteria andLibraryNotBetween(String value1, String value2) {
            addCriterion("library not between", value1, value2, "library");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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