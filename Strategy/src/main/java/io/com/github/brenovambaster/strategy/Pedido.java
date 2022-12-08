/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.strategy;

/**
 * Classe Pedido
 *
 * @author Breno Vambaster C. L
 */
public class Pedido {

    private double totalPedido;
    private String banco;

    public Pedido(double totalPedido, String banco) {
        this.totalPedido = totalPedido;
        this.banco = banco;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

}
