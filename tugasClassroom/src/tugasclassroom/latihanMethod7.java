/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasclassroom;

/**
 *
 * @author DELL
 */
public class latihanMethod7 {
     static int pangkat(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1;
        }

        return basis * pangkat(basis, eksponen - 1);
    }

    public static void main(String[] args) {

        System.out.println("2 pangkat 3 = " + pangkat(2, 3));
        System.out.println("3 pangkat 4 = " + pangkat(3, 4));
        System.out.println("5 pangkat 0 = " + pangkat(5, 0));
    }
}
