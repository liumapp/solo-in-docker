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
<#list articles as article>
<article>
    <header>
        <h2>
            <a rel="bookmark" href="${servePath}${article.articlePermalink}">
                ${article.articleTitle}
            </a>
            <#if article.articlePutTop>
            <sup>
                ${topArticleLabel}
            </sup>
            </#if>
            <#if article.hasUpdated>
            <sup>
                ${updatedLabel}
            </sup>
            </#if>
        </h2>

        <time><span class="icon-date"></span> ${article.articleCreateDate?string("yyyy-MM-dd")}</time>
    </header>
    <section class="abstract vditor-reset">
        ${article.articleAbstract}
    </section>
    <footer class="tags">
        <span class="icon-tag"></span>  &nbsp;
        <#list article.articleTags?split(",") as articleTag>
        <a class="tag" rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">
            ${articleTag}</a>
        </#list>

        <a rel="nofollow" href="${servePath}/authors/${article.authorId}">
            <img class="avatar" title="${article.authorName}" alt="${article.authorName}" src="${article.authorThumbnailURL}"/>
        </a>
    </footer>
</article>
</#list>

<#if 0 != paginationPageCount>
    <nav class="pagination">
        <#if 1 != paginationPageNums?first>
        <a href="${servePath}${path}?p=${paginationPreviousPageNum}" class="extend">${previousPageLabel}</a>
        <a class="page-num" href="${servePath}${path}">1</a> ...
        </#if>
        <#list paginationPageNums as paginationPageNum>
        <#if paginationPageNum == paginationCurrentPageNum>
        <span class="current page-num">${paginationPageNum}</span>
        <#else>
        <a class="page-num" href="${servePath}${path}?p=${paginationPageNum}">${paginationPageNum}</a>
        </#if>
        </#list>
        <#if paginationPageNums?last != paginationPageCount> ...
        <a href="${servePath}${path}?p=${paginationPageCount}" class="page-num">${paginationPageCount}</a>
        <a href="${servePath}${path}?p=${paginationNextPageNum}" class="extend">${nextPagePabel}</a>
        </#if>
    </nav>
    </#if>