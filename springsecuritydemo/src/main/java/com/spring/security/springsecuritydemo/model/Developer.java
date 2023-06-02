package com.spring.security.springsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Developer {
    private long id;
    private String firstname;
    private String lastname;
}
