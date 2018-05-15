<div id="${comment.oId}">
    <img class="left" alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
    <div class="comment-panel left">
        <div class="comment-top">
        <#if "http://" == comment.commentURL>
            <a>${comment.commentName}</a>
        <#else>
            <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
        </#if>
        <#if comment.isReply>
            @
            <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
               onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 11);"
               onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">
            ${comment.commentOriginalCommentName}</a>
        </#if>
        ${comment.commentDate2?string("yyyy-MM-dd HH:mm:ss")}
        </div>
        <div class="comment-content">
        ${comment.commentContent}
        </div>
        <div class="clear"></div>
    <#if article.commentable>
        <div class="reply">
            <a rel="nofollow" href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
        </div>
    </#if>
    </div>
    <div class="clear"></div>
</div>