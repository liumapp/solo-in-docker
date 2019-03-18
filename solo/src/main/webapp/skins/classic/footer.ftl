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
<span style="color: gray;">&copy; ${year}</span> - <a href="${servePath}">${blogTitle}</a>${footerContent}<br/>
Powered by <a href="https://b3log.org" target="_blank">B3log 开源</a> • <a href="https://solo.b3log.org" target="_blank">Solo</a> ${version}&nbsp;&nbsp;

Theme <a rel="friend" href="https://github.com/b3log/solo-skins" target="_blank">${skinDirName}</a>
by <a rel="friend" href="http://vanessa.b3log.org" target="_blank">Vanessa</a>.
<div class='goTopIcon' onclick='Util.goTop();'></div>
<div class='goBottomIcon' onclick='Util.goBottom();'></div>
<script type="text/javascript" src="${staticServePath}/js/lib/jquery/jquery.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${staticServePath}/js/common${miniPostfix}.js?${staticResourceVersion}" charset="utf-8"></script>
<script type="text/javascript">
    var latkeConfig = {
        "servePath": "${servePath}",
        "isLoggedIn": "${isLoggedIn?string}",
        "staticServePath": "${staticServePath}"
    };

    var Label = {
        "markedAvailable": ${markedAvailable?c},
        "hljsStyle": "atom-one-light",
        "langLabel": "${langLabel}",
        "skinDirName": "${skinDirName}"
    };
    
    var collapseArchive = function (it, year) {
        var tag = true,
        text = it.innerHTML;
        if (text.indexOf("-") > -1) {
            it.innerHTML = text.replace("-", "+");
            tag = false;
        } else {
            it.innerHTML = text.replace("+", "-");
        }
    
        $("#archiveSide li").each(function () {
            var $this = $(this);
            // hide other year month archives
            if ($this.data("year") === year) {
                if (tag) {
                    $(this).show();
                } else {
                    $(this).hide();
                }
            }
        });
    };
    
    $(document).ready(function () {
        var currentYear = (new Date()).getFullYear(),
        year = currentYear;
        $("#archiveSide li").each(function (i) {
            var $this = $(this);
        
            // hide other year month archives
            if ($this.data("year") !== currentYear) {
                $(this).hide()
            }
        
            // append year archive
            if (year !== $this.data("year")) {
                year = $this.data("year");
                $this.before("<li class='pointer'><div onclick='collapseArchive(this, " + 
                    year + ")'>" + year + "&nbsp;\u5e74 +</div></li>");
            }
        });
        
        Util.init();
        Util.setTopBar()
        Util.replaceSideEm($("#recentComments li .side-comment"));
    });
</script>
${plugins}
