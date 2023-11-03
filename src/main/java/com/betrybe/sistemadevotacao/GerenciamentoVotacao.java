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

  /** Método para cadastrar votos. */
  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    }
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numeroPessoaCandidata) {
        pessoaCandidata.receberVoto();
      }
    }
    cpfsComputados.add(cpfPessoaEleitora);
  }

  /** Método para calcular o resultado da votação. */
  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }

    int totalVotos = cpfsComputados.size();
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      System.out.printf("Nome: %s - %d votos ( %d%% )%n",
          pessoaCandidata.getNome(), 
          pessoaCandidata.getVotos(),
          Math.round((float) pessoaCandidata.getVotos() / totalVotos * 100)
      );
    }
    System.out.printf("Total de votos: %d%n", totalVotos);
  }
}
