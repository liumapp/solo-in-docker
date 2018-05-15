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
        <#include "header.ftl">
        <main class="main wrapper">
            <#if mostUsedCategories?size != 0>
            <div class="content page-archive">
                <section class="posts-collapse">
                    <div class="tag-cloud">
                        ${sumLabel} ${mostUsedCategories?size} ${categoryLabel}
                    </div>
                    <#list mostUsedCategories as category>
                        <article>
                            <header class="post-header">
                                <h1>
                                    <a class="post-title" href="${servePath}/category/${category.categoryURI}">
                                        ${category.categoryTitle} (${category.categoryTagCnt})</a>
                                    <small>${category.categoryDescription}</small>
                                </h1>
                            </header>
                        </article>
                    </#list>
                </section>
            </div>
            <br>
            <br>
            <br>
            </#if>
            <div class="content">
                <div class="tag-cloud">
                        ${sumLabel} ${tags?size} ${tagLabel}
                    <ul class="tag-cloud-tags fn-clear" id="tags">
                        <#list tags as tag>
                        <li>
                            <a rel="tag" data-count="${tag.tagPublishedRefCount}"
                               href="${servePath}/tags/${tag.tagTitle?url('UTF-8')}">
                                <span>${tag.tagTitle}</span>
                                (<b>${tag.tagPublishedRefCount}</b>)
                            </a>
                        </li>
                        </#list>
                    </ul>
                </div>
            </div>
            <#include "side.ftl">
        </main>
        <#include "footer.ftl">
        <script>
            Util.buildTags();
        </script>
    </body>
</html>
