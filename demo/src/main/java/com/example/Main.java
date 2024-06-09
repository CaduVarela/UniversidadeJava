package com.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Professor> professores = new ArrayList<Professor>();
        HashMap<Integer, Professor> professores = new HashMap<>();
        HashMap<Integer, Aluno> alunos = new HashMap<>();
        ArrayList<Materia> materias = new ArrayList<>();

        // Professores
        professores.put(Pessoa.getNextId(), new Professor("Rafael Fernandes Siqueira"));
        professores.put(Pessoa.getNextId(), new Professor("Ezequiel Gueiber"));
        professores.put(Pessoa.getNextId(), new Professor("Victor Schnepper Lacerda"));

        // Materias
        materias.add(new Materia("Programação de Computadores II", (Professor) professores.get(1)));
        materias.add(new Materia("Gerência de Projetos de Software", (Professor) professores.get(2)));
        materias.add(new Materia("Modelagem de Software", (Professor) professores.get(3)));
        materias.add(new Materia("Qualidade de Software", (Professor) professores.get(3)));

        // Alunos
        alunos.put(Pessoa.getNextId(), new Aluno("Raissa Moreira"));
        alunos.put(Pessoa.getNextId(), new Aluno("Carlos Varela"));

        // aluno com id 4
        alunos.get(4).matricularEmMateria(materias.get(0));
        alunos.get(4).matricularEmMateria(materias.get(2));
        alunos.get(4).matricularEmMateria(materias.get(1));

        // aluno com id 5
        alunos.get(5).matricularEmMateria(materias.get(0));
        alunos.get(5).matricularEmMateria(materias.get(3));

        // Adicionar a classe escola
        professores.forEach((id, professor) -> {
            Universidade.adicionarProfessor(professor);
        });
        
        alunos.forEach((id, aluno) -> {
            Universidade.adicionarAluno(aluno);
        });

        materias.forEach(materia -> {
            Universidade.adicionarMateria(materia);
        });

        Universidade.listarPessoas();
        Universidade.listarMaterias();
    }
}