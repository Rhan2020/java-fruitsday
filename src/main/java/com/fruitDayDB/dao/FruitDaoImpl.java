package com.fruitDayDB.dao;

import com.fruitDayDB.db.DBUtils;
import com.fruitDayDB.vo.Fruit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi on 2015/10/5.
 */
public class FruitDaoImpl implements FruitDao {

    public Fruit findByFid(int fid) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Fruit f= null;
        String sql="SELECT fname,spec,up,t1,t2,inum FROM fruits WHERE fid=?";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,fid);
            rs = ps.executeQuery();
            if(rs.next()){
                f = new Fruit();
                f.setFname(rs.getString("fname"));
                f.setSpec(rs.getString("spec"));
                f.setUp(rs.getDouble("up"));
                f.setFid(fid);
                f.setT1(rs.getString("t1"));
                f.setT2(rs.getString("t2"));
                f.setInum(rs.getInt("inum"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
        }
        return f;
    }


    public List<Fruit> findHot() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Fruit> hotfruits = new ArrayList<Fruit>();
        Fruit f=null;
        String sql = "SELECT * FROM hotfruits t1,fruits t2 WHERE t1.fid=t2.fid;";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                f = new Fruit();
                f.setFname(rs.getString("fname"));
                f.setSpec(rs.getString("spec"));
                f.setUp(rs.getDouble("up"));
                f.setFid(rs.getInt("fid"));
                f.setT1(rs.getString("t1"));
                f.setT2(rs.getString("t2"));
                f.setInum(rs.getInt("inum"));
                hotfruits.add(f);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
            return hotfruits;
        }

    }

    public List<Fruit> findall() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Fruit> fruits = new ArrayList<Fruit>();
        Fruit f=null;
        String sql = "SELECT  * FROM fruits;";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                f = new Fruit();
                f.setFname(rs.getString("fname"));
                f.setSpec(rs.getString("spec"));
                f.setUp(rs.getDouble("up"));
                f.setFid(rs.getInt("fid"));
                f.setT1(rs.getString("t1"));
                f.setT2(rs.getString("t2"));
                f.setInum(rs.getInt("inum"));
                fruits.add(f);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, ps, conn);
            return fruits;
        }

    }

    public int add(Fruit fruit) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "insert into fruits(fname,spec,up,t1,t2,inum,fid)values(?,?,?,?,?,?,?)";
        int num=0;
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,fruit.getFname());
            ps.setString(2,fruit.getSpec());
            ps.setDouble(3, fruit.getUp());
            ps.setString(4, fruit.getT1());
            ps.setString(5, fruit.getT2());
            ps.setInt(6, fruit.getInum());
            ps.setInt(7, fruit.getFid());
            num=ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(null, ps, conn);
            return num;
        }
    }

    public int del(int fid) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM fruits WHERE fid="+fid;
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

    public int up(Fruit fruit)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        int num=0;
        String sql = "UPDATE fruits SET fname=? ,spec=? ,up=?,t1=?,t2=?,inum=? WHERE fid=?;";
        try{
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1,fruit.getFname());
            ps.setString(2,fruit.getSpec());
            ps.setDouble(3, fruit.getUp());
            ps.setString(4, fruit.getT1());
            ps.setString(5, fruit.getT2());
            ps.setInt(6, fruit.getInum());
            ps.setInt(7, fruit.getFid());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtils.close(null, ps, conn);
        }
        return num;
    }
}
