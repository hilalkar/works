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
public class Gumusoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        double u=input.nextInt();
        double b=u/(2+Math.sqrt(2));
        double a=u*b;
        System.out.println(a);
        System.out.println(b);
    }
    }
    

