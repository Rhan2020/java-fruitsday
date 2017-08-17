package com.fruitDayDB.servlet;

import com.fruitDayDB.service.ShopService;
import com.fruitDayDB.vo.Cart;
import com.fruitDayDB.vo.Fruit;
import com.fruitDayDB.vo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

/**
 * Created by xi on 2015/10/6.
 */
public class ShopServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");

        if(key.equals("del"))
            doDel(req,resp);
        else if(key.equals("show"))
            doShow(req,resp);
        else if(key.equals("add"))
            doAdd(req,resp);
        else if(key.equals("num"))
            doNum(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    protected void doDel(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart=new Cart();
        int id=Integer.parseInt(req.getParameter("uid"));
        cart.setFid(Integer.parseInt(req.getParameter("fid")));
        String str = req.getParameter("str");
        if(id!=0) {
            Cart serCart=ShopService.find(id, cart.getFid());
            System.out.println(serCart.toString());
            if (str.equals("cart")) {
                cart.setIsCart(false);
                cart.setIsStar(serCart.isStar());
            } else {
                cart.setIsStar(false);
                cart.setIsCart(serCart.isCart());
            }
            System.out.println(serCart.toString());
            if(cart.isCart()||cart.isStar())
            {
                ShopService.up(id, cart);
            }
            else
            {
                ShopService.del(id,cart.getFid());
            }
        }
        if (str.equals("cart")) {
            req.getRequestDispatcher("/ShopServlet?key=show&id="+id+"&boob=cart").forward(req, resp);
        } else {
            req.getRequestDispatcher("/ShopServlet?key=show&id="+id+"&boob=star").forward(req, resp);
        }

    }


    protected void doShow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));


        String boob=req.getParameter("boob");

        Boolean boo=null;

        if(boob.equals("cart"))
            boo=true;
        else if(boob.equals("star"))
            boo=false;

        if(id!=0) {
            List<Fruit> fruits = ShopService.show(id, boo);

            req.setAttribute("fruits", fruits);

            if (boo)
                req.getRequestDispatcher("showcart.jsp").forward(req, resp);
            else
                req.getRequestDispatcher("showstar.jsp").forward(req, resp);
        }
        else
            req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }



    protected void doAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cart cart=new Cart();
        Cart serCart=null;
        int id=Integer.parseInt(req.getParameter("id"));

        cart.setFid(Integer.parseInt(req.getParameter("fid")));

        if(id!=0) {
            String str = req.getParameter("str");
            serCart=ShopService.find(id, cart.getFid());
            if(cart.getFid()!=serCart.getFid())
            {
                if (str.equals("cart")) {
                    cart.setIsStar(false);
                    cart.setIsCart(true);
                } else {
                    cart.setIsStar(true);
                    cart.setIsCart(false);
                }

                ShopService.add(id, cart);
            }
            else
            {
                if(str.equals("cart"))
                {
                    cart.setIsCart(true);
                    cart.setIsStar(serCart.isStar());
                }
                else
                {
                    cart.setIsStar(true);
                    cart.setIsCart(serCart.isCart());
                }

                ShopService.up(id,cart);
            }


        }

        req.getRequestDispatcher("/FruitServlet?key=info&id="+id+"&fid="+cart.getFid()).forward(req, resp);

    }

    protected void doNum(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num=0;
        HttpSession session=req.getSession();
        if(session.getAttribute("user")!=null) {
            User user = (User) session.getAttribute("user");
            List<Fruit> fruits = ShopService.show(user.getId(), true);
            num = fruits.size();
        }
        req.setAttribute("num",num);
    }
}
