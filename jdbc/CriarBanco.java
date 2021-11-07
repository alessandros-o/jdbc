package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	public static void main(String[] args) throws SQLException {
		String stringDeConexao = "jdbc:mysql://localhost";
		String usuario = "root";
		String senha = "";
		
		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco criado com sucesso!");
		conexao.close();
	}

}
