<#--

    Solo - A small and beautiful blogging system written in Java.
    Copyright (c) 2010-2019, b3log.org & hacpai.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

-->
<#include "macro-head.ftl">
<#include "macro-comments.ftl">
<#include "../../common-template/macro-comment_script.ftl">
<!DOCTYPE html>
<html>
<head>
<@head title="${article.articleTitle} - ${blogTitle}">
    <meta name="keywords" content="${article.articleTags}"/>
    <meta name="description" content="${article.articleAbstract?html}"/>
</@head>
<#if previousArticlePermalink??>
    <link rel="prev" title="${previousArticleTitle}" href="${servePath}${previousArticlePermalink}">
</#if>
<#if nextArticlePermalink??>
    <link rel="next" title="${nextArticleTitle}" href="${servePath}${nextArticlePermalink}">
</#if>
    <!-- Open Graph -->
    <meta property="og:locale" content="zh_CN"/>
    <meta property="og:type" content="article"/>
    <meta property="og:title" content="${article.articleTitle}"/>
    <meta property="og:description" content="${article.articleAbstract?html}"/>
    <meta property="og:image" content="${article.authorThumbnailURL}"/>
    <meta property="og:url" content="${servePath}${article.articlePermalink}"/>
    <meta property="og:site_name" content="Solo"/>
    <!-- Twitter Card -->
    <meta name="twitter:card" content="summary"/>
    <meta name="twitter:description" content="${article.articleAbstract?html}"/>
    <meta name="twitter:title" content="${article.articleTitle}"/>
    <meta name="twitter:image" content="${article.authorThumbnailURL}"/>
    <meta name="twitter:url" content="${servePath}${article.articlePermalink}"/>
    <meta name="twitter:site" content="@DL88250"/>
    <meta name="twitter:creator" content="@DL88250"/>
</head>
<body>
<#include "header.ftl">
<div id="pjax">
    <#if pjax><!---- pjax {#pjax} start ----></#if>
    <div class="main post__main">
        <#if noticeBoard??>
        <div class="board">
            ${noticeBoard}
        </div>
        </#if>
        <div class="wrapper content">
            <article class="post">
                <header>
                    <h1 class="post__title">
                    ${article.articleTitle}
                <#if article.articlePutTop>
                    <sup>
                        ${topArticleLabel}
                    </sup>
                </#if>
                <#if article.hasUpdated>
                    <sup>
                        ${updatedLabel}
                    </sup>
                </#if>
                    </h1>
                </header>
                <section class="vditor-reset">
                ${article.articleContent}
            <#if "" != article.articleSign.signHTML?trim>
                <div>
                    ${article.articleSign.signHTML}
                </div>
            </#if>
                </section>
                <footer data-oid="${article.oId}"
                        class="post__tags"
                        data-tag="<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>">
            <#list article.articleTags?split(",") as articleTag>
                <a class="tag" rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">
                    ${articleTag}</a>
            </#list>
                </footer>
                <div class="post__share fn-clear">
                    <time class="ft-gray">
                    ${article.articleCreateDate?string("yyyy-MM-dd")} •
                    </time>
                    <a class="post__view" href="${servePath}${article.articlePermalink}">
                    ${article.articleViewCount} ${viewLabel}</a>
                    <div class="fn-right">
                    <span class="pipe-tooltipped pipe-tooltipped--n post__share-icon ft-green"
                          onclick="$('#comment').focus()"
                          aria-label="${commentLabel}">
                        <svg>
                            <use xlink:href="#icon-comment"></use>
                        </svg>
                    ${article.articleCommentCount}  &nbsp; &nbsp;
                    </span>

                        <span id="articleShare">
                        <span class="post__share-icon" data-type="wechat">
                            <svg><use xlink:href="#icon-wechat"></use></svg>
                        </span> &nbsp; &nbsp;
                        <span class="post__share-icon" data-type="weibo">
                            <svg><use xlink:href="#icon-weibo"></use></svg>
                        </span> &nbsp; &nbsp;
                        <span class="post__share-icon" data-type="twitter">
                            <svg><use xlink:href="#icon-twitter"></use></svg>
                        </span> &nbsp; &nbsp;
                        <span class="post__share-icon" data-type="qqz">
                            <svg><use xlink:href="#icon-qqz"></use></svg>
                        </span>
                        <span class="article__code"
                              data-title="${article.articleTitle}"
                              data-blogtitle="${blogTitle}"
                              data-url="${servePath}${article.articlePermalink}"
                              data-avatar="${article.authorThumbnailURL}"></span>
                    </span>
                    </div>
                </div>
            </article>
        </div>
        <div class="article__bottom">
            <div class="wrapper">
                <div class="fn-flex footer__tag">
                    <div class="fn-flex-1" id="externalRelevantArticles"></div>
                    <div class="fn-flex-1" id="relevantArticles"></div>
                    <div class="fn-flex-1" id="randomArticles"></div>
                </div>
            <@comments commentList=articleComments article=article></@comments>
            </div>
        </div>

        <div class="article__toolbar">
            <div class="wrapper">
                <a class="post__view" href="${servePath}${article.articlePermalink}">
                ${article.articleViewCount} ${viewLabel}
                </a>
                <div class="fn-right">
                <span class="pipe-tooltipped pipe-tooltipped--n post__share-icon ft-green"
                      onclick="$('#comment').focus()"
                      aria-label="${commentLabel}">
                    <svg>
                        <use xlink:href="#icon-comment"></use>
                    </svg>
                ${article.articleCommentCount}  &nbsp; &nbsp;
                </span>
                    <span id="articleBottomShare">
                    <span class="post__share-icon" data-type="wechat">
                        <svg><use xlink:href="#icon-wechat"></use></svg>
                    </span> &nbsp; &nbsp;
                    <span class="post__share-icon" data-type="weibo">
                        <svg><use xlink:href="#icon-weibo"></use></svg>
                    </span> &nbsp; &nbsp;
                    <span class="post__share-icon" data-type="twitter">
                        <svg><use xlink:href="#icon-twitter"></use></svg>
                    </span> &nbsp; &nbsp;
                    <span class="post__share-icon" data-type="qqz">
                        <svg><use xlink:href="#icon-qqz"></use></svg>
                    </span>
                    <span class="article__code"
                          data-title="${article.articleTitle}"
                          data-blogtitle="${blogTitle}"
                          data-url="${servePath}${article.articlePermalink}"
                          data-avatar="${article.authorThumbnailURL}"></span>
                </span>

                <#if nextArticlePermalink??>
                    <a href="${servePath}${nextArticlePermalink}" rel="next" class="article__next">
                        <span class="ft-12 ft-gray">${nextArticleLabel}</span> <br>
                        ${nextArticleTitle}
                    </a>
                </#if>
                </div>
            </div>
        </div>

        <div class="post__side">
        <span class="pipe-tooltipped pipe-tooltipped--e post__share-icon ft-green"
              onclick="$('#comment').focus()"
              aria-label="${commentLabel}">
            <span class="ft-gray">${article.articleCommentCount}</span>
            <svg>
                <use xlink:href="#icon-comment"></use>
            </svg>
        </span>
            <div id="articleSideShare">
            <span class="post__share-icon" data-type="wechat">
                <svg><use xlink:href="#icon-wechat"></use></svg>
            </span> &nbsp; &nbsp;
                <span class="post__share-icon" data-type="weibo">
                <svg><use xlink:href="#icon-weibo"></use></svg>
            </span> &nbsp; &nbsp;
                <span class="post__share-icon" data-type="twitter">
                <svg><use xlink:href="#icon-twitter"></use></svg>
            </span> &nbsp; &nbsp;
                <span class="post__share-icon" data-type="qqz">
                <svg><use xlink:href="#icon-qqz"></use></svg>
            </span>
                <span class="article__code"
                      data-title="${article.articleTitle}"
                      data-blogtitle="${blogTitle}"
                      data-url="${servePath}${article.articlePermalink}"
                      data-avatar="${article.authorThumbnailURL}"></span>
            </div>
        </div>
        <div class="main">
        <#include "bottom.ftl">
        </div>
    </div>
    <#if pjax><!---- pjax {#pjax} end ----></#if>
</div>
<#include "footer.ftl">
<script type="text/javascript"
        src="${staticServePath}/skins/${skinDirName}/js/jquery.qrcode${miniPostfix}.js"></script>
<#if pjax><!---- pjax {#pjax} start ----></#if>
<@comment_script oId=article.oId commentable=article.commentable>
    Skin.initArticle()
    Skin.initComment = function (articleOId, articleTags) {
        page.tips.externalRelevantArticlesDisplayCount = "${externalRelevantArticlesDisplayCount}";
    <#if 0 != randomArticlesDisplayCount>
        page.loadRandomArticles("<div class='module__title'><span>${randomArticlesLabel}</span></div>");
    </#if>
    <#if 0 != externalRelevantArticlesDisplayCount>
        page.loadExternalRelevantArticles(articleTags, "<div class='module__title'><span>${externalRelevantArticlesLabel}</span></div>");
    </#if>
    <#if 0 != relevantArticlesDisplayCount>
        page.loadRelevantArticles(articleOId, '<div class="module__title"><span>${relevantArticlesLabel}</span></div>');
    </#if>
    }
    Skin.initComment('${article.oId}', "<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>")
</@comment_script>
<#if pjax><!---- pjax {#pjax} end ----></#if>
${plugins}
</body>
</html>
