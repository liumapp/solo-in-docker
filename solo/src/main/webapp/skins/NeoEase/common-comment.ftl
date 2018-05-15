<div id="${comment.oId}">
    <img class="comment-header" title="${comment.commentName}"
         alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
    <div class="comment-panel">
        <div class="left">
        <#if "http://" == comment.commentURL>
        ${comment.commentName}
        <#else>
            <a href="${comment.commentURL}" target="_blank">${comment.commentName}</a>
        </#if>
        <#if comment.isReply>&nbsp;@
            <a href="${servePath}${article.permalink}#${comment.commentOriginalCommentId}"
               onmouseover="page.showComment(this, '${comment.commentOriginalCommentId}', 20);"
               onmouseout="page.hideComment('${comment.commentOriginalCommentId}')">${comment.commentOriginalCommentName}</a>
        </#if>
        </div>
    <#if article.commentable>
        <div class="right">
            <a rel="nofollow" href="javascript:replyTo('${comment.oId}');">${replyLabel}</a>
            &nbsp;|&nbsp;
        ${comment.commentDate2?string("yyyy-MM-dd HH:mm:ss")}
        </div>
    </#if>
        <span class="clear"></span>
        <div class="article-body">${comment.commentContent}</div>
    </div>
    <span class="clear"></span>
</div>