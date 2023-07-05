// extends Gerente herda da classe Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonifacao() {
		System.out.println("Chamando metodo de bonificacao do GERENTE");
		return super.getBonifacao() + super.getSalario();
	}	
	
}
