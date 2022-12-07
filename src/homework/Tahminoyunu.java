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
public class Tahminoyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);           
        Random random = new Random();              
        int a = random.nextInt(25) + 65;            
        int i = 1;
        char h = (char) a;             

        while (i <= 10) {            
            System.out.println("Lütfen  büyük harf tahmininizi giriniz");
            String deneme = input.nextLine();
            char deneme1 = deneme.charAt(0);
            if (deneme1 == h) {             
                System.out.println(i + "   Denemede doğru tahmin ettiniz !!!");
                break;              
            } else {
                System.out.println("Yanlış lütfen tekrar deneyiniz...");
                i++;
            }
        }
        if (i > 10) {             
            System.out.println();
            System.out.println("Maalesef kaybettiniz...");
        } //73
    }
    
}
