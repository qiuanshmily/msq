package com.msq.provider.mapper;

import com.msq.common.pojo.SeSearchSql;
import com.msq.common.pojo.SeSearchSqlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeSearchSqlMapper {
    int countByExample(SeSearchSqlExample example);

    int deleteByExample(SeSearchSqlExample example);

    int deleteByPrimaryKey(SeSearchSql seSearchSql);

    int insert(SeSearchSql record);

    int insertSelective(SeSearchSql record);

    List<SeSearchSql> selectByExample(SeSearchSqlExample example);

    SeSearchSql selectByPrimaryKey(Long searchId);

    int updateByExampleSelective(@Param("record") SeSearchSql record, @Param("example") SeSearchSqlExample example);

    int updateByExample(@Param("record") SeSearchSql record, @Param("example") SeSearchSqlExample example);

    int updateByPrimaryKeySelective(SeSearchSql record);

    int updateByPrimaryKey(SeSearchSql record);
    List<String> checkSqlExist(SeSearchSql record);
}