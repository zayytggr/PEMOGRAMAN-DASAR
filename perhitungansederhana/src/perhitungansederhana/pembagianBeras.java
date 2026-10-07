//identitas diri
//nim : 09020626044
//nama : Ahmad Zayyan Widyadhana
//model pratikum bab 3
package perhitungansederhana;
import java.util.Scanner;
public class pembagianBeras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();

        System.out.print("Jumlah keluarga penerima: ");
        int jumlahKeluarga = input.nextInt();
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;
        System.out.println("\n=== HASIL PEMBAGIAN BERAS ===");
        System.out.println("Beras per keluarga = "
                + berasPerKeluarga + " kg");
        System.out.println("Sisa beras = "
                + sisaBeras + " kg");
        int sisaDalamGram = sisaBeras * 1000;
        int tambahanGram = sisaDalamGram / jumlahKeluarga;
        System.out.println("Tambahan per keluarga = "
                + tambahanGram + " gram");
        input.close();
    }
}
