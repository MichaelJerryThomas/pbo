package Modul_10;
import java.util.Scanner;/*mengimpor kelas Scanner dari paket java.util.Scanner.*/

/*Mendefinisikan kelas MainStudent yang merupakan kelas utama yang berisi metode main(). 
Ini adalah titik masuk (entry point) untuk menjalankan program.*/
public class MainStudent {

    /*Mendefinisikan metode main() yang merupakan metode utama yang akan dieksekusi ketika program dijalankan.*/
    public static void main(String[] args) {
        /*Membuat objek Scanner dengan menggunakan konstruktor yang mengambil System.in sebagai argumen.*/
        Scanner scanner = new Scanner(System.in);

        /*Mencetak pesan ke layar untuk meminta pengguna memasukkan detail untuk Siswa 1.*/
        System.out.println("Enter details for Student 1");
        /*Mencetak pesan ke layar untuk meminta pengguna memasukkan nama siswa dan menyimpannya dalam 
        variabel studentName1 dengan menggunakan scanner.nextLine() untuk membaca input dari pengguna.*/
        System.out.print("Enter student name: ");
        String studentName1 = scanner.nextLine();

        /*Membuat objek Student dengan menggunakan konstruktor yang mengambil studentName1 sebagai argumen.*/
        Student student1 = new Student(studentName1);
        /*Memanggil metode inputTestScores() dari objek student1 untuk mengambil input skor tes siswa.*/
        student1.inputTestScores();
        /*Memanggil metode inputSubject() dari objek student1 untuk mengambil input mata pelajaran yang diambil oleh siswa.*/
        student1.inputSubject();
        /*Mencetak tingkat prestasi akademik siswa 1 dengan memanggil metode getCourseGrade() dari objek student1 dan mencetak hasilnya.*/
        System.out.println("Course grade for student 1: " + student1.getCourseGrade());

        /*Mencetak pesan ke layar untuk meminta pengguna memasukkan detail untuk Siswa Pascasarjana.*/
        System.out.println("\nEnter details for Graduate PascaSarjana");
        /*Mencetak pesan ke layar untuk meminta pengguna memasukkan nama siswa pascasarjana dan menyimpannya dalam variabel 
        graduateStudentName dengan menggunakan scanner.nextLine() untuk membaca input dari pengguna.*/
        System.out.print("Enter graduate student name: ");
        String graduateStudentName = scanner.nextLine();

        /*Membuat objek GraduateStudent dengan menggunakan konstruktor yang mengambil graduateStudentName sebagai argumen.*/
        GraduateStudent graduateStudent = new GraduateStudent(graduateStudentName);
        /*Memanggil metode inputTestScores() dari objek graduateStudent untuk mengambil input skor tes siswa pascasarjana.*/
        graduateStudent.inputTestScores();
        /*Memanggil metode inputSubject() dari objek graduateStudent untuk mengambil input mata pelajaran yang diambil oleh siswa pascasarjana.*/
        graduateStudent.inputSubject();
        /*Mencetak tingkat prestasi akademik siswa pascasarjana dengan memanggil metode getCourseGrade() dari objek 
        graduateStudent dan mencetak hasilnya.*/
        System.out.println("Course grade for graduate student: " + graduateStudent.getCourseGrade());

        /*Mencetak pesan ke layar untuk meminta pengguna memasukkan detail untuk Siswa Sarjana.*/
        System.out.println("\nEnter details for Sarjana");
        /*Mencetak pesan ke layar untuk meminta pengguna memasukkan nama siswa sarjana dan menyimpannya dalam variabel 
        undergraduateStudentName dengan menggunakan scanner.nextLine() untuk membaca input dari pengguna.*/
        System.out.print("Enter undergraduate student name: ");
        String undergraduateStudentName = scanner.nextLine();

        /*Membuat objek UndergraduateStudent dengan menggunakan konstruktor yang mengambil undergraduateStudentName sebagai argumen.*/
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent(undergraduateStudentName);
        /*Memanggil metode inputTestScores() dari objek undergraduateStudent untuk mengambil input skor tes siswa sarjana.*/
        undergraduateStudent.inputTestScores();
        /*Memanggil metode inputSubject() dari objek undergraduateStudent untuk mengambil input mata pelajaran yang diambil oleh siswa sarjana.*/
        undergraduateStudent.inputSubject();
        /*Mencetak tingkat prestasi akademik siswa sarjana dengan memanggil metode getCourseGrade() dari objek 
        undergraduateStudent dan mencetak hasilnya.*/
        System.out.println("Course for undergraduate student: " + undergraduateStudent.getCourseGrade());

        /*Menutup objek Scanner.*/
        scanner.close();
    }
}



