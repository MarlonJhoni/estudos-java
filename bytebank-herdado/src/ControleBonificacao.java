
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Gerente g) {
		double boni = g.getBonifacao();
		this.soma = this.soma + boni;
	}
	
	public void registra(Funcionario f) {
		double boni = f.getBonifacao();
		this.soma = this.soma + boni;
	}

	public void registra(EditorVideo ev) {
		double boni = ev.getBonifacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
   