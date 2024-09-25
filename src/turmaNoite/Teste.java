package turmaNoite;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o nome do produto");
		String produto = entrada.next();
		System.out.print("Digite a quantidade");
		int quant = entrada.nextInt();
		System.out.print("Digite o preço");
		float preco = entrada.nextFloat();
		System.out.print("Digite o codigo");
		int cod = entrada.nextInt();
		System.out.print("Digite o peso");
		float peso = entrada.nextFloat();
		entrada.close();

	}

}
