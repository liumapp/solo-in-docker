package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.ant.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 链接表
 * </p>
 *
 * @author jobob
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class B3SoloLink extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("oId")
    private String oId;

    /**
     * 链接地址
     */
    @TableField("linkAddress")
    private String linkAddress;

    /**
     * 链接描述
     */
    @TableField("linkDescription")
    private String linkDescription;

    /**
     * 链接展现的排序
     */
    @TableField("linkOrder")
    private Integer linkOrder;

    /**
     * 链接标题
     */
    @TableField("linkTitle")
    private String linkTitle;


}
