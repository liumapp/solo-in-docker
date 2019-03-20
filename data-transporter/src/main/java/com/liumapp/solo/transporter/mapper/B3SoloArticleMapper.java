package com.liumapp.solo.transporter.mapper;

import com.liumapp.solo.transporter.domain.B3SoloArticle;
import com.liumapp.solo.transporter.domain.B3SoloArticleExample;
import com.liumapp.solo.transporter.domain.B3SoloArticleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B3SoloArticleMapper {
    long countByExample(B3SoloArticleExample example);

    int deleteByExample(B3SoloArticleExample example);

    int deleteByPrimaryKey(String oId);

    int insert(B3SoloArticleWithBLOBs record);

    int insertSelective(B3SoloArticleWithBLOBs record);

    List<B3SoloArticleWithBLOBs> selectByExampleWithBLOBs(B3SoloArticleExample example);

    List<B3SoloArticle> selectByExample(B3SoloArticleExample example);

    B3SoloArticleWithBLOBs selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") B3SoloArticleWithBLOBs record, @Param("example") B3SoloArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") B3SoloArticleWithBLOBs record, @Param("example") B3SoloArticleExample example);

    int updateByExample(@Param("record") B3SoloArticle record, @Param("example") B3SoloArticleExample example);

    int updateByPrimaryKeySelective(B3SoloArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(B3SoloArticleWithBLOBs record);

    int updateByPrimaryKey(B3SoloArticle record);
}