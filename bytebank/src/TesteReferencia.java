
public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas difirentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
