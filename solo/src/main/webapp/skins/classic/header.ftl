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
<div class="marginBottom12">
    <h1 class="title">
        <a href="${servePath}" id="logoTitle" >
            ${blogTitle}
        </a>
        <span class="sub-title">${blogSubtitle}</span>
    </h1>
</div>
<div class="left">
    <#list pageNavigations as page>
    <span>
        <a href="${page.pagePermalink}" target="${page.pageOpenTarget}"><#if page.pageIcon != ''><img class="page-icon" src="${page.pageIcon}"></#if>${page.pageTitle}</a>&nbsp;&nbsp;
    </span>
    </#list>
    <a href="${servePath}/tags.html">${allTagsLabel}</a>&nbsp;&nbsp;
    <a rel="alternate" href="${servePath}/rss.xml">RSS</a><a href="${servePath}/rss.xml"><img src="${staticServePath}/images/feed.png" alt="RSS"/></a>
    &nbsp;&nbsp;<a href="${servePath}/search?keyword=">Search</a>
</div>
<div class="right" id="statistic">
    <span>${viewCount1Label}
        <span class='error-msg'>
            ${statistic.statisticBlogViewCount}
        </span>
        &nbsp;&nbsp;
    </span>
    <span>
        ${articleCount1Label}
        <span class='error-msg'>
            ${statistic.statisticPublishedBlogArticleCount}
        </span>
        &nbsp;&nbsp;
    </span>
    <span>
        ${commentCount1Label}
        <span class='error-msg'>
            ${statistic.statisticPublishedBlogCommentCount}
        </span>
    </span>
</div>
<div class="clear"></div>