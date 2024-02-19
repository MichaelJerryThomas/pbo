/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_6;
import java.util.Arrays;
public class KumpulanSegitiga {
    private int jumlahSegitiga;
    private Segitiga[] daftarSegitiga;

    public KumpulanSegitiga(Segitiga[] daftarSegitiga) {
        this.daftarSegitiga = daftarSegitiga;
        this.jumlahSegitiga = daftarSegitiga.length;
    }

    public double hitungRataRataLuas() {
        double totalLuas = 0;
        for (Segitiga segitiga : daftarSegitiga) {
            totalLuas += segitiga.hitungLuas();
        }
        return totalLuas / jumlahSegitiga;
    }

    public Segitiga cariSegitigaTerluas() {
        Segitiga terluas = daftarSegitiga[0];
        for (int i = 1; i < jumlahSegitiga; i++) {
            if (daftarSegitiga[i].hitungLuas() > terluas.hitungLuas()) {
                terluas = daftarSegitiga[i];
            }
        }
        return terluas;
    }

    public Segitiga cariSegitigaTerkecil() {
        Segitiga terkecil = daftarSegitiga[0];
        for (int i = 1; i < jumlahSegitiga; i++) {
            if (daftarSegitiga[i].hitungLuas() < terkecil.hitungLuas()) {
                terkecil = daftarSegitiga[i];
            }
        }
        return terkecil;
    }

   
    public String toString() {
        return "KumpulanSegitiga{" +
                "jumlahSegitiga=" + jumlahSegitiga +
                ", daftarSegitiga=" + Arrays.toString(daftarSegitiga) +
                '}';
    }
}





