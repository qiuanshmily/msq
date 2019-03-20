package com.msq.provider.mapper;

import com.msq.common.pojo.SeDataSource;
import com.msq.common.pojo.SeDataSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeDataSourceMapper {
    int countByExample(SeDataSourceExample example);

    int deleteByExample(SeDataSourceExample example);

    int deleteByPrimaryKey(SeDataSource seDataSource);

    int insert(SeDataSource record);

    int insertSelective(SeDataSource record);

    List<SeDataSource> selectByExample(SeDataSourceExample example);

    SeDataSource selectByPrimaryKey(Long dataSourceId);

    int updateByExampleSelective(@Param("record") SeDataSource record, @Param("example") SeDataSourceExample example);

    int updateByExample(@Param("record") SeDataSource record, @Param("example") SeDataSourceExample example);

    int updateByPrimaryKeySelective(SeDataSource seDataSource);

    int updateByPrimaryKey(SeDataSource record);
    List<String> checkNameCount(SeDataSource record);
}