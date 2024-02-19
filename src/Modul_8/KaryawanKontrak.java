package Modul_8;/*membuat package bernama Modul_8*/
public class KaryawanKontrak extends Karyawan{/* merupakan subkelas atau turunan dari kelas "Karyawan".*/
    /*membuat atribut jumlahHariMasuk dan upahHarian.*/
    private int jumlahHariMasuk;
    private double upahHarian;
    
    public KaryawanKontrak(){}//digunakan untuk membuat objek karyawan kontrak.
    
    /*Method ini digunakan untuk menghitung upah total karyawan kontrak berdasarkan jumlah hari masuk 
    dan nilai upah harian,ditambah tunjangan anak. Method ini mengembalikan hasil berupa nilai upah 
    total dalam bentuk double.*/
    public double upahTotal(){
        return (upahHarian * jumlahHariMasuk) + tunjanganAnak();
    }
    
    /*Method ini digunakan untuk mengubah nilai atribut "jumlahHariMasuk" sesuai dengan parameter 
    yang diberikan.*/
    public void setJumlahHariMasuk(int jumlahHariMasuk){
        this.jumlahHariMasuk = jumlahHariMasuk;
    }
    
    /*Method ini digunakan untuk mengembalikan nilai atribut "jumlahHariMasuk".*/
    public int getJumlahHariMasuk(){
        return jumlahHariMasuk;
    }
    
    /*Method ini digunakan untuk mengubah nilai atribut "upahHarian" sesuai dengan parameter 
    yang diberikan.*/
    public void setUpahHarian(double upahHarian){
        this.upahHarian = upahHarian;
    }
    
    /*Method ini digunakan untuk mengembalikan nilai atribut "upahHarian".*/
    public double getUpahHarian(){
        return upahHarian;
    }
}



