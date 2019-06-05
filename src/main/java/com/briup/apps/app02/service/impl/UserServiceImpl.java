package com.briup.apps.app02.service.impl;

import com.briup.apps.app02.bean.User;
import com.briup.apps.app02.dao.UserMapper;
import com.briup.apps.app02.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
   @Resource
   private UserMapper userMapper;

    @Override
    public List<User> findAll(){

        return userMapper.findAll();
    }

    @Override
    public User findUserById(long id){

        return userMapper.findUserById(id);
    }


    @Override
    public void deleteUserById(long id) throws Exception{
        User user=userMapper.findUserById(id);
        if(user==null){
        throw new Exception("数据不存在");
        }
        userMapper.deleteUserById(id);
    }

    @Override
    public void insertOrUpdate(User user) throws Exception {

        if(user.getId()==null){
            user.setStatus("正常");
            userMapper.insertUser(user);
        }else{
            userMapper.updateUserById(user);
        }

    }

    @Override
    public List<User> query(User user) {
        return userMapper.query(user);
    }
}
