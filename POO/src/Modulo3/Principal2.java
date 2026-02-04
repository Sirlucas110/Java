package Modulo3;

public class Principal2 {
	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Lucas Moraes";
		dono1.cpf = "000.632.203.56";
		dono1.logradouro = "Rua nove de julho, 1914";
		dono1.bairro = "Vila Ipiranga";
		dono1.cidade = "Campo Grande";
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2025;
		meuCarro.cor = "Preto";
		meuCarro.fabricante = "Pegeout";
		meuCarro.modelo = "208";
		meuCarro.dono = dono1;
		
		System.out.println("Nome: " + dono1.nome);
		System.out.println("Modelo do carro: " + meuCarro.modelo);
		
	}
}
