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
    <meta name="keywords" content="${metaKeywords},${page.pageTitle}"/>
    <meta name="description" content="${metaDescription}"/>
</@head>
</head>
<body>
<#include "header.ftl">
<main id="pjax" class="fn__flex-1">
    <#if pjax><!---- pjax {#pjax} start ----></#if>
    <div class="post wrapper wrapper--miner">
            <div class="vditor-reset">
            ${page.pageContent}
            </div>
    </div>
    <div class="body--gray post__gray">
        <div class="wrapper comment">
            <@comments commentList=pageComments article=page></@comments>
        </div>
        <div class="page__bottom"></div>
    </div>
    <div class="post__fix">
        <div class="wrapper">
            <span class="post__share">
                Share
                <span class="tag tag--4" data-type="weibo">WeiBo</span>
                <span class="tag tag--5" data-type="twitter">Twitter</span>
                <span class="tag tag--6" data-type="qqz">QZone</span>
                <span class="post__code tag tag--7 mobile__none"
                      data-type="wechat"
                      data-title="${page.pageTitle}"
                      data-blogtitle="${blogTitle}"
                      data-url="${servePath}${page.pagePermalink}"
                      data-avatar="${adminUser.userAvatar}">WeChat</span>
            </span>
        </div>
    </div>
    <#if pjax><!---- pjax {#pjax} end ----></#if>
</main>
<#include "footer.ftl">
<#if pjax><!---- pjax {#pjax} start ----></#if>
<@comment_script oId=page.oId commentable=page.commentable>
    Skin.initArticle()
</@comment_script>
<#if pjax><!---- pjax {#pjax} end ----></#if>
</body>
</html>
