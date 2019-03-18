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
<!DOCTYPE html>
<html>
    <head>
        <@head title="${allTagsLabel} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${allTagsLabel}"/>
        <meta name="description" content="<#list tags as tag>${tag.tagTitle}<#if tag_has_next>,</#if></#list>"/>
        </@head>
    </head>
    <body>
        <#include "side.ftl">
        <main class="classify">
            <#if 0 != mostUsedCategories?size>
                <article>
                    <header>
                        <h2>
                            <a rel="archive" href="${servePath}/tags.html">
                                ${categoryLabel}
                            </a>
                        </h2>
                    </header>
                    <ul class="tags fn-clear">
                        <#list mostUsedCategories as category>
                            <li>
                                <a class="tag" href="${servePath}/category/${category.categoryURI}">
                                    ${category.categoryTitle} (${category.categoryTagCnt})</a>
                            </li>
                        </#list>
                    </ul>
                </article>
            </#if>

            <article>
                <header>
                    <h2>
                        <a rel="archive" href="${servePath}/tags.html">
                            ${tagLabel}
                        </a>
                    </h2>
                </header>
                <ul class="tags fn-clear">
                    <#list tags as tag>
                    <li>
                        <a rel="tag" class="tag" data-count="${tag.tagPublishedRefCount}"
                           href="${servePath}/tags/${tag.tagTitle?url('UTF-8')}" title="${tag.tagTitle}">
                            <span>${tag.tagTitle}</span>
                            (<b>${tag.tagPublishedRefCount}</b>)
                        </a>
                    </li>
                    </#list>
                </ul>
            </article>
            <#include "footer.ftl">
        </main>
    </body>
</html>
