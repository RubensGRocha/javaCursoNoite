package turmaNoite;

import java.util.Scanner;

public class Votar {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade");

		int idade = entrada.nextInt();

		if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade >= 16 && idade < 18 || idade > 65) {
			System.out.println("Voto facultativo");

		} else {
			System.out.println("Obrigado a votar");
		}
		
	    

	}
}
