package com.servletprograms;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
       int i=Integer.parseInt(req.getParameter("num1"));
       int j=Integer.parseInt(req.getParameter("num2"));
       int k=i+j;
       req.setAttribute("k",k);


//       PrintWriter out=res.getWriter();
//       out.println(k);
//        HttpSession httpSession=req.getSession();
//        httpSession.setAttribute("k",k);

//        Cookie cookie=new Cookie("k",k+"");
//        res.addCookie(cookie);


//        res.sendRedirect("/sq");//which is used if the client wants to know from where response is coming.




        RequestDispatcher requestDispatcher=req.getRequestDispatcher("form.jsp");
        requestDispatcher.forward(req,res);

    }
}
