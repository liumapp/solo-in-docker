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
        <@head title="${linkLabel} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${linkLabel}"/>
        <meta name="description" content="${metaDescription},${linkLabel}"/>
        </@head>
    </head>
    <body>
        <#include "side.ftl">
        <main class="classify">
            <article>
                <header>
                    <h2>
                        <a rel="archive" href="${servePath}/links.html">
                            ${linkLabel}
                        </a>
                    </h2>
                </header>
                <#if 0 != links?size>
                <ul class="tags fn-clear">
                    <#list links as link>
                    <li>
                        <a rel="friend" href="${link.linkAddress}" class="tag"
                           title="${link.linkDescription}" target="_blank">
                            <img src="${faviconAPI}<#list link.linkAddress?split('/') as x><#if x_index=2>${x}<#break></#if></#list>" width="16" height="16" />
                            ${link.linkTitle}
                        </a>
                    </li>
                    </#list>
                </ul>
                </#if>
            </article>
            <#include "footer.ftl">
        </main>
    </body>
</html>
