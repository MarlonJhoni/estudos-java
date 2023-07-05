
public class EditorVideo extends Funcionario {

	
	public double getBonifacao() {
		System.out.println("Chamando metodo de bonificacao do EDITOR DE VIDEO");
		return super.getBonifacao() + 100;
	}	
	
}
