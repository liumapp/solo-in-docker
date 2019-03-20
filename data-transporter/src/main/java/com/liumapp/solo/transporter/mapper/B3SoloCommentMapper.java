package com.liumapp.solo.transporter.mapper;

import com.liumapp.solo.transporter.domain.B3SoloComment;
import com.liumapp.solo.transporter.domain.B3SoloCommentExample;
import com.liumapp.solo.transporter.domain.B3SoloCommentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B3SoloCommentMapper {
    long countByExample(B3SoloCommentExample example);

    int deleteByExample(B3SoloCommentExample example);

    int deleteByPrimaryKey(String oId);

    int insert(B3SoloCommentWithBLOBs record);

    int insertSelective(B3SoloCommentWithBLOBs record);

    List<B3SoloCommentWithBLOBs> selectByExampleWithBLOBs(B3SoloCommentExample example);

    List<B3SoloComment> selectByExample(B3SoloCommentExample example);

    B3SoloCommentWithBLOBs selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") B3SoloCommentWithBLOBs record, @Param("example") B3SoloCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") B3SoloCommentWithBLOBs record, @Param("example") B3SoloCommentExample example);

    int updateByExample(@Param("record") B3SoloComment record, @Param("example") B3SoloCommentExample example);

    int updateByPrimaryKeySelective(B3SoloCommentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(B3SoloCommentWithBLOBs record);

    int updateByPrimaryKey(B3SoloComment record);
}