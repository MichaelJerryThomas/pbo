package Modul_2;
public class BankMain {
    public static void main(String[] args) 
    {
        // membentuk objek dengan nama rekening budi
        RekeningBank rekeningBudi;
          rekeningBudi = new RekeningBank("12345");
        // mencetak kata rekening budi lalu menampilkan isi rekening dengan method cek saldo
        System.out.println("Rekening Budi = " +
          rekeningBudi.cekSaldo());
        // mencetak kata "menabung Rp 50.000" 
        System.out.println("Menabung Rp 50.000");
          // memanggil method tabung dengan parameter 50000
          rekeningBudi.tabung(50000);
        // mencetak kata "rekening budi sekarang" lalu menampilkan isi rekening dengan method cek saldo  
        System.out.println("Rekening Budi sekarang = " +
            rekeningBudi.cekSaldo());
        // mencetak kata "mengambil Rp 20.000"
        System.out.println("Mengambil Rp 20.000");
          // memanggil method ambil dengan parameter 20000
          rekeningBudi.ambil(20000);
        // mencetak kata "rekening budi sekarang" lalu menampilkan isi rekening dengan method cek saldo 
        System.out.println("Rekening Budi sekarang = " +
        rekeningBudi.cekSaldo()); 
    } 
}

