package br.com.deitel.cap2;

public class Questao2 {
	
	public static void main(String[] args) {
		
		String[] listaDeSenhas = {"mePe", "mePe@aaaa", "mePea2014", "mepe@2014", "mePe@2014"};
		for(int i = 0; i < listaDeSenhas.length; i++) {
			System.out.println("A senha eh forte: "+ listaDeSenhas[i] + " - " + aSenhaEhForte(listaDeSenhas[i]));
		}		
	}

	private static boolean aSenhaEhForte(String senha) {
		boolean contemSenhaEhForte = false;
		
		if(aSenhaContemMaisQueSeisCaracteres(senha) && 
				aSenhaContemUmNumero(senha) &&
				aSenhaContemUmCaracterMinusculo(senha) && 
				aSenhaContemUmCaracterMaisculo(senha) && 
				aSenhaContemCaracterEspecial(senha)) {
			contemSenhaEhForte = true;
		}
		return contemSenhaEhForte;
	}
	
	
	public static boolean aSenhaContemCaracterEspecial(String senha) {

		char[] charSearch = {'!','@','#','$','%','^','&','*','(',')','-','+'};
		boolean contemCaracterEspecial = false;

		for (int i=0; i < senha.length(); i++) {
			char chr = senha.charAt(i);
			for(int j=0; j < charSearch.length; j++) {
				if(charSearch[j] == chr) {
					contemCaracterEspecial = true;
					break;
				}
			}
		}

		return contemCaracterEspecial;
	}

	
	public static boolean aSenhaContemUmCaracterMaisculo(String senha) {
		boolean contemUmCaracterMaisculo = false;
		for (int i=0; i < senha.length(); i++) {
			char chr = senha.charAt(i);			
			if(Character.isUpperCase(chr)) {
				contemUmCaracterMaisculo = true;
				break;
			}
		}
		return contemUmCaracterMaisculo;
	}

	private static boolean aSenhaContemUmCaracterMinusculo(String senha) {
		
		boolean contemUmCaracterMinusculo = false;
		
		for (int i=0; i < senha.length(); i++) {
			char chr = senha.charAt(i);			
			if(Character.isLowerCase(chr)) {
				contemUmCaracterMinusculo = true;
				break;
			}
		}
		return contemUmCaracterMinusculo;
	}

	private static boolean aSenhaContemUmNumero(String senha) {
		boolean contemUmNumero = false;
		
		for (int i=0; i < senha.length(); i++) {
			
			char chr = senha.charAt(i);
			
			if(Character.isDigit(chr)) {
				contemUmNumero = true;
				break;
			}
		}
		return contemUmNumero;
	}

	private static boolean aSenhaContemMaisQueSeisCaracteres(String senha) {
		boolean contemMaisQueSeisCaracteres = false;
		if(senha.length() > 6)
			contemMaisQueSeisCaracteres = true;
		return contemMaisQueSeisCaracteres;
	}

}
