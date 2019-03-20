package com.liumapp.solo.transporter.mapper;

import com.liumapp.solo.transporter.domain.B3SoloArchivedateArticle;
import com.liumapp.solo.transporter.domain.B3SoloArchivedateArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B3SoloArchivedateArticleMapper {
    long countByExample(B3SoloArchivedateArticleExample example);

    int deleteByExample(B3SoloArchivedateArticleExample example);

    int deleteByPrimaryKey(String oId);

    int insert(B3SoloArchivedateArticle record);

    int insertSelective(B3SoloArchivedateArticle record);

    List<B3SoloArchivedateArticle> selectByExample(B3SoloArchivedateArticleExample example);

    B3SoloArchivedateArticle selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") B3SoloArchivedateArticle record, @Param("example") B3SoloArchivedateArticleExample example);

    int updateByExample(@Param("record") B3SoloArchivedateArticle record, @Param("example") B3SoloArchivedateArticleExample example);

    int updateByPrimaryKeySelective(B3SoloArchivedateArticle record);

    int updateByPrimaryKey(B3SoloArchivedateArticle record);
}