<#macro comments commentList article>
<div class="comments" id="comments">
    <#list commentList as comment>
    <#include "common-comment.ftl"/>
    </#list>
</div>
<#if article.commentable>
<table id="commentForm" class="comment-form">
    <tbody>
        <#if !isLoggedIn>
        <tr>
            <td width="208px">
                <input type="text" class="normalInput" id="commentName"/>
            </td>
            <td width="400px">
                ${commentNameLabel}
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" class="normalInput" id="commentEmail"/>
            </td>
            <td>
                ${commentEmailLabel}
            </td>
        </tr>
        <tr>
            <td>
                <input type="text" class="normalInput" id="commentURL"/>
            </td>
            <td>
                ${commentURLLabel}
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
            <td colspan="2">
                <textarea rows="10" cols="96" id="comment"></textarea>
            </td>
        </tr>
        <#if !isLoggedIn>
        <tr>
            <td>
                <input type="text" class="normalInput" id="commentValidate"/>
            </td>
            <td>
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
        var commentFormHTML = "<table class='marginTop12 comment-form' id='replyForm'>";
        page.addReplyForm(id, commentFormHTML);
    };
    
    (function () {
        page.load();
        if ($("#comments div").length === 0) {
            $("#comments").removeClass("comments");
        }
        // emotions
        page.replaceCommentsEm("#comments .comment-content");
            <#nested>
        })();
</script>
</#macro>