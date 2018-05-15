<div class="side-tool">
    <ul>
        <li>
            <ul>
                <#list pageNavigations as page>
                <li>
                    <a href="${page.pagePermalink}" target="${page.pageOpenTarget}" title="${page.pageTitle}">
                        <#if page.pageIcon != ''><img class="page-icon" src="${page.pageIcon}"></#if>${page.pageTitle}
                    </a>
                </li>
                </#list>
            </ul>
        </li>
        <li id="changeBG">
            <a title="grey" id="greyBG" class="selected"></a>
            <a title="brown" id="brownBG"></a>
            <a title="blue" id="blueBG"></a>
        </li>
        <li>
            <span id="goTop" onclick="Util.goTop();" title="${goTopLabel}"></span>
        </li>
    </ul>
</div>