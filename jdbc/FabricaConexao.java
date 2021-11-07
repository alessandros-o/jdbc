package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		try {
			final String stringDeConexao = "jdbc:mysql://localhost/curso_java";
			final String usuario = "root";
			final String senha = "";
			
			return DriverManager.getConnection(stringDeConexao, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
