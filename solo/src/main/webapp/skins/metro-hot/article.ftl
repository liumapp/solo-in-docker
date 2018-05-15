<#include "macro-head.ftl">
<#include "macro-comments.ftl">
<#include "macro-side.ftl">
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
        <div class="wrapper">
            <div id="header">
                <#include "header.ftl">
                <div class="article-header">
                    <span class="article-date" data-ico="&#xe200;">
                        <#if article.hasUpdated>
                        ${article.articleUpdateDate?string("yy-MM-dd HH:mm")}
                        <#else>
                        ${article.articleCreateDate?string("yy-MM-dd HH:mm")}
                        </#if>
                    </span>

                    <h2>  
                        <#if article.hasUpdated>
                        <span>
                            [${updatedLabel}]
                        </span>
                        </#if>
                        <#if article.articlePutTop>
                        <span>
                            [${topArticleLabel}]
                        </span>
                        </#if>
                        ${article.articleTitle}
                    </h2>
                    <div data-ico="&#x003b;" title="${tagLabel}">
                        <#list article.articleTags?split(",") as articleTag>
                        <a rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">${articleTag}</a><#if articleTag_has_next>,</#if>
                        </#list>
                    </div>
                    <div class="article-info">
                        <a rel="nofollow" data-ico="&#xe14e;" href="${servePath}${article.articlePermalink}#comments">
                            ${article.articleCommentCount}
                        </a>
                        <a rel="nofollow" data-ico="&#xe185;" href="${servePath}${article.articlePermalink}">
                            ${article.articleViewCount}
                        </a>
                        <a rel="nofollow" data-ico="&#x0060;" href="${servePath}/authors/${article.authorId}">
                            ${article.authorName}
                        </a>
                    </div>
                </div>
            </div>
            <div class="fn-clear">
                <div class="main">
                    <div class="article-body">
                        ${article.articleContent}
                        <#if "" != article.articleSign.signHTML?trim>
                        ${article.articleSign.signHTML}
                        </#if>
                    </div>
                    <@comments commentList=articleComments article=article></@comments>
                    <#include "copyright.ftl"/>
                </div>
                <@side isArticle=true />
            </div>
        </div>
        <#include "footer.ftl">
        <@comment_script oId=article.oId>
        MetroHot.tips = {
            externalRelevantArticlesDisplayCount: "${externalRelevantArticlesDisplayCount}",
        blogHost: "${blogHost}"
        }
        <#if 0 != randomArticlesDisplayCount>
        MetroHot.loadRandomArticles();
        </#if>
        <#if 0 != relevantArticlesDisplayCount>
        MetroHot.loadRelevantArticles('${article.oId}', '<h4>${relevantArticles1Label}</h4>');
        </#if>
        <#if 0 != externalRelevantArticlesDisplayCount>
        MetroHot.loadExternalRelevantArticles("<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>");
        </#if>
        </@comment_script>   
    </body>
</html>
