package com.liumapp.solo.transporter.util;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Component;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

/**
 * file CommonUtil.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Component
public class CommonUtil {

    public long oldDateToMilliSec (String oldDate) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(oldDate, dateTimeFormatter);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("GMT+8"));
        return zonedDateTime.toInstant().toEpochMilli();
    }

    public String randImage() {
        try {
            final long min = DateUtils.parseDate("20171104", new String[]{"yyyyMMdd"}).getTime();
            final long max = System.currentTimeMillis();
            final long delta = max - min;
            final long time = ThreadLocalRandom.current().nextLong(0, delta) + min;
            return "https://img.hacpai.com/bing/" + DateFormatUtils.format(time, "yyyyMMdd") + ".jpg";
        } catch (final Exception e) {
            return "https://img.hacpai.com/bing/20171104.jpg";
        }
    }

    /**
     * 0 发布
     * 1 草稿
     */
    public Integer isPublished (Integer old) {
        if (old.equals(1)) {
            return 0;
        } else {
            return 1;
        }
    }

}
