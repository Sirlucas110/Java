package comm.poo.polimorfismo;

public class TestePolimorfismo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setSaldo(4000);
		TestePolimorfismo.imprimirSaldo(conta);
		
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(3500);
		imprimirSaldo(contaCorrente);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setSaldo(2500);
		imprimirSaldo(contaPoupanca);
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		if (conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println("o LIMITE DE CC É " + cc.getLimite());
		}
		

		if (conta instanceof ContaPoupanca) {
			ContaPoupanca cc = (ContaPoupanca) conta;
			System.out.println("o LIMITE DE CC É " + cc.getRendimentos());
		}
	}
}
