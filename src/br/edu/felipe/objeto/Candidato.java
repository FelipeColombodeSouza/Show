/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.felipe.objeto;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class Candidato extends Pessoa {

    private String nacionalidade;
    private String profissao;

    public Candidato(String nacionalidade, String profissao, String nome, int id, Date dataNascimento, char sexo) {
        super(nome, id, dataNascimento, sexo);
        this.nacionalidade = nacionalidade;
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nacionalidade=" + nacionalidade + ", profissao=" + profissao + '}';
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

}
