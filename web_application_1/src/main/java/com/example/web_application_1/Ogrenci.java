package com.example.web_application_1;

public class Ogrenci {
    private int id;

    private String isim;
    private String soyisim;
    private String eposta;

    public Ogrenci(int id, String isim, String soyisim, String eposta) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.eposta = eposta;
    }

    public Ogrenci(String isim, String soyisim, String eposta) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.eposta = eposta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}
