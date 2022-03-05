package com.synisys.ServletTutorial;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        printWriter.write("Hello Servlet!");
    }
}
