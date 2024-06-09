package com.example;

import java.util.ArrayList;

class Aluno extends Pessoa implements Matricula {
  private ArrayList<Materia> materias;

  public Aluno(String nome) {
    super(nome);
    // Inicializa a lista materias como uma nova instância de ArrayList.
    this.materias = new ArrayList<>();
  }

  @Override
  public void matricularEmMateria(Materia materia) {
    materias.add(materia);
    //passando a instância atual (this) do aluno, para registrar o aluno na matéria.
    materia.adicionarAluno(this);
  }

  @Override
  public void listarMaterias() {
    System.out.println("MATÉRIAS MATRICULADAS POR " + nome + ":");
    for (Materia materia : materias) {
      System.out.println("- " + materia.getNome() + " (Professor: " + materia.getProfessor().getNome() + ")");
    }
  }

  public String getNome() {
    return nome;
  }

  @Override
  public void exibirDetalhes() {
    System.out.println("\nALUNO: " + nome + ", ID: " + id);
    listarMaterias();
  }
}