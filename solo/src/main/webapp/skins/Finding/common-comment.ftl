<li id="${comment.oId}" class="fn-clear">
    <div class="fn-left avatar-warp">
        <img class="avatar-48" title="${comment.commentName}" src="${comment.commentThumbnailURL}">
    </div>
    <div class="fn-left" style="width: 90%">
        <div class="fn-clear post-meta">
                <span class="fn-left">
                    <#if "http://" == comment.commentURL>
                        <a>${comment.commentName}</a>
                    <#else>
                        <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
                    </#if>
                    <#if comment.isReply>
                        @
                    <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
                       onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 23);"
                       onmouseout="page.hideComment('${comment.commentOriginalCommentId}')"
                    >${comment.commentOriginalCommentName}</a>
                    </#if>
                        <time>${comment.commentDate2?string("yyyy-MM-dd HH:mm")}</time>
                </span>
        <#if article.commentable>
            <a class="fn-right" href="javascript:replyTo('${comment.oId}')">${replyLabel}</a>
        </#if>
        </div>
        <div class="comment-content">
        ${comment.commentContent}
        </div>
    </div>
</li>