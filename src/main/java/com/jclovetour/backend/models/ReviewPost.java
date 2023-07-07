package com.jclovetour.backend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "reviewposts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String title;
    
    @Column(nullable = true)
    private String content;

    @Column(length = 50, nullable = false)
    private String date;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String password;

    @Column(length = 20, nullable = false)
    private String phoneNumber;
}
