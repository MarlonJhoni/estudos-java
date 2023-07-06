// extends Gerente herda da classe FuncionarioAutenticavel
public class Gerente extends FuncionarioAutenticavel {
	
	
	public double getBonifacao() {
		System.out.println("Chamando metodo de bonificacao do GERENTE");
		return super.getSalario();
	}	
	
}
