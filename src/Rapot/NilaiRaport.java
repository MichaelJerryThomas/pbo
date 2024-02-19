/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Rapot;
import java.util.Scanner;
public class NilaiRaport 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        Raport myRaport = new Raport();
        
        System.out.printf("Nmama Matakuliah awal: %s\n\n",myRaport.getNamaMatakuliah());
        System.out.println("Masukkan nama matakuliah :");
        String namaMTK = input.nextLine();
        myRaport.setNamaMatakuliah(namaMTK);
        System.out.println ();
        
        myRaport.tampilPesan();
    }
    
}
