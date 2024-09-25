package turmaNoite;

import java.util.Scanner;

public class CalcJurosSimples {

	public static void main(String[] args) {
		// instanciando a classe Scanner para usa-la:
		Scanner scanner = new Scanner(System.in);

		// Entrada de valores
		System.out.println("Capital a investir: ");

		double capital = scanner.nextDouble();

		System.out.println("Qual a taxa de juros ");

		double taxa = scanner.nextDouble();

		System.out.println("Tempo de investimento em anos: ");

		int tempo = scanner.nextInt();

		double juros = (capital * taxa * tempo) / 100;

		System.out.println("O valor do juros é R$" + juros);

		System.out.println("Valor total adquirido é R$" + (juros + capital));
		scanner.close();

	}

}
