package com.wangcan.adapter.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wangcan.client.api.IUserService;
import com.wangcan.client.dto.UserSaveCmd;
import com.wangcan.client.dto.UserByIdQry;
import com.wangcan.client.dto.data.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserService IUserService;

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello, welcome to COLA world!";
    }

    @GetMapping(value = "/user")
    public MultiResponse<UserDTO> getById(@RequestParam(required = false) String id){
        UserByIdQry userByIdQry = new UserByIdQry();
        userByIdQry.setId(1L);
        return IUserService.getById(userByIdQry);
    }

    @PostMapping(value = "/user")
    public Response save(@RequestBody UserSaveCmd userSaveCmd){
        return IUserService.save(userSaveCmd);
    }
}
