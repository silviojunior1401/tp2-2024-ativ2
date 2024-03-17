/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio13 {
    public static void mostrarPontosExclamacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        mostrarPontosExclamacao(10);
    }
}
