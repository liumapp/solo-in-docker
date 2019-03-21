package com.liumapp.solo.transporter.services.impl;

import com.liumapp.solo.transporter.db.mapper.B3SoloArchivedateArticleMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * file ArchivedateArticleHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class ArchivedateArticleHandler implements HandDataService {

    @Autowired
    private B3SoloArchivedateArticleMapper mapper;

    @Override
    public void handle() {

    }

}
