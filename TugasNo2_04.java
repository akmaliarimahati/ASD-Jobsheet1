import java.util.Scanner;

public class TugasNo2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Jadwal: ");
        int jumlahJadwal = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[jumlahJadwal][4];
        inputJadwal(jadwal, jumlahJadwal);
        tampilSemuaJadwal(jadwal, jumlahJadwal);

        System.out.print("\nCari Berdasarkan Hari: ");
        String hari = sc.nextLine();
        berdasarkanHari(jadwal, jumlahJadwal, hari);

        System.out.print("\nCari Berdasarkan Mata kuliah: ");
        String matkul = sc.nextLine();
        berdasarkanMatkul(jadwal, jumlahJadwal, matkul);

    }

    public static void inputJadwal(String[][] jadwal, int jumlahJadwal) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < jumlahJadwal; i++) {
            System.out.println("Jadwal Ke-" + (i + 1));

            System.out.print("Masukkan Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();

            System.out.println();
        }
    }

    public static void tampilSemuaJadwal(String[][] jadwal, int jumlahJadwal) {
        System.out.println("====== Seluruh Jadwal ======");

        System.out.printf("%-25s %-20s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jumlahJadwal; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void berdasarkanHari(String[][] jadwal, int jumlahJadwal, String hari) {
        System.out.println("====== Jadwal Hari " + hari.toUpperCase() + " ======");

        boolean ditemukan = false;
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {

                System.out.printf("%-25s %-20s %-15s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak Ada Jadwal Pada Hari Tersebut");
        }
    }

    public static void berdasarkanMatkul(String[][] jadwal, int jumlahJadwal, String matkul) {
        System.out.println("====== Pencarian Berdasarkan Mata Kuliah ======");

        boolean ditemukan = false;
        for (int i = 0; i < jumlahJadwal; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {

                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }

    }
}
