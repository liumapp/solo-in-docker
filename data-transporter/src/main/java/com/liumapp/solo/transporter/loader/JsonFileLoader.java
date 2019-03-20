package com.liumapp.solo.transporter.loader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * file JsonFileLoader.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/20
 */
@Component
@Scope("prototype")//确保可以与其他component交互
public class JsonFileLoader implements Runnable {

    private static final Logger Logger = LoggerFactory.getLogger(JsonFileLoader.class);

    @Override
    public void run() {
        Logger.info("JsonFileLoader begin...");

    }
}
