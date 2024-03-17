/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio03 {
    public static void main(String[] args) {
        int[] numeros = new int[100];
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int pares = 0;

        for (int i = 0; i < 100; i++) {
            numeros[i] = (int) (Math.random() * 100);
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] % 2 == 0) {
                pares++;
            }
            soma += numeros[i];
        }

        double media = soma / 100.0;
        double percentualPares = (pares / 100.0) * 100;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Percentual de números pares: " + percentualPares + "%");
        System.out.println("Média dos números: " + media);
    }
}
