package turmaNoite;

public class OperaConta {

	public static void main(String[] args) {
		// Criação de conta com saldo inicial de R$ 1000.00:
		ContaBancaria conta = new ContaBancaria(1000.00);
		
		//Operando a conta do cliente:
		//Exibir o saldo inicial da conta:
		System.out.println("Saldo Inicial " + conta.getSaldo() );
		
		
		//Realizando Depósito:
		conta.depositar(5);
		System.out.println("Seu saldo é  "+ conta.getSaldo());

		//Realizar um saque:
		conta.sacar(50);
		System.out.println("Seu saldo é " + conta.getSaldo());
	}

}
