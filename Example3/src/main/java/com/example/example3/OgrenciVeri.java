package com.example.example3;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OgrenciVeri
{
    public OgrenciVeri(){

    }
    public List<Ogrenci> ogrencileriGetir() {
        List<Ogrenci> ogrenciler = new ArrayList<>();

        Connection baglanti = null;
        Statement ifade = null;
        ResultSet sonuc =null;
        try
        {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql = "SELECT * FROM ogrenci";
            ifade = baglanti.createStatement();
            sonuc = ifade.executeQuery(sql);
            while(sonuc.next())
            {

                int id = sonuc.getInt("id");
                String isim = sonuc.getString("isim");
                String soyisim = sonuc.getString("soyisim");
                String eposta = sonuc.getString("eposta");


                Ogrenci ogr1 = new Ogrenci(id,isim,soyisim,eposta);
                ogrenciler.add(ogr1);

            }
            return ogrenciler;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
                kapat(baglanti,ifade,sonuc);
        }

    }

    private void kapat(Connection baglanti, Statement ifade, ResultSet sonuc) {
        try
        {
            if (sonuc != null) {
                sonuc.close();
            }
            if (ifade != null) {
                ifade.close();
            }
            if (baglanti != null) {
                baglanti.close();
            }
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }



}






