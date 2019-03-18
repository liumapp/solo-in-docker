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
        <#include "header.ftl">


        <div class="container">
            <div class="row">
                <div class="col-sm-2"></div>

                <div class="col-sm-8 site">
                    <#if 0 != links?size>
                    <div class="row">
                        <#list links as link>
                        <#if 0 == link_index % 3></div><div class="row"></#if>  
                        <div class="col-sm-4">
                            <a rel="friend" href="${link.linkAddress}" alt="${link.linkTitle}" target="_blank">
                                <img alt="${link.linkTitle}"
                                     src="${faviconAPI}<#list link.linkAddress?split('/') as x><#if x_index=2>${x}<#break></#if></#list>" width="16" height="16" /></a>
                            <a rel="friend" href="${link.linkAddress}" title="${link.linkDescription}" target="_blank">${link.linkTitle}</a>
                        </div>
                        </#list>
                    </div>
                    </#if>
                </div>

                <div class="col-sm-2"></div>
            </div>
        </div>

        <#include "footer.ftl">
    </body>
</html>
