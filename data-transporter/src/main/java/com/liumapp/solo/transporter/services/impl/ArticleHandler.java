package com.liumapp.solo.transporter.services.impl;

import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.domain.B3SoloArticleExample;
import com.liumapp.solo.transporter.mapper.B3SoloArticleMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * file ArticleService.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class ArticleHandler implements HandDataService {

    @Autowired
    private JsonFileContents jsonFileContents;

    @Override
    public void handle() {

    }
}
