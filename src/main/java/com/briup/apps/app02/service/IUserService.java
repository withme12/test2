package com.briup.apps.app02.service;
import java.util.*;
import com.briup.apps.app02.bean.User;

public interface IUserService {
List<User> findAll();
User findUserById(long id);
//void insertUser();
void deleteUserById(long id)throws Exception;
//void updateUserById();
void insertOrUpdate(User user) throws Exception;
List<User> query(User user);
}
