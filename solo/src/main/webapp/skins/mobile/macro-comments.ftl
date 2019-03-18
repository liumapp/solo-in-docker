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
<#macro comments commentList article>
<!-- Let's rock the comments -->
<!-- You can start editing below here... but make a backup first!  -->
<div class="comment_wrapper" id="comments">
    <#if 0 lt commentList?size>
    <h3 onclick="bnc_showhide_coms_toggle();" id="com-head">
        ${commentList?size} ${responses}
    </h3>
    </#if>
    <ol class="commentlist" id="commentlist">
        <#list commentList as comment>
        <#include "common-comment.ftl"/>
        </#list>
    </ol>
    <#if article.commentable>
    <div id="textinputwrap" style="margin: 0 10px">
        <div id="refresher" style="display:none;">
            <img src="${staticServePath}/skins/${skinDirName}/images/good.png" alt="checkmark" />
            <h3>${commentSuccess}</h3>
            <a href="javascript:this.location.reload();">${refresh2CComment}</a>
        </div>
        <textarea id="comment" rows="3" placeholder="${postCommentsLabel}" tabindex="4"></textarea>
    </div>
    </#if><!--textinputwrap div-->
</div>
</#macro>