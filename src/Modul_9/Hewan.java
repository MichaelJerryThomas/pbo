package Modul_9;
public abstract class Hewan {/*Membuat kelas abstrak bernama Hewan.*/
   abstract void suara();/*Membuat metode abstrak bernama suara().*/
}

class Anjing extends Hewan {/*Membuat kelas Anjing yang merupakan turunan 
dari kelas Hewan.*/
    void suara() { /*Mengimplementasikan metode suara() dari kelas Hewan.*/
        System.out.println("gug gug");/*Menampilkan teks "gug gug".*/
    }
}

class Kucing extends Hewan {/*Membuat kelas Kucing yang merupakan turunan 
dari kelas Hewan*/

    void suara() {/*Mengimplementasikan metode suara() dari kelas Hewan.*/
        System.out.println("meong-meong");/*Menampilkan teks "meong-meong".*/
    }
}

class Bebek extends Hewan {/*Membuat kelas Bebek yang merupakan turunan 
dari kelas Hewan.*/

    void suara() {/*Mengimplementasikan metode suara() dari kelas Hewan.*/
        System.out.println("kwek-kwek");/*Menampilkan teks "kwek-kwek".*/
    }
}

    class Harimau extends Hewan {/*Membuat kelas Harimau yang merupakan 
    turunan dari kelas Hewan.*/

        void suara() {/*Mengimplementasikan metode suara() dari kelas Hewan.*/
            System.out.println("Mengaum");/*Menampilkan teks "Mengaum".*/
        }
    }


