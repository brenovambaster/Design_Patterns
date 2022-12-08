/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.com.github.brenovambaster.seminario;

/**
 * Classe MySqlAdapter
 *
 * @author Breno Vambaster C. L
 */
public class MySqlAdapter implements DbAdapter {

    private MySqlCommands mysql;

    public MySqlAdapter(MySqlCommands mysql) {
        this.mysql = mysql;
    }

    @Override
    public void insert() {
        this.mysql.insertMySql();
    }

    @Override
    public void update() {
        this.mysql.updteMySql();
    }

    @Override
    public void delete() {
        this.mysql.updteMySql();
    }

}
