package com.poo.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("emails.txt"))){
			try {
				String email = reader.readLine();
				while (email != null) {
					System.out.println("ENVIANDO email para: " + email);
					email = reader.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
}
