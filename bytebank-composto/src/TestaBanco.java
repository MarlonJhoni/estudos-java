
public class TestaBanco {
	public static void main(String[] args) {
		Cliente marlon = new Cliente();
		
		marlon.nome = "Marlon Jhoni";
		marlon.cpf = "222.222.222-22";
		marlon.profissao = "programador";
		
		Conta contaDoMarlon = new Conta();
		contaDoMarlon.deposita(100);
		
		contaDoMarlon.titular = marlon;
		System.out.println(contaDoMarlon.titular.nome);
	}
}
