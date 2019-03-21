package com.liumapp.solo.transporter.loader.start;

import com.liumapp.solo.transporter.loader.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

/**
 * file StartLoadingFile.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/3/21
 */
@Component
public class StartLoadingFile {

    @Autowired
    private TaskExecutor taskExecutor;

    @Autowired
    private ArchivedateArticleLoader archivedateArticleLoader;

    @Autowired
    private ArticleLoader articleLoader;

    @Autowired
    private CommentLoader commentLoader;

    @Autowired
    private LinkLoader linkLoader;

    @Autowired
    private TagArticleLoader tagArticleLoader;

    @Autowired
    private TagLoader tagLoader;

    public void start () {
        taskExecutor.execute(archivedateArticleLoader);
        taskExecutor.execute(articleLoader);
        taskExecutor.execute(commentLoader);
        taskExecutor.execute(linkLoader);
        taskExecutor.execute(tagArticleLoader);
        taskExecutor.execute(tagLoader);
    }

}
