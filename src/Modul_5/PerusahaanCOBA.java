package Modul_5;
public class PerusahaanCOBA {
    private String nama, alamat, pemilik, npwp;
    
    public PerusahaanCOBA(String nama, String Alamat,String Pemilik, String npwp){
        this.nama = nama;
        this.alamat = alamat;
        this.pemilik = pemilik;
        this.npwp = npwp;
    }

    public String getNama(){
        return nama;
    }
    public void setNama (String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getPemilik(){
        return pemilik;
    }
    public void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    public String getNpwp(){
        return npwp;
    }
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }
}
