package perhitungansederhana;
import java.util.Scanner;
public class simulasiTabungan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();

        System.out.println("masukkan tabungan bulan pertama");
        int tabungan = input.nextInt();
        int totalTabungan = 0;
        boolean sudahMencapai = false;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {

            System.out.println("Bulan " + bulan + " = Rp" + tabungan);
            totalTabungan += tabungan;

            if (totalTabungan >= 1000000 && !sudahMencapai) {
                System.out.println("Total pertama kali mencapai Rp1.000.000 pada bulan " + bulan);
                sudahMencapai = true;
            }

            tabungan += 50000;
        }
        System.out.println("Total tabungan = Rp" + totalTabungan);

        input.close();
    }
}
