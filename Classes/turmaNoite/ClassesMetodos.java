package turmaNoite;

public class ClassesMetodos {
	
	//01 Calcula a soma de 2 valores
	public int soma (int a, int b) {
		return a + b;
	}
	//02 par impar
	public boolean parImpar(int a) {
	
			return a % 2 == 0;
	}
	//03 inverter uma string
	public String invertString(String nome) {
		return new StringBuilder(nome).reverse().toString();
	}
	
	//04 Metodo  Fatorial
	
	public int fatorial(int numero) {
 
		if (numero ==0 || numero ==1) {
			return 1;
		}
		return numero * fatorial(numero -1);
	}
	
	//05 Encontra o maior numero em um array de inteiros
	public int maiorNumero(int[]numeros) {
		int maior = numeros[0];
		for (int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
		return maior;
	}
	
	
	
	
    //Este método executa outros metodos!
	public static void main(String[] args) {
		//Instanciando a classe que criamos:
		ClassesMetodos util = new ClassesMetodos();
		
		//Chamando os métodos:
		System.out.println("Soma de 5 é 3: " + util.soma(5, 3));
		
		System.out.println("O numero 4 é par?  " + util.parImpar(4));
	    
		System.out.println("Nome ao contrario: " + util.invertString("java"));
		
		System.out.println("O fatorial do numero 5 é " + util.fatorial(5));
        
		int[] numeros = {1, 5 , 6 ,8,44};
		System.out.println("O maior numero do Array é: " + util.maiorNumero(numeros));
	}

}
