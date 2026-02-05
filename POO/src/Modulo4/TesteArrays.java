package Modulo4;

public class TesteArrays {
	public static void main(String[] args) {
		int[] notas = new int[5];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 3;
		notas[3] = 8;
		notas[4] = 7;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posição[" + i + "]=" + notas[i]);
		}
	}
}
