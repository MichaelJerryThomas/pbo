package Modul_5;
public class PegawaiCOBA {
    String status;
    private String NPP,nama;
    private double jmlhAnak, golongan;
    private int gol;
    
    public PegawaiCOBA(){}
    
    public String getStatus(){
        return status;
    }
    public void setstatus(String status){
        this.status=status;
    }
    public String getNPP(){
        return NPP;
    }
    public void setNPP(String NPP){
        this.NPP = NPP;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public double getJmlhAnak(){
        return jmlhAnak;
    }
    public void setJmlhAnak(double jmlhAnak){
        this.jmlhAnak = jmlhAnak;
    }
    public double getGolongan(){
        return golongan;
    }
    public void setGol(int gol){
        this.golongan = golongan;
    }
    public int getGol(){
        return gol;
    }
    public double HitungGaji(){
        return golongan;
    }
    public double tunjanganKeluarga(){
        double total;
        return total = (300000 + 100000)* jmlhAnak;
    }
    public double GajiTotal(){
        double total;
        return total = HitungGaji() + tunjanganKeluarga();
    }
}
