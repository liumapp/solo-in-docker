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
<#if "" != noticeBoard>
<div class="item" style="margin-top: -35px;">
    <h4>${noticeBoardLabel}</h4>
    <div class="marginLeft12 marginTop12">
        ${noticeBoard}
    </div>
</div>
</#if>
<#if 0 != recentComments?size || 0 != mostCommentArticles?size || 0 != mostViewCountArticles?size>
<div class="item">
    <dl>
        <#if 0 != mostCommentArticles?size>
        <dd>
            <h4>${mostCommentArticlesLabel}</h4>
            <ul>
                <#list mostCommentArticles as article>
                <li>
                    <a rel="nofollow" title="${article.articleTitle}" href="${servePath}${article.articlePermalink}">
                        <sup>[${article.articleCommentCount}]</sup>
                        ${article.articleTitle}
                    </a>
                </li>
                </#list>
            </ul>
        </dd>
        </#if>
        <#if 0 != recentComments?size>
        <dd>
            <h4>${recentCommentsLabel}</h4>
            <ul id="naviComments">
                <#list recentComments as comment>
                <li>
                    <a class="author" title="${comment.commentName}" target="_blank" href="${comment.commentURL}">
                        ${comment.commentName}
                    </a>:
                    <a rel="nofollow" class='side-comment' href="${servePath}${comment.commentSharpURL}">
                        ${comment.commentContent}
                    </a>
                </li>
                </#list>
            </ul>
        </dd>
        </#if>
        <#if 0 != mostViewCountArticles?size>
        <dd>
            <h4>${mostViewCountArticlesLabel}</h4>
            <ul>
                <#list mostViewCountArticles as article>
                <li>
                    <a rel="nofollow" title="${article.articleTitle}"
                       href="${servePath}${article.articlePermalink}">
                        <sup>[${article.articleViewCount}]</sup>
                        ${article.articleTitle}
                    </a>
                </li>
                </#list>
            </ul>
        </dd>
        </#if>
    </dl>
</div>
</#if>

<#if 0 != mostUsedCategories?size || 0 != mostUsedTags?size>
    <div class="item">
        <dl>
            <#if 0 != mostUsedCategories?size>
            <dd>
                <h4>${categoryLabel}</h4>
                <ul>
                    <#list mostUsedCategories as category>
                        <li>
                            <a href="${servePath}/category/${category.categoryURI}">
                                ${category.categoryTitle} (${category.categoryTagCnt})</a>
                        </li>
                    </#list>
                </ul>
            </dd>
            </#if>
            <#if 0 != mostUsedTags?size>
                <dd>
                    <h4>${tagsLabel}</h4>
                    <ul>
                        <#list mostUsedTags as tag>
                            <li>
                                <a rel="tag" title="${tag.tagTitle}(${tag.tagPublishedRefCount})" href="${servePath}/tags/${tag.tagTitle?url('UTF-8')}">
                                    ${tag.tagTitle} (${tag.tagPublishedRefCount})</a>
                            </li>
                        </#list>
                    </ul>
                </dd>
            </#if>
        </dl>
    </div>
</#if>

<#if 0 != links?size>
<div class="item">
    <dl>
        <dd>
            <h4>${linkLabel}</h4>
            <ul class="navi-tags">
                <#list links as link>
                <li>
                    <a rel="friend" href="${link.linkAddress}" title="${link.linkTitle}" target="_blank">
                        ${link.linkTitle}</a>
                     <img onclick="window.location='${link.linkAddress}'"
                         alt="${link.linkTitle}" 
                         src="${faviconAPI}<#list link.linkAddress?split('/') as x><#if x_index=2>${x}<#break></#if></#list>" width="16" height="16" />
                </li>
                </#list>
            </ul>
        </dd>
    </dl>
</div>
</#if>
<#if 0 != archiveDates?size>
<div class="item">
    <dl>
        <dd>
            <h4>${archiveLabel}</h4>
            <ul>
                <#list archiveDates as archiveDate>
                <#if archiveDate_index < 10>
                <li>
                    <#if "en" == localeString?substring(0, 2)>
                    <a href="${servePath}/archives/${archiveDate.archiveDateYear}/${archiveDate.archiveDateMonth}"
                       title="${archiveDate.monthName} ${archiveDate.archiveDateYear}(${archiveDate.archiveDatePublishedArticleCount})">
                        ${archiveDate.monthName} ${archiveDate.archiveDateYear} (${archiveDate.archiveDatePublishedArticleCount})</a>
                    <#else>
                    <a href="${servePath}/archives/${archiveDate.archiveDateYear}/${archiveDate.archiveDateMonth}"
                       title="${archiveDate.archiveDateYear} ${yearLabel} ${archiveDate.archiveDateMonth} ${monthLabel}(${archiveDate.archiveDatePublishedArticleCount})">
                        ${archiveDate.archiveDateYear} ${yearLabel} ${archiveDate.archiveDateMonth} ${monthLabel} (${archiveDate.archiveDatePublishedArticleCount})</a>
                    </#if>
                </li>
                </#if>
                </#list>
            </ul>
        </dd>
    </dl>
</div>
</#if>