/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.seminario;

/**
 * Classe OracleCommands
 *
 * @author Breno Vambaster C. L
 */
public class OracleCommands implements DbAdapter {

    @Override
    public void insert() {
        System.out.println("INSERT FROM ORACLE");
    }

    @Override
    public void update() {
        System.out.println("UPDATE FROM ORACLE");
    }

    @Override
    public void delete() {
        System.out.println("DELETE FROM ORACLE");
    }

}
