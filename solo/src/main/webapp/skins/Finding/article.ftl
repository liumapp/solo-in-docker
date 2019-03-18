<#--

    Solo - A small and beautiful blogging system written in Java.
    Copyright (c) 2010-2019, b3log.org & hacpai.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

-->
<#include "macro-head.ftl">
<#include "macro-comments.ftl">
<#include "../../common-template/macro-comment_script.ftl">
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
    <body class="nav-closed">
        <div class="nav">
            <#include "side.ftl">
        </div>
        <div class="site-wrapper">
            <#include "header.ftl">
            <main>
                <article class="post fn-wrap">
                    <header>
                        <h1 class="post-title">
                            <a rel="bookmark" href="${servePath}${article.articlePermalink}">
                                ${article.articleTitle}
                            </a>
                            <#if article.hasUpdated>
                            <sup class="post-tip">
                                ${updatedLabel}
                            </sup>
                            </#if>
                            <#if article.articlePutTop>
                            <sup class="post-tip">
                                ${topArticleLabel}
                            </sup>
                            </#if>
                        </h1>
                        <section class="post-meta">
                            <#list article.articleTags?split(",") as articleTag>
                            <span>
                                <a rel="tag" href="${servePath}/tags/${articleTag?url('UTF-8')}">
                                    ${articleTag}</a><#if articleTag_has_next>,</#if>
                            </span>
                            </#list>
                            <time>${article.articleCreateDate?string("yyyy-MM-dd")}</time>
                        </section>
                    </header>
                    <section class="post-content vditor-reset">
                        ${article.articleContent}
                        <#if "" != article.articleSign.signHTML?trim>
                        <div class="marginTop12">
                            ${article.articleSign.signHTML}
                        </div>
                        </#if>
                    </section>
                    <footer>
                        <figure class="post-author">
                            <a href="${servePath}/authors/${article.authorId}"
                               title="${article.authorName}" alt="${article.authorName}"
                               style="background-image: url('${article.authorThumbnailURL}')">
                                <span class="fn-none">${article.authorName}</span>
                            </a>
                        </figure>
                        <div class="share fn-right">
                            <span class="icon icon-wechat"
                                  data-type="wechat"
                                  data-title="${article.articleTitle}"
                                  data-blogtitle="${blogTitle}"
                                  data-url="${servePath}${article.articlePermalink}"
                                  data-avatar="${article.authorThumbnailURL}"></span>
                            <span class="icon icon-weibo" data-type="weibo"></span>
                            <span class="icon icon-twitter" data-type="twitter"></span>
                            <span class="icon icon-qqz" data-type="qqz"></span>
                        </div>
                    </footer>
                </article>
                <#if 0 != relevantArticlesDisplayCount>
                <div id="relevantArticles" class="fn-wrap"></div>
                </#if>
                <#if 0 != randomArticlesDisplayCount>
                <div id="randomArticles" class="fn-wrap"></div>
                </#if>
                <#if externalRelevantArticlesDisplayCount?? && 0 != externalRelevantArticlesDisplayCount>
                <div id="externalRelevantArticles" class="fn-wrap"></div>
                </#if>
                <@comments commentList=articleComments article=article></@comments>
            </main>
            <#if nextArticlePermalink?? || previousArticlePermalink??>
            <aside class="read-next">
                <#if nextArticlePermalink??>
                <div class="read-next-story " style="background-image: url('${staticServePath}/skins/${skinDirName}/images/next.jpg')"
                     onclick="window.location = '${servePath}${nextArticlePermalink}'">
                    <section class="post">
                        <h2>${nextArticleTitle}</h2>
                        <p>${nextArticleAbstract}</p>
                    </section>
                </div>
                </#if>
                <#if previousArticlePermalink??>
                <div class="read-next-story prev " style="background-image: url('${staticServePath}/skins/${skinDirName}/images/preview.jpg')"
                     onclick="window.location = '${servePath}${previousArticlePermalink}'">
                    <section class="post">
                        <h2>${previousArticleTitle}</h2>
                        <p>${previousArticleAbstract}</p>
                    </section>
                </div>
                </#if>
            </aside>
            </#if>
            <#include "footer.ftl">

            <@comment_script oId=article.oId commentable=article.commentable>
            page.tips.externalRelevantArticlesDisplayCount = "${externalRelevantArticlesDisplayCount}";
            <#if 0 != externalRelevantArticlesDisplayCount>
            page.loadExternalRelevantArticles("<#list article.articleTags?split(",") as articleTag>${articleTag}<#if articleTag_has_next>,</#if></#list>");
            </#if>
            <#if 0 != randomArticlesDisplayCount>
            page.loadRandomArticles();
            </#if>
            <#if 0 != relevantArticlesDisplayCount>
            page.loadRelevantArticles('${article.oId}', '<h4>${relevantArticles1Label}</h4>');
            </#if>
             </@comment_script>    
        </div>
    </body>
</html>
