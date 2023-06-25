package com.example.avp2_final;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OgrenciVeri {

    public List<Ogrenci> ogrencileriGetir(){
        List<Ogrenci> ogrenciler = new ArrayList<>();

        Connection baglanti = null;
        Statement ifade = null;
        ResultSet sonuc = null;

        try
        {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql = "SELECT * FROM ogrenci";
            ifade = baglanti.createStatement();
            sonuc = ifade.executeQuery(sql);
            while(sonuc.next())
            {
                int id = sonuc.getInt("id");
                String gorevadi = sonuc.getString("gorevadi");
                String gorevinf = sonuc.getString("gorevinf");
                String gorevspec = sonuc.getString("gorevspec");
                String gorevtarihson = sonuc.getString("gorevtarihson");
                String gorevtarihbas = sonuc.getString("gorevtarihbas");

                Ogrenci ogr1 = new Ogrenci(id,gorevadi,gorevinf,gorevspec,gorevtarihson,gorevtarihbas);
                ogrenciler.add(ogr1);
            }
            return ogrenciler;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally
        {
            kapat(baglanti,ifade,sonuc);
        }
    }

    private void kapat(Connection baglanti, Statement ifade, ResultSet sonuc) {
        try {
            if (sonuc != null) {
                sonuc.close();
            }
            if (ifade != null) {
                ifade.close();
            }
            if (baglanti != null) {
                baglanti.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void ogrenciEkle(Ogrenci ogrenci1) {

        Connection baglanti = null;
        PreparedStatement ifade = null;
        ResultSet sonuc = null;
        try
        {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();
            String sql = "INSERT INTO ogrenci(gorevadi,gorevinf,gorevspec,gorevtarihson,gorevtarihbas) VALUES(?,?,?,?,?)";

            ifade = baglanti.prepareStatement(sql);
            ifade.setString(1,ogrenci1.getGorevadi());
            ifade.setString(2,ogrenci1.getGorevinf());
            ifade.setString(3,ogrenci1.getGorevspec());
            ifade.setString(4,ogrenci1.getGorevtarihson());
            ifade.setString(5,ogrenci1.getGorevtarihbas());
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void ogrenciSil(int ogrenciId) {

        Connection baglanti = null;
        PreparedStatement ifade = null;
        ResultSet sonuc = null;

        try
        {
            baglanti = VeritabaniBaglanti.veritabaniBaslat();

            String sql = "DELETE FROM ogrenci WHERE id=?";
            ifade = baglanti.prepareStatement(sql);
            ifade.setInt(1,ogrenciId);
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public void gorevGuncelle(String gorevadi,String gorevspec) {
        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;
        try{
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="UPDATE `ogrenci` Set `gorevspec`=? WHERE gorevadi=?";
            ifade = baglanti.prepareStatement(sql);

            ifade.setString(1,gorevspec);
            ifade.setString(2,gorevadi);
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public void gorevGuncelleTarih(String gorevtarihson,String gorevadi) {
        Connection baglanti=null;
        PreparedStatement ifade=null;
        ResultSet sonuc=null;
        try{
            baglanti=VeritabaniBaglanti.veritabaniBaslat();
            String sql="UPDATE `ogrenci` Set `gorevtarihson`=? WHERE gorevadi=?";
            ifade = baglanti.prepareStatement(sql);

            ifade.setString(1,gorevtarihson);
            ifade.setString(2,gorevadi);
            ifade.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
