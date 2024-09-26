package turmaNoite;

public class OperacaoMatematicas {
	
	//01 Mutiplicação
	public int mutiplica (int a, int b) {
		return a * b;
	}
	
	//02 Adição
	public int adiciona (int a, int b) {
		return a + b;
	}
	
	//Subtração
	public int subtrai (int a, int b) {
		return a - b;
	}
	
	//Divisão 
	public int dividir (int a, int b) {
		return a / b;
	}
	
	
	
	

	public static void main(String[] args) {
		
		OperacaoMatematicas util = new OperacaoMatematicas();
		
		System.out.println("Adiciona "+ util.adiciona(5, 12));

	}

}
