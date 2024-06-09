package com.example;

abstract class Pessoa {
  protected String nome;
  protected int id;
  static private int idCount = 0;

  public Pessoa(String nome) {
    idCount++;
    this.nome = nome;
    this.id = idCount;
  }

  public static int getNextId() {
    return idCount + 1;
  }

  public abstract void exibirDetalhes();
}


/*
 * Ela não pode ser instanciada diretamente;
 * Contem métodos abstratos que precisam ser implementados pelas subclasses.
*/