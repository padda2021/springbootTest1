package com.itcast.mapper;

import com.itcast.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author XiongSongChao
 * @create 2019-08-31 17:38
 */
@Mapper
public interface UserMapper {

    List<User> queryUserList();
}
