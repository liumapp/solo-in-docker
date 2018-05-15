<#include "macro-head.ftl">
<!DOCTYPE html>
<html>
    <head>
        <@head title="${category.categoryTitle} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${category.categoryTitle}"/>
        <meta name="description" content="<#list articles as article>${article.articleTitle}<#if article_has_next>,</#if></#list>"/>
        </@head>
    </head>
    <body>
        ${topBarReplacement}
        <#include "header.ftl">
        <div class="body">
            <div class="wrapper">
                <div class="main">
                    <h2>
                        ${categoryLabel}:
                        ${category.categoryTitle}
                        (${category.categoryTagCnt})<small> ${category.categoryDescription}</small>
                    </h2>
                    <#include "article-list.ftl">
                </div>
                <#include "side.ftl">
                <div class="clear"></div>
            </div>
        </div>
        <#include "footer.ftl">
    </body>
</html>
