<!--[if lt IE 9]>
    <script type="text/javascript">
       (function () {
           var element = ['time', 'article'];
           for (var i = 0; i < element.length; i++) {
               document.createElement(element[i]);
           }
       })();
   </script>
<![endif]-->
<div class="header">
    <div class="container fn-clear">
        <div class="left">
            <h1 class="title">
                <a href="${servePath}">
                    ${blogTitle}
                </a>
            </h1>
            <span class="sub-title">${blogSubtitle}</span>
            <span class="ico-list"></span>
        </div>
        <ul class="left">
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
                <a rel="alternate" href="${servePath}/blog-articles-rss.do">RSS <img src="${staticServePath}/images/feed.png" alt="RSS"/></a>
            </li>
        </ul>
        <form class="right"  action="${servePath}/search">
            <input placeholder="${searchLabel}" id="search" type="text" name="keyword" />
            <input type="submit" value="" class="none" />
        </form>
    </div>
</div>