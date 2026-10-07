package perhitungansederhana;
public class setengahDiamond {
    public static void main(String[] args) {

        // Bagian naik
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bagian turun
        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}