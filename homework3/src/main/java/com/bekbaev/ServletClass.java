package com.bekbaev;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.util.Date;
@WebServlet(name = "ServletClass", urlPatterns = {"/zalupa"})
public class ServletClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response)
        throws ServletException, IOException{
        Date date = new Date();
        response.getWriter().println("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n"+
                "<script>window.onload = function(){\n" +
                "  window.setInterval(function(){\n" +
                "  var now = new Date();\n" +
                "  var clock = document.getElementById(\"clock\");\n" +
                "  clock.innerHTML = now.toLocaleTimeString();\n" +
                "  },1000);\n" +
                "};</script>\n"+
                "<body>\n" +
                "<style>#clock{\n" +
                "  color: #000;\n" +
                "  font-weight: bold;\n" +
                "  font-size: 30px;</style>\n"+
                "\n" +
                "<div id=\"clock\"></div>\n"+
                "<h1>Hello world</h1>\n" +
                "\n" +
                "<p>Today is </p>\n" + date +
                "\n" +
                "</body>\n" +
                "</head>\n" +
                "</html>\n");
    }
}
