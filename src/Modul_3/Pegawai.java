package Modul_3;
public class Pegawai {
    // membuat atribut
    private String nama;
    private String nip;
    private String gelar;

    // membuat construktor dengan parameter nama dan nip
    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    // membuat method getGelar
    public String getGelar() {
        return gelar;
    }

    // membuat method setGelar
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    // membuat method getNama
    public String getNama() {
        return nama;
    }

    // membuat method setNama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // membuat method getNip
    public String getNip() {
        return nip;
    }

    // membuat method setNip
    public void setNip(String nip) {
        this.nip = nip;
    }
}


