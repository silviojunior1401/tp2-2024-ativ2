/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio11 {
    public static void main(String[] args) {
        int horas = 3;
        int minutos = 34;
        int segundos = 41;
        int totalSegundos = converterParaSeg(horas, minutos, segundos);
        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos correspondem a " + totalSegundos + " segundos.");
    }
    
    public static int converterParaSeg(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }
}
