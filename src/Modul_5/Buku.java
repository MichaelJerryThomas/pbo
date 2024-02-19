/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_5;

public class Buku {
    //Deklarasi variabel
    private String kode;
    private String judul;
    private Pengarang[] pengarang;
    private int tahun;
    //Constructor Buku
    public Buku(){}
    //Method setter setKode
    public void setKode(String kode){
        this.kode = kode;
    }
    //Method setter setJudul
    public void setJudul(String judul){
        this.judul = judul;
    }
    //Method setter setPengarang
    public void setPengarang(Pengarang[] pengarang){
        this.pengarang = pengarang;
    }
    //Method setter setTahun
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    //Method getter getKode
    public String getKode(){
        return kode;
    }
    //Method getter getJudul
    public String getJudul(){
        return judul;
    }
    //Method getter getPengarang
    public Pengarang[] getPengarang(){
        return pengarang;
    }
    //Method getter getTahun
    public int getTahun (){
        return tahun;
    }

    public void dataPengarang() {
        this.dataPengarang();
    }
}

