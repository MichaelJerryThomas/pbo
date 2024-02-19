package Modul_3;
import javax.swing.JOptionPane;
public class ProdiMain {
    public static void main(String[] args) {
        // membuat objek dosen lalu mengisi parameter construktornya
        Pegawai dosen = new Pegawai(" Adi Bangun ", "2254");
        // memanggil method setGelar lalu mengisi variabelnya
        dosen.setGelar("M.sc");
        // membuat objek prodi lalu mengisi parameter construktornya
        ProgramStudi prodi = new ProgramStudi(2256, "Informatika");
        // memanggil method setKetuaProdi lalu mengisi parameternya dengan objek dosen
        prodi.setKetuaProdi(dosen);
        // mendeklarasikan variabel ketua dengan tipe pegawai
        Pegawai ketua = prodi.getKetuaProdi();
        // mengisi variabel ktn dengan method getNama
        String ktn = ketua.getNama();
        // mengisi variabel nip dengan method getNip
        String nip = ketua.getNip();
        // mencetak dengan tampilan
        JOptionPane.showMessageDialog(null,"program studi "+prodi.getNamaProdi()+" diketuai oleh "+ktn+
                " dengan NIP " +nip,"",JOptionPane.INFORMATION_MESSAGE);
    
    }
}
