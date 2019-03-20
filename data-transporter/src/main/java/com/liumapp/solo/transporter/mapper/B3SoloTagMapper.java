package com.liumapp.solo.transporter.mapper;

import com.liumapp.solo.transporter.domain.B3SoloTag;
import com.liumapp.solo.transporter.domain.B3SoloTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface B3SoloTagMapper {
    long countByExample(B3SoloTagExample example);

    int deleteByExample(B3SoloTagExample example);

    int deleteByPrimaryKey(String oId);

    int insert(B3SoloTag record);

    int insertSelective(B3SoloTag record);

    List<B3SoloTag> selectByExample(B3SoloTagExample example);

    B3SoloTag selectByPrimaryKey(String oId);

    int updateByExampleSelective(@Param("record") B3SoloTag record, @Param("example") B3SoloTagExample example);

    int updateByExample(@Param("record") B3SoloTag record, @Param("example") B3SoloTagExample example);

    int updateByPrimaryKeySelective(B3SoloTag record);

    int updateByPrimaryKey(B3SoloTag record);
}