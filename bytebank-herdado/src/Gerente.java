// extends Gerente herda da classe Funcionario e assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonifacao() {
		System.out.println("Chamando metodo de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
