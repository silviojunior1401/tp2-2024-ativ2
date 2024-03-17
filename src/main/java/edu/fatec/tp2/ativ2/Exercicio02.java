/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] conjunto1 = new int[10];
        int[] conjunto2 = new int[10];

        System.out.println("Digite os elementos do primeiro conjunto:");
        for (int i = 0; i < 10; i++) {
            conjunto1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo conjunto:");
        for (int i = 0; i < 10; i++) {
            conjunto2[i] = scanner.nextInt();
        }

        System.out.println("Elementos comuns:");

        for (int num1 : conjunto1) {
            for (int num2 : conjunto2) {
                if (num1 == num2) {
                    System.out.println(num1);
                }
            }
        }
    }
}
