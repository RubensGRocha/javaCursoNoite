package turmaNoite;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a palavra");
		
		String palavra = entrada.next();
		
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();
		System.out.println("Palavra Invertida:  "+ palavraInvertida);
				

	}

}
