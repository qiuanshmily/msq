package com.msq.provider.mapper;

import com.msq.common.dto.EssayUserDTO;
import com.msq.common.pojo.Essay;
import com.msq.common.pojo.EssayExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EssayMapper {
    int countByExample(EssayExample example);

    int deleteByExample(EssayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Essay record);

    int insertSelective(Essay record);

    List<Essay> selectByExample(EssayExample example);

    Essay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByExample(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKey(Essay record);

    List<EssayUserDTO> getEssay(EssayExample example);
}