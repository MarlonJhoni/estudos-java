package sintaxe_var_fluxos;

public class TestaWhile {
	public static void main(String[] args) {
		
		int contador = 0;
		while(contador < 10) {
			System.out.println(contador);
			contador++;
		}
		// System.out.println(contador); while funciona fora do escopo
	}
}
