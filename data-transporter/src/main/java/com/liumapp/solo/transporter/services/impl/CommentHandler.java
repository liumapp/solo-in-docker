package com.liumapp.solo.transporter.services.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.solo.transporter.contents.JsonFileContents;
import com.liumapp.solo.transporter.db.entity.B3SoloComment;
import com.liumapp.solo.transporter.db.mapper.B3SoloCommentMapper;
import com.liumapp.solo.transporter.services.HandDataService;
import com.liumapp.solo.transporter.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * file CommentHandler.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Service
public class CommentHandler implements HandDataService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JsonFileContents jsonFileContents;

    @Autowired
    private B3SoloCommentMapper mapper;

    @Autowired
    private CommonUtil commonUtil;

    @Override
    public void handle() {
        JSONArray comments = jsonFileContents.getComment();
        B3SoloComment b3SoloComment = new B3SoloComment();
        for (Iterator iterator = comments.iterator(); iterator.hasNext();) {
            JSONObject comment = (JSONObject) iterator.next();
            b3SoloComment.setOId(comment.get("oId").toString());
            b3SoloComment.setCommentContent(comment.get("commentContent").toString());
            b3SoloComment.setCommentCreated(commonUtil.oldDateToMilliSec(comment.get("commentDate").toString()));
            b3SoloComment.setCommentName(comment.get("commentName").toString());
            b3SoloComment.setCommentOnId(comment.get("commentOnId").toString());
            b3SoloComment.setCommentOnType(comment.get("commentOnType").toString());
            b3SoloComment.setCommentSharpURL(comment.get("commentSharpURL").toString());
            b3SoloComment.setCommentThumbnailURL(comment.get("commentThumbnailURL").toString());
            b3SoloComment.setCommentURL(comment.get("commentURL").toString());
            b3SoloComment.setCommentOriginalCommentId(comment.get("commentOriginalCommentId").toString());
            b3SoloComment.setCommentOriginalCommentName(comment.get("commentOriginalCommentName").toString());
            mapper.insert(b3SoloComment);
        }
        logger.info("成功插入" + comments.size() + "条评论数据");
    }

}
