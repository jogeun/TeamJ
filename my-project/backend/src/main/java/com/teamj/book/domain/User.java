package com.teamj.book.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table (name ="Users")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_no")
    private int userNo;

    @Column(name="user_name")
    private String userName;

    public User(){

    }
}
