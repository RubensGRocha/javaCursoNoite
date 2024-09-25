package turmaNoite;

import java.util.Scanner;

public class DiaDaSemana {
	public static void main(String[] args) {
	
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o dia da semana");
			
			int dia = entrada.nextInt();

			switch (dia) {
			case 1:
				System.out.println("segunda");
				break;
			case 2:
				System.out.println("terça");
				break;
			case 3:
				System.out.println("quarta");
				break;
				
			default:
				System.out.println("Dia invalido");
				
				
	}

}
}