package com.example.avp2_final;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@WebServlet(name = "OgrencilerServlet", value = "/anasayfa")
public class OgrencilerServlet extends HttpServlet {

    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<Ogrenci> ogrenciler = ogrenciVeri.ogrencileriGetir();

        request.setAttribute("ogrenci_listesi",ogrenciler);

        RequestDispatcher rs1 = request.getRequestDispatcher("/anasayfa.jsp");

        try {
            rs1.forward(request,response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    public void destroy() {
    }
}