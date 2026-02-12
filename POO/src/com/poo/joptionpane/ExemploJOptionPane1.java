package com.poo.joptionpane;

import javax.swing.JOptionPane;

public class ExemploJOptionPane1 {

	public static void main(String[] args) throws Exception{
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		JOptionPane.showMessageDialog(null, "Atenção - email não informado. ", "Atenção", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Atenção - email não informado. ", "Erro", JOptionPane.ERROR_MESSAGE);
	}
}
