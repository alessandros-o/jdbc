package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarRegistros {
	
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		String sql = "UPDATE pessoas SET nome = ? WHERE codido = ?";
		String sql2 = "SELECT * FROM pessoas WHERE codido = ?";
		
		System.out.println("Digite o código da pessoa!");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(sql2);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			System.out.println(resultado.getString("nome"));
			entrada.nextLine();
			
			System.out.print("Digite o nome para alterar!");
			String nome = entrada.nextLine();
			
			stmt.close();
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setInt(2, codigo);
			stmt.executeUpdate();
		
		}
		
				
		
		stmt.close();
		conexao.close();
		entrada.close();
	}

}
