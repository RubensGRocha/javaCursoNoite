package turmaNoite;
import java.util.Scanner;

public class Positivo {

	

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite um  numero");
			
		    int num01 = entrada.nextInt();
		    
		   // System.out.println("Digite o segundo numero");
		    
		   // int num02 = entrada.nextInt();
		    
		    
		    if (num01 > 0) {
		    	System.out.println("O Numero é positivo");
		    }else if (num01 < 0){
		    	System.out.println("O numero é negativo" );
		    }else {
		    	System.out.println("O numero é 0");
		    }
		    
		    
			

		}

	}