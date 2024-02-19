package Modul_10;
/*Sebuah kelas bernama "GraduateStudent" yang merupakan turunan dari kelas Student.*/
class GraduateStudent extends Student {

    /*Sebuah variabel bertipe data String yang menyimpan informasi tentang kursus yang diambil oleh mahasiswa pascasarjana.*/
    String course;

    /*Konstruktor yang menerima parameter studentName dan memanggil konstruktor superclass (Student) dengan menggunakan 
    kata kunci super. Ini digunakan untuk menginisialisasi nama mahasiswa dengan menggunakan konstruktor superclass.*/
    public GraduateStudent(String studentName) {
        super(studentName);
    }

    /*Override dari metode getCourseGrade() yang ada di kelas superclass (Student). Metode ini menghitung rata-rata 
    skor tes dan mengembalikan peringkat kursus berdasarkan rata-rata tersebut. Pada kelas GraduateStudent, 
    skor rata-rata yang memenuhi syarat untuk peringkat "A" adalah 80 atau lebih, "B" adalah 70 atau lebih,
    "C" adalah 60 atau lebih, "D" adalah 50 atau lebih, dan sisanya adalah "F".*/
    @Override
    public String getCourseGrade() {
        int totalScore = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            totalScore += test[i];
        }
        int averageScore = totalScore / NUM_OF_TESTS;

        if (averageScore >= 80) {
            courseGrade = "A";
        } else if (averageScore >= 70) {
            courseGrade = "B";
        } else if (averageScore >= 60) {
            courseGrade = "C";
        } else if (averageScore >= 50) {
            courseGrade = "D";
        } else {
            courseGrade = "F";
        }
        return courseGrade;
    }
}


