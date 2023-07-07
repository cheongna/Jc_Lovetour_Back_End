package com.jclovetour.backend.models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "mainposts")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MainPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    @Lob
    private String text;

    @Column(length = 50, nullable = false)
    private String title;

    @CreationTimestamp
    private LocalDate date;

    @Column(nullable = true)
    private int views = 0;
}
