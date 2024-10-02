package turmaNoite;

public class ContaBancaria {

	public static void main(String[] args) {
		// Criando atributo privado
		private double saldo;
		
		//Criando método contrutor para iniciar o saldo:
		public ContaBancaria(double saldoInicial) {
			this.saldo = saldoInicial;
		}
		//público para depositar dinheiro na conta:
		public void depositar(double valor) {
			if (valor > 0) {
				saldo += valor; //saldo +saldo + valor
				System.out.println("Deposito de R$ " +valor+" realizado!");
			} else {
				System.out.println("Valor depositado invalido");
				}
			
		     
			
	

}
}