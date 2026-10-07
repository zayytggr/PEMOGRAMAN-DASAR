// Identitas Diri
// NIM : 09020626044
// Nama : Ahmad Zayyan Widyadhana
// Modul Praktikum Bab 1
package perhitungansederhana;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class pratikumBab1 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Jumlah mahasiswa : ");
int jumlahMahasiswa = input.nextInt();
System.out.print("Frekuensi wudhu : ");
int frekuensiWudhu = input.nextInt();
System.out.print("Air per wudhu (liter) : ");
double airPerWudhu = input.nextDouble();
double totalAir =
jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
System.out.println("\n=== HASIL ===");

System.out.println("Total kebutuhan air = " + totalAir + " liter");
input.close();
}
}
