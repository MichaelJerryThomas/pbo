package Modul_8;/*membuat package bernama Modul_8.*/ 
/*sebuah class "Karyawan" yang memiliki atribut npp, nama, dan jumlahAnak serta static variable 
subsidiPerAnak*/
class Karyawan {

    private int NPP;
    private String nama;
    private int jumlahAnak;
    /*Static variable ini dapat diakses oleh seluruh objek dari kelas "Karyawan" karena bersifat static.*/
    public static int subsidiPerAnak = 100000;

    /*membuat constructor tanpa parameter pada kelas Karyawan.*/
    public Karyawan() {
    }

    /*method ini akan menghitung besarnya tunjangan anak yang akan diterima karyawan.*/
    protected double tunjanganAnak() {
        return jumlahAnak * subsidiPerAnak;
    }

    /*digunakan untuk mengatur nilai dari atribut yang NPP.*/
    public void setNPP(int NPP) {
        this.NPP = NPP;
    }

    /*digunakan untuk mengatur nilai dari atribut yang Nama.*/
    public void setNama(String nama) {
        this.nama = nama;
    }

    /*digunakan untuk mengatur nilai dari atribut yang JumlahAnak.*/
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    /*digunakan untuk mengambil nilai dari atribut NPP.*/
    public int getNPP() {
        return NPP;
    }

    /*digunakan untuk mengambil nilai dari atribut Nama.*/
    public String getNama() {
        return nama;
    }

    /*digunakan untuk mengambil nilai dari atribut JumlahAnak.*/
    public int getJumlahAnak() {
        return jumlahAnak;
    }

    /*method ini digunakan untuk mengatur nilai atribut gajiPokok.*/
    public void setGajiPokok(double nextDouble) {

    }

    /*method ini digunakan untuk mengatur nilai atribut jumlahHariMasuk.*/
    public void setJumlahHariMasuk(int nextInt) {

    }

    /*method ini digunakan untuk mengatur nilai atribut upahHarian.*/
    public void setUpahHarian(double nextDouble) {

    }

    /*method ini digunakan untuk mengambil nilai atribut gajiPokok, menghitung gaji total.*/ 
    public double getGajiPokok() {
        return 0;
    }

    public double gajiTotal() {
        return 0;
    }

    /*method ini digunakan untuk mengambil nilai atribut jumlahHariMasuk.*/ 
    public int getJumlahHariMasuk() {
        return 0;
    }

    /*method ini digunakan untuk  mengambil nilai atribut upahHarian, dan menghitung upah total.*/ 
    public double getUpahHarian() {
        return 0;
    }

    public double upahTotal() {
        return 0;
    }
}



