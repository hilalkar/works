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
public class Maclaurinserisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("Lütfen açıyı (x) değerini giriniz: ");
        int x=input.nextInt();
        System.out.println("Lütfen terim sayısı (t) girinz: ");
        int t= input.nextInt();
        int faktoriyel =1;
        double toplam=0;
        for (int i=0;i<t;i++){
            for(int j=2*i;j>0;j--){
                faktoriyel= faktoriyel*j;
            }
            toplam = toplam + (Math.pow(-1, i)* Math.pow(x, 2*i))/faktoriyel;
            faktoriyel=1;
        }
        System.out.println(toplam); //69
    }
    
}
