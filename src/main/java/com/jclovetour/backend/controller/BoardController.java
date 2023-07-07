package com.jclovetour.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jclovetour.backend.models.MainPost;
import com.jclovetour.backend.repository.MainPostRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class BoardController {
    private final MainPostRepository mainPostRepository;

    @PostMapping("/board/announce/add")
    public HttpStatus addContent(@RequestBody MainPost data) {
        mainPostRepository.save(data);
        return HttpStatus.OK;
    }

    @GetMapping("/board/announce")
    public void test() {

    }
}
