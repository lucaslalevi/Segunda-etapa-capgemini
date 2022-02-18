import java.util.Scanner;

public class Questao1 {

	public static StringBuilder gerarQuantidadeDeCaracteres(int quantidade, String caracter) {
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i < quantidade; i++) {
			buffer.append(caracter);
		}
		return buffer;
	}
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
				
		System.out.print("Entre com a quantidade de degraus: ");
		int quantidade = Integer.parseInt(entrada.nextLine());		

		System.out.print("Entre com o caracter para montar a escada: ");
		String caracter = entrada.nextLine();

		StringBuilder conteudo = new StringBuilder(gerarQuantidadeDeCaracteres(quantidade, caracter));        
		
		for(int linha=0 ; linha <= quantidade; linha++) {			
			for(int coluna = quantidade; coluna > linha; coluna--) {				
				System.out.print(" ");
			}			
			System.out.println(conteudo.substring(conteudo.length() - linha));
		}
	}
}