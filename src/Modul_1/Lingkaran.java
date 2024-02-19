/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_1;

/**
 *
 * @author HP
 */
public class Lingkaran {
    double r; // memesan variabel dengan nama r dengan tipe double
    double luas; //memesan variabel dengan nama luas dengan tipe double
    final double PHI=3.14;//nilai pasti PHI=3.14 bertipe double
    
    Lingkaran () {};// membuat konstruktor lingkaran 
    public void luas ()//membuat metode luas dengan tipe void
    {        
        r=7;//varibael r bernilai 7
        luas=PHI*r*r;//variabel luas=PHI dikalikan isi variabel r dikalikan variabel r
        
        System.out.println("Luas lingkaran dengan jari="+r+"adalah : "+luas);
    // mencetak kata "Luas lingkaran dengan jari" ditambah dengan isi variable r di tambah kata "adalah" ditambah isi variable luas 
    } 
}

