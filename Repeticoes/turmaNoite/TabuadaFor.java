package turmaNoite;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero para ver a tabuada");
		
		int n = entrada.nextInt();
		
		System.out.println("Tabuada do " + n + ":");
		for(int i = 1; i<=10; i++) {
			int resultado = n * i;
			
			System.out.println(n + "x" + i + "=" + resultado );
		}

	}

}
