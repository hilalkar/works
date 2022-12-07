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
public class Hilbertsayisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if((n-1)%4==0)
        {
            System.out.println("hilbert sayısıdır");
        }
        else
        {
            System.out.println("hilbert sayısı değildir");
        }
    }
    
    }
    

