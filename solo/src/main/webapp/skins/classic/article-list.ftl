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
<div>
    <#list articles as article>
    <div class="article">
        <div class="article-header">
            <div class="article-date">
                <#if article.hasUpdated>
                ${article.articleUpdateDate?string("yyyy-MM-dd HH:mm:ss")}
                <#else>
                ${article.articleCreateDate?string("yyyy-MM-dd HH:mm:ss")}
                </#if>
            </div>
            <div class="article-title">
                <h2>
                    <a rel="bookmark" class="no-underline" href="${servePath}${article.articlePermalink}">
                        ${article.articleTitle}
                    </a>
                    <#if article.hasUpdated>
                    <sup class="red">
                        ${updatedLabel}
                    </sup>
                    </#if>
                    <#if article.articlePutTop>
                    <sup class="red">
                        ${topArticleLabel}
                    </sup>
                    </#if>
                </h2>
                <div class="article-tags">
                    ${tags1Label}
                    <#list article.articleTags?split(",") as articleTag>
                    <span>
                        <a rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">
                            ${articleTag}</a><#if articleTag_has_next>,</#if>
                    </span>
                    </#list>&nbsp;&nbsp;&nbsp;
                    <#-- 注释掉填充用户名部分
                    ${author1Label}<a rel="nofollow" href="${servePath}/authors/${article.authorId}">${article.authorName}</a>
                    -->
                </div>
            </div>
            <div class="clear"></div>
        </div>
        <div class="vditor-reset">
            <div class="article-abstract">
                ${article.articleAbstract}
            </div>
        </div>
        <div class="article-footer">
            <div class="right">
                <span class="article-create-date left">
                    &nbsp;${article.articleCreateDate?string("yyyy-MM-dd HH:mm:ss")}&nbsp;&nbsp
                </span>
                <a rel="nofollow" href="${servePath}${article.articlePermalink}#comments" class="left">
                    <span class="left commentIcon" title="${commentLabel}"></span>
                    ${article.articleCommentCount}
                </a>
                <span class="left">&nbsp;&nbsp;</span>
                <a rel="nofollow" href="${servePath}${article.articlePermalink}" class="left">
                    <span class="left browserIcon" title="${viewLabel}"></span>
                    ${article.articleViewCount}
                </a>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    </#list>
    <#if 0 != paginationPageCount>
    <div class="pagination">
        <#if 1 != paginationPageNums?first>
        <a href="${servePath}${path}">${firstPageLabel}</a>
        <a id="previousPage" href="${servePath}${path}?p=${paginationPreviousPageNum}">${previousPageLabel}</a>
        </#if>
        <#list paginationPageNums as paginationPageNum>
        <#if paginationPageNum == paginationCurrentPageNum>
        <a href="${servePath}${path}?p=${paginationPageNum}" class="selected">${paginationPageNum}</a>
        <#else>
        <a href="${servePath}${path}?p=${paginationPageNum}">${paginationPageNum}</a>
        </#if>
        </#list>
        <#if paginationPageNums?last != paginationPageCount>
        <a id="nextPage" href="${servePath}${path}?p=${paginationNextPageNum}">${nextPagePabel}</a>
        <a href="${servePath}${path}?p=${paginationPageCount}">${lastPageLabel}</a>
        </#if>
        &nbsp;&nbsp;${sumLabel} ${paginationPageCount} ${pageLabel}
    </div>
    </#if>
</div>