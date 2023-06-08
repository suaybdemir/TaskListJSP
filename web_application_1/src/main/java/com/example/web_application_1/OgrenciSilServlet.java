package com.example.web_application_1;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "OgrenciSilServlet", value = "ogrenciSil")
public class OgrenciSilServlet extends HttpServlet {

    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       try
       {
           String ogrenciId = request.getParameter("ogrenciId");

            ogrenciVeri.ogrenciSil(Integer.parseInt(ogrenciId));

           response.sendRedirect(request.getContextPath()+"/index.jsp");
       }catch(Exception ex){
           throw new RuntimeException();
       }

    }

    public void destroy() {
    }
}