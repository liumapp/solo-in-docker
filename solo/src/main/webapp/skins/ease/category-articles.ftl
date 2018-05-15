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
        <div class="main">
            <div class="wrapper">
                <h2>
                        ${categoryLabel}
                        ${category.categoryTitle}
                        (${category.categoryTagCnt})
                </h2>
                ${category.categoryDescription}
                <#include "article-list.ftl">
            </div>
        </div>
        <#include "footer.ftl">
    </body>
</html>
