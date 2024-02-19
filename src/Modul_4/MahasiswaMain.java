package Modul_4;
import javax.swing.*;
public class MahasiswaMain {
    public static void main(String[] args) {
        //meminta input dari pengguna dalam bentuk angka untuk menentukan jumlah mahasiswa yang akan dihitung nilai nya dalam program
        //Input ini diambil menggunakan JOptionPane.showInputDialog dan disimpan dalam variabel n yang bertipe int.
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Banyaknya Siswa  : "));
        //mendeklarasikan sebuah array mhs yang bertipe Mahasiswa dan menginisialisasinya dengan panjang n yang telah ditentukan 
        //sebelumnya dengan mengambil input dari pengguna pada baris sebelumnya
        Mahasiswa[] mhs;
        mhs = new Mahasiswa[n];
        //meminta input dari pengguna dalam tiga variabel: "nama", "nim", dan "tgl" yang masing-masing merupakan objek String
        for (int i = 0; i < mhs.length; i++) {
            String nama = JOptionPane.showInputDialog(null, "Masukan Nama : ");
            String nim = JOptionPane.showInputDialog(null, "Masukan Nim : ");
            String tgl = JOptionPane.showInputDialog(null, "Masukan tanggal lahir : ");
            //menyimpan input pengguna pada variabel "uts1", "uts2", dan "uas", masing-masing sebagai double
            double uts1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai UTS 1 : "));
            double uts2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai UTS 2 : "));
            double uas = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan Nilai UAS  : "));
            //menyimpan objek ini pada elemen array "mhs[i]"
            mhs[i] = new Mahasiswa(nim, nama, tgl);
            mhs[i].setUts1(uts1);
            mhs[i].setUts2(uts2);
            mhs[i].setUas(uas);
        
        }
        //membuat objek Mahasiswa baru bernama "nilaiTertinggi" dan menginisialisasi nilainya dengan nilai pada elemen pertama array "mhs"
        Mahasiswa nilaiTertinggi = mhs[0];
        System.out.println("No.\t"+"NIM\t"+"\tNama\t\t"+"Tanggal Lahir\t\t"+"uts1\t"+"uts2\t"+"uas\t"+"Final\t"+"Nilai");
        //for untuk setiap objek Mahasiswa dalam array "mhs". Program mencetak atribut-atribut objek Mahasiswa tersebut menggunakan fungsi "System.out.println", 
        //dengan menggunakan metode-metode get untuk mengambil nilai-nilai atribut dari objek Mahasiswa.
        for (int i = 0; i < mhs.length; i++) {
            System.out.println((i+1) +"\t" + mhs[i].getNim() + "\t\t" +mhs[i].getNama()+ "\t\t" + mhs[i].getTanggalLahir()+ "\t\t\t" + 
                    mhs[i].getUts1() + "\t" + mhs[i].getUts2() + "\t" + mhs[i].getUas() + "\t" + mhs[i].NilaiFinal() + "\t" +mhs[i].Konversi());
            //melakukan pengecekan untuk menemukan nilai tertinggi dari semua nilai final Mahasiswa
            if (mhs[i].NilaiFinal() > nilaiTertinggi.NilaiFinal()) {
                mhs[i] = nilaiTertinggi;
            }
        }
        //mencetak nilai tertinggi menggunakan fungsi "System.out.println"
        System.out.println(" Nim : "+nilaiTertinggi.getNim());
        System.out.println(" Nama : "+nilaiTertinggi.getNama());
        System.out.println(" Tanggal Lahir : "+nilaiTertinggi.getTanggalLahir());
        System.out.println(" Final : "+nilaiTertinggi.NilaiFinal());
        System.out.println(" Nilai : "+nilaiTertinggi.Konversi());
    }
}

