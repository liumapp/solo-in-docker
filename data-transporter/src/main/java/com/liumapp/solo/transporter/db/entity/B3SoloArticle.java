package com.liumapp.solo.transporter.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.ant.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author jobob
 * @since 2019-03-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class B3SoloArticle extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("oId")
    private String oId;

    /**
     * 文章标题
     */
    @TableField("articleTitle")
    private String articleTitle;

    /**
     * 文章摘要 Markdown
     */
    @TableField("articleAbstract")
    private String articleAbstract;

    /**
     * 文章摘要纯文本
     */
    @TableField("articleAbstractText")
    private String articleAbstractText;

    /**
     * 文章标签，英文逗号分隔
     */
    @TableField("articleTags")
    private String articleTags;

    /**
     * 文章作者 id
     */
    @TableField("articleAuthorId")
    private String articleAuthorId;

    /**
     * 文章评论计数
     */
    @TableField("articleCommentCount")
    private Integer articleCommentCount;

    /**
     * 文章浏览计数
     */
    @TableField("articleViewCount")
    private Integer articleViewCount;

    /**
     * 文章正文内容
     */
    @TableField("articleContent")
    private String articleContent;

    /**
     * 文章访问路径
     */
    @TableField("articlePermalink")
    private String articlePermalink;

    /**
     * 文章是否置顶
     */
    @TableField("articlePutTop")
    private String articlePutTop;

    /**
     * 文章创建时间戳
     */
    @TableField("articleCreated")
    private Long articleCreated;

    /**
     * 文章更新时间戳
     */
    @TableField("articleUpdated")
    private Long articleUpdated;

    /**
     * 文章随机数，用于快速查询随机文章列表
     */
    @TableField("articleRandomDouble")
    private Double articleRandomDouble;

    /**
     * 文章关联的签名档 id
     */
    @TableField("articleSignId")
    private String articleSignId;

    /**
     * 文章是否可以评论
     */
    @TableField("articleCommentable")
    private String articleCommentable;

    /**
     * 文章浏览密码，留空为不设置访问密码
     */
    @TableField("articleViewPwd")
    private String articleViewPwd;

    /**
     * 文章首图地址
     */
    @TableField("articleImg1URL")
    private String articleImg1URL;

    /**
     * 文章状态，0：已发布，1：草稿
     */
    @TableField("articleStatus")
    private Integer articleStatus;


}
