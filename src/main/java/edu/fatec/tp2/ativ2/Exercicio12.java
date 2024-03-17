/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio12 {
    public static void main(String[] args) {
        double x = 2.0;
        int z = 7;
        double resultado = calcularExp(x, z);
        System.out.println(x + " elevado a " + z + " é igual a " + resultado);
    }
    
    public static double calcularExp(double x, int z) {
        double resultado = 1;
        for (int i = 0; i < z; i++) {
            resultado *= x;
        }
        return resultado;
    }
}
