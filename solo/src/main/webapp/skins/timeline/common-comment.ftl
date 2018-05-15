<li id="${comment.oId}">
    <img title="${comment.commentName}"
         alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
    <div>
            <span class="author">
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
            </span>
        <small><b> ${comment.commentDate2?string("yy-MM-dd HH:mm")}</b></small>
    <#if article.commentable>
        <span class="ico-reply ico right">
                <a rel="nofollow" href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
            </span>
    </#if>
        <div class="article-body">${comment.commentContent}</div>
    </div>
</li>