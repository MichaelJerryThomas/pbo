package Modul_2;
public class SegitigaModifikasi {
    //mendeklarasikan atribut
    private double x1, y1, x2, y2, x3, y3;
    //deklarasi konstruktor dengan parameter x1,y1,x2,y2,x3,y3
    public SegitigaModifikasi (double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    // deklarasi method hitungSisi
    public double hitungSisi(double xa, double ya, double xb, double yb) {
        return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
    }
    // deklarasi method hitungKeliling
    public double hitungKeliling() {
        return hitungSisi(x1, y1, x2, y2) + hitungSisi(x2, y2, x3, y3) + hitungSisi(x3, y3, x1, y1);
    }
    // deklarasi method hitungLuas
    public double hitungLuas() {
        double s = hitungKeliling() / 2;
        return Math.sqrt(s * (s - hitungSisi(x1, y1, x2, y2)) * (s - hitungSisi(x2, y2, x3, y3)) *
        (s - hitungSisi(x3, y3, x1, y1)));
    }
    //deklarasikan getter getX1dengan parameter x1
    public double getX1() {
        return x1;
    }
    //deklarasikan setter setX1 dengan parameter x1
    public void setX1(double x1) {
        this.x1 = x1;
    }
    //deklarasikan getter getY1 dengan parameter y1
    public double getY1() {
        return y1;
    }
    //deklarasikan setter setY3 dengan parameter y3
    public void setY1(double y1) {
        this.y1 = y1;
    }
    //deklarasikan getter getX2 dengan parameter x2
    public double getX2() {
        return x2;
    }
    //deklarasikan setter setX2 dengan parameter x2
    public void setX2(double x2) {
        this.x2 = x2;
    }
    //deklarasikan getter getY2 dengan parameter y2
    public double getY2() {
        return y2;
    }
    //deklarasikan setter setY2 dengan parameter y2
    public void setY2(double y2) {
        this.y2 = y2;
    }
    //deklarasikan getter getX3 dengan parameter x3
    public double getX3() {
        return x3;
    }
    //deklarasikan setter setX3 dengan parameter x3
    public void setX3(double x3) {
        this.x3 = x3;
    }
    //deklarasikan getter getY3 dengan parameter y3
    public double getY3() {
        return y3;
    }
    //deklarasikan setter setY3 dengan parameter y3
    public void setY3(double y3) {
        this.y3 = y3;
    }
}

