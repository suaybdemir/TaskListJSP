package com.example.web_application_1;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "OgrenciEkleServlet", value = "/ogrenciEkle")
public class OgrenciEkleServlet extends HttpServlet {

    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       try
       {
           String isim = request.getParameter("isim");
           String soyisim = request.getParameter("soyisim");
           String eposta = request.getParameter("eposta");

           Ogrenci ogrenci1 = new Ogrenci(isim,soyisim,eposta);

           ogrenciVeri.ogrenciEkle(ogrenci1);

           response.sendRedirect(request.getContextPath()+"/index.jsp");
       }catch(Exception ex){
           throw new RuntimeException();
       }


    }

    public void destroy() {
    }
}