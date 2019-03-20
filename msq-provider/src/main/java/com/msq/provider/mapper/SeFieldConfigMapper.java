package com.msq.provider.mapper;

import com.msq.common.pojo.SeFieldConfig;
import com.msq.common.pojo.SeFieldConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeFieldConfigMapper {
    int countByExample(SeFieldConfigExample example);

    int deleteByExample(SeFieldConfigExample example);

    int deleteByPrimaryKey(SeFieldConfig seFieldConfig);

    int insert(SeFieldConfig record);

    int insertSelective(SeFieldConfig record);

    List<SeFieldConfig> selectByExample(SeFieldConfigExample example);

    SeFieldConfig selectByPrimaryKey(Long fieldConfigId);

    int updateByExampleSelective(@Param("record") SeFieldConfig record, @Param("example") SeFieldConfigExample example);

    int updateByExample(@Param("record") SeFieldConfig record, @Param("example") SeFieldConfigExample example);

    int updateByPrimaryKeySelective(SeFieldConfig record);

    int updateByPrimaryKey(SeFieldConfig record);

    List<SeFieldConfig> selectFieldsByDataSourceId(Integer dataSourceId);
    List<String> checkFieldExist(SeFieldConfig record);
}