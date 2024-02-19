/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul_1;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class PersegiMain {
    public static void main(String[] args) {
        Persegi objPersegi=new Persegi();//Membuat objek dengan nama "Persegi"

        objPersegi.panj=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        //menginput variabel dengan memunculkan panel dialog dengan tulisan "Masukkan Panjang"
        objPersegi.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        //menginput variabel dengan memunculkan panel dialog dengan tulisan "Masukkan Panjang"
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang="+objPersegi.panj+" dan lebar = "+objPersegi.lebar+"adalah "+objPersegi.luas());
        // memunculkan panel dialog dengan tulisan "Luas dari persegi dengan panjang"
    }
}



