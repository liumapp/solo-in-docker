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
<@head title="${allTagsLabel} - ${blogTitle}">
    <meta name="keywords" content="${metaKeywords},${allTagsLabel}"/>
    <meta name="description" content="<#list tags as tag>${tag.tagTitle}<#if tag_has_next>,</#if></#list>"/>
</@head>
</head>
<body class="body--gray" class="fn__flex-1">
<#include "header.ftl">
<main id="pjax">
    <#if pjax><!---- pjax {#pjax} start ----></#if>
    <div class="wrapper--min wrapper">
        <div class="page__title">
            <span class="ft__red">#</span>
            ${sumLabel} ${tags?size} ${tagLabel}
        </div>

        <div class="page__content page__tags fn__clear">
         <#list tags as tag>
             <a rel="tag" data-count="${tag.tagPublishedRefCount}" class="tag tag--${tag_index % 10}"
                href="${servePath}/tags/${tag.tagTitle?url('UTF-8')}">
                 <span class="name">${tag.tagTitle}</span>
                 (<b>${tag.tagPublishedRefCount}</b>)
             </a>
         </#list>
        </div>
    </div>
    <#if pjax><!---- pjax {#pjax} end ----></#if>
</main>
<#include "footer.ftl">
</body>
</html>
