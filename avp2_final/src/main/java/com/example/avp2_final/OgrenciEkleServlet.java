package com.example.avp2_final;

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
            String gorevadi = request.getParameter("gorevadi");
            String gorevinf = request.getParameter("gorevinf");
            String gorevspec = request.getParameter("gorevspec");
            String gorevtarihson = request.getParameter("gorevtarihson");
            String gorevtarihbas = request.getParameter("gorevtarihbas");

            Ogrenci ogrenci1 = new Ogrenci(gorevadi,gorevinf,gorevspec,gorevtarihson,gorevtarihbas);

            ogrenciVeri.ogrenciEkle(ogrenci1);

            response.sendRedirect(request.getContextPath()+"/ogrenci-ekle-form.jsp");

        }catch(Exception ex)
        {
            throw new RuntimeException();
        }
    }

    public void destroy() {
    }
}