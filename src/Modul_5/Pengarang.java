/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_5;

public class Pengarang {
    //Deklarasi variabel
    private String nik;
    private String nama;
    private String alamat;
    //Constructor Pengarang
    public Pengarang(){}
    //Method setter setNik
    public void setNik(String nik){
        this.nik = nik;
    }
    //Method setter setNama
    public void setNama(String nama){
        this.nama = nama;
    }
    //Method setter setAlamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    //Method getter getNik
    public String getNik(){
        return nik;
    }
    //Method getter getNama
    public String getNama(){
        return nama;
    }
    //Method getter getAlamat
    public String getAlamat(){
        return alamat;
    }
}
