// extends Gerente herda da classe Funcionario e assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente () {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonifacao() {
		System.out.println("Chamando metodo de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}
	
}
