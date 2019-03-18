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
<footer class="footer">
    <div class="wrapper fn-clear">
        <a href="${servePath}">${blogTitle}</a>  •
        ${onlineVisitor1Label}${onlineVisitorCnt} <br/>
        &copy; ${year}
        ${footerContent}
        Powered by <a href="https://b3log.org" target="_blank">B3log 开源</a> •
        <a href="https://solo.b3log.org" target="_blank">Solo</a> ${version}
        
        <div class="fn-right">
            Theme <a rel="friend" href="https://github.com/b3log/solo-skins" target="_blank">${skinDirName}</a>
            <sup>[<a href="https://github.com/iissnan/hexo-theme-next" target="_blank">ref</a>]</sup>
            by <a href="http://vanessa.b3log.org" target="_blank">Vanessa</a>
        </div>
    </div>
</footer>
<div class="back-to-top" onclick="Util.goTop()"></div>

<script type="text/javascript" src="${staticServePath}/js/lib/jquery/jquery.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticServePath}/js/common${miniPostfix}.js?${staticResourceVersion}" charset="utf-8"></script>
<script type="text/javascript" src="${staticServePath}/skins/${skinDirName}/js/${skinDirName}${miniPostfix}.js?${staticResourceVersion}" charset="utf-8"></script>
<script type="text/javascript">
    var latkeConfig = {
        "servePath": "${servePath}",
        "staticServePath": "${staticServePath}",
        "isLoggedIn": "${isLoggedIn?string}",
        "userName": "${userName}"
    };

    var Label = {
        "markedAvailable": ${markedAvailable?c},
        "hljsStyle": "atom-one-light",
        "langLabel": "${langLabel}",
        "skinDirName": "${skinDirName}",
        "tocLabel": "${tocLabel}",
        "siteViewLabel": "${siteViewLabel}"
    };
    Util.init()
</script>
${plugins}
