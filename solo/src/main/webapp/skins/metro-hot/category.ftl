<#include "macro-head.ftl">
<#include "macro-side.ftl">
<!DOCTYPE html>
<html>
    <head>
        <@head title="${categoryLabel} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${categoryLabel}"/>
        <meta name="description" content="<#list mostUsedCategories as category>${category.categoryTitle}<#if category_has_next>,</#if></#list>"/>
        </@head>
    </head>
    <body>
        ${topBarReplacement}
        <div class="wrapper">
            <div id="header">
                <#include "header.ftl" />
                <div class="sub-nav fn-clear">
                    <h2>${categoryLabel}</h2>
                </div>
            </div>
            <div class="fn-clear">
                <div class="main">
                    <ul id="tags" class="archives fn-clear">
                        <#list mostUsedCategories as category>
                            <li>
                                <a href="${servePath}/category/${category.categoryURI}">
                                    <span>${category.categoryTitle}</span>
                                    (<b>${category.categoryTagCnt}</b>)</a>
                                </a>
                            </li>
                        </#list>
                    </ul>
                    <#include "copyright.ftl"/>
                </div>
                <@side isArticle=false />
            </div>
        </div>
        <span id="goTop" onclick="Util.goTop()" data-ico="&#xe042;" class="side-tile"></span>
        <#include "footer.ftl"/>
    </body>
</html>
