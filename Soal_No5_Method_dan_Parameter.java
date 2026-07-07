import java.util.Scanner;

public class Soal_No5_Method_dan_Parameter {
    
    public static double hitungHargaSetelahDiskon(double harga, double persenDiskon) {
        return harga - (harga * persenDiskon / 100);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harga = ");
        double hargaAwal = input.nextDouble();
        
        System.out.print("Diskon = ");
        double persenDiskon = input.nextDouble();
        System.out.println();

    
        double besarDiskon = hargaAwal * persenDiskon / 100;
        double hargaAkhir = hitungHargaSetelahDiskon(hargaAwal, persenDiskon);

        System.out.printf("Harga Awal          : Rp. %.0f\n", hargaAwal);
        System.out.printf("Diskon              : Rp. %.0f\n", besarDiskon);
        System.out.printf("Harga Setelah Diskon : Rp. %.0f\n", hargaAkhir);

        input.close();
    }
}