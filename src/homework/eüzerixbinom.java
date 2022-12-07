/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author HİLAL
 */
import java.util.Scanner;
public class eüzerixbinom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x,n,sonuc;
        Scanner klavye = new Scanner(System.in);
        System.out.print("x: ");
        x = klavye.nextDouble();
        System.out.print("n: ");
        n = klavye.nextDouble();
        sonuc = Math.pow((1 + x / n), n);
        System.out.printf("\nexp(%f)=%f\n", x, sonuc); //75
    }
    
}
