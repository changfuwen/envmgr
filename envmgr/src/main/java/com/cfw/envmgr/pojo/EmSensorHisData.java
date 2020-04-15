package com.cfw.envmgr.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class EmSensorHisData {
    private Long dataId;

    private Date dataTime;

    private String sensorId;

    private BigDecimal pm25;

    private BigDecimal pm10;

    private BigDecimal so2;

    private BigDecimal no2;

    private BigDecimal o3;

    private BigDecimal co;

    private BigDecimal tsp;

    private BigDecimal tp;

    private BigDecimal mt;

    private BigDecimal vo1;

    private BigDecimal vo2;

    private BigDecimal windPress;

    private String windDirection;

    private BigDecimal windForce;

    private BigDecimal noise;

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId == null ? null : sensorId.trim();
    }

    public BigDecimal getPm25() {
        return pm25;
    }

    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }

    public BigDecimal getPm10() {
        return pm10;
    }

    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
    }

    public BigDecimal getSo2() {
        return so2;
    }

    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    public BigDecimal getNo2() {
        return no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getO3() {
        return o3;
    }

    public void setO3(BigDecimal o3) {
        this.o3 = o3;
    }

    public BigDecimal getCo() {
        return co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public BigDecimal getTsp() {
        return tsp;
    }

    public void setTsp(BigDecimal tsp) {
        this.tsp = tsp;
    }

    public BigDecimal getTp() {
        return tp;
    }

    public void setTp(BigDecimal tp) {
        this.tp = tp;
    }

    public BigDecimal getMt() {
        return mt;
    }

    public void setMt(BigDecimal mt) {
        this.mt = mt;
    }

    public BigDecimal getVo1() {
        return vo1;
    }

    public void setVo1(BigDecimal vo1) {
        this.vo1 = vo1;
    }

    public BigDecimal getVo2() {
        return vo2;
    }

    public void setVo2(BigDecimal vo2) {
        this.vo2 = vo2;
    }

    public BigDecimal getWindPress() {
        return windPress;
    }

    public void setWindPress(BigDecimal windPress) {
        this.windPress = windPress;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection == null ? null : windDirection.trim();
    }

    public BigDecimal getWindForce() {
        return windForce;
    }

    public void setWindForce(BigDecimal windForce) {
        this.windForce = windForce;
    }

    public BigDecimal getNoise() {
        return noise;
    }

    public void setNoise(BigDecimal noise) {
        this.noise = noise;
    }
}