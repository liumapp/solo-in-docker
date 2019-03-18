/*
 * Solo - A small and beautiful blogging system written in Java.
 * Copyright (c) 2010-2019, b3log.org & hacpai.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
/**
 * @fileoverview util and every page should be used.
 *
 * @author <a href="http://vanessa.b3log.org">Liyuan Li</a>
 * @version 1.1.1.0, Sep 21, 2018
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
    this.share();
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
    if ($(window).width() > 500) {
      $("body").toggleClass("nav-opened nav-closed");
    }

    $('.nav .icon-list').show();
    Finding.tabNav('toc')

    var $articleTocs = $('.vditor-reset [id^=b3_solo_h]'),
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
      $('.nav ul:first, .nav .count').hide();
      $('.nav ul:last').show();
      $('.icon-list').addClass('current');
    } else {
      $('.nav ul:first, .nav .count').show();
      $('.nav ul:last').hide();
      $('.icon-sitemap').addClass('current');
    }
  },
  /**
   * 分享
   * @returns {undefined}
   */
  share: function () {
    var $this = $('.share')
    var $qrCode = $this.find('.icon-wechat')
    var shareURL = $qrCode.data('url')
    var avatarURL = $qrCode.data('avatar')
    var title = encodeURIComponent($qrCode.data('title') + ' - ' +
      $qrCode.data('blogtitle')),
      url = encodeURIComponent(shareURL)

    var urls = {}
    urls.weibo = 'http://v.t.sina.com.cn/share/share.php?title=' +
      title + '&url=' + url + '&pic=' + avatarURL
    urls.qqz = 'https://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='
      + url + '&sharesource=qzone&title=' + title + '&pics=' + avatarURL
    urls.twitter = 'https://twitter.com/intent/tweet?status=' + title + ' ' +
      url

    $this.find('span').click(function () {
      var key = $(this).data('type')

      if (!key) {
        return
      }

      if (key === 'wechat') {
        if ($qrCode.find('canvas').length === 0) {
          $.ajax({
            method: 'GET',
            url: latkeConfig.staticServePath +
            '/js/lib/jquery.qrcode.min.js',
            dataType: 'script',
            cache: true,
            success: function () {
              $qrCode.qrcode({
                width: 128,
                height: 128,
                text: shareURL,
              })
            },
          })
        } else {
          $qrCode.find('canvas').slideToggle()
        }
        return false
      }

      window.open(urls[key], '_blank', 'top=100,left=200,width=648,height=618')
    })
  }
};

Finding.init();