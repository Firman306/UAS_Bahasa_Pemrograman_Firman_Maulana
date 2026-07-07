import java.util.Scanner;

public class Soal_No2_Array_Multidimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.class.cast(System.in));
        
        final int JUMLAH_SISWA = 5;
        final int JUMLAH_MAPEL = 3;
        
        double[][] nilai = new double[JUMLAH_SISWA][JUMLAH_MAPEL];
        double[] rataRata = new double[JUMLAH_SISWA];
        
        String[] namaMapel = {"Matematika", "Bahasa Indonesia", "IPA"};

        System.out.println("=== INPUT NILAI SISWA ===");
        for (int i = 0; i < JUMLAH_SISWA; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ":");
            double totalNilai = 0;
            
            for (int j = 0; j < JUMLAH_MAPEL; j++) {
                System.out.print("  - Nilai " + namaMapel[j] + ": ");
                nilai[i][j] = input.nextDouble();
                totalNilai += nilai[i][j];
            }
            rataRata[i] = totalNilai / JUMLAH_MAPEL;
            System.out.println();
        }

        int indeksTertinggi = 0;
        double rataTertinggi = rataRata[0];

        for (int i = 1; i < JUMLAH_SISWA; i++) {
            if (rataRata[i] > rataTertinggi) {
                rataTertinggi = rataRata[i];
                indeksTertinggi = i;
            }
        }

        System.out.println("=======================================================");
        System.out.println("Siswa dengan rata-rata tertinggi : Siswa ke-" + (indeksTertinggi + 1));
        System.out.printf("Rata-rata                        : %.2f\n", rataTertinggi);
        System.out.println("=======================================================\n");

        System.out.println("-------------------------------------------------------");
        System.out.printf("| %-2s | %-10s | %-16s | %-5s | %-9s |\n", 
                "No", "Matematika", "Bahasa Indonesia", "IPA", "Rata-rata");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < JUMLAH_SISWA; i++) {
            System.out.printf("| %-2d | %-10.0f | %-16.0f | %-5.0f | %-9.2f |\n", 
                    (i + 1), nilai[i][0], nilai[i][1], nilai[i][2], rataRata[i]);
        }
        System.out.println("-------------------------------------------------------");
        
        input.close();
    }
}