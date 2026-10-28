import java.util.Scanner;

public class Tugas228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Nilai n harus minimal 3");
        } else {
            int totalAngka = 0;
            System.out.println("\nTabel Perkalian " +n+ "x" +n+ ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    
                    System.out.printf("%4d", hasil);
                    totalAngka+=hasil;
                }
                System.out.println();
            }
            System.out.println("=======================================");
            System.out.println("Total angka yang dicetak: " + totalAngka);
        }
        sc.close();
    }
}