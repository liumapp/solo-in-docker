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
        <div id="a">
            <#include "header.ftl">
            <div id="b">
                <article>
                    <cite>${categoryLabel}</cite>
                    <blockquote>
                            ${category.categoryTitle}
                        (${category.categoryTagCnt}) ${category.categoryDescription}
                    </blockquote>
                    <#include "article-list.ftl">
                </article>
                <#include "side.ftl">
                <div class="clear"></div>
            </div>
            <#include "footer.ftl">
        </div>
    </body>
</html>
