<header class="header">
    <div class="header-line"></div>
    <div class="fn-clear wrapper">
        <div class="logo-wrap">
            <a href="${servePath}" rel="start">
                <span class="logo-line-before"><i></i></span>
                <span class="site-title">${blogTitle}</span>
                <span class="logo-line-after"><i></i></span>
            </a>
        </div>

        <div class="site-nav-toggle fn-right" onclick="$('.header-line').toggle();$('nav').children('.menu').slideToggle();">
            <span class="btn-bar"></span>
            <span class="btn-bar"></span>
            <span class="btn-bar"></span>
        </div>

        <nav>
            <ul class="menu">
                <#list pageNavigations as page>
                <li class="menu-item">
                    <#if page.pageIcon != ''><img class="page-icon" src="${page.pageIcon}"></#if>
                    <a href="${page.pagePermalink}" target="${page.pageOpenTarget}" rel="section">
                        ${page.pageTitle}
                    </a>
                </li>
                </#list>  
                <li class="menu-item">
                    <a href="${servePath}/dynamic.html" rel="section">
                        ${dynamicLabel}
                    </a>
                </li>
                <li class="menu-item">
                    <a href="${servePath}/tags.html" rel="section">
                        ${allTagsLabel}
                    </a>  
                </li>
                <li class="menu-item">
                    <a href="${servePath}/archives.html">
                        ${archiveLabel}
                    </a>
                </li>
                <li class="menu-item">
                    <a rel="alternate" href="${servePath}/blog-articles-rss.do" rel="section">
                        RSS
                    </a>
                </li>
            </ul>

            <div class="site-search">
                <form action="${servePath}/search">
                    <input placeholder="${searchLabel}" id="search" type="text" name="keyword"/>
                    <input type="submit" value="" class="fn-none" />
                </form>
            </div>
        </nav>
    </div>
</header>