<#macro comments commentList article>
<#if article.commentable>
<div class="comment-disabled">
    <h3>${postCommentsLabel}</h3>
</div>

<table id="commentForm" class="form">
    <tbody>
        <#if !isLoggedIn>
        <tr>
            <td colspan="2">
                <input type="text" id="commentName"/>
                <label for="commentName">${commentNameLabel}</label>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="text" id="commentEmail"/>
                <label for="commentEmail">${commentEmailLabel}</label>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="text" id="commentURL"/>
                <label for="commentURL">${commentURLLabel}</label>
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
                <label>${commentEmotionsLabel}</label>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <textarea rows="10" cols="96" id="comment"></textarea>
            </td>
        </tr>
        <#if !isLoggedIn>
        <tr>
            <td colspan="2">
                <input type="text" id="commentValidate"/>
                <img id="captcha" alt="validate" src="${servePath}/captcha.do" />
            </td>
        </tr>
        </#if>
        <tr>
            <td>
                <span id="commentErrorTip" class="tip"></span>
            </td>
            <td align="right">
                <button id="submitCommentButton" onclick="page.submitComment();">${submmitCommentLabel}</button>
            </td>
        </tr>
    </tbody>
</table>
<#else>
<div class="comment-disabled">
    <h3>${notAllowCommentLabel}</h3>
</div>
</#if>

<#if commentList?size == 0>
<div class="comment-disabled">
    <h3>${noCommentLabel}</h3>
</div>
<div id="comments"></div>
<#else>
<div class="comment-disabled">
    <h3>${commentLabel}</h3>
</div>
<div id="comments">
    <#list commentList as comment>
    <#include "common-comment.ftl"/>
    </#list>
</div>
</#if>
<span id="goTop" onclick="Util.goTop();" data-ico="&#xe042;" class="side-tile"></span>
<span id="goCmt" onclick="MetroHot.goCmt();" data-ico="&#x005b;" class="side-tile"></span>
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
                        "randomArticles1Label": "${randomArticlesLabel}",
                        "externalRelevantArticles1Label": "${externalRelevantArticlesLabel}"
                    });
                    var replyTo = function(id) {
                        var commentFormHTML = "<table class='form' id='replyForm'>";
                        page.addReplyForm(id, commentFormHTML);
                        $("#replyForm label").each(function() {
                            $this = $(this);
                            $this.attr("for", $this.attr("for") + "Reply");
                        });
                    };

                    $(document).ready(function() {
                        page.load();
                        // emotions
                        page.replaceCommentsEm("#comments .article-body");
                        <#nested>
                    });
</script>
</#macro>