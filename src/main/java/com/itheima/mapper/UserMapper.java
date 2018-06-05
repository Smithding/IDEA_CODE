package com.itheima.mapper;


import com.itheima.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public User selectByExample();

    public User findUserById(Integer id);

    public List<User> findUserByName(String username);

    public void insertUser(User user);
}
