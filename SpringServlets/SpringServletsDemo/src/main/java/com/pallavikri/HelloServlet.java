package com.pallavikri;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");

        res.setContentType("text/html");
//        res.getWriter().println("Hello World");
        PrintWriter print = res.getWriter();
        print.println("<h2><b>Hello World</b></h2>");
    }
}
