<#include "macro-head.ftl">
<#include "macro-comments.ftl">
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
        <#include "header.ftl">

        <div class="container">
            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8 site article-list">
                    <div class="article">
                        <div class="row article">
                            <h2 class="row article-title">
                                <a rel="bookmark" href="${servePath}${article.articlePermalink}">
                                    ${article.articleTitle}
                                </a>
                            </h2>

                            <div class="row article-tags">
                                <#list article.articleTags?split(",") as articleTag>
                                <a rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">
                                    ${articleTag}</a><#if articleTag_has_next>, </#if>
                                </#list>
                            </div>

                            <div class="row article-date">
                                <#setting locale="en_US">
                                ${article.articleCreateDate?string("MMMM d, yyyy")}
                                <#setting locale=localeString>
                            </div>

                            <div class="row article-content code-highlight">
                                <div class="col-sm-12" id="abstract${article.oId}">
                                    ${article.articleContent}
                                    <#if "" != article.articleSign.signHTML?trim>
                                    <p>
                                        ${article.articleSign.signHTML}
                                    </p>
                                    </#if>
                                </div>
                            </div>
                        </div>
                        <@comments commentList=articleComments article=article></@comments>
                    </div>
                    
                        <div id="externalRelevantArticles"></div>
                    <div class="col-sm-2"></div>
                </div>
            </div>  
        </div>

        <#include "footer.ftl">
        <@comment_script oId=article.oId>
        page.tips.externalRelevantArticlesDisplayCount = "${externalRelevantArticlesDisplayCount}";
        <#if 0 != externalRelevantArticlesDisplayCount>
        page.loadExternalRelevantArticles("<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>");
        </#if>
        </@comment_script>    
    </body>
</html>
