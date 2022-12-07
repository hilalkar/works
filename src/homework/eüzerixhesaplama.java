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
public class eüzerixhesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        double x , F = 1;
        double t=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Terim Sayısı Giriniz  :  ");
        N = input.nextInt();
        System.out.println("Hesaplanacak X Değerini Giriniz  :  ");
        x = input.nextDouble();
        for (int i = 0; i < N; i++) {
            F = F* i;
            t +=  Math.pow(x, i) /F;
        }
        System.out.printf("\nSeri açılımı ile e üzerix değeri:  %.5f\n",t);
        System.out.printf("Komutla e üzeri x değeri: %.5f\n", Math.exp(x));
    }
    
}
