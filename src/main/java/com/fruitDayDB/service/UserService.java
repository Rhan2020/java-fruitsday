package com.fruitDayDB.service;

import com.fruitDayDB.dao.ShopDao;
import com.fruitDayDB.dao.ShopDaoImpl;
import com.fruitDayDB.dao.UserDao;
import com.fruitDayDB.dao.UserDaoImpl;
import com.fruitDayDB.vo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by xi on 2015/10/4.
 */
public class UserService {
    public static User add(User u){
        UserDao userDao=new UserDaoImpl();
        int num=userDao.add(u);
        User user=null;
        if(num==1)
        {
            user=UserService.login(u.getEmail(),u.getPwd(),true);

            ShopDao shopDao=new ShopDaoImpl();
            boolean boo=shopDao.newTable(user.getId());

            if(!boo)
            {
                UserService.del(user);
                return null;
            }
        }

        return  user;

    }

    public static User login(String str,String pwd,boolean boo)
    {
        UserDao userDao=new UserDaoImpl();
        User u=userDao.findByStr(str,boo);

        if(pwd.equals(u.getPwd())) {
            u.setPwd("******");
            return u;
        }
        else
            return null;
    }

    public static boolean del(User user)
    {
        UserDao userDao=new UserDaoImpl();
        int num=userDao.del(user);
        if(num==1)
            return true;
        else
            return false;
    }

    public static List<User> alluser()
    {
        UserDao userDao=new UserDaoImpl();

        return  userDao.findAll();
    }
    public static List<Integer> root()
    {
        UserDao userDao=new UserDaoImpl();

        return  userDao.root();
    }

    public static boolean upUser(User user)
    {
        UserDao userDao=new UserDaoImpl();
        int num=userDao.update(user);
        if(num==1)
            return true;
        else
            return false;
    }

    public static User findById(int id)
    {
        UserDao userDao=new UserDaoImpl();
        return  userDao.findById(id);
    }
}
