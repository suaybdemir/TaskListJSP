package com.example.avp2_final;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "OgrenciGuncelleTarihServlet", value = "/ogrenciGuncelleTarih")
public class OgrenciGuncelleTarihServlet extends HttpServlet {

    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        List<Ogrenci> ogrenciler= ogrenciVeri.ogrencileriGetir();
        request.setAttribute("ogrenci_listesi",ogrenciler);
        RequestDispatcher rs1= request.getRequestDispatcher("ogrenci-guncelle-form-tarih.jsp");
        rs1.forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        try
        {
            String gorevadi = request.getParameter("gorevadi");

            String gorevtarihson= request.getParameter("gorevtarihson");

            ogrenciVeri.gorevGuncelleTarih(gorevtarihson,gorevadi);

            response.sendRedirect("ogrenci-guncelle-form-tarih.jsp");

        }catch(Exception ex)
        {
            throw new RuntimeException();
        }
    }

    public void destroy() {
    }
}