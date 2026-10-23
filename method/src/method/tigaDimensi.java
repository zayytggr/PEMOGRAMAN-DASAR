/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

/**
 *
 * @author DELL
 */
public class tigaDimensi {
    public static void main(String[]args) {
      String[][][] dataMahasiswa = {
           {
                {"Andi", "Budi", "Citra", "Dina", "Eko"},
                {"Fajar", "Gita", "Hadi", "Intan", "Joko"},
                {"Kiki", "Lina", "Miko", "Nina", "Oki"}
            },
            {
                {"Putri", "Rian", "Salsa", "Tono", "Udin"},
                {"Vina", "Wahyu", "Xavier", "Yuni", "Zaki"},
                {"Aldi", "Bella", "Cahya", "Doni", "Elsa"}
            },
            {
                {"Farhan", "Galih", "Hana", "Ilham", "Jihan"},
                {"Kevin", "Laras", "Maya", "Naufal", "Olivia"},
                {"Rizky", "Sinta", "Tegar", "Umar", "Vera"}
            }
      }; 
      for (int i = 0; i < 3; i++) {
                System.out.println("\n Prodi" + (i+1));
                    for (int j = 0; j < 3; j++) {
                        System.out.println("\n kelas" + (j+1));
                        for (int k = 0; k < 5; k++) {
                        System.out.print(dataMahasiswa[i][j][k]);
                        }
                    }
                    
            }
    }
}
