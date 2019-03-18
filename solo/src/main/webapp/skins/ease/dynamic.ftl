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
        <@head title="${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${dynamicLabel}"/>
        <meta name="description" content="${metaDescription},${dynamicLabel}"/>
        </@head>
    </head>
    <body>
        ${topBarReplacement}
        <#include "header.ftl">
        <div class="main">
            <div class="wrapper dynamic">
                <div class="other-main">
                    <#if 0 != recentComments?size>
                    <div class="module side-comments">
                        <h3 class="ft-gray">${recentCommentsLabel}</h3>
                        <ul>
                            <#list recentComments as comment>
                            <li>
                                <img class='comment-header'
                                     alt='${comment.commentName}'
                                     src='${comment.commentThumbnailURL}'/>
                                <div class='comment-panel'>
                                    <span class="left">
                                        <#if "http://" == comment.commentURL>
                                        ${comment.commentName}
                                        <#else>
                                        <a target="_blank" href="${comment.commentURL}">${comment.commentName}</a>
                                        </#if>
                                    </span>
                                    <div class="right ft-gray">
                                        ${comment.commentDate?string("yyyy-MM-dd HH:mm:ss")}
                                        <a rel="nofollow" href="${servePath}${comment.commentSharpURL}">${viewLabel}</a>
                                    </div>
                                    <span class="clear"></span>
                                    <div class="vditor-reset">
                                        ${comment.commentContent}
                                    </div>
                                </div>
                                <div class='clear'></div>
                            </li>
                            </#list>
                        </ul>
                    </div>
                    </#if>
                    <#if 0 != mostUsedTags?size>
                    <div class="module side-tags">
                        <h3 class="ft-gray">${tagsLabel}</h3>
                        <ul>
                            <#list mostUsedTags as tag>
                            <li>
                                <a rel="tag" href="${servePath}/tags/${tag.tagTitle?url('UTF-8')}" 
                                   title="${tag.tagTitle}(${tag.tagPublishedRefCount})">
                                    <span>${tag.tagTitle}</span>
                                </a>
                            </li>
                            </#list>
                        </ul>
                        <div class="clear"></div>
                    </div>
                    </#if>

                    <#if 0 != mostUsedCategories?size>
                        <div class="module side-categories">
                            <h3 class="ft-gray">${categoryLabel}</h3>
                            <ul>
                                <#list mostUsedCategories as category>
                                    <li>
                                        <a href="${servePath}/category/${category.categoryURI}"
                                        title="${category.categoryTitle} (${category.categoryTagCnt})">
                                            ${category.categoryTitle}</a>
                                    </li>
                                </#list>
                            </ul>
                            <div class="clear"></div>
                        </div>
                    </#if>

                    <div class="clear"></div>
                    <#if 0 != mostCommentArticles?size>
                    <div class="module side-most-comment">
                        <h3 class="ft-gray">${mostCommentArticlesLabel}</h3>
                        <ul>
                            <#list mostCommentArticles as article>
                            <li>
                                <a rel="nofollow" class="left" title="${article.articleTitle}" 
                                   href="${servePath}${article.articlePermalink}">
                                    ${article.articleTitle}
                                </a>
                                <a rel="nofollow" class="ft-gray right" href="${servePath}${article.articlePermalink}#comments">
                                    ${article.articleCommentCount}&nbsp;&nbsp;${commentLabel}
                                </a>
                                <span class="clear"></span>
                            </li>
                            </#list>
                        </ul>
                    </div>
                    </#if>
                    <#if 0 != mostViewCountArticles?size>
                    <div class="module side-most-view">
                        <h3 class="ft-gray">${mostViewCountArticlesLabel}</h3>
                        <ul>
                            <#list mostViewCountArticles as article>
                            <li>
                                <a rel="nofollow" class="left" title="${article.articleTitle}" href="${servePath}${article.articlePermalink}">
                                    ${article.articleTitle}
                                </a>
                                <a rel="nofollow" class="ft-gray right" href="${servePath}${article.articlePermalink}">
                                    ${article.articleViewCount}&nbsp;&nbsp;${viewLabel}
                                </a>
                                <span class="clear"></span>
                            </li>
                            </#list>
                        </ul>
                    </div>
                    </#if>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
        <#include "footer.ftl">
    </body>
</html>
