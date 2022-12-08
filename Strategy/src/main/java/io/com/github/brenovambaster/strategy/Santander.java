/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.strategy;

/**
 * Classe Santander
 *
 * @author Breno Vambaster C. L
 */
public class Santander implements CalculaJurosStrategyInterface {

    private Pedido pedido;

    public Santander(Pedido pedido) {
        this.pedido = pedido;
    }

    public Santander() {
    }

    @Override
    public double getTaxaDeJuros(Pedido pedido) {
        double totalPedido = pedido.getTotalPedido();
        return 8.0;
    }

}
