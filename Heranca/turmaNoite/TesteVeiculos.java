package turmaNoite;

public class TesteVeiculos {
	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Corola", 2004, 4);
		Carro carro01 = new Carro("Fiat", "Toro", 2020, 4);
		Moto moto = new Moto("Honda ", "CB500",2019 , true);
		Moto moto01 = new Moto("Yamaha ", "Nmax",2020 , true);
		
		
		System.out.println("Detalhes do Carro: ");
		carro.exibirDetalhes();
		carro01.exibirDetalhes();
		
		System.out.println("\nDetalhes da moto: ");
		moto.exibirDetalhes();
		moto01.exibirDetalhes();

	}

}
