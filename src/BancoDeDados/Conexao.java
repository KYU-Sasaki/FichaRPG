package BancoDeDados;

import GerenciadorDeClasses.GerenteClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

    private final GerenteClasses gerenteClasses;
    private static String CAMINHO = "jdbc:mysql://localhost:3307/db_cadastro_ficha";
    private static String USUARIO = "root";
    private static String SENHA = "";
    private static Connection connection;

    public Conexao(GerenteClasses gerenteClasses) throws SQLException {
        this.gerenteClasses = gerenteClasses;
        connection();
        criarTabela();
    }

    public static Connection connection() throws SQLException{
        if (connection == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Entrando no Servidor...");
                connection = DriverManager.getConnection(CAMINHO, USUARIO, SENHA);
            }catch (ClassNotFoundException exception){
                System.out.println("Erro no servidor");
                exception.printStackTrace();
            }
        }
        return connection;
    }

    public void criarTabela() throws SQLException{
        Connection connection = connection();
        try(Statement statement = connection.createStatement()){
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS `dados_usuario` (" +
                    "`id` INT AUTO_INCREMENT NOT NULL," +
                    "`usuario` VARCHAR(15) NOT NULL," +
                    "`email` VARCHAR(255) NOT NULL," +
                    "`senha` VARCHAR(32) NOT NULL," +
                    "PRIMARY KEY (id), UNIQUE (usuario, email)" +
                    ")");
        }
    }
}
