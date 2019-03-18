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
        <@head title="${archiveLabel} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${archiveLabel}"/>
        <meta name="description" content="${metaDescription},${archiveLabel}"/>
        </@head>
    </head>
    <body>
        <#include "header.ftl">
        <main class="main">
            <div class="wrapper">
            <div class="content page-archive">
                <section class="posts-collapse">
                    <span class="archive-move-on"></span>
                    <span class="archive-page-counter">
                        ${ohLabel}..!  ${sumLabel} ${statistic.statisticPublishedBlogArticleCount} ${fightLabel}
                    </span>
                    <#if 0 != archiveDates?size>
                    <#list archiveDates as archiveDate>
                    <article>
                        <header class="post-header">
                            <h1>
                                <#if "en" == localeString?substring(0, 2)>
                                <a class="post-title" href="${servePath}/archives/${archiveDate.archiveDateYear}/${archiveDate.archiveDateMonth}">
                                    ${archiveDate.monthName} ${archiveDate.archiveDateYear}(${archiveDate.archiveDatePublishedArticleCount})
                                </a>
                                <#else>
                                <a class="post-title" href="${servePath}/archives/${archiveDate.archiveDateYear}/${archiveDate.archiveDateMonth}">
                                    ${archiveDate.archiveDateYear} ${yearLabel} ${archiveDate.archiveDateMonth} ${monthLabel}(${archiveDate.archiveDatePublishedArticleCount})
                                </a>
                                </#if>
                            </h1>
                        </header>
                    </article>
                    </#list>
                    </#if>
                </section>
            </div>
            <#include "side.ftl">
            </div>
        </main>
        <#include "footer.ftl">
    </body>
</html>
