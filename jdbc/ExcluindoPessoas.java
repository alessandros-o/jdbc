package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluindoPessoas {
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o c�dido da pessoa que ser� exclu�da!");
		int cod = entrada.nextInt();
		
		String sql = "DELETE FROM pessoas WHERE codido = ?";
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, cod);
		
		stmt.execute();
		
		System.out.println("Pessoa exclu�da com sucesso!");
		
		stmt.close();
		conexao.close();
		entrada.close();
	}

}
