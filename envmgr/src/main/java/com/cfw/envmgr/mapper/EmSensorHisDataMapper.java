package com.cfw.envmgr.mapper;

import com.pojo.EmSensorHisData;
import com.pojo.EmSensorHisDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmSensorHisDataMapper {
    int countByExample(EmSensorHisDataExample example);

    int deleteByExample(EmSensorHisDataExample example);

    int deleteByPrimaryKey(Long dataId);

    int insert(EmSensorHisData record);

    int insertSelective(EmSensorHisData record);

    List<EmSensorHisData> selectByExample(EmSensorHisDataExample example);

    EmSensorHisData selectByPrimaryKey(Long dataId);

    int updateByExampleSelective(@Param("record") EmSensorHisData record, @Param("example") EmSensorHisDataExample example);

    int updateByExample(@Param("record") EmSensorHisData record, @Param("example") EmSensorHisDataExample example);

    int updateByPrimaryKeySelective(EmSensorHisData record);

    int updateByPrimaryKey(EmSensorHisData record);
}