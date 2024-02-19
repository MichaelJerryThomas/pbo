package Modul_3;
public class Segitiga {
    //membuat atribut
    private Titik titikA, titikB, titikC;
    private double sisiA, sisiB, sisiC;
    //membuat constructor dengan parameter titik satu, titik dua, titik tiga
    public Segitiga (Titik satu, Titik dua, Titik tiga)
        {//constructor segitiga
        this.titikA = satu;
        this.titikB = dua;
        this.titikC = tiga; }
    // deklarasi method hitungSisi
    public double hitungSisi(Titik A, Titik B){
    int x1, y1, x2,y2;
    x1 = A.getX(); y1 =A.getY();
    x2 = B.getX(); y2 = B.getY();
    return Math.sqrt( Math.pow(x1-x2, 2) + Math.pow(y1-y2,2));
}
    //deklarasi method hitungKeliling
    public double hitungKeliling(){
    this.sisiA = hitungSisi(titikA, titikB);
    this.sisiB = hitungSisi(titikA, titikC); 
    this.sisiC = hitungSisi(titikB, titikC);
    return (sisiA + sisiB +sisiC); 
}
    //deklarasi method hitungLuas
    public double hitungLuas(){
    double s = hitungKeliling()/2;
    return Math.sqrt(s * (s-sisiA) * (s-sisiB) * (s-sisiC));
    } 
}