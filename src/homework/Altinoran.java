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
public class Altinoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        double ac , cb ;
        System.out.println("Lütfen bir uzunluk giriniz: ");
        int ab=input.nextInt();
        cb=2*ab/(1+Math.pow(5,0.5));
        ac= ab-cb;
        System.out.println(ac);
        System.out.println(cb); //83
    }
    
}
