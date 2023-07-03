
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario marlon = new Funcionario();
		marlon.setNome("Marlon Jhoni");
		marlon.setCpf("123456789-0");
		marlon.setSalario(2600.00);
		
		System.out.println(marlon.getNome());
		System.out.println(marlon.getBonifacao());
	}
}
