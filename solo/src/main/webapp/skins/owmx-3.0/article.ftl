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
        <meta name="keywords" content="${article.articleTags}" />
        <meta name="description" content="${article.articleAbstract?html}" />
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
        ${topBarReplacement}
        <div id="a">
            <#include "header.ftl">
            <div id="b">
                <article>
                    <h1>
                        ${article.articleTitle}
                        <#if article.hasUpdated>
                        <sup class="red">
                            ${updatedLabel}
                        </sup>
                        </#if>
                        <#if article.articlePutTop>
                        <sup class="red">
                            ${topArticleLabel}
                        </sup>
                        </#if>
                    </h1>
                    <section class="meta">
                        <p> 
                            ${author1Label}<a rel="nofollow" href="${servePath}/authors/${article.authorId}">${article.authorName}</a> |
                            <#if article.hasUpdated>
                            ${updateDateLabel}:${article.articleUpdateDate?string("yyyy-MM-dd HH:mm:ss")}
                            <#else>
                            ${createDateLabel}:${article.articleCreateDate?string("yyyy-MM-dd HH:mm:ss")}
                            </#if>
                            ${viewCount1Label}<a rel="nofollow" href="${servePath}${article.articlePermalink}">
                                <span class="left article-browserIcon" title="${viewLabel}"></span>
                                ${article.articleViewCount}
                            </a> | ${commentCount1Label}  
                            <a rel="nofollow" href="${servePath}${article.articlePermalink}#comments">
                                <span class="left articles-commentIcon" title="${commentLabel}"></span>
                                ${article.articleCommentCount}
                            </a>
                        </p>
                        <p>
                            ${tags1Label} 
                            <#list article.articleTags?split(",") as articleTag>
                            <span>
                                <a rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">${articleTag}</a><#if articleTag_has_next>,</#if>
                            </span>
                            </#list>
                        </p>
                    </section>
                    <div class="vditor-reset">
                        ${article.articleContent}
                        <#if "" != article.articleSign.signHTML?trim>
                        <div class="marginTop12">
                            ${article.articleSign.signHTML}
                        </div>
                        </#if>
                    </div>
                    <div class="marginBottom12">
                        <#if nextArticlePermalink??>
                        <div class="right">
                            <a href="${servePath}${nextArticlePermalink}">${nextArticle1Label}${nextArticleTitle}</a>
                        </div><div class="clear"></div>
                        </#if>
                        <#if previousArticlePermalink??>
                        <div class="right">
                            <a href="${servePath}${previousArticlePermalink}" >${previousArticle1Label}${previousArticleTitle}</a>
                        </div>
                        </#if>
                        <div class="clear"></div>
                    </div>
                    <div id="relevantArticles" class="article-relative"></div>
                    <div id="randomArticles"></div>
                    <div id="externalRelevantArticles"></div>
                    <@comments commentList=articleComments article=article></@comments>
                </article>
                <#include "side.ftl">
                <div class="clear"></div>
            </div>
            <#include "footer.ftl">
        </div>
        <@comment_script oId=article.oId commentable=article.commentable>
        page.tips.externalRelevantArticlesDisplayCount = "${externalRelevantArticlesDisplayCount}";
        <#if 0 != randomArticlesDisplayCount>
        page.loadRandomArticles();
        </#if>
        <#if 0 != relevantArticlesDisplayCount>
        page.loadRelevantArticles('${article.oId}', '<h4>${relevantArticles1Label}</h4>');
        </#if>
        <#if 0 != externalRelevantArticlesDisplayCount>
        page.loadExternalRelevantArticles("<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>");
        </#if>
        </@comment_script>    
    </body>
</html>
