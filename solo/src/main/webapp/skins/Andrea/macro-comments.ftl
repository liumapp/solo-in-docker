<#macro comments commentList article>
<h2 class="comment-label">${commentLabel}</h2>
<div id="comments">
    <#list commentList as comment>
    <#include "common-comment.ftl"/>
    </#list>
</div>
<#if article.commentable>
<table id="commentForm" class="comment-form" cellpadding="0" cellspacing="0">
    <tbody>
        <#if !isLoggedIn>
        <tr>
            <th width="115px">
                ${commentNameLabel}
            </th>
            <td>
                <input type="text" id="commentName"/>
            </td>
        </tr>
        <tr>
            <th>
                ${commentEmailLabel}
            </th>
            <td>
                <input type="text" id="commentEmail"/>
            </td>
        </tr>
        <tr>
            <th>
                ${commentURLLabel}
            </th>
            <td>
                <input type="text" id="commentURL"/>
            </td>
        </tr>
        </#if>
        <tr>
            <th>
                ${commentEmotionsLabel}
            </th>
            <td id="emotions">
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
                ${commentContentLabel}
            </th>
            <td>
                <textarea rows="10" id="comment"></textarea>
            </td>
        </tr>
        <#if !isLoggedIn>
        <tr>
            <th>
                ${captchaLabel}
            </th>
            <td>
                <input type="text" id="commentValidate"/>
                <img id="captcha" alt="validate" src="${servePath}/captcha.do" />
            </td>
        </tr>
        </#if>
        <tr>
            <td colspan="2" align="right">
                <button class="right" id="submitCommentButton" onclick="page.submitComment();">${submmitCommentLabel}</button>
                <span  style="margin-top: 13px;" class="right error-msg" id="commentErrorTip"></span>
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
        var commentFormHTML = "<table class='comment-form' id='replyForm' cellpadding='0' cellspacing='0'>";
                
        page.addReplyForm(id, commentFormHTML);
    };

    (function () {
        page.load();
        // emotions
        page.replaceCommentsEm("#comments .comment-content");
            <#nested>
        })();
</script>
</#macro>