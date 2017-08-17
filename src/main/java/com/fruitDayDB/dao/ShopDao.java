package com.fruitDayDB.dao;

import com.fruitDayDB.vo.Cart;
import com.fruitDayDB.vo.Fruit;

import java.util.List;

/**
 * Created by xi on 2015/10/6.
 */
public interface ShopDao {
    /*创建用户的购物车表*/
    public boolean newTable(int id);

    /*删除*/
    public int del(int id, int fid);

    /*显示购物车列表*/
    public List<Cart> show(int id);

    /*加入购物车*/
    public int add(int id, Cart cart);

    /*查找*/
    public Cart find(int id,int fid);

    /*修改*/
    public int up(int id,Cart cart);
}
