
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double boni = f.getBonifacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
   