/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[5];
        int[] y = new int[5];
        int[] soma = new int[5];
        int[] produto = new int[5];

        System.out.print("Digite os elementos do vetor x: ");
        for (int i = 0; i < 5; i++) {
            x[i] = scanner.nextInt();
        }

        System.out.print("Digite os elementos do vetor y: ");
        for (int i = 0; i < 5; i++) {
            y[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            soma[i] = x[i] + y[i];
        }

        for (int i = 0; i < 5; i++) {
            produto[i] = x[i] * y[i];
        }

        List<Integer> diferenca = new ArrayList<>();
        for (int i : x) {
            boolean isFound = false;
            for (int j : y) {
                if (i == j) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) diferenca.add(i);
        }

        List<Integer> interseccao = new ArrayList<>();
        for (int i : x) {
            for (int j : y) {
                if (i == j) {
                    interseccao.add(i);
                    break;
                }
            }
        }

        List<Integer> uniao = new ArrayList<>();
        for (int i : x) uniao.add(i);
        for (int i : y) uniao.add(i);

        System.out.println("Soma: " + Arrays.toString(soma));
        System.out.println("Produto: " + Arrays.toString(produto));
        System.out.println("Diferença: " + diferenca);
        System.out.println("Intersecção: " + interseccao);
        System.out.println("União: " + uniao);
    }
}
