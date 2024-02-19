package Modul_8; /*membuat package bernama Modul_8.*/ 
public class KaryawanTetap extends Karyawan{/*subkelas atau turunan dari kelas "Karyawan".*/
    private double gajiPokok;/*membuat atribut gajiPokok bertipe double.*/
    
    /*digunakan untuk membuat objek karyawan tetap.*/
    public KaryawanTetap(){}
    
    /*Method ini digunakan untuk menghitung gaji total karyawan tetap berdasarkan nilai gaji pokok,
    ditambah tunjangan anak. Method ini mengembalikan hasil berupa nilai gaji total dalam bentuk double.*/
    public double gajiTotal(){
        return gajiPokok + tunjanganAnak();
    }
    
    /*Method ini digunakan untuk mengubah nilai atribut "gajiPokok" sesuai dengan parameter yang diberikan.*/
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    /*Method ini digunakan untuk mengembalikan nilai atribut "gajiPokok".*/
    public double getGajiPokok(){
        return gajiPokok;
    }
}


