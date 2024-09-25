package turmaNoite;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		
	    int num01 = entrada.nextInt();
	    
	    System.out.println("Digite o segundo numero");
	    
	    int num02 = entrada.nextInt();
	    
	    
	    if (num01 >num02) {
	    	System.out.println("O numero maior é "+num01);
	    }else {
	    	System.out.println("O numero maior é" +num02);
	    }
	    
	    
		

	}

}
