package com.briup.apps.app02.web.controller;

import com.briup.apps.app02.bean.User;
import com.briup.apps.app02.service.IUserService;
import com.briup.apps.app02.utils.Message;
import com.briup.apps.app02.utils.MessageUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @ApiOperation("查询所有")
    @GetMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @ApiOperation("通过ID查询")
    @GetMapping("/findUserById")
    public User findUserById(Long id){
     return userService.findUserById(id);
    }
//    @ApiOperation("插入记录")
//    @GetMapping("/insertUserById")
//    public void insertUserById(){
//        userService.insertUser();
//    }
     @ApiOperation("根据ID删除用户")
    @GetMapping("/deleteUserById")
    public String deleteUserByName(@ApiParam(value="主键",required = true) @RequestParam("id") long id)throws Exception{
       try{userService.deleteUserById(id);
           return("删除成功");
       }catch(Exception e){
           e.printStackTrace();
           return e.getMessage();
       }


    }

//    @GetMapping("/updateUserById")
//    public void updateUserById(){
//        userService.updateUserById();
//    }
    @ApiOperation("插入或删除")
    @GetMapping("insertOrUpdate")
    public String  insertOrUpdate(User user)throws Exception{
        try {
            userService.insertOrUpdate(user);
            return "保存成功";
        }catch(Exception e){
            e.printStackTrace();
            return "保存失败";
        }


    }
    @ApiOperation("模糊查询")
    @GetMapping("query")
    public Message query(User user){
        List<User> list=userService.query(user);
        return MessageUtil.success("success",list);
    }

}
