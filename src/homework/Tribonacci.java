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
public class Tribonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int b1=1;
        int b2=1;
        int b3=2;
        for (int i = 1; i <= n; i++) 
        {
            int tpl=b1+b2+b3;
            System.out.println(b3);
            b1=b2;
            b2=b3;
            b3=tpl;
        }
    }
    }
    

