package turmaNoite;

public class TesteVeiculos {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corola", 2004, 4);
		Moto moto = new Moto("Honda ", "CB500",2019 , true);
		
		
		System.out.println("Detalhes do Carro: ");
		carro.exibirDetalhes();
		
		System.out.println("Detalhes da moto: ");
		moto.exibirDetalhes();

	}

}
