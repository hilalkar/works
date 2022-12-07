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
import java.util.Random;
public class Sayibulmaoyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        Random rnd=new Random();
        System.out.println("Lütfen 1_99 arasında bir sayı giriniz: ");
        int tahmin=input.nextInt();
        int sayi=rnd.nextInt(100);
        while (tahmin != sayi) {
            if (tahmin <0 || tahmin >100) {
                System.out.println("1 ile 99 arasında bir sayı giriniz: ");
                tahmin =input.nextInt();}
            else if (tahmin<sayi){
                System.out.println("Daha büyük bir sayi giriniz: ");
                tahmin=input.nextInt();
            }
            else{
                System.out.println("Daha küçük bir sayı giriniz:");
                tahmin=input.nextInt();
            }
            
            }
        System.out.println("Tebrikler..."); //72
    }
    
}
