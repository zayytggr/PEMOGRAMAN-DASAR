
package tugasclassroom;

import java.util.Scanner;

public class TugasClassroom {

    static Scanner input = new Scanner(System.in);

    // Method untuk memasukkan ukuran array
    static int inputUkuran(String pesan) {
        int ukuran;

        do {
            System.out.print(pesan);
            ukuran = input.nextInt();

            if (ukuran <= 0) {
                System.out.println("Ukuran harus lebih dari 0!");
            }
        } while (ukuran <= 0);

        return ukuran;
    }

    // Method untuk memasukkan data mahasiswa
    static String[][][] inputData(int prodi, int kelas, int mahasiswa) {
        String[][][] data = new String[prodi][kelas][mahasiswa];

        input.nextLine();

        for (int i = 0; i < prodi; i++) {
            System.out.println("\n=== Program Studi " + (i + 1) + " ===");

            for (int j = 0; j < kelas; j++) {
                System.out.println("\nKelas " + (j + 1));

                for (int k = 0; k < mahasiswa; k++) {
                    System.out.print("Nama mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = input.nextLine();
                }
            }
        }

        return data;
    }

    // Method untuk menampilkan data mahasiswa
    static void tampilData(String[][][] data) {
        System.out.println("\n===== DATA MAHASISWA =====");

        for (int i = 0; i < data.length; i++) {
            System.out.println("\nProgram Studi " + (i + 1));

            for (int j = 0; j < data[i].length; j++) {
                System.out.println("\nKelas " + (j + 1));

                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.println(
                        (k + 1) + ". " + data[i][j][k]
                    );
                }
            }
        }
    }

    // Method untuk menampilkan data dan operasi String
    static void tampilDataMahasiswa(String[][][] data) {
        System.out.println("\n===== OPERASI STRING MAHASISWA =====");

        for (int i = 0; i < data.length; i++) {
            System.out.println("\nProgram Studi " + (i + 1));

            for (int j = 0; j < data[i].length; j++) {
                System.out.println("\nKelas " + (j + 1));

                for (int k = 0; k < data[i][j].length; k++) {
                    String nama = data[i][j][k];

                    System.out.println("Nama: " + nama);
                    System.out.println("Huruf kapital: " + nama.toUpperCase());
                }
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=== PENDATAAN MAHASISWA ===");

        // Input ukuran array dari keyboard
        int prodi = inputUkuran("Jumlah program studi: ");
        int kelas = inputUkuran("Jumlah kelas setiap prodi: ");
        int mahasiswa = inputUkuran("Jumlah mahasiswa setiap kelas: ");

        // Memanggil method input data
        String[][][] dataMahasiswa = inputData(prodi, kelas, mahasiswa);

        // Memanggil method untuk menampilkan data
        tampilData(dataMahasiswa);

        // Memanggil method operasi String
        tampilDataMahasiswa(dataMahasiswa);

        input.close();
    }
}
