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
public class ucgenselsayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        int n=inp.nextInt();
        for (int i = 0; i <= n; i++) 
        {
            int tr=i*(i+1)/2;
            if(Math.sqrt(tr)%1==0)
            {
                System.out.println(tr);
            }
        }
    }
    }
    

