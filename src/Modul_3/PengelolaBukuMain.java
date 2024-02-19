package Modul_3;
public class PengelolaBukuMain {
    public static void main(String[] args) {
        // membuat objek bernama book sekaligus mengisi parameter construktor dengan kode dan nama pengarang
        Buku book = new Buku("9786020529639", "Boy Candra");
        // memanggil method setjudul lalu parameternya diisi dengan
        // judul " Tulus Untuk orang yang salah"
        book.setJudul("Tulus Untuk Orang Yang Salah");
        // memanggil method setTahunTerbit 
        // lalu mengisi parameter dengan 2022
        book.setTahunTerbit(2022);
        
        // membuat objek penerbi1 sekaligus mengisi parameter construktornya
        // dengan "Gramedia"
        Penerbit penerbit1 = new Penerbit("Gramedia");
        // memanggil method setAlamat lalu mengisi parameternya
        penerbit1.setAlamat("JL. Palmerah Barat, Jakarta");
        // memanggil method setTahunBerdiri lalu mengisi parameternya
        penerbit1.setTahunBerdiri("1970");
        
        // memanggil method setPenerbit lalu mengisi parameter dengan penerbit1
        book.setPenerbit(penerbit1);
        // mendeklarasikan variabel penerbit dengan tipe penerbit
        Penerbit penerbit = book.getPenerbit();
        // mendeklarasikan variabel namaPenerbit yang isinya berasal dari method getNamaPenerbit
        String namaPenerbit = penerbit.getNamaPenerbit();
        // mendeklarasikan variabel alamat yang isinya berasal dari method getAlamat
        String alamat = penerbit.getAlamat();
        // mendeklarasikan variabel tahunBerdiri yang isinya berasal dari method getTahunBerdiri
        String tahunBerdiri =penerbit.getTahunBerdiri();
        
        
        
        System.out.println("\t\t ========================\n"
                          +"\t\t Program Pengelolaan Buku\n"
                          +"\t\t ========================\n");
        
        // menampilkan semua isi method dan variabel
        System.out.println(" Judul Buku\t\t\t: "+book.getJudul()
                          +"\n Kode Buku\t\t\t: "+book.getKodeBuku()
                          +"\n Nama Pengarang\t\t: "+book.getNamaPengarang()
                          +"\n Tahun Terbit\t\t\t: "+book.getTahunTerbit()
                          +"\n Diterbitkan Oleh\t\t: "+namaPenerbit
                          +"\n Alamat Penerbit\t\t: "+alamat
                          +"\n Tahun Berdiri Penerbit\t: "+tahunBerdiri
                          +"\n Termasuk Jenis Buku\t\t:"+book.jenisBuku());
    }
}