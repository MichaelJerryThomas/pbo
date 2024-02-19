/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_3;

/**
 *
 * @author HP
 */
public class ProgramStudi {
    // membuat atribut 
    private int kodeProdi;
    private String namaProdi;
    private Pegawai ketuaProdi;

    // membuat construktor dengan parameter kodeProdi, namaProdi
    public ProgramStudi(int kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
    }

    // membuat method getKodeProdi
    public int getKodeProdi() {
        return kodeProdi;
    }

    // membuat method setKodeProdi
    public void setKodeProdi(int kodeProdi) {
        this.kodeProdi = kodeProdi;
    }

    // membuat method getNamaProdi
    public String getNamaProdi() {
        return namaProdi;
    }

    // membuat method setNamaProdi
    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    // membuat method getKetuaProdi
    public Pegawai getKetuaProdi() {
        return ketuaProdi;
    }

    // membuat method setKetuaProdi
    public void setKetuaProdi(Pegawai ketuaProdi ) {
        this.ketuaProdi = ketuaProdi;
    }
    
}
