package Modul_2;
public class RekeningBank 
{
    private String nomorRekening;//memesan variabel nomorRekening dengan tipe String yang hanya bisa di gunakan untuk class tertentu
    private int saldo;//memesan variabel saldo dengan tipe interger yang hanya bisa di gunakan untuk class tertentu
    
    //deklarasi konstruktor dengan parameter string nomer
    // dan mendeklarasikan saldo awal = 0
    public RekeningBank (String nomor) 
    {
        nomorRekening = nomor;
        saldo = 0;
    }
    // mendeklarasikan method cekSaldo dengan tipe integer dan nilai kembalian saldo
    public int cekSaldo ()
    {
        return saldo;
    }
    //mendeklarasikan method tabung dengan tipe void dan parameter jumlah
    //di dalamnya terdapat rumus saldo = saldo + jumlah
    public void tabung(int jumlah)
    {
        saldo = saldo + jumlah;
    }        
    // mendeklarasikan method ambil dengan tipe void dan parameter jumlah
    // di dalamnya terdapat rumus saldo = saldo - jumlah
    public void ambil (int jumlah)
    {
        saldo = saldo - jumlah;
    }
}

