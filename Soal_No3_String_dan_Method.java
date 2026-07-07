import java.util.Scanner;

public class Soal_No3_String_dan_Method{

    public static void main(String[] args) {
        analisisKalimat();
    }

    public static void analisisKalimat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        if (kalimat.trim().isEmpty()) {
            System.out.println("Kalimat tidak boleh kosong.");
            return;
        }

        int jumlahKarakter = kalimat.replace(" ", "").length();


        String[] kata = kalimat.trim().split("\\s+");
        int jumlahKata = kata.length;

        String hurufKapital = kalimat.toUpperCase();

        System.out.println("\nOutput:");
        System.out.println("Jumlah karakter : " + jumlahKarakter);
        System.out.println("Jumlah kata     : " + jumlahKata);
        System.out.println("Huruf kapital   : " + hurufKapital);

        scanner.close();
    }
}