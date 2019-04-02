/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.pkg2;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, i, j, space = 1;
        System.out.print("Masukkan angka: ");
        Scanner conny = new Scanner(System.in);
        x = conny.nextInt();
        space = x - 1;
        for (int k = 1; k <= x ; k++) {
            for (int l = 1; l <= space ; l++) {
                System.out.print(" ");
            }
            space--;
            for (int l = 1; l <=2 * k - 1 ; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int k = 1; k <= x -1 ; k++) {
            for (int l = 1; l <= space ; l++) {
                System.out.print(" ");
            }
            space++;
            for (int l = 1; l <= 2 * (x-k) -1 ; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
