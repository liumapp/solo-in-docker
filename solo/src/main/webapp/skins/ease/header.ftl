<div class="header">
    <div class="wrapper banner">
        <div class="left">
            <h1>
                <a class="title ft-gray" href="${servePath}">
                    ${blogTitle}
                </a>
            </h1>
            <span class="sub-title">${blogSubtitle}</span>
        </div>
        <#if "" != noticeBoard>
        <div class="notice">
            ${noticeBoard}
        </div>
        </#if>
        <div class="clear"></div>
    </div>
    <div class="nav">
        <div class="wrapper">
            <ul>
                <li>
                    <a rel="nofollow" href="${servePath}/">${indexLabel}</a>
                </li>  
                <#list pageNavigations as page>
                <li>
                    <a href="${page.pagePermalink}" target="${page.pageOpenTarget}"><#if page.pageIcon != ''><img class="page-icon" src="${page.pageIcon}"></#if>${page.pageTitle}</a>
                </li>
                </#list>  
                <li>
                    <a href="${servePath}/dynamic.html">${dynamicLabel}</a>
                </li>
                <li>
                    <a href="${servePath}/tags.html">${allTagsLabel}</a>  
                </li>
                <li>
                    <a href="${servePath}/archives.html">${archiveLabel}</a>
                </li>
                <li>
                    <a href="${servePath}/links.html">${linkLabel}</a>
                </li>
                <li>
                    <a rel="alternate" href="${servePath}/blog-articles-rss.do">RSS<img src="${staticServePath}/images/feed.png" alt="RSS"/></a>
                </li>
            </ul>
            <form action="${servePath}/search">
                <input id="search" type="text" name="keyword" />
                <input type="submit" value="" class="none" />
            </form>
            <div class="clear"></div>
        </div>
    </div>
</div>