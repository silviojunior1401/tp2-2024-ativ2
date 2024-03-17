/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.fatec.tp2.ativ2;

/**
 *
 * @author junin
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Produto[] produtos = new Produto[30];
        
        for (int i = 0; i < produtos.length; i++) {
            int quantidade = (int) (Math.random() * 100);
            double valorCompra = (Math.random() * 100);
            double valorVenda = (Math.random() * 10) + valorCompra;
            
            produtos[i] = new Produto(i+1,quantidade, valorCompra, valorVenda);
        }
        
        listarProdutos(produtos);
        
        listarProdutoPorCodigo(5,produtos);
    }
    
    public static void listarProdutos(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto.dadosProduto());
        }
    }

    public static void listarProdutoPorCodigo(int codigo, Produto[] produtos) {
        for (Produto produto : produtos) {
            if (produto.codigo == codigo) {
                System.out.println(produto.dadosProduto());
                return;
            }
        }
        System.out.println("Produto não encontrado");
    }
}
