package com.akb.uas;
/**
 Nama : Rifqi Muhammad Rizqullah
 NIM : 10118372
 TGL : 14-8-2021
 */

public class MainModel {
    String nama,sejarah,gambar;
    MainModel(){

    }

    public MainModel(String nama, String sejarah, String gambar) {
        this.nama = nama;
        this.sejarah = sejarah;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSejarah() {
        return sejarah;
    }

    public void setSejarah(String sejarah) {
        this.sejarah = sejarah;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
