package com.example.avp2_final;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "OgrencilerTarihServlet", value = "/ogrenci-tarih")
public class OgrencilerTarihServlet extends HttpServlet {

    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<Ogrenci> ogrenciler = ogrenciVeri.ogrencileriGetir();

        request.setAttribute("ogrenci_listesi",ogrenciler);

        RequestDispatcher rs1 = request.getRequestDispatcher("/ogrenci-tarih.jsp");

        try {
            rs1.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {
    }


}