package turmaNoite;

import java.util.Scanner;

public class AtividadesFisicas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		//Exibe o menu de opções
		System.out.println("Escolha uma atividade fisica");
		System.out.println("1. Corrida");
		System.out.println("2. Caminhada");
		System.out.println("3. Ciclismo");
		
		//Recebe a escolha do usuario
		int opcao = entrada.nextInt();
		int calorias = 0;
		String atividade = "";
		
		//Estrutura Switch para selecionar atividade e calcular as calorias:
		
		switch(opcao) {
		case 1:
			atividade = "Corrida";
			calorias = 300;
			break;
		case 2:
			atividade = "Caminhada";
			calorias = 150;
			break;
		case 3:
			atividade = "Ciclismo";
			calorias = 250;
			break;
			default:
				System.out.println("Opção invalida tente novamente");
				System.exit(0);
		}
		
		//Exibe o resultado da escolha:
		System.out.println("Voce escolheu a atividade:" + atividade);
		System.out.println("Calorias queimadas em 30 min: " +calorias+  " 3Kcal.");
		
		entrada.close();
		

	}

}
