package com.comp;

import com.comp.model.Comment;
import com.comp.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext container = SpringApplication.run(MyApp.class,args);
        CommentService cs = container.getBean(CommentService.class);
        cs.publishComment(comment);

    }
}
