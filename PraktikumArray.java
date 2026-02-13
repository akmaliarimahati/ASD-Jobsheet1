import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine();

        String [] namaMatkul = new String[jumlahMatkul];
        int [] sks = new int[jumlahMatkul];
        double [] nilaiAngka = new double[jumlahMatkul];
        String [] nilaiHuruf = new String[jumlahMatkul];
        double [] bobotNilai = new double[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan Nama Mata Kuliah Ke-" + (i + 1) + ": ");
            namaMatkul[i] = sc.nextLine();

            System.out.print("Masukkan Jumlah SKS: ");
            sks[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("===============================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================================");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan Nilai Angka Untuk Mata Kuliah " + namaMatkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
        }

        for (int i = 0; i < namaMatkul.length; i++) {
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        System.out.println("===============================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===============================================");

        System.out.printf("%-30s %10s %-15s %15s %15s\n", 
            "MK", "SKS", "Nilai Angka", "Nilai Huruf", "Bobot");
        
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-30s %10s %-15s %15s %15s\n", 
                namaMatkul[i], sks[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("===============================================");

        double totalMutu = 0;
        int totalSks = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            totalMutu += bobotNilai[i] * sks[i];
            totalSks += sks[i];
        }

        double ip = totalMutu / totalSks;
        System.out.println("IP Semester: " + ip);

    }
}
