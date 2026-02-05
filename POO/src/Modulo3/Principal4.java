package Modulo3;

public class Principal4 {
	public static void main(String[] args) {
		Paciente lucas = new Paciente();
		
		lucas.altura = 1.73;
		lucas.peso = 67.7;
		
		IMC imcCalculado = lucas.calcularIndiceDeMassaCorporal();
		
		System.out.println("IMC do paciente: " + imcCalculado.indice);
		System.out.println("Abaixo do peso ideal: " + imcCalculado.abaixoDoPesoIdeal);
		System.out.println("Peso Ideal: " + imcCalculado.pesoIdeal);
		System.out.println("Obeso: " + imcCalculado.obeso);
		System.out.println("Grau de obesidade: " + imcCalculado.grauObesidade);
	}
}
