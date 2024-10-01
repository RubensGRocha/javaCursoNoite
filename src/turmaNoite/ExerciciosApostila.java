package turmaNoite;

import java.util.Scanner;

public class ExerciciosApostila {

	public static void main(String[] args) {
		// Passo 2: Declara uma variável para o número a ser verificado
		int numero;

		// Criação do Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuário para inserir um número
		System.out.print("Digite um número para verificar se é primo: ");
		numero = scanner.nextInt();

		// Passo 3: Lógica para contar o número de divisores
		int contDivisores = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contDivisores++;
			}
		}

		// Passo 4: Verifica se o número é primo
		if (contDivisores > 2) {
			System.out.println(numero + " não é um número primo.");
		}else {
			System.out.println(numero + " é um número primo.");
		
			
		}
		

		// Fecha o scanner
		scanner.close();
	}
}
