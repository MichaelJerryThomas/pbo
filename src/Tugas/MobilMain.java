package Tugas;
import java.util.Scanner;
public class MobilMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyak Mobil : ");
        int N = input.nextInt();
        
        Mobil[] mbl;
        mbl= new Mobil[N];
        
        System.out.println("\n");
        for (int i = 0; i < mbl.length; i++) {
            mbl[i]=new Mobil();
            System.out.print(" Masukan Merk Mobil : ");
            String merk = input.next();           
            mbl[i].setMerk(merk);
            
            System.out.print(" Masukan warna Mobil : ");
            String warna = input.next();
            mbl[i].setWarna(warna);
            
        }
        
        System.out.println("\n");
        for (int i = 0; i < mbl.length; i++) {
             System.out.print( "\nmobil merk "+mbl[i].getMerk()+" dengan warna "+mbl[i].getWarna());
        }
    }
}


