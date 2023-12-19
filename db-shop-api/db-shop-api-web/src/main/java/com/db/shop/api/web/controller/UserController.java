package com.db.shop.api.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/user")
@RestController
@Api(tags = "用户模块")
public class UserController {

    @PostMapping("/login")
    @ApiOperation("登录")
    public void login() {

    }
}
