package br.com.bytebank.banco.teste;

public class TesteString {
	public static void main(String[] args) {
		
		String nome = "Marlon";

		String vazio = " ";
		String outraVazio = vazio.trim();
		System.out.println(outraVazio.isEmpty());
		System.out.println(vazio.contains("Mar"));
		
//		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("lo");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
//		
//		char c = 'M';
//		char d = 'm';
//		String outra = nome.replace (c,d);
		
//		System.out.println(nome);
//		System.out.println(outra);
	}
}
