<div id="${comment.oId}">
    <div class="comment-panel">
        <div class="comment-title">
        <#if "http://" == comment.commentURL>
            <a>${comment.commentName}</a>
        <#else>
            <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
        </#if>
        <#if comment.isReply>
            @
            <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
               onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 23);"
               onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">${comment.commentOriginalCommentName}</a>
        </#if>
            <div class="right">
            ${comment.commentDate2?string("yyyy-MM-dd HH:mm:ss")}

            <#if article.commentable>
                <a class="no-underline"
                   href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
            </#if>
            </div>
            <div class="clear"></div>
        </div>
        <div class="comment-body">
            <div class="left comment-picture">
                <img alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
            </div>
            <div class="comment-content content-reset">
            ${comment.commentContent}
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>