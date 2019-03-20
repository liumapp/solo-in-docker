package com.liumapp.solo.transporter.mapper;

import com.liumapp.solo.transporter.domain.B3SoloTagArticle;
import com.liumapp.solo.transporter.domain.B3SoloTagArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B3SoloTagArticleMapper {
    long countByExample(B3SoloTagArticleExample example);

    int deleteByExample(B3SoloTagArticleExample example);

    int deleteByPrimaryKey(String oId);

    int insert(B3SoloTagArticle record);

    int insertSelective(B3SoloTagArticle record);

    List<B3SoloTagArticle> selectByExample(B3SoloTagArticleExample example);

    B3SoloTagArticle selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") B3SoloTagArticle record, @Param("example") B3SoloTagArticleExample example);

    int updateByExample(@Param("record") B3SoloTagArticle record, @Param("example") B3SoloTagArticleExample example);

    int updateByPrimaryKeySelective(B3SoloTagArticle record);

    int updateByPrimaryKey(B3SoloTagArticle record);
}