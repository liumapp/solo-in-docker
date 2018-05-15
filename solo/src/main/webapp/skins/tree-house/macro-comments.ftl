<#macro comments commentList article>
<div class="comments-header"></div>
<div class="comments marginTop12" id="comments">
    <#list commentList as comment>
    <#include "common-comment.ftl"/>
    </#list>
</div>
<#if article.commentable>
<div class="comments">
    <div class="comment-top"></div>
    <div class="comment-body">
        <div class="comment-title">
            <a>${postCommentsLabel}</a>
        </div>
        <table id="commentForm" class="form">
            <tbody>
                <#if !isLoggedIn>
                <tr>
                    <th>
                        ${commentName1Label}
                    </th>
                    <td>
                        <input type="text" class="normalInput" id="commentName"/>
                    </td>
                </tr>
                <tr>
                    <th>
                        ${commentEmail1Label}
                    </th>
                    <td>
                        <input type="text" class="normalInput" id="commentEmail"/>
                    </td>
                </tr>
                <tr>
                    <th>
                        ${commentURL1Label}
                    </th>
                    <td>
                        <input type="text" id="commentURL"/>
                    </td>
                </tr>
                </#if>
                <tr>
                    <td id="emotions" colspan="2">
                        <span class="em00" title="${em00Label}"></span>
                        <span class="em01" title="${em01Label}"></span>
                        <span class="em02" title="${em02Label}"></span>
                        <span class="em03" title="${em03Label}"></span>
                        <span class="em04" title="${em04Label}"></span>
                        <span class="em05" title="${em05Label}"></span>
                        <span class="em06" title="${em06Label}"></span>
                        <span class="em07" title="${em07Label}"></span>
                        <span class="em08" title="${em08Label}"></span>
                        <span class="em09" title="${em09Label}"></span>
                        <span class="em10" title="${em10Label}"></span>
                        <span class="em11" title="${em11Label}"></span>
                        <span class="em12" title="${em12Label}"></span>
                        <span class="em13" title="${em13Label}"></span>
                        <span class="em14" title="${em14Label}"></span>
                    </td>
                </tr>
                <tr>
                    <th valign="top">
                        ${commentContent1Label}
                    </th>
                    <td>
                        <textarea rows="10" cols="96" id="comment"></textarea>
                    </td>
                </tr>
                <#if !isLoggedIn>
                <tr>
                    <th valign="top">
                        ${captcha1Label}
                    </th>
                    <td valign="top" style="min-width: 190px;">
                        <input type="text" class="normalInput" id="commentValidate"/>
                        <img id="captcha" alt="validate" src="${servePath}/captcha.do" />
                    </td>
                </tr>
                </#if>
                <tr>
                    <td colspan="2" align="right">
                        <span class="error-msg" id="commentErrorTip"></span>
                        <button id="submitCommentButton" onclick="page.submitComment();">${submmitCommentLabel}</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="comment-bottom"></div>
</div>
</#if>
</#macro>

<#macro comment_script oId>
<script type="text/javascript" src="${staticServePath}/js/page${miniPostfix}.js?${staticResourceVersion}" charset="utf-8"></script>
<script type="text/javascript">
    var page = new Page({
        "nameTooLongLabel": "${nameTooLongLabel}",
        "mailCannotEmptyLabel": "${mailCannotEmptyLabel}",
        "mailInvalidLabel": "${mailInvalidLabel}",
        "commentContentCannotEmptyLabel": "${commentContentCannotEmptyLabel}",
        "captchaCannotEmptyLabel": "${captchaCannotEmptyLabel}",
        "captchaErrorLabel": "${captchaErrorLabel}",
        "loadingLabel": "${loadingLabel}",
        "oId": "${oId}",
        "skinDirName": "${skinDirName}",
        "blogHost": "${blogHost}",
        "randomArticles1Label": "${randomArticles1Label}",
        "externalRelevantArticles1Label": "${externalRelevantArticles1Label}"
    });

    var replyTo = function (id) {
        var commentFormHTML = "<div id='replyForm'><div class='comment-top'></div>"
            + "<div class='comment-body'><table class='form comment-reply'>";
                
        page.addReplyForm(id, commentFormHTML, "</div><div class='comment-bottom'></div></div>");
    };

    (function () {
        page.load();
        // emotions
        page.replaceCommentsEm("#comments .comment-content");
            <#nested>
        })();
</script>
</#macro>