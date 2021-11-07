package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class ConsultarPessoas2 {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome que deseja procurar: ");
		String nome = entrada.next();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = String.format("SELECT * FROM pessoas WHERE nome LIKE ?", nome);
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nome + "%");
		
		ResultSet resultado = stmt.executeQuery();
		
		while(resultado.next()) {
		System.out.println(resultado.getInt("codido"));
		System.out.println(resultado.getString("nome"));
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}

}
