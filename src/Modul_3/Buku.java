package Modul_3;
public class Buku {
    // membuat atribut dengan tipe string, penerbit,int
    private String kodeBuku,judul,namaPengarang;
    private Penerbit penerbit;
    private int tahunTerbit;

    // membuat construktor
    public Buku(String kodeBuku, String namaPengarang) {
        this.kodeBuku = kodeBuku;
        this.namaPengarang = namaPengarang;
    }

    // membuat method getterKodeBuku
    public String getKodeBuku() {
        return kodeBuku;
    }
    // membuat method setKodeBuku
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
    // membuat method getJudul
    public String getJudul() {
        return judul;
    }
    // membuat method setJudul
    public void setJudul(String judul) {
        this.judul = judul;
    }
    // membuat method getNamaPengarang
    public String getNamaPengarang() {
        return namaPengarang;
    }
    // membuat setNamaPengarang
    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
    // membuat method getPenerbit
    public Penerbit getPenerbit() {
        return penerbit;
    }
    // membuat method setPenerbit
    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }
    // membuat method getTahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    // membuat method setTahunTerbit
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    // membuat method jenisBuku
    public String jenisBuku(){
        String jenis;
        if (getTahunTerbit()< 2019) {
             jenis = " Buku Lama ";
        } else{
             jenis = " Buku Baru ";
        }
        return jenis;
    } 
}
