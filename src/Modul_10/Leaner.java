package Modul_10;
class Leaner {/*Mendefinisikan sebuah kelas interface bernama "Learner".*/

    /*Sebuah interface yang dideklarasikan di dalam kelas "Leaner".Interface menyediakan kerangka 
    kerja untuk menggambarkan perilaku yang harus diimplementasikan oleh kelas-kelas yang menggunakannya.*/
    public interface Learner {
        /*Metode ini mengembalikan nilai berupa string yang mewakili nilai atau grade dari kursus 
        yang diambil oleh seorang pembelajar. Implementasi dari metode ini akan ditentukan 
        oleh kelas yang mengimplementasikan interface "Learner".*/
        String getCourseGrade();
        /*Metode ini bertanggung jawab untuk meminta input dari pembelajar mengenai nilai-nilai 
        tes yang telah mereka lakukan. Implementasi dari metode ini akan ditentukan oleh kelas 
        yang mengimplementasikan interface "Learner".*/
        void inputTestScores();
        /*Metode ini bertugas untuk meminta input dari pembelajar mengenai subjek atau mata pelajaran 
        yang sedang mereka pelajari. Implementasi dari metode ini akan ditentukan oleh kelas yang 
        mengimplementasikan interface "Learner".*/
        void inputSubject();
    }
}




