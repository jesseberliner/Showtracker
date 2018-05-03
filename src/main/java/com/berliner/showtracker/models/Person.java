package com.berliner.showtracker.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long p_id;

    @NotEmpty
    @Size(max = 50)
    private String p_firstName;

    @NotEmpty
    @Size(max = 50)
    private String p_lastName;

    @NotEmpty
    @Size(max = 100)
    private String p_email;

    private String p_password;

    private String p_username;


}
