package Modul_2;
public class Kalkulator {
    //mendeklarasikan atribut bilangan1 dan bilangan2 dengan tipe private double
    private double bilangan1; 
    private double bilangan2;
    
    //membentuk konstruktor dengan parameter bilangan1 dan bilangan2
    public Kalkulator(double bilangan1, double bilangan2){
        this.bilangan1 = bilangan1;
        this.bilangan2 = bilangan2;
    }
    
    //deklarasikan setter setBilangan1 dengan parameter bilangan1
    public void setBilangan1(double bilangan1){
        this.bilangan1 = bilangan1;
    }
    
    //deklarasikan setter setBilangan2 dengan parameter bilangan 2
    public void setBilangan2(double bilangan2){
        this.bilangan2 = bilangan2;
    }
    
    //deklarasikan getter getBilangan1 dengan parameter bilangan 1
    public double getBilangan1(){
        return this.bilangan1;
    }
    
    //deklarasikan getter getBilangan2 dengan parameter bilangan 2
    public double getBilangan2(){
        return this.bilangan2;
    }
    
    //mendeklarasikan method penjumlahan
    public double penjumlahan(){
        double hasil = getBilangan1() + getBilangan2();
        return hasil;
    }
    
    //mendeklarasikan method pengurangan
    public double pengurangan(){
        double hasil = getBilangan1() + getBilangan2();
        return hasil;
    }
    
    //mendeklarasikan method perkalian
    public double perkalian(){
        double hasil = getBilangan1() * getBilangan2();
        return hasil;
    }
    
    //mendeklarasikan method pembagian
    public double pembagian(){
        double hasil = getBilangan1() / getBilangan2();
        return hasil; 
    }
}

