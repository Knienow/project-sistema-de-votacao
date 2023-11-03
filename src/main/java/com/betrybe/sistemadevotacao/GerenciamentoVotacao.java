package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/** Classe GerenciamentoVotacao. */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  /** Método para cadastrar pessoas candidatas. */
  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    }
    PessoaCandidata candidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(candidata);
  }

  /** Método para cadastrar pessoas eleitoras. */
  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (pessoaEleitora.getCpf() == cpf) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }
    PessoaEleitora eleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(eleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    throw new UnsupportedOperationException("Unimplemented method 'votar'");
  }

  @Override
  public void mostrarResultado() {
    throw new UnsupportedOperationException("Unimplemented method 'mostrarResultado'");
  }
}
