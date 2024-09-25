package turmaNoite;

import java.util.Scanner;
public class Swit {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int faixaEtaria = entrada.nextInt();
		switch (faixaEtaria) {
        case 0:
            System.out.println("Proibido votar");
            break;
        case 1:
        case 2:
            System.out.println("Voto facultativo");
            break;
        case 3:
            System.out.println("Obrigado a votar");
            break;
        default:
            System.out.println("Voto invalido");
            break;
    }
}
}

	
