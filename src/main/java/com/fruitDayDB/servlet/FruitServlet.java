package com.fruitDayDB.servlet;

import com.fruitDayDB.service.FruitService;
import com.fruitDayDB.service.ShopService;
import com.fruitDayDB.vo.Cart;
import com.fruitDayDB.vo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by xi on 2015/10/5.
 */
public class FruitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key=req.getParameter("key");

        if(key.equals("info"))
            doInfo(req,resp);
        else if(key.equals("hot"))
            doHot(req,resp);
    }

    protected void doInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int fid=Integer.parseInt(req.getParameter("fid"));

        Fruit fruit= FruitService.info(fid);

        req.setAttribute("fruit", fruit);

        if(!(Integer.parseInt(req.getParameter("id"))==0)) {

            int id=Integer.parseInt(req.getParameter("id"));

            if(id!=0) {

                List<Cart> carts = ShopService.showAll(id);

                for (Cart cart : carts) {
                    if (cart.getFid() == fid) {
                        if(cart.isCart())
                            req.setAttribute("tit1", "已加入购物车");
                        if(cart.isStar())
                            req.setAttribute("tit2", "已关注");
                        break;
                    }
                }
            }
        }

        doHot(req,resp);

        req.getRequestDispatcher("fruit_info.jsp").forward(req, resp);

    }

    protected void doHot(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Fruit> fruits=FruitService.hot();

        req.setAttribute("fruits", fruits);

    }

}
