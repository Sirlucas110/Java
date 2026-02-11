package com.poo.collections;

import java.util.Set;

public class TesteSetHashSet2 {
	public static void main(String[] args) {
		Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos();
		
		Aluno alunoSorteado = new Aluno("Maria");
		
		if (alunos.contains(alunoSorteado)) {
			System.out.println("Parabéns " + alunoSorteado.getNome());
		} else {
			System.out.println("Aluno não cadastrado no banco de dados");
		}
	}
}
