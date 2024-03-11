package com.comp;

import com.comp.config.ProjectConfig;
import com.comp.model.Comment;
import com.comp.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
            Comment comment = new Comment();
            comment.setAuthor("Johnson");
            comment.setText("Spring Framework");

            ApplicationContext container = new AnnotationConfigApplicationContext(ProjectConfig.class);
            CommentService cs = container.getBean(CommentService.class);
            cs.publishComment(comment);

    }
}
