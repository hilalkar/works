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
public class karekokbeshesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        double t=1;
        System.out.println("Bölme sayısı: ");
        int n = input.nextInt();
        for (int i=1;i<n;i++){
            t=4+1/t;
        }
        System.out.printf("Karekök(5)=%f\n", 2+1/t); //82
    }
    
}
