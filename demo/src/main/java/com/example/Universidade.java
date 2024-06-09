package com.example;

import java.util.ArrayList;

class Universidade {
  private static ArrayList<Materia> materias = new ArrayList<>();
  private static ArrayList<Professor> professores = new ArrayList<>();
  private static ArrayList<Aluno> alunos = new ArrayList<>();

  public static void adicionarMateria(Materia materia) {
      materias.add(materia);
  }

  public static void adicionarProfessor(Professor professor) {
      professores.add(professor);
  }

  public static void adicionarAluno(Aluno aluno) {
      alunos.add(aluno);
  }

  public static void listarPessoas() {
      System.out.println("\n=========== PROFESSORES ===========");
      for (Professor professor : professores) {
          professor.exibirDetalhes();
      }

      System.out.println("\n=========== ALUNOS ===========");
      for (Aluno aluno : alunos) {
          aluno.exibirDetalhes();
      }
  }

  public static void listarMaterias() {
      System.out.println("\n=========== MATÉRIAS ===========");
      for (Materia materia : materias) {
          System.out.println("\n- " + materia.getNome() + " (Professor: " + materia.getProfessor().getNome() + ")");
          materia.listarAlunos();
      }
  }
}