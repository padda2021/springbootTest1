package com.itcast.controller;

import com.itcast.domain.User;
import com.itcast.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author XiongSongChao
 * @create 2019-08-31 17:43
 */
@Controller
public class MybaitsController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    @ResponseBody
    public List<User> queryTest() {
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
