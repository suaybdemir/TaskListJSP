package com.example.avp2_final;

public class Ogrenci {


    private int id;
    private String gorevadi;
    private String gorevinf;
    private String gorevspec;

    public String getGorevtarihbas() {
        return gorevtarihbas;
    }

    public void setGorevtarihbas(String gorevtarihbas) {
        this.gorevtarihbas = gorevtarihbas;
    }

    private String gorevtarihbas;
    public String getGorevtarihson() {
        return gorevtarihson;
    }

    public void setGorevtarihson(String gorevtarihson) {
        this.gorevtarihson = gorevtarihson;
    }

    private String gorevtarihson;

    public Ogrenci(int id, String gorevadi, String gorevinf, String gorevspec, String gorevtarihson, String gorevtarihbas) {
        this.id = id;
        this.gorevadi = gorevadi;
        this.gorevinf = gorevinf;
        this.gorevspec = gorevspec;
        this.gorevtarihson = gorevtarihson;
        this.gorevtarihbas = gorevtarihbas;
    }

    public Ogrenci(String gorevadi, String gorevinf, String gorevspec, String gorevtarihson, String gorevtarihbas)
    {
        this.gorevadi = gorevadi;
        this.gorevinf = gorevinf;
        this.gorevspec = gorevspec;
        this.gorevtarihson = gorevtarihson;
        this.gorevtarihbas = gorevtarihbas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getGorevadi() {
        return gorevadi;
    }

    public void setGorevadi(String gorevadi) {
        this.gorevadi = gorevadi;
    }

    public String getGorevinf() {
        return gorevinf;
    }

    public void setGorevinf(String gorevinf) {
        this.gorevinf = gorevinf;
    }

    public String getGorevspec() {
        return gorevspec;
    }

    public void setGorevspec(String gorevspec) {
        this.gorevspec = gorevspec;
    }
}
