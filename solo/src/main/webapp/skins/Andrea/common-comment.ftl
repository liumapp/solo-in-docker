<div id="${comment.oId}"
     class="comment-body">
    <div class="comment-panel">
        <div class="left comment-author">
            <img alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
        </div>
        <div class="left comment-info">
        <#if "http://" == comment.commentURL>
            <a>${comment.commentName}</a>
        <#else>
            <a href="${comment.commentURL}"
               target="_blank">${comment.commentName}</a>
        </#if><#if comment.isReply>
            @
            <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
               onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 20);"
               onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">${comment.commentOriginalCommentName}</a>
        </#if>
            &nbsp;${comment.commentDate2?string("yyyy-MM-dd HH:mm:ss")}
            <div class="comment-content">
            ${comment.commentContent}
            </div>
        <#if article.commentable>
            <div>
                <a rel="nofollow" href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
            </div>
        </#if>
        </div>
        <div class="clear"></div>
    </div>
</div>