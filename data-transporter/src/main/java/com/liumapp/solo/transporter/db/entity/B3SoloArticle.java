package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.ant.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author liumapp
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="B3SoloArticle对象", description="文章表")
public class B3SoloArticle extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("oId")
    private String oId;

    @ApiModelProperty(value = "文章标题")
    @TableField("articleTitle")
    private String articleTitle;

    @ApiModelProperty(value = "文章摘要 Markdown")
    @TableField("articleAbstract")
    private String articleAbstract;

    @ApiModelProperty(value = "文章摘要纯文本")
    @TableField("articleAbstractText")
    private String articleAbstractText;

    @ApiModelProperty(value = "文章标签，英文逗号分隔")
    @TableField("articleTags")
    private String articleTags;

    @ApiModelProperty(value = "文章作者 id")
    @TableField("articleAuthorId")
    private String articleAuthorId;

    @ApiModelProperty(value = "文章评论计数")
    @TableField("articleCommentCount")
    private Integer articleCommentCount;

    @ApiModelProperty(value = "文章浏览计数")
    @TableField("articleViewCount")
    private Integer articleViewCount;

    @ApiModelProperty(value = "文章正文内容")
    @TableField("articleContent")
    private String articleContent;

    @ApiModelProperty(value = "文章访问路径")
    @TableField("articlePermalink")
    private String articlePermalink;

    @ApiModelProperty(value = "文章是否置顶")
    @TableField("articlePutTop")
    private String articlePutTop;

    @ApiModelProperty(value = "文章创建时间戳")
    @TableField("articleCreated")
    private Long articleCreated;

    @ApiModelProperty(value = "文章更新时间戳")
    @TableField("articleUpdated")
    private Long articleUpdated;

    @ApiModelProperty(value = "文章随机数，用于快速查询随机文章列表")
    @TableField("articleRandomDouble")
    private Double articleRandomDouble;

    @ApiModelProperty(value = "文章关联的签名档 id")
    @TableField("articleSignId")
    private String articleSignId;

    @ApiModelProperty(value = "文章是否可以评论")
    @TableField("articleCommentable")
    private String articleCommentable;

    @ApiModelProperty(value = "文章浏览密码，留空为不设置访问密码")
    @TableField("articleViewPwd")
    private String articleViewPwd;

    @ApiModelProperty(value = "文章首图地址")
    @TableField("articleImg1URL")
    private String articleImg1URL;

    @ApiModelProperty(value = "文章状态，0：已发布，1：草稿")
    @TableField("articleStatus")
    private Integer articleStatus;


}
