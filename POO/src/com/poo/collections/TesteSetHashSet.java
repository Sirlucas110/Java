package com.poo.collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Lucas");
		Aluno a2 = new Aluno("Joao");
		Aluno a3 = new Aluno("Adauto");
		Aluno a4 = new Aluno("Caio");

		Set<Aluno> alunos = new HashSet<Aluno>();

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		imprimirAlunos(alunos);
	}

	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno a: alunos) {
			System.out.println("Nome: " + a.getNome());
		}
	}
}
