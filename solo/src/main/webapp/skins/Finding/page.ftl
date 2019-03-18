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
    <body class="nav-closed">
        <div class="nav">
            <#include "side.ftl">
        </div>
        <div class="site-wrapper">
            <#include "header.ftl">
            <main>
                <article class="post">
                    <section class="post-content vditor-reset">
                        ${page.pageContent}
                    </section>
                    <footer>
                        <div class="share fn-right">
                            <span class="icon icon-wechat"
                                  data-type="wechat"
                                  data-title="${page.pageTitle}"
                                  data-blogtitle="${blogTitle}"
                                  data-url="${servePath}${page.pagePermalink}"
                                  data-avatar="${adminUser.userAvatar}"></span>
                            <span class="icon icon-weibo" data-type="weibo"></span>
                            <span class="icon icon-twitter" data-type="twitter"></span>
                            <span class="icon icon-qqz" data-type="qqz"></span>
                        </div>
                    </footer>
                </article>
                <@comments commentList=pageComments article=page></@comments>
            </main>

            <#include "footer.ftl">

            <@comment_script oId=page.oId commentable=page.commentable></@comment_script>
        </div>
    </body>
</html>
