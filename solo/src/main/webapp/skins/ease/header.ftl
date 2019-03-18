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
<div class="header">
    <div class="wrapper banner">
        <div class="left">
            <h1>
                <a class="title ft-gray" href="${servePath}">
                    ${blogTitle}
                </a>
            </h1>
            <span class="sub-title">${blogSubtitle}</span>
        </div>
        <#if "" != noticeBoard>
        <div class="notice">
            ${noticeBoard}
        </div>
        </#if>
        <div class="clear"></div>
    </div>
    <div class="nav">
        <div class="wrapper">
            <ul>
                <li>
                    <a rel="nofollow" href="${servePath}/">${indexLabel}</a>
                </li>  
                <#list pageNavigations as page>
                <li>
                    <a href="${page.pagePermalink}" target="${page.pageOpenTarget}"><#if page.pageIcon != ''><img class="page-icon" src="${page.pageIcon}"></#if>${page.pageTitle}</a>
                </li>
                </#list>  
                <li>
                    <a href="${servePath}/dynamic.html">${dynamicLabel}</a>
                </li>
                <li>
                    <a href="${servePath}/tags.html">${allTagsLabel}</a>  
                </li>
                <li>
                    <a href="${servePath}/archives.html">${archiveLabel}</a>
                </li>
                <li>
                    <a href="${servePath}/links.html">${linkLabel}</a>
                </li>
                <li>
                    <a rel="alternate" href="${servePath}/rss.xml">RSS<img src="${staticServePath}/images/feed.png" alt="RSS"/></a>
                </li>
            </ul>
            <form action="${servePath}/search">
                <input id="search" type="text" name="keyword" />
                <input type="submit" value="" class="none" />
            </form>
            <div class="clear"></div>
        </div>
    </div>
</div>