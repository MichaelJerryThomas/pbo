package Modul_10;
import java.util.Scanner;/*Mengimpor kelas Scanner dari package java.util.Scanner.*/ 
import Modul_10.Leaner.Learner;/*Mengimport modul 10 dari kelas leaner.*/

/*Deklarasi kelas Student dimulai dengan kata kunci public. Kelas ini mengimplementasikan interface 
Learner dan secara default mengakses semua kelas dalam package ini. Kelas ini memiliki tiga 
variabel: name (bertipe String), test (bertipe array int), dan courseGrade (bertipe String).*/
public class Student implements Learner {

    /*Sebuah konstanta bertipe data int yang menentukan jumlah tes yang akan diambil oleh seorang siswa. 
    Nilai konstanta ini diatur sebagai 3.*/
    protected final static int NUM_OF_TESTS = 3;
    /*Sebuah variabel name bertipe String yang akan digunakan untuk menyimpan nama mahasiswa.*/
    protected String name;
    /*Sebuah array test bertipe int yang akan digunakan untuk menyimpan skor tes mahasiswa.*/ 
    protected int[] test;
    /*Sebuah variabel courseGrade bertipe String yang akan digunakan untuk menyimpan nilai huruf dari kursus yang diambil mahasiswa.*/
    protected String courseGrade;

    /*Konstruktor ini akan menginisialisasi objek Student dengan nama "No Name". Konstruktor ini memanggil konstruktor 
    kedua dengan memberikan "No Name" sebagai argumen.*/
    public Student() {
        this("No Name");
    }

    /*Konstruktor ini akan menginisialisasi enginisialisasi objek Student dengan nama yang diberikan. Array test akan diinisialisasi
    dengan panjang NUM_OF_TESTS dan courseGrade diatur sebagai "**".*/
    public Student(String studentName) {
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "**";
    }

    /* Metode ini mengimplementasikan metode dari interface Learner. Metode ini menghitung peringkat kursus 
    berdasarkan rata-rata skor tes siswa. Peringkat kursus ditentukan berdasarkan nilai rata-rata. */
    @Override
    public String getCourseGrade() {
        int totalScore = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            totalScore += test[i];
        }
        int averageScore = totalScore / NUM_OF_TESTS;

        if (averageScore >= 90) {
            courseGrade = "A";
        } else if (averageScore >= 80) {
            courseGrade = "B";
        } else if (averageScore >= 70) {
            courseGrade = "C";
        } else if (averageScore >= 60) {
            courseGrade = "D";
        } else {
            courseGrade = "F";
        }
        /*Metode ini mengembalikan peringkat kursus yang dihitung.*/
        return courseGrade;
    }

    /*Metode ini digunakan untuk memasukkan skor tes siswa. Menggunakan objek Scanner untuk 
    membaca input dari pengguna dan menyimpan skor tes dalam array "test".*/
    public void inputTestScores() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_OF_TESTS; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            test[i] = scanner.nextInt();
        }
    }

    /*Metode ini digunakan untuk memasukkan mata pelajaran yang dipelajari oleh siswa. Menggunakan 
    objek Scanner untuk membaca input dari pengguna dan menampilkan mata pelajaran yang dimasukkan.*/
    public void inputSubject() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter course: ");
        String subject = scanner.nextLine();

        System.out.println("Course: " + subject);

    }
}



