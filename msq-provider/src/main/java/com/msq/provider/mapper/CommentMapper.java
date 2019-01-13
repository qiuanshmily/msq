package com.msq.provider.mapper;

import com.msq.common.dto.CommentUserDTO;
import com.msq.common.pojo.Comment;
import com.msq.common.pojo.CommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {
    /**
     * @param example
     * @return
     */
    int countByExample(CommentExample example);

    /**
     * @param example 
     * @return
     */
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    Comment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    List<CommentUserDTO> listCommentUser(Long essayId);
}