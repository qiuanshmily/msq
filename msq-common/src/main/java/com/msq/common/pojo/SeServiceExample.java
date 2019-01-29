package com.msq.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }

    protected List<Criteria> oredCriteria;

    public SeServiceExample() {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Long value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Long value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Long value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Long value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Long value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Long> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Long> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Long value1, Long value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Long value1, Long value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstIsNull() {
            addCriterion("service_use_first is null");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstIsNotNull() {
            addCriterion("service_use_first is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstEqualTo(String value) {
            addCriterion("service_use_first =", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstNotEqualTo(String value) {
            addCriterion("service_use_first <>", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstGreaterThan(String value) {
            addCriterion("service_use_first >", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstGreaterThanOrEqualTo(String value) {
            addCriterion("service_use_first >=", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstLessThan(String value) {
            addCriterion("service_use_first <", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstLessThanOrEqualTo(String value) {
            addCriterion("service_use_first <=", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstLike(String value) {
            addCriterion("service_use_first like", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstNotLike(String value) {
            addCriterion("service_use_first not like", value, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstIn(List<String> values) {
            addCriterion("service_use_first in", values, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstNotIn(List<String> values) {
            addCriterion("service_use_first not in", values, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstBetween(String value1, String value2) {
            addCriterion("service_use_first between", value1, value2, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseFirstNotBetween(String value1, String value2) {
            addCriterion("service_use_first not between", value1, value2, "serviceUseFirst");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondIsNull() {
            addCriterion("service_use_second is null");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondIsNotNull() {
            addCriterion("service_use_second is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondEqualTo(String value) {
            addCriterion("service_use_second =", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondNotEqualTo(String value) {
            addCriterion("service_use_second <>", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondGreaterThan(String value) {
            addCriterion("service_use_second >", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondGreaterThanOrEqualTo(String value) {
            addCriterion("service_use_second >=", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondLessThan(String value) {
            addCriterion("service_use_second <", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondLessThanOrEqualTo(String value) {
            addCriterion("service_use_second <=", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondLike(String value) {
            addCriterion("service_use_second like", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondNotLike(String value) {
            addCriterion("service_use_second not like", value, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondIn(List<String> values) {
            addCriterion("service_use_second in", values, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondNotIn(List<String> values) {
            addCriterion("service_use_second not in", values, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondBetween(String value1, String value2) {
            addCriterion("service_use_second between", value1, value2, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andServiceUseSecondNotBetween(String value1, String value2) {
            addCriterion("service_use_second not between", value1, value2, "serviceUseSecond");
            return (Criteria) this;
        }

        public Criteria andSearchIdIsNull() {
            addCriterion("search_id is null");
            return (Criteria) this;
        }

        public Criteria andSearchIdIsNotNull() {
            addCriterion("search_id is not null");
            return (Criteria) this;
        }

        public Criteria andSearchIdEqualTo(Long value) {
            addCriterion("search_id =", value, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdNotEqualTo(Long value) {
            addCriterion("search_id <>", value, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdGreaterThan(Long value) {
            addCriterion("search_id >", value, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("search_id >=", value, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdLessThan(Long value) {
            addCriterion("search_id <", value, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdLessThanOrEqualTo(Long value) {
            addCriterion("search_id <=", value, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdIn(List<Long> values) {
            addCriterion("search_id in", values, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdNotIn(List<Long> values) {
            addCriterion("search_id not in", values, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdBetween(Long value1, Long value2) {
            addCriterion("search_id between", value1, value2, "searchId");
            return (Criteria) this;
        }

        public Criteria andSearchIdNotBetween(Long value1, Long value2) {
            addCriterion("search_id not between", value1, value2, "searchId");
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

        public Criteria andCallNumberIsNull() {
            addCriterion("call_number is null");
            return (Criteria) this;
        }

        public Criteria andCallNumberIsNotNull() {
            addCriterion("call_number is not null");
            return (Criteria) this;
        }

        public Criteria andCallNumberEqualTo(Integer value) {
            addCriterion("call_number =", value, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberNotEqualTo(Integer value) {
            addCriterion("call_number <>", value, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberGreaterThan(Integer value) {
            addCriterion("call_number >", value, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("call_number >=", value, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberLessThan(Integer value) {
            addCriterion("call_number <", value, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberLessThanOrEqualTo(Integer value) {
            addCriterion("call_number <=", value, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberIn(List<Integer> values) {
            addCriterion("call_number in", values, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberNotIn(List<Integer> values) {
            addCriterion("call_number not in", values, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberBetween(Integer value1, Integer value2) {
            addCriterion("call_number between", value1, value2, "callNumber");
            return (Criteria) this;
        }

        public Criteria andCallNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("call_number not between", value1, value2, "callNumber");
            return (Criteria) this;
        }

        public Criteria andServiceUriIsNull() {
            addCriterion("service_uri is null");
            return (Criteria) this;
        }

        public Criteria andServiceUriIsNotNull() {
            addCriterion("service_uri is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUriEqualTo(String value) {
            addCriterion("service_uri =", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriNotEqualTo(String value) {
            addCriterion("service_uri <>", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriGreaterThan(String value) {
            addCriterion("service_uri >", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriGreaterThanOrEqualTo(String value) {
            addCriterion("service_uri >=", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriLessThan(String value) {
            addCriterion("service_uri <", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriLessThanOrEqualTo(String value) {
            addCriterion("service_uri <=", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriLike(String value) {
            addCriterion("service_uri like", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriNotLike(String value) {
            addCriterion("service_uri not like", value, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriIn(List<String> values) {
            addCriterion("service_uri in", values, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriNotIn(List<String> values) {
            addCriterion("service_uri not in", values, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriBetween(String value1, String value2) {
            addCriterion("service_uri between", value1, value2, "serviceUri");
            return (Criteria) this;
        }

        public Criteria andServiceUriNotBetween(String value1, String value2) {
            addCriterion("service_uri not between", value1, value2, "serviceUri");
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