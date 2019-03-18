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
        ${topBarReplacement}
        <#include "header.ftl">
        <div class="main">
            <div class="wrapper">
                <#if 0 != links?size>
                <ul class="other-main links">
                    <#list links as link>
                    <li>
                        <a rel="friend" href="${link.linkAddress}" alt="${link.linkTitle}" target="_blank">
                            <img alt="${link.linkTitle}"
                                 src="${faviconAPI}<#list link.linkAddress?split('/') as x><#if x_index=2>${x}<#break></#if></#list>" width="16" height="16" /></a>
                        <a rel="friend" href="${link.linkAddress}" title="${link.linkDescription}" target="_blank">${link.linkTitle}
                        </a>
                    </li>
                    </#list>
                </ul>
                </#if>
            </div>
        </div>
        <#include "footer.ftl">
    </body>
</html>
