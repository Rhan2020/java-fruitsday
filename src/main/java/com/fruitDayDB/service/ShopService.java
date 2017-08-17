package com.fruitDayDB.service;

import com.fruitDayDB.dao.ShopDao;
import com.fruitDayDB.dao.ShopDaoImpl;
import com.fruitDayDB.vo.Cart;
import com.fruitDayDB.vo.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi on 2015/10/6.
 */
public class ShopService {
    public static boolean del(int id,int fid)
    {
        ShopDao shopDao=new ShopDaoImpl();
        int num=shopDao.del(id,fid);
        if(num==1)
            return true;
        else
            return false;
    }

    public static List<Cart> showAll(int id)
    {
        ShopDao shopDao=new ShopDaoImpl();

        return shopDao.show(id);
    }
    public static List<Fruit> show(int id,boolean boo)
    {
                ;
        List<Cart> carts=ShopService.showAll(id);

        List<Fruit> fruits=new ArrayList<Fruit>();

        if(boo)
        {
            for(Cart cart:carts)
            {
                if(cart.isCart())
                {
                    Fruit fruit=new Fruit();
                    fruit=FruitService.info(cart.getFid());
                    fruits.add(fruit);
                }
            }
        }
        else
        {
            for(Cart cart:carts)
            {
                if(cart.isStar())
                {
                    Fruit fruit=new Fruit();
                    fruit=FruitService.info(cart.getFid());
                    fruits.add(fruit);
                }
            }
        }

        return fruits;
    }

    public static void add(int id,Cart cart)
    {
        ShopDao shopDao=new ShopDaoImpl();
        int num=shopDao.add(id, cart);
        System.out.println("num:"+num);
    }

    public static Cart find(int id,int fid)
    {
        ShopDao shopDao=new ShopDaoImpl();
        return shopDao.find(id,fid);
    }

    public static boolean up(int id,Cart cart)
    {
        ShopDao shopDao=new ShopDaoImpl();
        int num=shopDao.up(id,cart);
        if(num==1)
            return true;
        else
            return false;

    }
}
