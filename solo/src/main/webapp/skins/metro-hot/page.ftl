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
<#include "macro-side.ftl">
<#include "macro-comments.ftl">
<#include "../../common-template/macro-comment_script.ftl">
<!DOCTYPE html>
<html>
    <head>
        <@head title="${page.pageTitle} - ${blogTitle}">
        <meta name="keywords" content="${metaKeywords},${page.pageTitle}" />
        <meta name="description" content="${metaDescription}" />
        </@head>
    </head>
    <body>
        ${topBarReplacement}
        <div class="wrapper">
            <div id="header">
                <#include "header.ftl">
                <div class="article-header">
                    <h2>${blogSubtitle}</h2>
                    
                    <div class="article-info">
                        <a rel="nofollow" data-ico="&#xe14e;" href="${servePath}${page.pagePermalink}#comments">
                            ${page.pageCommentCount}
                        </a>
                       
                    </div>
                </div>
            </div>
            <div class="fn-clear">
                <div class="main">
                    <div class="vditor-reset">
                        ${page.pageContent}
                    </div>
                    <@comments commentList=pageComments article=page></@comments>
                    <#include "copyright.ftl"/>
                </div>
                <@side isArticle=true />
            </div>
        </div>
        <#include "footer.ftl">
        <@comment_script oId=page.oId commentable=page.commentable></@comment_script>
    </body>
</html>
