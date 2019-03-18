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
        <@head title="${categoryLabel} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${categoryLabel}"/>
        <meta name="description" content="<#list mostUsedCategories as category>${category.categoryTitle}<#if category_has_next>,</#if></#list>"/>
        </@head>
    </head>
    <body class="nav-closed">
        <div class="nav">
            <#include "side.ftl">
        </div>
        <div class="site-wrapper">
            <#include "header.ftl">
            <main id="content">
                <ul id="tags" class="fn-clear fn-wrap">
                    <#list mostUsedCategories as category>
                    <li>
                        <a href="${servePath}/category/${category.categoryURI}"
                           title="${category.categoryTitle} (${category.categoryTagCnt})">
                            ${category.categoryTitle} (<b>${category.categoryTagCnt}</b>)
                        </a>
                    </li>
                    </#list>
                </ul>
            </main>
            <#include "footer.ftl">
        </div>
        <script type="text/javascript">
            Util.buildTags();
        </script>
    </body>
</body>
</html>
