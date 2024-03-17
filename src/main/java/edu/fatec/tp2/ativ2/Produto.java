/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ2;

/**
 *
 * @author Silvio Junior
 */
public class Produto {
    int codigo;
    int quantidade;
    double valorCompra;
    double valorVenda;

    public Produto(int codigo, int quantidade, double valorCompra, double valorVenda) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public String dadosProduto() {
        return "-- Produto --\n Código: " + codigo +
                "\n Quantidade: " + quantidade +
                "\n Valor de Compra:" + valorCompra +
                "\n valorVenda=" + valorVenda + "\n \n";
    }
}
