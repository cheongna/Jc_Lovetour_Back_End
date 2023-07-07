package com.jclovetour.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jclovetour.backend.models.MainPost;

public interface MainPostRepository extends JpaRepository<MainPost, Integer>  {
    
}
