/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

import java.util.Arrays;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio06 {
    public static void main(String[] args) {
        double[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        double m = Arrays.stream(v).average().getAsDouble();
        
        double variancia = Arrays.stream(v).map(i -> Math.pow(i - m, 2)).sum() / (v.length - 1);
        
        double desvioPadrao = Math.sqrt(variancia);
        
        System.out.println("Desvio Padrão = " + desvioPadrao);
    }
}
