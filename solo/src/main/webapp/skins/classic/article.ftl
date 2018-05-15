<#include "macro-head.ftl">
<#include "macro-comments.ftl">
<!DOCTYPE html>
<html>
    <head>
        <@head title="${article.articleTitle} - ${blogTitle}">
        <meta name="keywords" content="${article.articleTags}" />
        <meta name="description" content="${article.articleAbstract?html}" />
        </@head>
        <#if previousArticlePermalink??>
            <link rel="prev" title="${previousArticleTitle}" href="${servePath}${previousArticlePermalink}">
        </#if>
        <#if nextArticlePermalink??>
            <link rel="next" title="${nextArticleTitle}" href="${servePath}${nextArticlePermalink}">
        </#if>
            <!-- Open Graph -->
            <meta property="og:locale" content="zh_CN"/>
            <meta property="og:type" content="article"/>
            <meta property="og:title" content="${article.articleTitle}"/>
            <meta property="og:description" content="${article.articleAbstract?html}"/>
            <meta property="og:image" content="${article.authorThumbnailURL}"/>
            <meta property="og:url" content="${servePath}${article.articlePermalink}"/>
            <meta property="og:site_name" content="Solo"/>
            <!-- Twitter Card -->
            <meta name="twitter:card" content="summary"/>
            <meta name="twitter:description" content="${article.articleAbstract?html}"/>
            <meta name="twitter:title" content="${article.articleTitle}"/>
            <meta name="twitter:image" content="${article.authorThumbnailURL}"/>
            <meta name="twitter:url" content="${servePath}${article.articlePermalink}"/>
            <meta name="twitter:site" content="@DL88250"/>
            <meta name="twitter:creator" content="@DL88250"/>
    </head>
    <body>
        ${topBarReplacement}
        <div class="content">
            <div class="header">
                <#include "header.ftl">
            </div>
            <div class="body">
                <div class="left main">
                    <div>
                        <div class="article">
                            <div class="article-header">
                                <div class="article-date">
                                    <#if article.hasUpdated>
                                    ${article.articleUpdateDate?string("yyyy-MM-dd HH:mm:ss")}
                                    <#else>
                                    ${article.articleCreateDate?string("yyyy-MM-dd HH:mm:ss")}
                                    </#if>
                                </div>
                                <div class="article-title">
                                    <h2>
                                        <a class="no-underline" href="${servePath}${article.articlePermalink}">${article.articleTitle}</a>
                                        <#if article.hasUpdated>
                                        <sup class="red">
                                            ${updatedLabel}
                                        </sup>
                                        </#if>
                                        <#if article.articlePutTop>
                                        <sup class="red">
                                            ${topArticleLabel}
                                        </sup>
                                        </#if>
                                    </h2>
                                    <div class="article-tags">
                                        ${tags1Label}
                                        <#list article.articleTags?split(",") as articleTag>
                                        <span>
                                            <a rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">
                                                ${articleTag}</a><#if articleTag_has_next>,</#if>
                                        </span>
                                        </#list>&nbsp;&nbsp;&nbsp;
                                        <#-- 注释掉填充用户名部分
                                        ${author1Label}<a rel="nofollow" href="${servePath}/authors/${article.authorId}">${article.authorName}</a>
                                        -->
                                    </div>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <div class="article-body content-reset">
                                ${article.articleContent}
                                <#if "" != article.articleSign.signHTML?trim>
                                <div class="marginTop12">
                                    ${article.articleSign.signHTML}
                                </div>
                                </#if>
                            </div>
                            <div class="article-details-footer">
                                <div class="left">
                                    <#if nextArticlePermalink??>
                                    <a href="${servePath}${nextArticlePermalink}">${nextArticle1Label}${nextArticleTitle}</a><br/>
                                    </#if>
                                    <#if previousArticlePermalink??>
                                    <a href="${servePath}${previousArticlePermalink}">${previousArticle1Label}${previousArticleTitle}</a>
                                    </#if>
                                </div>
                                <div class="right">
                                    <span class="article-create-date left">
                                        ${article.articleCreateDate?string("yyyy-MM-dd HH:mm:ss")}&nbsp;&nbsp;
                                    </span>
                                    <a rel="nofollow" href="${servePath}${article.articlePermalink}#comments" class="left">
                                        <span class="left commentIcon" title="${commentLabel}"></span>
                                        <span class="left">${article.articleCommentCount}</span>&nbsp;&nbsp;
                                    </a>
                                    <a rel="nofollow" href="${servePath}${article.articlePermalink}" class="left">
                                        <span class="left browserIcon" title="${viewLabel}"></span>
                                        <span id="articleViewCount">${article.articleViewCount}</span>
                                    </a>
                                </div>
                                <div class="clear"></div>
                            </div>
                            <#if 0 != relevantArticlesDisplayCount>
                            <div id="relevantArticles" class="article-relative left" style="width: 50%;"></div>
                            </#if>
                            <div id="randomArticles" class="left article-relative"></div>
                            <div class="clear"></div>
                            <div id="externalRelevantArticles" class="article-relative"></div>
                        </div>
                        <div class="clear"></div>
                        <@comments commentList=articleComments article=article></@comments>
                    </div>
                </div>
                <div class="right side">
                    <section>
                    <#include "side.ftl">
                    </section>
                </div>
                <div class="clear"></div>
            </div>
            <div class="footer">
                <#include "footer.ftl">
            </div>
        </div>
        <@comment_script oId=article.oId>
        page.tips.externalRelevantArticlesDisplayCount = "${externalRelevantArticlesDisplayCount}";
        <#if 0 != randomArticlesDisplayCount>
        page.loadRandomArticles();
        </#if>
        <#if 0 != relevantArticlesDisplayCount>
        page.loadRelevantArticles('${article.oId}', '<h4>${relevantArticles1Label}</h4>');
        </#if>
        <#if 0 != externalRelevantArticlesDisplayCount>
        page.loadExternalRelevantArticles("<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>");
        </#if>
        </@comment_script>
        <script>
        (function () {
            if ($('.b3-solo-list li').length > 0 && $(window).width() > 1000) {
                // add color to sidebar menu
                $('.side').addClass('has-toc');

                // append toc to sidebar menu
                var articleTocHTML = '<ul><li class="current" data-tab="toc">${tocLabel}'
                + '</li><li data-tab="site">${siteViewLabel}</li></ul><div class="clear"></div><section></section>';
                $('.side').prepend(articleTocHTML);
                var $sectionF = $('.side section:first').html($('.b3-solo-list')),
                        $sectionL = $('.side section:last');
                $sectionL.hide();
                $sectionF.height($(window).height()).css({ 'overflow': 'auto', 'width':  $('.side').width() + 'px'});;
                // 切换 tab
                $('.side > ul > li').click(function () {
                    if ($(this).data('tab') === 'toc') {
                        $sectionL.animate({
                            "opacity": '0',
                            "top": '-50px'
                        }, 300, function () {
                            $sectionF.show().css('top', '-50px');
                            $sectionF.animate({
                                "opacity": '1',
                                "top": '0'
                            }, 300);
                        }).hide();
                    } else {
                        $sectionF.animate({
                            "opacity": '0',
                            "top": '-50px'
                        }, 300, function () {
                            $sectionF.hide().css('top', '-50px');
                            $sectionL.animate({
                                "opacity": '1',
                                "top": '0'
                            }, 300).show();
                        });
                    }
                    $('.side > ul > li').removeClass('current');
                    $(this).addClass('current');
                });
            }

            $(window).scroll(function () {
                if ($(window).scrollTop() > 155) {
                    $('.side section:eq(0)').css({
                        position: "fixed",
                        top: 0,
                        backgroundColor: "#fff",
                        borderLeft: "2px solid #E5ECF9"
                    })
                } else {
                    $('.side section:eq(0)').css({
                        position: "inherit",
                        borderLeft: 0
                    })
                }
            });
        })();
        </script>
    </body>
</html>
