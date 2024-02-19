package Modul_8;/*membuat package bernama Modul_8.*/ 
import java.util.Scanner;/*Scanner diimport agar program dapat membaca input dari pengguna.*/
public class MainMahasiswa {
    /*method yang pertama kali dijalankan dalam program Java. Method ini meminta pengguna untuk 
    memasukkan banyaknya data mahasiswa yang akan dimasukkan, dan menyimpan data tersebut 
    dalam array.Kemudian, program akan menampilkan data mahasiswa yang dimasukkan.*/
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("        Data Mahasiswa       ");
        System.out.println("------------------------------");
        System.out.print("Masukan Banyak data Mahasiswa:");
        Mahasiswa[] mahasiswa = new Mahasiswa[input.nextInt()];
        System.out.println("");
        /*Program menggunakan loop for untuk meminta input data mahasiswa sejumlah yang dimasukkan pengguna. 
        Di dalam loop for, program akan meminta pengguna untuk memilih apakah mahasiswa tersebut S1 atau S2, 
        dan kemudian meminta pengguna untuk memasukkan nama, NIM, tanggal lahir, nilai UTS 1, nilai UTS 2, 
        dan nilai UAS.*/
        for (int i = 0; i < mahasiswa.length; i++) {
            int pilih;
            System.out.println("Data Mahasiswa");
            System.out.println("1. Mahasiswa S1");
            System.out.println("2. Mahasiswa S2");
            System.out.print("Perintah: ");
            pilih = input.nextInt();
            
            if (pilih == 1) {
                mahasiswa[i] = new MahasiswaS1();
                System.out.println("------------------------------");
                System.out.println("       Data Mahasiswa S1     ");
                System.out.println ("-----------------------------");
            }
            else if (pilih == 2) {
                mahasiswa[i] = new MahasiswaS2();
                System.out.println("-----------------------------");
                System.out.println("       Data Mahasiswa S2     ");
                System.out.println("-----------------------------");
            }
            System.out.print("Masukan nama          : ");
            mahasiswa[i].setNama(ketik());
            System.out.print("Masukan NIM           : ");
            mahasiswa[i].setNim(ketik());
            System.out.print("Masukan Tanggal Lahir : ");
            mahasiswa[i].setTgl(ketik());
            System.out.print("Masukan Nilai UTS 1   : ");
            mahasiswa[i].setUts1(input.nextDouble());
            System.out.print("Masukan Nilai UTS 2   : ");
            mahasiswa[i].setUts2(input.nextDouble());
            System.out.print("Masukan Nilai UAS     : ");
            mahasiswa[i].setUas(input.nextDouble());
            System.out.println("");
        }
        
        System.out.println("------------------------------");
        System.out.println("            Tampilan         ");
        System.out.println("------------------------------");
        /*Setelah meminta input data mahasiswa, program akan menampilkan data mahasiswa yang dimasukkan. 
        Data ini termasuk nama, NIM, tanggal lahir, nilai UTS 1, nilai UTS 2, nilai UAS, dan nilai akhir.*/
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i] instanceof MahasiswaS1) {
                System.out.println("------------------------------");
                System.out.println("       Data Mahasiswa S1     ");
                System.out.println("------------------------------");
            }
            else if (mahasiswa[i] instanceof MahasiswaS2) {
                System.out.println("------------------------------");
                System.out.println("       Data Mahasiswa S2     ");
                System.out.println("------------------------------");
            }
            System.out.println("Nama          : " + mahasiswa[i].getNama());
            System.out.println("NIM           : " + mahasiswa[i].getNim());
            System.out.println("Tanggal Lahir : " + mahasiswa[i].getTgl());
            System.out.println("UTS 1         : " + mahasiswa[i].getUts1());
            System.out.println("UTS 2         : " + mahasiswa[i].getUts2());
            System.out.println("UAS           : " + mahasiswa[i].getUas());
            System.out.println("Nilai         : " + mahasiswa[i].hitungNilaiFinal());
            System.out.println("");
        }
        
        System.out.println("Daftar Mahasiswa S1 yang Lulus");
        System.out.println("");
        /*Setelah menampilkan data mahasiswa, program akan menampilkan daftar mahasiswa S1 yang lulus. 
        Mahasiswa S1 yang lulus adalah mahasiswa yang memiliki nilai akhir C, B, atau A. Program akan 
        menampilkan nama, NIM, tanggal lahir, nilai UTS 1, nilai UTS 2, nilai UAS, dan nilai akhir 
        dari mahasiswa S1 yang lulus.*/
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i] instanceof MahasiswaS1) {
                if (mahasiswa[i].hitungNilaiFinal() == 'C' || mahasiswa[i].hitungNilaiFinal() == 'B' || mahasiswa[i].hitungNilaiFinal() == 'A') {
                    System.out.println("------------------------------");
                    System.out.println("Mahasiswa ke-"+(i+1));
                    System.out.println("------------------------------");
                    System.out.println("Nama          : " + mahasiswa[i].getNama());
                    System.out.println("NIM           : " + mahasiswa[i].getNim());
                    System.out.println("Tanggal Lahir : " + mahasiswa[i].getTgl());
                    System.out.println("UTS 1         : " + mahasiswa[i].getUts1());
                    System.out.println("UTS 2         : " + mahasiswa[i].getUts2());
                    System.out.println("UAS           : " + mahasiswa[i].getUas());
                    System.out.println("Nilai         : " + mahasiswa[i].hitungNilaiFinal());
                    System.out.println("");
                }
            }
        }
        
    }
    /*Terdapat method ketik() yang digunakan untuk membaca input dari user berupa String menggunakan objek Scanner. 
    Method ini digunakan untuk membaca input untuk setiap data mahasiswa yang dimasukkan.*/
    public static String ketik(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }    
}

