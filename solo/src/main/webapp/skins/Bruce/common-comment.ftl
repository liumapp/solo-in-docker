<div class="row comment" id="${comment.oId}">
    <img class="col-sm-1" title="${comment.commentName}"
         alt="${comment.commentName}" src="${comment.commentThumbnailURL}"/>
    <div class="col-sm-11">
        <div class="row">
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

            <span class="gray">• ${comment.commentDate2?string("yy-MM-dd HH:mm")} • <#if article.commentable>
                <a rel="nofollow" href="javascript:replyTo('${comment.oId}');">Reply</a>
            </#if></span>

        </div>
        <div class="row code-highlight article-content">${comment.commentContent}</div>
    </div>
</div>