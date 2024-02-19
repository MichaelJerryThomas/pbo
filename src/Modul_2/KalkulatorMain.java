package Modul_2;
import java.util.Scanner;
public class KalkulatorMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // membentuk scanner bernama input
        
        Kalkulator bilangan = new Kalkulator(0, 0); // membentuk objek dengan nama bilangan 
        
              
        System.out.print(" masukan bilangan pertama : "); // meminta user memasukan bilangan pertama
        double blg1 = input.nextDouble();
        bilangan.setBilangan1(blg1); // memanggil method setBilangan1
        
        System.out.print(" masukan bilangan kedua : "); // meminta user memasukan bilangan kedua
        double blg2 = input.nextDouble();
        bilangan.setBilangan2(blg2); // memanggil method setBilangan2
        

        System.out.print(" masukan tanda operasi : "); // meminta user memasukan tanda operasi
        String tanda = input.next();
        
        
        if ("+".equalsIgnoreCase(tanda)) { // jika tanda "+"
            System.out.println(" Hasil : "+bilangan.penjumlahan());// maka cetak kata hasil lalu tampilkan hasil penjumlahan dengan method penjumlahan
        } else if ("-".equalsIgnoreCase(tanda)) { // jika tanda "-"
            System.out.println(" Hasil : "+bilangan.pengurangan()); // maka cetak kata hasil lalu tampilkan hasil pengurangan dengan method pengurangan
        } else if ("x".equalsIgnoreCase(tanda) || "".equalsIgnoreCase(tanda)) { // jika tanda "x" atau ""
            System.out.println(" Hasil : "+bilangan.perkalian()); // maka cetak kata hasil lalu tampilkan hasil perkalian dengan method perkalian
        } else if (":".equalsIgnoreCase(tanda) || "/".equalsIgnoreCase(tanda)) { // jika tanda ":" atau "/"
            System.out.println(" Hasil : "+bilangan.pembagian()); // maka cetak kata hasil lalu tampilkan hasil pembagian dengan method pembagian
        } 
        
        
    }
}

