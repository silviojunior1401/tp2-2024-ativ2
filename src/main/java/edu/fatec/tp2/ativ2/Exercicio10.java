/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio10 {
    public static void main(String[] args) {
        double raio = 29.0;
        double volume = calcularVolume(raio);
        System.out.printf("O volume da esfera com raio %.2f é %.2f", raio, volume);
    }
    
    public static double calcularVolume(double raio) {
        return (4.0 / 3) * Math.PI * Math.pow(raio, 3);
    }
}
