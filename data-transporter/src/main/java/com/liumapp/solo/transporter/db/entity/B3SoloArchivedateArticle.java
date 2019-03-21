package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.liumapp.solo.transporter.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 存档-文章关联表
 * </p>
 *
 * @author liumapp
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="B3SoloArchivedateArticle对象", description="存档-文章关联表")
public class B3SoloArchivedateArticle extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("oId")
    private String oId;

    @ApiModelProperty(value = "存档日期 id")
    @TableField("archiveDate_oId")
    private String archivedateOid;

    @ApiModelProperty(value = "文章 id")
    @TableField("article_oId")
    private String articleOid;


}
