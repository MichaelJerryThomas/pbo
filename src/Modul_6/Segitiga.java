/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_6;
public class Segitiga {
    public double x1,y1,x2,y2,x3,y3;//membuat method x1, y1, x2, y2, x3, y3
    
 
    public double hitungSisi(double xa, double ya,double xb, double yb){//membuat method hitungSisi
        return Math.sqrt( Math.pow(xa-xb, 2) + Math.pow(ya-yb,2));//mengembalikan nilai akar kuadrat antara dua sisi
 }
    
    public double hitungKeliling(){//membuat method hitungLuas
        return hitungSisi(x1,y1,x2,y2) + hitungSisi(x2,y2,x3,y3)+ hitungSisi(x3,y3,x1,y1);
        //mengembalikan nilai perhitungan dari hitungSisi
 }
 
    public double hitungLuas(){//membuat method hitungLuas
        double s = hitungKeliling();//variabel s=hitungKeliling berindeks dengan tipe double
        return Math.sqrt(s * (s-hitungSisi(x1,y1,x2,y2)) * (s-hitungSisi(x2,y2,x3,y3)) * (s-hitungSisi(x3,y3,x1,y1)));
       //mengembalikan nilai akar kuadrat dari s-hitungSisi*s-hitungSisisi*s-hitungSisi
 } 
}

