package Modul_4;
public class Buku {
    //membuat atribut
    private String kodeBuku,Judul,namaPengarang;
    private int tahun;
    //membuat construktor 
    public Buku(String Judul, String namaPengarang) {
        this.Judul = Judul;
        this.namaPengarang = namaPengarang;
    }
    //membuat method getterKodeBuku
    public String getKodeBuku() {
        return kodeBuku;
    }
    //membuat method setterKodeBuku
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }
    //membuat method getterJudul
    public String getJudul() {
        return Judul;
    }
    //membuat method setJudul
    public void setJudul(String Judul) {
        this.Judul = Judul;
    }
    //membuat method getterNamaPengarang
    public String getNamaPengarang() {
        return namaPengarang;
    }
    //membuat method setterPengarang
    public void setNamaPengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
    //membuat method getterTahun
    public int getTahun() {
        return tahun;
    }
    //membuat method setterTahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
   
//Mendeklarasikan sebuah method dengan nama "tahunSearching" yang menerima dua parameter,
//yaitu sebuah integer "n1" dan sebuah array "n" yang berisi objek-objek dari kelas "Buku"
    public int tahunSearching (int n1,Buku [] n){
        int jumlah = 0;//Mendeklarasikan sebuah variabel bertipe integer dengan nama "jumlah" dan memberikan nilai awal 0
        for (int i = 0; i < n.length; i++) {//Memulai sebuah perulangan dengan menggunakan indeks "i" yang dimulai dari 0 hingga kurang dari panjang array "n"
            if (getTahun() == n1) {//Memeriksa apakah tahun terbit buku yang saat ini diperiksa oleh perulangan sama dengan nilai parameter "n1" dengan memanggil   
                //method "getTahun()" pada objek buku yang sedang diperiksa. Jika ya, maka kode di dalam blok if akan dijalankan
                jumlah = jumlah + 1;//Menambahkan nilai variabel "jumlah" sebanyak 1 jika tahun terbit buku saat ini sama dengan nilai parameter "n1".            
            }else{//Jika tahun terbit buku saat ini tidak sama dengan nilai parameter "n1", maka blok kode di dalam else akan dijalankan
                jumlah = 0;//Mengubah nilai variabel "jumlah" menjadi 0
            }
        }
        return jumlah;//Mengembalikan nilai variabel "jumlah"
    }
    //Mendefinisikan method "dataBuku" yang menerima satu parameter bertipe String yang diberi nama p
    public void dataBuku(String p){
        // jika method getjudul sama dengan judul maka mencetak kode Buku, getKodeBuku, judul, tahun terbit, gettahun,karangan, getnamapengarang
        if (getJudul().equalsIgnoreCase(Judul))
            System.out.println(" Kode Buku\t: " + getKodeBuku()
                               + "\n Judul\t\t: " + getJudul()
                               + "\n Tahun Terbit\t: " +getTahun()
                               + "\n Karangan\t: "+ getNamaPengarang());
        }
    }


