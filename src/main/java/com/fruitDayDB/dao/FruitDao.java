package com.fruitDayDB.dao;

import com.fruitDayDB.vo.Fruit;

import java.util.List;

/**
 * Created by xi on 2015/10/5.
 */
public interface FruitDao {

    //按商品编号查找
    public Fruit findByFid(int fid);

    //热卖商品
    public List<Fruit> findHot();

    //全部商品
    public List<Fruit> findall();

    //添加商品
    public int add(Fruit fruit);

    //删除商品
    public int del(int fid);

    //更新商品
    public   int up(Fruit fruit);
}
