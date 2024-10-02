package turmaNoite;

public class ContaBancaria {

	// Criando atributo privado
	private double saldo;

	// Criando método contrutor para iniciar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Metodo público para depositar dinheiro na conta:
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor; // saldo +saldo + valor
			System.out.println("Deposito de R$ " + valor + " realizado!");
		} else {
			System.out.println("Valor depositado invalido ");
		}
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor);
		} else {
			System.out.println("Seu saldo é insuficiente");
		}

	}

	// Método público para consultar o saldo (getter):
	public double getSaldo() {
		return saldo;
	}
}
