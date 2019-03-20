package com.msq.provider.mapper;

import com.msq.common.pojo.SeService;
import com.msq.common.pojo.SeServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeServiceMapper {
    int countByExample(SeServiceExample example);

    int deleteByExample(SeServiceExample example);

    int deleteByPrimaryKey(Long serviceId);

    int insert(SeService record);

    int insertSelective(SeService record);

    List<SeService> selectByExample(SeServiceExample example);

    SeService selectByPrimaryKey(Long serviceId);

    int updateByExampleSelective(@Param("record") SeService record, @Param("example") SeServiceExample example);

    int updateByExample(@Param("record") SeService record, @Param("example") SeServiceExample example);

    int updateByPrimaryKeySelective(SeService record);

    int updateByPrimaryKey(SeService record);

    int deleteByIdAndFlag(SeService seService);

    List<String> checkServiceIsExist(SeService seService);


}