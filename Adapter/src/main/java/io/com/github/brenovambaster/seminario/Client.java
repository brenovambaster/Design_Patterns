/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package io.com.github.brenovambaster.seminario;

/**
 *
 * @author Breno Vambaster C. L
 */
public class Client {

    public static void main(String[] args) {

        OracleCommands oracle = new OracleCommands();
        oracle.insert();

        /*
        MySqlCommands mysql = new MySqlCommands();
        mysql.insert();  perceba que não existe esse método, e eu não posso alterar o nome dele na classe.
         */
        MySqlAdapter mysql = new MySqlAdapter(new MySqlCommands());
        mysql.insert();
    }
}
