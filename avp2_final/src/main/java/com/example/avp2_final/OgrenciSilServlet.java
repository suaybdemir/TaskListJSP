package com.example.avp2_final;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "OgrenciSilServlet", value = "/ogrenciSil")
public class OgrenciSilServlet extends HttpServlet {

    private OgrenciVeri ogrenciVeri = new OgrenciVeri();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<Ogrenci> ogrenciler = ogrenciVeri.ogrencileriGetir();

        request.setAttribute("ogrenci_listesi",ogrenciler);

        try
        {
           String ogrenciId = request.getParameter("ogrenciId");

           ogrenciVeri.ogrenciSil(Integer.parseInt(ogrenciId));

            response.sendRedirect(request.getContextPath()+"/ogrenci_sil");

        }catch(Exception ex)
        {
            throw new RuntimeException();
        }
    }

    public void destroy() {
    }
}