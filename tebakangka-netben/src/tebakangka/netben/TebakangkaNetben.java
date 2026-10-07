package tebakangka.netben;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TebakangkaNetben {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angkaKomputer = (int) (Math.random() * 100) + 1;
        int tebakan;
        int percobaan = 0;

        System.out.println("=== PERMAINAN TEBAK ANGKA ===");
        System.out.println("Saya telah memilih angka dari 1 sampai 100.");
        System.out.println("Kamu memiliki 7 kesempatan untuk menebak.");
        System.out.println();

        while (percobaan < 7) {

            System.out.print("Masukkan tebakan: ");
            tebakan = input.nextInt();

            percobaan++;

            if (tebakan < angkaKomputer) {

                System.out.println("Terlalu kecil!");

            } else if (tebakan > angkaKomputer) {

                System.out.println("Terlalu besar!");

            } else {

                System.out.println("Benar!");
                System.out.println("Kamu berhasil menebak dalam "
                        + percobaan + " percobaan.");

                break;
            }

            System.out.println("Percobaan: " + percobaan + "/7");
            System.out.println();

            if (percobaan == 7) {

                System.out.println("Kesempatan habis!");
                System.out.println("Angka yang benar adalah: " + angkaKomputer);
            }
        }

        input.close();
    }
}