package Modul_2;
import java.util.Scanner;
public class PegawaiMain {
    public static void main(String[] args) {
        // mendeklarasikan scanner dengan nama input
        Scanner input = new Scanner(System.in);
        
        Pegawai Pegawai = new Pegawai();// mendeklarasikan objek dengan nama pegawai
        
        
        // meminta user memasukan npp
        System.out.print("Masukan Nomer Pendaftaran perusahaan\t:");
        String npp1 = input.nextLine();
        Pegawai.setNPP(npp1); // memanggil method setNPP
        
        // meminta user memasukan nama 
        System.out.print("Masukan Nama Anda\t:");
        String nama1 = input.nextLine();
        Pegawai.setNama(nama1); // memanggil method setNama
        
        // meminta user memasukan status
        System.out.print("Apakah Sudah Menikah (ya/tidak)\t:");
        String status1 = input.nextLine();
        Pegawai.setStatus(status1); // memanggil method setStatus
        
        // meminta user memasukan Golongan pegawai
        System.out.print("Masukan Golongan Anda\t:");
        int golongan1 = input.nextInt();
        Pegawai.setGolongan(golongan1);// memanggil setGolongan
        
        // meminta user memasukan jumlah anak
        System.out.print("Masukan Jumlah Anak Anda\t:");
        int anak = input.nextInt();
        Pegawai.setJumlahAnak(anak);// memanggil method setJumlahAnak
        
        
        // mencetak isi method gajiTotal,tunjanganKeluarga,gajiPokok
        System.out.println("\n\nGaji Total Yang Anda Terima\t: "+Pegawai.gajiTotal()
                           +"\nTunjangan Anda Sebesar\t: "+Pegawai.tunjanganKeluarga()
                           +"\nGaji pokok Anda\t: "+Pegawai.gajiPokok());
        
    }
}

