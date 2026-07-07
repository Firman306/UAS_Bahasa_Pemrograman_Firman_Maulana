import java.util.Scanner;

public class Soal_No4_Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();
        
       
        System.out.println("Bilangan ganjil:");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        
        int jumlah = 0;
        int j = 1; 
        
        if (n >= 1) {
            do {
                if (j % 2 != 0) {
                    jumlah += j;
                }
                j++; 
            } while (j <= n);
        }
        
        System.out.println("Jumlah = " + jumlah);
        
        input.close();
    }
}