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
 * 评论表
 * </p>
 *
 * @author liumapp
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="B3SoloComment对象", description="评论表")
public class B3SoloComment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("oId")
    private String oId;

    @ApiModelProperty(value = "评论内容")
    @TableField("commentContent")
    private String commentContent;

    @ApiModelProperty(value = "评论时间戳")
    @TableField("commentCreated")
    private Long commentCreated;

    @ApiModelProperty(value = "评论人名称")
    @TableField("commentName")
    private String commentName;

    @ApiModelProperty(value = "评论的文章/页面的 id")
    @TableField("commentOnId")
    private String commentOnId;

    @ApiModelProperty(value = "评论的是文章还是页面，文章：article 页面：page")
    @TableField("commentOnType")
    private String commentOnType;

    @ApiModelProperty(value = "评论访问路径，带 # 锚点")
    @TableField("commentSharpURL")
    private String commentSharpURL;

    @ApiModelProperty(value = "评论人头像图片链接地址")
    @TableField("commentThumbnailURL")
    private String commentThumbnailURL;

    @ApiModelProperty(value = "评论人链接地址")
    @TableField("commentURL")
    private String commentURL;

    @ApiModelProperty(value = "评论回复时原始的评论 id，即父评论 id")
    @TableField("commentOriginalCommentId")
    private String commentOriginalCommentId;

    @ApiModelProperty(value = "评论回复时原始的评论人名称，即父评论人名称")
    @TableField("commentOriginalCommentName")
    private String commentOriginalCommentName;


}
