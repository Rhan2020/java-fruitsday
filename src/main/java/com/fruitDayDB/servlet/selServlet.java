package com.fruitDayDB.servlet;

import com.fruitDayDB.service.FruitService;
import com.fruitDayDB.vo.Fruit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xi on 2015/10/16.
 */
public class selServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        req.setCharacterEncoding("utf-8");
        String selkey=req.getParameter("selkey");

        if("all".equals(selkey))
            doAll(req,resp);
        else if("out".equals(selkey))
            doOut(req,resp);
        else if("in".equals(selkey))
            doIn(req,resp);
        else if ("ser".equals(selkey))
            doSer(req,resp);
        else if ("mon".equals(selkey))
            doMon(req,resp);

    }

    protected void doAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Fruit> allFruits= FruitService.all();

        req.setAttribute("selFruits", allFruits);

        req.getRequestDispatcher(req.getContextPath()+"sel.jsp").forward(req, resp);
    }

    protected void doOut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    protected void doIn(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    protected void doSer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ser=req.getParameter("ser");
        System.out.println(ser);
        List<Fruit> serFruits= FruitService.ser(ser);

        req.setAttribute("selFruits", serFruits);
        req.getRequestDispatcher("sel.jsp").forward(req, resp);
    }

    protected void doMon(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ser=req.getParameter("ser");

        List<Fruit> fruits= FruitService.all();

        List<Fruit> selfruits=new ArrayList<Fruit>();
        int n=0,m=0;
        if("a".equals(ser))
        {
            n=0;
            m=100;
        }
        else if("b".equals(ser))
        {
            n=100;
            m=300;
        }
        else if("c".equals(ser))
        {
            n=300;
            m=99999999;
        }

        for(Fruit fruit:fruits)
        {
           if(fruit.getUp()>=n&&fruit.getUp()<=m)
               selfruits.add(fruit);
        }
        req.setAttribute("selFruits", selfruits);

        req.getRequestDispatcher("sel.jsp").forward(req, resp);
    }
}
