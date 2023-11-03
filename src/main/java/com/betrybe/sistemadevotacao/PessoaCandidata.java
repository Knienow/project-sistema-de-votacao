package com.betrybe.sistemadevotacao;

/** Classe PessoaCandidata. */
public class PessoaCandidata extends Pessoa {
  public int numero;
  public int votos;

  /** Construtor da classe PessoaCandidata. */
  public PessoaCandidata(String nome, int numero) {
    this.setNome(nome);
    this.numero = numero;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    this.votos++;
  }
}
