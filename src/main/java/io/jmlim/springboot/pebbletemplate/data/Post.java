package io.jmlim.springboot.pebbletemplate.data;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Post {
    private long userId;
    private String userName;
    private Date date;
    private int likes;
    private String details;
}