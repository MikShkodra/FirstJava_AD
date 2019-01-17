/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjava_ad;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Confronto {

    //leggere in input due numeri interi e stampare il massimo
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserisci primo numero: ");
        int op1 = s.nextInt();

        System.out.println("Inserisci secondo numero: ");
        int op2 = s.nextInt();

        if  (op1 > op2) {
            System.out.println(op1);
        } 
        else if (op1 < op2) {
            System.out.print(op2);
        }
        else {
            System.out.print("SONO UGUALI  ");
        }
    }

}
