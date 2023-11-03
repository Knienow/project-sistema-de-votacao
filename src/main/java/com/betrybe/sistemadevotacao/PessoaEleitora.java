package com.betrybe.sistemadevotacao;

/** Classe PessoaEleitora. */
public class PessoaEleitora extends Pessoa {
  private String cpf;
  
  /** Construtor da classe PessoaEleitora. */
  public PessoaEleitora(String nome, String cpf) {
    this.setNome(nome);
    this.setCpf(cpf);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
