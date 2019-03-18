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
 * @version 0.4.0.0, Jul 26, 2017
 */

/**
 * @description next 皮肤脚本
 * @static
 */
var NexT = {
  init: function () {
    $('.sidebar-toggle').click(function () {
      var $sidebar = $('.sidebar');
      if ($(this).hasClass('sidebar-active')) {
        $(this).removeClass('sidebar-active');

        $('body').animate({
          'padding-right': 0
        });
        $sidebar.animate({
          right: -320
        });
        $sidebar.find('section').css('opacity', 0);
      } else {
        $(this).addClass('sidebar-active');
        $('body').animate({
          'padding-right': 320
        });
        $sidebar.animate({
          right: 0
        }, function () {
          $sidebar.find('section:first').animate({
            'opacity': 1
          });
        });
      }
    });

    $('.site-nav-toggle').click(function () {
      $('.site-nav').slideToggle();
    });

    $(document).ready(function () {
      setTimeout(function () {
        // logo animate
        $('.logo-wrap').css('opacity', 1);
        $('.logo-line-before i').animate({
          'left': '0'
        }, function () {
          $('.site-title').css('opacity', 1).animate({
            'top': 0
          }, function () {
            $('.menu').css('opacity', 1).animate({
              'margin-top': '15px'
            });
            $('.main').css('opacity', 1).animate({
              'top': '0'
            }, function () {
              // 当有文章页面有目录时，回调不放这里，侧边栏就会一片空白
              if ($('.b3-solo-list li').length > 0 && $(window).width() > 1000) {
                $('.sidebar-toggle').click();
              }
            });
          });


        });

        $('.logo-line-after i').animate({
          'right': '0'
        });
      }, 500);
    });
  },
  initArticle: function () {
    if ($('.b3-solo-list li').length > 0 && $(window).width() > 1000) {
      // add color to sidebar menu
      $('.sidebar-toggle').addClass('has-toc');

      // append toc to sidebar menu
      var articleTocHTML = '<ul><li class="current" data-tab="toc">' + Label.tocLabel + '</li><li data-tab="site">' + Label.siteViewLabel + '</li></ul><section></section>';
      $('.sidebar').prepend(articleTocHTML);
      var $sectionF = $('.sidebar section:first').html($('.b3-solo-list')),
        $sectionL = $('.sidebar section:last');
      $sectionF.height($(window).height() - 90);
      // 切换 tab
      $('.sidebar > ul > li').click(function () {
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
          });
        } else {
          $sectionF.animate({
            "opacity": '0',
            "top": '-50px'
          }, 300, function () {
            $sectionF.hide().css('top', '-50px');
            $sectionL.animate({
              "opacity": '1',
              "top": '0'
            }, 300);
          });
        }
        $('.sidebar > ul > li').removeClass('current');
        $(this).addClass('current');
      });

      this.initToc();
    }
  },
  initToc: function () {
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
        if (scrollTop < toc[i].offsetTop + 200) {
          $articleToc.find('li').removeClass('current');
          var index = i > 0 ? i - 1 : 0;
          $articleToc.find('a[href="#' + toc[index].id + '"]').parent().addClass('current');
          break;
        }
      }
      if (scrollTop >= toc[toc.length - 1].offsetTop + 200) {
        $articleToc.find('li').removeClass('current');
        $articleToc.find('li:last').addClass('current');
      }
    });

    $(window).scroll();
  }
};
NexT.init();