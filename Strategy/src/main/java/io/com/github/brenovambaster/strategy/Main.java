/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package io.com.github.brenovambaster.strategy;

/**
 *
 * @author Breno Vambaster C. L
 */
public class Main {

    public static void main(String[] args) {
        Pedido p1 = new Pedido(123, "Itau");
        Santander banco = new Santander();
        CalculadoraDeJuros calc;
        calc = new CalculadoraDeJuros(banco);
        System.out.println("+  " + calc.calculaJuros(p1));

    }
}
