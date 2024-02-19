package Modul_2;
public class Pegawai {
  // mendeklarasikan atribut
    private int golongan;
    private String NPP;
    private String nama;
    private String status;
    private int jumlahAnak;
    private int gajiPokok =0;
    private int tunjangan =0;
    private int gajiTotal =0;

    // membuat getter getGolongan
    public int getGolongan() {
        return golongan;
    }

    // membentuk setter setGolongan dengan parameter golongan
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    // membuat getter getNPP
    public String getNPP() {
        return NPP;
    }

    // membentuk setter setNPP dengan parameter NPP
    public void setNPP(String NPP) {
        this.NPP = NPP;
    }

    // membuat getter getNama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    // membentuk setter setNama dengan parameter nama

    // membuat getter getStatus
    public String getStatus() {
        return status;
    }

    // membentuk setter setStatus dengan parameter status
    public void setStatus(String status) {
        this.status = status;
    }

    // membuat getter getJumlahAnak
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    // membentuk setter setJumlahAnak dengan parameter jumlahAnak
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
    
    // mendeklarasikan gajiPokok
    public int gajiPokok(){
        // menseleksi besaran gajiPokok berdasarkan Golongan
        switch (getGolongan()) {
            case 1:
                gajiPokok = 1300000;
                break;
            case 2:
                gajiPokok = 1750000;
                break;
            case 3:
                gajiPokok = 2000000;
                break;
            default:
                break;
        }
        return gajiPokok;// mengembalikan nilai gajiPokok
    }
    
    // mendeklarasikan method tunjangan keluarga
    public int tunjanganKeluarga (){
        // jika sudah menikah maka menghitung besar tujangan 
        // selain itu tampilkan tulisan anda belum menikah
        if ("ya".equalsIgnoreCase(getStatus())) {
            tunjangan = 300000 + (getJumlahAnak()*100000);
        } else {
           String kata = "Anda Belum Nikah";
        }
    
        return tunjangan;// mengembalikan nilai tunjangan
    }
    
    // mendeklarasikan method gajiTotal
    // dengan rumus gaji pokok + tunjangan keluarga
    // lalu mengembalikan nilai gajiTotal
    public int gajiTotal(){
        gajiTotal = gajiPokok() + tunjanganKeluarga();
        return gajiTotal;
    }
}

