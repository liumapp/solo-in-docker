package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.ant.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author jobob
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class B3SoloComment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("oId")
    private String oId;

    /**
     * 评论内容
     */
    @TableField("commentContent")
    private String commentContent;

    /**
     * 评论时间戳
     */
    @TableField("commentCreated")
    private Long commentCreated;

    /**
     * 评论人名称
     */
    @TableField("commentName")
    private String commentName;

    /**
     * 评论的文章/页面的 id
     */
    @TableField("commentOnId")
    private String commentOnId;

    /**
     * 评论的是文章还是页面，文章：article 页面：page
     */
    @TableField("commentOnType")
    private String commentOnType;

    /**
     * 评论访问路径，带 # 锚点
     */
    @TableField("commentSharpURL")
    private String commentSharpURL;

    /**
     * 评论人头像图片链接地址
     */
    @TableField("commentThumbnailURL")
    private String commentThumbnailURL;

    /**
     * 评论人链接地址
     */
    @TableField("commentURL")
    private String commentURL;

    /**
     * 评论回复时原始的评论 id，即父评论 id
     */
    @TableField("commentOriginalCommentId")
    private String commentOriginalCommentId;

    /**
     * 评论回复时原始的评论人名称，即父评论人名称
     */
    @TableField("commentOriginalCommentName")
    private String commentOriginalCommentName;


}
