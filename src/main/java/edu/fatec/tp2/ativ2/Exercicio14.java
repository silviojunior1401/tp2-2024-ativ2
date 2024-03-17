/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio14 {
    public static void main(String[] args) {
        mostrarTriangulo(8);
    }

    public static void mostrarTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (2 * i - 1); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
