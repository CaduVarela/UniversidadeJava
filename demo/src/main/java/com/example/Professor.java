package com.example;

import java.util.ArrayList;

class Professor extends Pessoa {
  private ArrayList<Materia> materias;

  public Professor(String nome) {
      super(nome);
      this.materias = new ArrayList<>();
  }

  public void adicionarMateria(Materia materia) {
      materias.add(materia);
  }

  public void listarMaterias() {
      System.out.println("MATÉRIAS ENSINADAS POR " + nome + ":");
      for (Materia materia : materias) {
          System.out.println("- " + materia.getNome());
      }
  }

  @Override
  public void exibirDetalhes() {
      System.out.println("\nPROFESSOR: " + nome + ", ID: " + id);
      listarMaterias();
  }

  public String getNome() {
      return nome;
  }
}
