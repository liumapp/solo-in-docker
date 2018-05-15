<#include "macro-head.ftl">
<!DOCTYPE html>
<html>
    <head>
        <@head title="${allTagsLabel} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${allTagsLabel}"/>
        <meta name="description" content="<#list tags as tag>${tag.tagTitle}<#if tag_has_next>,</#if></#list>"/>
        </@head>
    </head>
    <body>
        ${topBarReplacement}
        <#include "header.ftl">
        <div class="wrapper">
            <div class="container">
                <#if 0 != mostUsedCategories?size>
                    <h2>${categoryLabel}</h2>
                    <ul class="module fn-clear tags">
                        <#list mostUsedCategories as category>
                            <li>
                                <a href="${servePath}/category/${category.categoryURI}">
                                    <span>${category.categoryTitle}</span>
                                    (<b>${category.categoryTagCnt}</b>)
                                </a>
                            </li>
                        </#list>
                    </ul>
                </#if>

                <h2>${tagsLabel}</h2>
                <ul id="tags" class="tags module fn-clear">
                    <#list tags as tag>
                    <li>
                        <a rel="tag" data-count="${tag.tagPublishedRefCount}"
                           href="${servePath}/tags/${tag.tagTitle?url('UTF-8')}" title="${tag.tagTitle}">
                            <span>${tag.tagTitle}</span>
                            (<b>${tag.tagPublishedRefCount}</b>)
                        </a>
                    </li>
                    </#list>
                </ul>
            </div>
        </div>
        <#include "footer.ftl">
        <script type="text/javascript">
            Util.buildTags();
        </script>
    </body>
</html>
