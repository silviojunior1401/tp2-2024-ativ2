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
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];

        System.out.print("Digite os elementos do primeiro conjunto: ");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextDouble();
        }

        System.out.print("Digite os elementos do segundo conjunto: ");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextDouble();
        }

        double produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        System.out.print("O produto escalar dos dois conjuntos é: " + produtoEscalar);
    }
}
