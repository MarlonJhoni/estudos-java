import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		 
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		//quantas linahas modificadas apos o statement executado
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidades de linhas que foram modificadas: " + linhasModificadas);
		
	}
}
