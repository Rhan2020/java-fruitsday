package com.fruitDayDB.service;

import com.fruitDayDB.dao.FruitDao;
import com.fruitDayDB.dao.FruitDaoImpl;
import com.fruitDayDB.vo.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi on 2015/10/5.
 */
public class FruitService {
    public static Fruit info(int fid)
    {
        FruitDao fruitDao=new FruitDaoImpl();
        Fruit fruit=fruitDao.findByFid(fid);

        if(fruit==null)
        {
            fruit=new Fruit(1,"商品不存在","",0,"","",0);
        }

        return fruit;
    }

    public static List<Fruit> hot()
    {
        FruitDao fruitDao=new FruitDaoImpl();
        return  fruitDao.findHot();
    }

    public static List<Fruit> all()
    {

        FruitDao fruitDao=new FruitDaoImpl();
        List<Fruit> serfruits=fruitDao.findall();
        return serfruits;
    }

    public static List<Fruit> ser(String ser)
    {
        FruitDao fruitDao=new FruitDaoImpl();
        List<Fruit> fruits= fruitDao.findall();

        List<Fruit> serfruits=new ArrayList<Fruit>();

        for(Fruit fruit:fruits)
        {
            if(ser.indexOf(fruit.getFname())!=-1)
                serfruits.add(fruit);
            else if(fruit.getFname().indexOf(ser)!=-1)
                serfruits.add(fruit);
        }

        return serfruits;

    }

    public static boolean add(Fruit fruit)
    {
        FruitDao fruitDao=new FruitDaoImpl();
        int num=fruitDao.add(fruit);
        if(num==1)
            return true;
        else
            return false;
    }

    public static boolean del(int fid)
    {
        FruitDao fruitDao=new FruitDaoImpl();
        int num=fruitDao.del(fid);
        if(num==1)
            return true;
        else
            return false;
    }

    public  static  boolean up(Fruit fruit)
    {
        FruitDao fruitDao=new FruitDaoImpl();
        int num=fruitDao.up(fruit);
        if(num==1)
            return true;
        else
            return false;
    }
}
