<div id="${comment.oId}">
    <img class="comment-header" title="${comment.commentName}"
         alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
    <div class="comment-panel">
        <div class="left">
        <#if "http://" == comment.commentURL>
            <a>${comment.commentName}</a>
        <#else>
            <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
        </#if>
        <#if comment.isReply>@
            <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
               onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 20);"
               onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">${comment.commentOriginalCommentName}</a>
        </#if>
        </div>
    <#if article.commentable>
        <div class="right  ft-gray">
        ${comment.commentDate2?string("yy-MM-dd HH:mm")}
            <a rel="nofollow" href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
        </div>
    </#if>
        <span class="clear"></span>
        <div class="article-body">${comment.commentContent}</div>
    </div>
    <span class="clear"></span>
</div>