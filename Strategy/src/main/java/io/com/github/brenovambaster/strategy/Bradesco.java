/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.strategy;

/**
 * Classe Bradesco
 *
 * @author Breno Vambaster C. L
 */
public class Bradesco implements CalculaJurosStrategyInterface {

    private Pedido pedido;

    public Bradesco(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public double getTaxaDeJuros(Pedido pedido) {
        double totalPedido = pedido.getTotalPedido();
        return 10.0;
    }
}
