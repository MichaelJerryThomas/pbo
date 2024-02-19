package Modul_7;
import java.util.Scanner;/*membuat perintah scanner*/
    public class MainMahasiswa {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);/*Membuat variabel untuk memasukan data melalui scanner*/
            /*Merupakan bagian dari input data mahasiswa S1 menggunakan scanner. Pertama, program akan meminta input 
            nama mahasiswa S1 dari pengguna. Kemudian, program akan meminta input NIM mahasiswa S1 dari pengguna. 
            Selanjutnya, program akan meminta input nilai UTS dan UAS mahasiswa S1 dari pengguna menggunakan scanner.*/
            System.out.println("Masukkan nama MahasiswaS1:");
            String namaS1 = scanner.nextLine();
            System.out.println("Masukkan NIM MahasiswaS1:");
            String nimS1 = scanner.nextLine();
            System.out.println("Masukkan nilai UTS MahasiswaS1:");
            int utsS1 = scanner.nextInt();
            System.out.println("Masukkan nilai UAS MahasiswaS1:");
            int uasS1 = scanner.nextInt();
            
            /*Membuat objek MahasiswaS1 baru dengan memanggil konstruktor MahasiswaS1 dengan argumen nama, NIM, 
            nilai UTS, dan nilai UAS yang telah dimasukkan sebelumnya. Objek ini digunakan untuk menghitung 
            nilai final dan menampilkan informasi tentang mahasiswa */
            MahasiswaS1 mhsS1 = new MahasiswaS1(namaS1, nimS1, utsS1, uasS1);
               
            /*Menggunakan scanner.nextLine() untuk membersihkan newline character 
            yang tersisa di buffer setelah menggunakan scanner.nextInt() sehingga tidak terjadi kesalahan 
            input saat menggunakan scanner.nextLine() pada input berikutnya*/
            scanner.nextLine(); 

            /*Bagian dari program yang meminta input dari pengguna untuk membuat objek MahasiswaS2. 
            Input yang diminta meliputi nama, NIM, nilai UTS, dan nilai UAS dari MahasiswaS2 */
            System.out.println("\nMasukkan nama MahasiswaS2:");
            String namaS2 = scanner.nextLine();
            System.out.println("Masukkan NIM MahasiswaS2:");
            String nimS2 = scanner.nextLine();
            System.out.println("Masukkan nilai UTS MahasiswaS2:");
            int utsS2 = scanner.nextInt();
            System.out.println("Masukkan nilai UAS MahasiswaS2:");
            int uasS2 = scanner.nextInt();
            /*Membuat objek MahasiswaS2 baru dengan menggunakan input yang diberikan oleh pengguna melalui scanner  
            yang terakhir mencetak baris kosong*/
            MahasiswaS2 mhsS2 = new MahasiswaS2(namaS2, nimS2, utsS2, uasS2);
            System.out.println("");
            /*Program akan menampilkan nilai final dari MahasiswaS1 dan MahasiswaS2 
            dengan menggunakan method hitungNilaiFinal() dari masing-masing objek*/
            System.out.println("Nilai final MahasiswaS1 " + mhsS1.nama + ": " + mhsS1.hitungNilaiFinal());
            System.out.println("Nilai final MahasiswaS2 " + mhsS2.nama + ": " + mhsS2.hitungNilaiFinal());

            scanner.close(); /*Scanner.close() digunakan untuk menutup scanner yang digunakan untuk input/output, 
            sehingga tidak ada lagi input yang diterima setelah fungsi ini dipanggil.*/
        }
    }

