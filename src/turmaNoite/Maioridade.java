package turmaNoite;

import java.util.Scanner;

public class Maioridade {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a idade");
		
	    int num01 = entrada.nextInt();
	    
	    
	    
	    if (num01 >= 18) {
	    	System.out.println("Você é maior de idade ");
	    }else {
	    	System.out.println("Você é menor de idade" );
	    }

	}

}
