package com.circle.common.web;

import com.circle.common.domain.TestUser;
import com.circle.common.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestUserService testUserService;

    @GetMapping("/list/testUser")
    public ResponseEntity<List<TestUser>> listTestUser(){
        return ResponseEntity.ok(testUserService.list());
    }

    @RequestMapping("/insert")
    public ResponseEntity testInsertUser(@RequestBody TestUser testUser){
        testUserService.save(testUser);
        return new ResponseEntity(HttpStatus.OK);
    }
}
