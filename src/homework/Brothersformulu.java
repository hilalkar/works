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
public class Brothersformulu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("sayi");
        int sayi=input.nextInt();
        double toplam=0;
        for(int k=0;k<=sayi;k++){
            int temp=2*k+1;
            double fakt=1;
            for (int j=1;j<=temp;j++){
                fakt*=j;
            }
            toplam+=(double) (temp+1)/fakt;
        }
        System.out.println(toplam); //76
    }
    
}
