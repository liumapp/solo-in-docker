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
        <#include "header.ftl">
        <main class="main">
            <div class="wrapper">
            <div class="content">
                <#if 0 != recentComments?size>
                <ul class="comments" id="comments">
                    <#list recentComments as comment>
                    <li class="fn-clear">
                        <img class="avatar-48" title="${comment.commentName}" src="${comment.commentThumbnailURL}">
                        <div class="comment-body">
                            <div class="fn-clear comment-meta">
                                <span class="fn-left">
                                    <#if "http://" == comment.commentURL>
                                    <span>${comment.commentName}</span>
                                    <#else>
                                    <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
                                    </#if>
                                    <time>${comment.commentDate?string("yyyy-MM-dd HH:mm")}</time> 
                                </span>
                                <a class="fn-right" href="${servePath}${comment.commentSharpURL}">${viewLabel}»</a>
                            </div>
                            <div class="comment-content post-body vditor-reset">
                                ${comment.commentContent}
                            </div>
                        </div>
                    </li>
                    </#list>
                </ul>
                </#if>
            </div>
            <#include "side.ftl">
            </div>
        </main>
        <#include "footer.ftl">

        <script>
            var $commentContents = $(".comments .comment-content");
            for (var i = 0; i < $commentContents.length; i++) {
                var str = $commentContents[i].innerHTML;
                $commentContents[i].innerHTML = Util.replaceEmString(str);
            }
        </script>
    </body>
</html>
