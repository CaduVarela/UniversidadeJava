package com.example;

import java.util.ArrayList;

class Materia {
  private String nome;
  private Professor professor;
  private ArrayList<Aluno> alunos;

  public Materia(String nome, Professor professor) {
      this.nome = nome;
      this.professor = professor;
      this.alunos = new ArrayList<>();
      professor.adicionarMateria(this);
  }

  public String getNome() {
      return nome;
  }

  public Professor getProfessor() {
      return professor;
  }

  public void adicionarAluno(Aluno aluno) {
      alunos.add(aluno);
  }

  public void listarAlunos() {
      System.out.println("ALUNOS MATRICULADOS EM " + nome + ":");
      for (Aluno aluno : alunos) {
          System.out.println("- " + aluno.getNome());
      }
  }
}

/*
 * Cada matéria é associada a um professor e a uma lista de alunos matriculados nela.
*/