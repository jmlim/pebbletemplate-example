package io.jmlim.springboot.pebbletemplate.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private String gender;
    private String email;
}