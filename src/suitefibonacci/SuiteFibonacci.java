/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suitefibonacci;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SuiteFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 1;
        int n1 = 1;
        int n2 = 1;

        System.out.print(n1 + " , ");
        System.out.print(n2 + " , ");

        while (i <= 10) {

            int n3 = n2 + n1;
            System.out.print(n3 + " , ");

            n1 = n2;
            n2 = n3;
            i++;
        }

    }

}
