package com.fruitDayDB.dao;

import com.fruitDayDB.db.DBUtils;
import com.fruitDayDB.vo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi on 2015/10/4.
 */
public class UserDaoImpl implements UserDao {

    public int del(User u) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE  FROM user WHERE id="+u.getId();
        int num=0;
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            num=ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(null, ps, conn);
            return num;
        }
    }

    /**
     * 实现添加方法--添加用户
     */

    public int add(User u) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "insert into user(email,phone,pwd,uname)values(?,?,?,?)";
        int num=0;
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getPhone());
            ps.setString(3, u.getPwd());
            ps.setString(4,u.getUname());
            num=ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(null, ps, conn);
            return num;
        }
    }

    /*登陆*/

    public User findByStr(String str, boolean boo){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        String sql="";
        if(boo)
            sql = "select id,email,phone,pwd,uname from user where email=?";
        else
            sql = "select id,email,phone,pwd,uname from user where phone=?";

        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, str);
            rs = ps.executeQuery();
            if(rs.next()){
                u = new User();
                u.setId(rs.getInt("id"));
                u.setEmail(rs.getString("email"));
                u.setPhone(rs.getString("phone"));
                u.setPwd(rs.getString("pwd"));
                u.setUname(rs.getString("uname"));
                System.out.println(u.toString());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return u;
    }


    public int upPwd(User u) {
        Connection conn = null;
        PreparedStatement ps = null;
        int num=0;
        String sql = "UPDATE user SET pwd=? WHERE id=?;";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,u.getPwd());
            ps.setInt(2, u.getId());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return num;
    }

    /**
     * 更新方法
     */

    public int update(User u) {
        Connection conn = null;
        PreparedStatement ps = null;
        int num=0;
        String sql = "UPDATE user SET email=? ,phone=? ,uname=?,pwd=? WHERE id=?;";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,u.getEmail());
            ps.setString(2, u.getPhone());
            ps.setString(3,u.getUname());
            ps.setString(4,u.getPwd());
            ps.setInt(5, u.getId());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return num;
    }


    /**
     * 根据ID查询一个对象
     */

    public User findById(int id)  {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
        String sql = "select email,phone,uname from user where id=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                u = new User();
                u.setId(id);
                u.setEmail(rs.getString("email"));
                u.setPhone(rs.getString("phone"));
                u.setPwd("******");
                u.setUname(rs.getString("uname"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return u;
    }

    /**
     * 查询所有数据
     */

    public List<User> findAll() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u=null;
        List<User> users = new ArrayList<User>();
        String sql = "select id,email,phone,uname from user";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                u = new User();
                u.setId(rs.getInt("id"));
                u.setEmail(rs.getString("email"));
                u.setPhone(rs.getString("phone"));
                u.setPwd("******");
                u.setUname(rs.getString("uname"));
                users.add(u);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return users;
    }

    public List<Integer> root() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Integer> uids=new ArrayList<Integer>();
        int uid=0;
        String sql = "select uid from root";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                uid=rs.getInt("uid");
                uids.add(uid);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return uids;
    }
}
