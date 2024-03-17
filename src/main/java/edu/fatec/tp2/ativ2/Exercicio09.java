/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio09 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);

        int[][] cartela = new int[5][5];
        int index = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cartela[i][j] = numeros.get(index);
                index++;
            }
        }

        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
