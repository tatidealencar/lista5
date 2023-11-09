/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import java.sql.SQLException;
import view.principal.Principal;

/**
 *
 * @author Tatiana
 */
public class TesteAcessoBD {

    public static void main(String[] args) throws SQLException {
        Principal telaUser = new Principal();
        telaUser.setVisible(true);
        telaUser.pack();
        telaUser.setLocationRelativeTo(null);
    }
}
