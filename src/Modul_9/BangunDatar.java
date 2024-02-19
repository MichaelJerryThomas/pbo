package Modul_9;
/*Kelas abstract BangunDatar.*/
abstract class BangunDatar {
    /*Method abstract untuk menghitung keliling.*/
    abstract double hitungKeliling();
    /* Method abstract untuk menghitung luas.*/
    abstract double hitungLuas();
    /*Method abstract untuk mendapatkan nama bangun datar.*/
    abstract String getNama();
}
/*Kelas SegiEmpat yang merupakan turunan dari BangunDatar.*/
class SegiEmpat extends BangunDatar {
    private double panjang, lebar;
    /*Konstruktor SegiEmpat.*/
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    /*Implementasi method hitungKeliling dari kelas induk.*/
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    /*Implementasi method hitungLuas dari kelas induk.*/
    double hitungLuas() {
        return panjang * lebar;
    }
    /*Implementasi method getNama dari kelas induk.*/
    String getNama() {
        return "Segiempat";
    }
}
/*Kelas Segitiga yang merupakan turunan dari BangunDatar.*/
    class Segitiga extends BangunDatar {
        private double sisi1, sisi2, sisi3;
        /*Konstruktor Segitiga.*/
        public Segitiga(double sisi1, double sisi2, double sisi3) {
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
        }
        /*Implementasi method hitungKeliling dari kelas induk.*/
        double hitungKeliling() {
            return sisi1 + sisi2 + sisi3;
        }
        /*Implementasi method hitungLuas dari kelas induk.*/
        double hitungLuas() {
            double s = (sisi1 + sisi2 + sisi3) / 2;
            return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
        }
        /*Implementasi method getNama dari kelas induk.*/
        public String getNama() {
            return "Segitiga";
        }
    }
/*Kelas Lingkaran yang merupakan turunan dari BangunDatar.*/
        class Lingkaran extends BangunDatar {
            private double jariJari;
            /*Konstruktor Lingkaran.*/
            public Lingkaran(double jariJari) {
                this.jariJari = jariJari;
            }
            /*Implementasi method hitungKeliling dari kelas induk.*/
            double hitungKeliling() {
                return 2 * Math.PI * jariJari;
            }
            /*Implementasi method hitungLuas dari kelas induk.*/
            double hitungLuas() {
                return Math.PI * jariJari * jariJari;
            }
            /*Implementasi method getNama dari kelas induk.*/
            public String getNama() {
                return "Lingkaran";
            }

        }



