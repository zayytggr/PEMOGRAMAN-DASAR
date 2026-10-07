package perhitungansederhana;
import java.util.Scanner;
public class operator {
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.print("Masukkan pilihan (1-3): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Andi belajar operasi pertambahan");
        } 
        else if (pilihan == 2) {
            System.out.println("Andi belajar operasi pengurangan");
        } 
        else if (pilihan == 3) {
            System.out.println("Andi belajar operasi pembagian");
        } 
        else {
            System.out.println("Andi belajar operasi perkalian");
        }
    }
    
}
