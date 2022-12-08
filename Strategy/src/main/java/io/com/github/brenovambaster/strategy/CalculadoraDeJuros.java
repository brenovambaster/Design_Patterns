/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.strategy;

/**
 * Classe CalculadoraDeJuros
 *
 * @author Breno Vambaster C. L
 */
public class CalculadoraDeJuros {
    
    private CalculaJurosStrategyInterface calc;
    
    public CalculadoraDeJuros(CalculaJurosStrategyInterface calInterface) {
        calc = calInterface;
    }
    
    public double calculaJuros(Pedido pedido) {

//        if (pedido.getBanco() == "Bradesco") {
//            return new Bradesco(pedido).getTaxaDeJuros();
//        } else if (pedido.getBanco() == "Santander") {
//            return new Santander(pedido).getTaxaDeJuros();
//        } else if (pedido.getBanco() == "Itau") {
//            return new Itau(pedido).getTaxaDeJuros();
//        }
        return calc.getTaxaDeJuros(pedido);
    }
    
}
