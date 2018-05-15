/*
 * Copyright (c) 2010-2018, b3log.org & hacpai.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * @fileoverview util and every page should be used.
 *
 * @author <a href="http://vanessa.b3log.org">Liyuan Li</a>
 * @version 1.1.0.0, Oct 13, 2016
 */

/**
 * @description Finding 皮肤脚本
 * @static
 */
var Finding = {
  /**
   * @description 页面初始化
   */
  init: function () {
    Util.killIE();
    this._initToc();
    $(".scroll-down").click(function (event) {
      event.preventDefault();

      var $this = $(this),
        $htmlBody = $('html, body'),
        offset = ($this.attr('data-offset')) ? $this.attr('data-offset') : false,
        toMove = parseInt(offset);

      $htmlBody.stop(true, false).animate({ scrollTop: ($(this.hash).offset().top + toMove) }, 500);
    });

    $('body').append('<a class="icon-gotop fn-none" href="javascript:Util.goTop()"></a>' +
      '<span class="menu-button icon-menu"><span class="word">Menu</span></span>');

    $(".menu-button").click(function (event) {
      event.stopPropagation();
      $("body").toggleClass("nav-opened nav-closed");
    });


    $(window).scroll(function () {
      if ($(window).scrollTop() > $('.main-header').height()) {
        $(".icon-gotop").show();
      } else {
        $(".icon-gotop").hide();
      }
    });
  },
  /**
   * 文章目录
   * @returns {undefined}
   */
  _initToc: function () {
    if ($('.b3-solo-list li').length === 0) {
      $('.nav .icon-list').hide();
      $('.nav .icon-sitemap').click();
      return;
    }

    $('.nav ul:first').after($('.b3-solo-list'));
    $("body").toggleClass("nav-opened nav-closed");

    $('.nav .icon-list').show();
    Finding.tabNav('toc')

    var $articleTocs = $('.article-body [id^=b3_solo_h]'),
      $articleToc = $('.b3-solo-list');

    $(window).scroll(function (event) {
      if ($('.b3-solo-list li').length === 0) {
        return false;
      }

      // 界面各种图片加载会导致帖子目录定位
      var toc = [];
      $articleTocs.each(function (i) {
        toc.push({
          id: this.id,
          offsetTop: this.offsetTop
        });
      });

      // 当前目录样式
      var scrollTop = $(window).scrollTop();
      for (var i = 0, iMax = toc.length; i < iMax; i++) {
        if (scrollTop < toc[i].offsetTop + 280) {
          $articleToc.find('li').removeClass('current');
          var index = i > 0 ? i - 1 : 0;
          $articleToc.find('a[href="#' + toc[index].id + '"]').parent().addClass('current');
          break;
        }
      }
      if (scrollTop >= toc[toc.length - 1].offsetTop + 280) {
        $articleToc.find('li').removeClass('current');
        $articleToc.find('li:last').addClass('current');
      }
    });

    $(window).scroll();
  },
  tabNav: function (type) {
    $('.nav .current').removeClass('current');
    if (type === 'toc') {
      $('.nav ul:first').hide();
      $('.nav ul:last').show();
      $('.icon-list').addClass('current');
    } else {
      $('.nav ul:first').show();
      $('.nav ul:last').hide();
      $('.icon-sitemap').addClass('current');
    }
  },
  /**
   * 分享
   * @returns {undefined}
   */
  share: function () {
    $(".share span").click(function () {
      var key = $(this).data("type");
      var title = encodeURIComponent($("title").text()),
        url = $(".post-title a").attr('href') ? $(".post-title a").attr('href') : location,
        pic = $(".post-content img:eq(0)").attr("src");
      var urls = {};
      urls.tencent = "http://share.v.t.qq.com/index.php?c=share&a=index&title=" + title +
        "&url=" + url + "&pic=" + pic;
      urls.weibo = "http://v.t.sina.com.cn/share/share.php?title=" +
        title + "&url=" + url + "&pic=" + pic;
      urls.google = "https://plus.google.com/share?url=" + url;
      urls.twitter = "https://twitter.com/intent/tweet?status=" + title + " " + url;
      window.open(urls[key], "_blank", "top=100,left=200,width=648,height=618");
    });
  }
};

Finding.init();