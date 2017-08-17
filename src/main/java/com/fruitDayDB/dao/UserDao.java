package com.fruitDayDB.dao;

import com.fruitDayDB.vo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by xi on 2015/10/4.
 */
public interface UserDao {
    //添加用户
    public int add(User u);

    //用户按邮箱或手机号登陆
    public User findByStr(String str, boolean boo);

    //查看所有人信息
    public List<User> findAll();

    /*删除*/
    public int del(User u);

    //修改信息
    public int update(User u);

    //修改密码
    public int upPwd(User u);

    //查看个人信息
    public User findById(int id);

    //获取管理员uid
    public List<Integer> root();

}
