
public class TesteFuncionario {
	public static void main(String[] args) {
		
		
		
		Gerente marlon = new Gerente();
		marlon.setNome("Marlon Jhoni");
		marlon.setCpf("123456789-0");
		marlon.setSalario(2600.00);
		
		System.out.println(marlon.getNome());
		System.out.println(marlon.getBonifacao());
		
//		marlon.salario = 300.0;
	}
}
