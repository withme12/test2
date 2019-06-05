package com.briup.apps.app02.dao;
import java.util.*;
import com.briup.apps.app02.bean.User;

public interface UserMapper {
    List<User> findAll();
    User findUserById(long id);
    void updateUserById(User user);
    void insertUser(User user);
    void deleteUserById(long id);
    List<User> query(User user);
//    void insertOrUpdate(User user);
}
