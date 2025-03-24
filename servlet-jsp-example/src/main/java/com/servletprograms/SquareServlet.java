package com.servletprograms;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class SquareServlet  extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        int k=0;
//        Cookie[] cookie=  req.getCookies();//client will send more cookies that why it returns a array.
//        for(Cookie c:cookie){
//            if(c.getName().equals("k")){
//                k=Integer.parseInt(c.getValue());
//            }
//        }

//        HttpSession httpSession= req.getSession();
//        int k=(int)httpSession.getAttribute("k");


        int k=Integer.parseInt(req.getAttribute("k").toString());
        k=k*k;
        PrintWriter out = res.getWriter();
        out.println(k);
    }
}
