import java.util.Scanner;

public class Soal_No1_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] nilai = new double[10];
        double total = 0;
        int jumlahLulus = 0;

        System.out.println("Masukkan 10 nilai mahasiswa:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        double tertinggi = nilai[0];
        double terendah = nilai[0];

        for (int i = 0; i < 10; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
            
            if (nilai[i] >= 75) {
                jumlahLulus++;
            }
        }

        double rataRata = total / 10;
    
        System.out.println("\nContoh Output:");
        System.out.printf("Nilai tertinggi : %.0f\n", tertinggi);
        System.out.printf("Nilai terendah  : %.0f\n", terendah);
        System.out.printf("Rata-rata       : %.2f\n", rataRata);
        System.out.println("Lulus           : " + jumlahLulus + " mahasiswa");

        input.close();
    }
}