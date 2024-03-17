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
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int valorReferencia;
        int menores = 0;
        int iguais = 0;

        System.out.print("Digite 10 números inteiros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Digite um valor de referência: ");
        valorReferencia = scanner.nextInt();

        System.out.print("Números maiores que o valor de referência: ");
        for (int num : numeros) {
            if (num > valorReferencia) {
                System.out.println(num);
            } else if (num < valorReferencia) {
                menores++;
            } else {
                iguais++;
            }
        }

        System.out.println("Quantidade de números menores que o valor de referência: " + menores);
        System.out.println("Quantidade de vezes que o valor de referência aparece no vetor: " + iguais);
    }
}
