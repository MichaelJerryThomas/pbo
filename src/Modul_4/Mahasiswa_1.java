package Modul_4;
public class Mahasiswa_1 {
 private String nim;
 private String nama;
 private String email;
 private int umur;
 
 public Mahasiswa_1(String no, String nm) {
 nim=no;
 nama=nm;
 }
 public String getNim() {
 return nim;
 }
 public String getNama() {
 return nama;
 }
 public String getEmail() {
 return email;
 }
 public void setEmail(String email) {
 email = email;
 }
 public int getUmur() {
 return umur;
 }
 public void setUmur(int usia){
 umur = usia;
 }
 }

