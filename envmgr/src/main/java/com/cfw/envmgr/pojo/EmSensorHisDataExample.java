package com.cfw.envmgr.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmSensorHisDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmSensorHisDataExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(Long value) {
            addCriterion("DATA_ID =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(Long value) {
            addCriterion("DATA_ID <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(Long value) {
            addCriterion("DATA_ID >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DATA_ID >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(Long value) {
            addCriterion("DATA_ID <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(Long value) {
            addCriterion("DATA_ID <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<Long> values) {
            addCriterion("DATA_ID in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<Long> values) {
            addCriterion("DATA_ID not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(Long value1, Long value2) {
            addCriterion("DATA_ID between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(Long value1, Long value2) {
            addCriterion("DATA_ID not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNull() {
            addCriterion("DATA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataTimeIsNotNull() {
            addCriterion("DATA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataTimeEqualTo(Date value) {
            addCriterion("DATA_TIME =", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotEqualTo(Date value) {
            addCriterion("DATA_TIME <>", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThan(Date value) {
            addCriterion("DATA_TIME >", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATA_TIME >=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThan(Date value) {
            addCriterion("DATA_TIME <", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATA_TIME <=", value, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeIn(List<Date> values) {
            addCriterion("DATA_TIME in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotIn(List<Date> values) {
            addCriterion("DATA_TIME not in", values, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeBetween(Date value1, Date value2) {
            addCriterion("DATA_TIME between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andDataTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATA_TIME not between", value1, value2, "dataTime");
            return (Criteria) this;
        }

        public Criteria andSensorIdIsNull() {
            addCriterion("SENSOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSensorIdIsNotNull() {
            addCriterion("SENSOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIdEqualTo(String value) {
            addCriterion("SENSOR_ID =", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotEqualTo(String value) {
            addCriterion("SENSOR_ID <>", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThan(String value) {
            addCriterion("SENSOR_ID >", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThanOrEqualTo(String value) {
            addCriterion("SENSOR_ID >=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThan(String value) {
            addCriterion("SENSOR_ID <", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThanOrEqualTo(String value) {
            addCriterion("SENSOR_ID <=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLike(String value) {
            addCriterion("SENSOR_ID like", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotLike(String value) {
            addCriterion("SENSOR_ID not like", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdIn(List<String> values) {
            addCriterion("SENSOR_ID in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotIn(List<String> values) {
            addCriterion("SENSOR_ID not in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdBetween(String value1, String value2) {
            addCriterion("SENSOR_ID between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotBetween(String value1, String value2) {
            addCriterion("SENSOR_ID not between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("PM25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("PM25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(BigDecimal value) {
            addCriterion("PM25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(BigDecimal value) {
            addCriterion("PM25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(BigDecimal value) {
            addCriterion("PM25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PM25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(BigDecimal value) {
            addCriterion("PM25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PM25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<BigDecimal> values) {
            addCriterion("PM25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<BigDecimal> values) {
            addCriterion("PM25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("PM10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(BigDecimal value) {
            addCriterion("PM10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(BigDecimal value) {
            addCriterion("PM10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(BigDecimal value) {
            addCriterion("PM10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PM10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(BigDecimal value) {
            addCriterion("PM10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("PM10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<BigDecimal> values) {
            addCriterion("PM10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<BigDecimal> values) {
            addCriterion("PM10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PM10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("SO2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(BigDecimal value) {
            addCriterion("SO2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(BigDecimal value) {
            addCriterion("SO2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(BigDecimal value) {
            addCriterion("SO2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SO2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(BigDecimal value) {
            addCriterion("SO2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("SO2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<BigDecimal> values) {
            addCriterion("SO2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<BigDecimal> values) {
            addCriterion("SO2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("SO2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SO2 not between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andNo2IsNull() {
            addCriterion("NO2 is null");
            return (Criteria) this;
        }

        public Criteria andNo2IsNotNull() {
            addCriterion("NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andNo2EqualTo(BigDecimal value) {
            addCriterion("NO2 =", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotEqualTo(BigDecimal value) {
            addCriterion("NO2 <>", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThan(BigDecimal value) {
            addCriterion("NO2 >", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO2 >=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThan(BigDecimal value) {
            addCriterion("NO2 <", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO2 <=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2In(List<BigDecimal> values) {
            addCriterion("NO2 in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotIn(List<BigDecimal> values) {
            addCriterion("NO2 not in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO2 between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO2 not between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andO3IsNull() {
            addCriterion("O3 is null");
            return (Criteria) this;
        }

        public Criteria andO3IsNotNull() {
            addCriterion("O3 is not null");
            return (Criteria) this;
        }

        public Criteria andO3EqualTo(BigDecimal value) {
            addCriterion("O3 =", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotEqualTo(BigDecimal value) {
            addCriterion("O3 <>", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThan(BigDecimal value) {
            addCriterion("O3 >", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O3 >=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThan(BigDecimal value) {
            addCriterion("O3 <", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("O3 <=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3In(List<BigDecimal> values) {
            addCriterion("O3 in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotIn(List<BigDecimal> values) {
            addCriterion("O3 not in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("O3 between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O3 not between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(BigDecimal value) {
            addCriterion("CO =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(BigDecimal value) {
            addCriterion("CO <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(BigDecimal value) {
            addCriterion("CO >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CO >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(BigDecimal value) {
            addCriterion("CO <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CO <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<BigDecimal> values) {
            addCriterion("CO in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<BigDecimal> values) {
            addCriterion("CO not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CO between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CO not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andTspIsNull() {
            addCriterion("TSP is null");
            return (Criteria) this;
        }

        public Criteria andTspIsNotNull() {
            addCriterion("TSP is not null");
            return (Criteria) this;
        }

        public Criteria andTspEqualTo(BigDecimal value) {
            addCriterion("TSP =", value, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspNotEqualTo(BigDecimal value) {
            addCriterion("TSP <>", value, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspGreaterThan(BigDecimal value) {
            addCriterion("TSP >", value, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TSP >=", value, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspLessThan(BigDecimal value) {
            addCriterion("TSP <", value, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TSP <=", value, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspIn(List<BigDecimal> values) {
            addCriterion("TSP in", values, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspNotIn(List<BigDecimal> values) {
            addCriterion("TSP not in", values, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TSP between", value1, value2, "tsp");
            return (Criteria) this;
        }

        public Criteria andTspNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TSP not between", value1, value2, "tsp");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("TP is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("TP is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(BigDecimal value) {
            addCriterion("TP =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(BigDecimal value) {
            addCriterion("TP <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(BigDecimal value) {
            addCriterion("TP >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TP >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(BigDecimal value) {
            addCriterion("TP <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TP <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<BigDecimal> values) {
            addCriterion("TP in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<BigDecimal> values) {
            addCriterion("TP not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TP between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TP not between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andMtIsNull() {
            addCriterion("MT is null");
            return (Criteria) this;
        }

        public Criteria andMtIsNotNull() {
            addCriterion("MT is not null");
            return (Criteria) this;
        }

        public Criteria andMtEqualTo(BigDecimal value) {
            addCriterion("MT =", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotEqualTo(BigDecimal value) {
            addCriterion("MT <>", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtGreaterThan(BigDecimal value) {
            addCriterion("MT >", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MT >=", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtLessThan(BigDecimal value) {
            addCriterion("MT <", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MT <=", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtIn(List<BigDecimal> values) {
            addCriterion("MT in", values, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotIn(List<BigDecimal> values) {
            addCriterion("MT not in", values, "mt");
            return (Criteria) this;
        }

        public Criteria andMtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MT between", value1, value2, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MT not between", value1, value2, "mt");
            return (Criteria) this;
        }

        public Criteria andVo1IsNull() {
            addCriterion("VO1 is null");
            return (Criteria) this;
        }

        public Criteria andVo1IsNotNull() {
            addCriterion("VO1 is not null");
            return (Criteria) this;
        }

        public Criteria andVo1EqualTo(BigDecimal value) {
            addCriterion("VO1 =", value, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1NotEqualTo(BigDecimal value) {
            addCriterion("VO1 <>", value, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1GreaterThan(BigDecimal value) {
            addCriterion("VO1 >", value, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VO1 >=", value, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1LessThan(BigDecimal value) {
            addCriterion("VO1 <", value, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("VO1 <=", value, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1In(List<BigDecimal> values) {
            addCriterion("VO1 in", values, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1NotIn(List<BigDecimal> values) {
            addCriterion("VO1 not in", values, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("VO1 between", value1, value2, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VO1 not between", value1, value2, "vo1");
            return (Criteria) this;
        }

        public Criteria andVo2IsNull() {
            addCriterion("VO2 is null");
            return (Criteria) this;
        }

        public Criteria andVo2IsNotNull() {
            addCriterion("VO2 is not null");
            return (Criteria) this;
        }

        public Criteria andVo2EqualTo(BigDecimal value) {
            addCriterion("VO2 =", value, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2NotEqualTo(BigDecimal value) {
            addCriterion("VO2 <>", value, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2GreaterThan(BigDecimal value) {
            addCriterion("VO2 >", value, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VO2 >=", value, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2LessThan(BigDecimal value) {
            addCriterion("VO2 <", value, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("VO2 <=", value, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2In(List<BigDecimal> values) {
            addCriterion("VO2 in", values, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2NotIn(List<BigDecimal> values) {
            addCriterion("VO2 not in", values, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("VO2 between", value1, value2, "vo2");
            return (Criteria) this;
        }

        public Criteria andVo2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VO2 not between", value1, value2, "vo2");
            return (Criteria) this;
        }

        public Criteria andWindPressIsNull() {
            addCriterion("WIND_PRESS is null");
            return (Criteria) this;
        }

        public Criteria andWindPressIsNotNull() {
            addCriterion("WIND_PRESS is not null");
            return (Criteria) this;
        }

        public Criteria andWindPressEqualTo(BigDecimal value) {
            addCriterion("WIND_PRESS =", value, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressNotEqualTo(BigDecimal value) {
            addCriterion("WIND_PRESS <>", value, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressGreaterThan(BigDecimal value) {
            addCriterion("WIND_PRESS >", value, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIND_PRESS >=", value, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressLessThan(BigDecimal value) {
            addCriterion("WIND_PRESS <", value, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIND_PRESS <=", value, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressIn(List<BigDecimal> values) {
            addCriterion("WIND_PRESS in", values, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressNotIn(List<BigDecimal> values) {
            addCriterion("WIND_PRESS not in", values, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIND_PRESS between", value1, value2, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindPressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIND_PRESS not between", value1, value2, "windPress");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNull() {
            addCriterion("WIND_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIsNotNull() {
            addCriterion("WIND_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andWindDirectionEqualTo(String value) {
            addCriterion("WIND_DIRECTION =", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotEqualTo(String value) {
            addCriterion("WIND_DIRECTION <>", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThan(String value) {
            addCriterion("WIND_DIRECTION >", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("WIND_DIRECTION >=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThan(String value) {
            addCriterion("WIND_DIRECTION <", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLessThanOrEqualTo(String value) {
            addCriterion("WIND_DIRECTION <=", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionLike(String value) {
            addCriterion("WIND_DIRECTION like", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotLike(String value) {
            addCriterion("WIND_DIRECTION not like", value, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionIn(List<String> values) {
            addCriterion("WIND_DIRECTION in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotIn(List<String> values) {
            addCriterion("WIND_DIRECTION not in", values, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionBetween(String value1, String value2) {
            addCriterion("WIND_DIRECTION between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindDirectionNotBetween(String value1, String value2) {
            addCriterion("WIND_DIRECTION not between", value1, value2, "windDirection");
            return (Criteria) this;
        }

        public Criteria andWindForceIsNull() {
            addCriterion("WIND_FORCE is null");
            return (Criteria) this;
        }

        public Criteria andWindForceIsNotNull() {
            addCriterion("WIND_FORCE is not null");
            return (Criteria) this;
        }

        public Criteria andWindForceEqualTo(BigDecimal value) {
            addCriterion("WIND_FORCE =", value, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceNotEqualTo(BigDecimal value) {
            addCriterion("WIND_FORCE <>", value, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceGreaterThan(BigDecimal value) {
            addCriterion("WIND_FORCE >", value, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIND_FORCE >=", value, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceLessThan(BigDecimal value) {
            addCriterion("WIND_FORCE <", value, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIND_FORCE <=", value, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceIn(List<BigDecimal> values) {
            addCriterion("WIND_FORCE in", values, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceNotIn(List<BigDecimal> values) {
            addCriterion("WIND_FORCE not in", values, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIND_FORCE between", value1, value2, "windForce");
            return (Criteria) this;
        }

        public Criteria andWindForceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIND_FORCE not between", value1, value2, "windForce");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNull() {
            addCriterion("NOISE is null");
            return (Criteria) this;
        }

        public Criteria andNoiseIsNotNull() {
            addCriterion("NOISE is not null");
            return (Criteria) this;
        }

        public Criteria andNoiseEqualTo(BigDecimal value) {
            addCriterion("NOISE =", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotEqualTo(BigDecimal value) {
            addCriterion("NOISE <>", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThan(BigDecimal value) {
            addCriterion("NOISE >", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOISE >=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThan(BigDecimal value) {
            addCriterion("NOISE <", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOISE <=", value, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseIn(List<BigDecimal> values) {
            addCriterion("NOISE in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotIn(List<BigDecimal> values) {
            addCriterion("NOISE not in", values, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOISE between", value1, value2, "noise");
            return (Criteria) this;
        }

        public Criteria andNoiseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOISE not between", value1, value2, "noise");
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