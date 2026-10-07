package perhitungansederhana;
import java.util.Scanner;
public class Perhitungansederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka1 = input.nextInt();
        char operator = input.next().charAt(0);
        int angka2 = input.nextInt();
        int hasil = 0;
        
        if (operator == '+'){
            hasil = angka1 + angka2;
        }else if (operator == '-'){
            hasil = angka1 - angka2;
        }else if (operator == '*'){
            hasil = angka1 * angka2;
        }else if (operator == '/'){
            hasil = angka1 / angka2;
        }else if (operator == '%'){
            hasil = angka1 % angka2;
        }else {
            System.out.println("operator yang dimasukkan tidak valid!");
        }
        System.out.println("Hasil:  " + hasil);
    }
}
