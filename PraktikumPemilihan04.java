import java.util.Scanner;

public class PraktikumPemilihan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas = sc.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUts < 0 || nilaiUts > 100 ||
            nilaiUas < 0 || nilaiUas > 100) {
            
            System.out.println("Nilai Tidak Valid");
            return;
        }

        double hasilTugas = nilaiTugas * 0.2;
        double hasilKuis = nilaiKuis * 0.2;
        double hasilUts = nilaiUts * 0.3;
        double hasilUas = nilaiUas * 0.3;

        double nilaiAkhir = (hasilTugas + hasilKuis + hasilUts + hasilUas);
        String nilaiHuruf;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        
        System.out.println("==============================");
        System.out.println("==============================");
        
        if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("TIDAK LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }
}
