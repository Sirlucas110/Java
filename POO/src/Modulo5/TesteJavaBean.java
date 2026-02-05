package Modulo5;

public class TesteJavaBean {
	public static void main(String[] args) {
		PessoaBean pessoa = new PessoaBean();
		pessoa.setNome("Lucas");
		pessoa.setIdade(23);
		
		System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
	}
}
