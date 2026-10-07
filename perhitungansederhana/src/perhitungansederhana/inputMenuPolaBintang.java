package perhitungansederhana;
import java.util.Scanner;
public class inputMenuPolaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        int tinggi;

        do {
            System.out.println("\n===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= 5) {
                System.out.print("Masukkan tinggi: ");
                tinggi = input.nextInt();
            } else {
                tinggi = 0;
            }

            switch (pilihan) {

                case 1:
                    // Segitiga
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Segitiga Terbalik
                    for (int i = tinggi; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Persegi
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= tinggi; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // bagian bangun Piramida
                    for (int i = 1; i <= tinggi; i++) {

                        // Spasi
                        for (int j = 1; j <= tinggi - i; j++) {
                            System.out.print(" ");
                        }

                        // Bintang
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;

                case 5:
                    // Diamond bagian atas
                    for (int i = 1; i <= tinggi; i++) {

                        for (int j = 1; j <= tinggi - i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }

                    // Diamond bagian bawah
                    for (int i = tinggi - 1; i >= 1; i--) {

                        for (int j = 1; j <= tinggi - i; j++) {
                            System.out.print(" ");
                        }

                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 6);

        input.close();
    }
}
