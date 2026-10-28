import java.util.Scanner;

public class Tugas328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko<1){
            System.out.println("Masukkan jumlah toko minimal 1");
        } else {
            int totalBarang = 0;
            int maxBarang = -1;
            int tokoTerbanyak = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan di toko ke-" + i + ": ");
                int jumlahPenggan = sc.nextInt();
                
                while (jumlahPenggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif. Silakan masukkan lagi.");
                    jumlahPenggan = sc.nextInt();
                }
                int totalBarangPerToko = 0;

                for (int j = 1; j <= jumlahPenggan; j++) {
                    System.out.print("Masukkan jumlah barang yang di beli pelanggan " + j + ": ");
                    int jumlahBarang = sc.nextInt();
                    
                    while (jumlahBarang < 0) {
                        System.out.println("jumlah barang tidak boleh negatif. Silahkan masukkan lagi.");
                        jumlahBarang = sc.nextInt();
                    }
                    totalBarangPerToko += jumlahBarang;
                }
                System.out.println("Hasil untuk Toko " + i + ": ");
                System.out.println("- Total Pelanggan: " + jumlahPenggan);
                System.out.println("- Total Barang: " + totalBarangPerToko);
                totalBarang += totalBarangPerToko;

                if (totalBarangPerToko > maxBarang) {
                    maxBarang = totalBarangPerToko;
                    tokoTerbanyak = i;
                }
            }
            System.out.println("=======================================");
            System.out.println("REKAPITULASI KESELURUHAN");
            System.out.println("Total barang seluruh toko: " + totalBarang);
            System.out.println("Toko dengan jumlah barang terbanyak: Toko " + tokoTerbanyak + " dengan total barang " + maxBarang);
        }
        sc.close();
    }
}
