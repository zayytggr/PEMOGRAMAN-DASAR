/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

/**
 *
 * @author DELL
 */
public class belajarMethodDimensi {
    public static void main(String[]args) {
        String[][] intel = {
            {"sena", "jendral", "jakarta"},
            {"bilal", "intel", "surabaya"},
            {"ayub", "anggota1", "lampung"},
            {"sena", "anggota2", "medan"},
            {"reza", "anggota3", "bekasi"},
        };
        
        for (int i = 0; i < intel.length; i++) {
            for (int j = 0; j < intel[i].length; j++) {
                System.out.println(intel[i][j]);
            }
            System.out.println("");
        }
    }
}
