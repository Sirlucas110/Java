package com.poo.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmails {
	public static void main(String[] args) {
		String[] emails = {"joao@joao.com", "maria@maria.com", "ricardo@gmail.com"};
		
		BufferedWriter writer = null;
	
		try {
			writer = new BufferedWriter(new FileWriter("emails.txt", true));
			
			for (String email : emails) {
				writer.write(email);
				writer.newLine();
			}
		} catch (IOException e) {
			System.err.println("Não conseguiu gravar o arquivo. " + e.getMessage());
		} finally {
			try {
				writer.close();
			} catch (IOException e) {}
		}
	}
}
