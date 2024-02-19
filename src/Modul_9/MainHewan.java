package Modul_9;
/*Program dimulai dengan mendefinisikan kelas MainHewan.
Di dalam metode main(), objek kewan dari tipe Hewan dideklarasikan 
dan diinisialisasi dengan objek dari kelas turunan Anjing.
Kemudian, metode suara() dipanggil pada objek kewan, yang akan 
mencetak "gug gug" ke konsol.Proses ini diulang untuk objek kewan 
dengan kelas turunan lain seperti Kucing, Bebek, dan Harimau, 
sehingga akan mencetak suara masing-masing hewan pada setiap 
pemanggilan metode suara().*/
class MainHewan {
    public static void main(String[] args) {
        Hewan kewan = new Anjing();
        kewan.suara();
        kewan = new Kucing();
        kewan.suara();
        kewan = new Bebek();
        kewan.suara();
        kewan = new Harimau();
        kewan.suara();
    }
}

