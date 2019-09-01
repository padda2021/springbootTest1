package com.itcast;

import com.itcast.domain.User;
import com.itcast.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author XiongSongChao
 * @create 2019-08-31 18:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatis002Application.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void testMybatis() {
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
    }
}
