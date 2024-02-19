package Modul_3;
class Penerbit {
    // deklarasi atribut
    private String namaPenerbit,alamat,tahunBerdiri;

    // membuat construktor dengan parameter namaPenerbit dengan tipe String
    public Penerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    // membuat method getNamaPenerbit 
    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    // membuat method setNamaPenerbit
    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    // membuat method getAlamat
    public String getAlamat() {
        return alamat;
    }

    // membuat method setAlamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // membuat method getTahunBerdiri
    public String getTahunBerdiri() {
        return tahunBerdiri;
    }

    // membuat method setTahunBerdiri
    public void setTahunBerdiri(String tahunBerdiri) {
        this.tahunBerdiri = tahunBerdiri;
    }
}