/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihanStringBuilder10 {
    public static void main(String[] args) {
        int jumlah = 100_000;

        // Pengujian menggunakan String +=
        long mulaiString = System.nanoTime();

        String teks = "";
        for (int i = 1; i <= jumlah; i++) {
            teks += i;
        }

        long selesaiString = System.nanoTime();
        long waktuString = selesaiString - mulaiString;

        // Pengujian menggunakan StringBuilder.append()
        long mulaiBuilder = System.nanoTime();

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= jumlah; i++) {
            builder.append(i);
        }

        String hasil = builder.toString();

        long selesaiBuilder = System.nanoTime();
        long waktuBuilder = selesaiBuilder - mulaiBuilder;

        // Menampilkan hasil pengujian
        System.out.println("Jumlah angka: " + jumlah);
        System.out.println("Panjang hasil: " + hasil.length());

        System.out.println("\nWaktu String +=: "
                + waktuString + " nanodetik");

        System.out.println("Waktu StringBuilder: "
                + waktuBuilder + " nanodetik");

        if (waktuBuilder > 0) {
            System.out.printf(
                "String += sekitar %.2f kali waktu StringBuilder.%n",
                (double) waktuString / waktuBuilder
            );
        }
    }
}
