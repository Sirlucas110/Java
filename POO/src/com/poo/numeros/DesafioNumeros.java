package com.poo.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class DesafioNumeros {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

			double numero = entrada.nextDouble();
			
			BigDecimal bg = new BigDecimal(numero);
			
			BigDecimal percentual = bg.multiply(BigDecimal.TEN).divide(new BigDecimal(100));
			
			String valorFormatado = formatador.format(percentual.doubleValue());
			
			System.out.println(valorFormatado);
		}
	}
}
