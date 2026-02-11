package com.poo.collections;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {
	public static Set<Aluno> buscarAlunos(){
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(new Aluno("Ricador"));
		alunos.add(new Aluno("Rich"));
		alunos.add(new Aluno("Maria"));
		
		return alunos;
	}
}
