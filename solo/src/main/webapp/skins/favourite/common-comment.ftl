<div id="${comment.oId}" class="comment-body">
    <div class="comment-panel">
        <div class="left comment-author">
            <div>
                <img alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
            </div>
        <#if "http://" == comment.commentURL>
            <a class="left" title="${comment.commentName}">${comment.commentName}</a>
        <#else>
            <a href="${comment.commentURL}" target="_blank" title="${comment.commentName}">${comment.commentName}</a>
        </#if>
        </div>
        <div class="left comment-info">
            <div class="left">
            ${comment.commentDate2?string("yyyy-MM-dd HH:mm:ss")}
            <#if comment.isReply>
                @
                <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
                   onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 3);"
                   onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">${comment.commentOriginalCommentName}</a>
            </#if>
            </div>
        <#if article.commentable>
            <div class="right">
                <a rel="nofollow" class="no-underline"
                   href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
            </div>
        </#if>
            <div class="clear">
            </div>
            <div class="comment-content">
            ${comment.commentContent}
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>