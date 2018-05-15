<div id="${comment.oId}" class="fn-clear">
    <img title="${comment.commentName}"
         alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
    <div class="comment-main">
        <div class="fn-clear">
        <#if "http://" == comment.commentURL>
            <span>${comment.commentName}</span>
        <#else>
            <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
        </#if>

        <#if comment.isReply>
            <span class="at">@</span>
            <a class="user-name" href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
               onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 20);"
               onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">${comment.commentOriginalCommentName}</a>
        </#if>

        <#if article.commentable>
            <a data-ico="&#x0056;" rel="nofollow" href="javascript:replyTo('${comment.oId}');" title="${replyLabel}"></a>
        </#if>

            <div class="fn-right" data-ico="&#xe200;">
            ${comment.commentDate2?string("yy-MM-dd HH:mm")}
            </div>
        </div>
        <div class="article-body">${comment.commentContent}</div>
    </div>
</div>