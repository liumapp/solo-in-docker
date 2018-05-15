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
        <h3 id="category" class="nav-abs">
            ${categoryLabel}:
            ${category.categoryTitle}
            (${category.categoryTagCnt})<small> ${category.categoryDescription}</small>
        </h3>
        <#include "article-list.ftl">
        <#include "footer.ftl">
    </body>
</html>
