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
public class fermatsayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        for (int i = 0; i <= n-1; i++) 
        {
            System.out.println(Math.pow(2, Math.pow(2, i))+1);
        }
    }
    }
    

