package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarConexao(){
        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        String usuario = "rm565554";
        String senha = "230806";

        try {
            Connection con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão feita com sucesso!");
            return con;
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
}
