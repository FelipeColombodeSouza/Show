/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.felipe.objeto;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author SATC
 */
public class Avaliacao {
    private Apresentacao apresentacao;
    private ArrayList<Jurado> jurados = new ArrayList();
    private ArrayList<Requisito> requisitos = new ArrayList();
    private Float mediaGeral;

    public Avaliacao(Apresentacao apresentacao, Float mediaGeral) {
        this.apresentacao = apresentacao;
        this.mediaGeral = mediaGeral;
    }

    @Override
    public String toString() {
        return "Avaliacao{" + "apresentacao=" + apresentacao + ", jurados=" + jurados + ", requisitos=" + requisitos + ", mediaGeral=" + mediaGeral + '}';
    }

    
    
    public Apresentacao getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(Apresentacao apresentacao) {
        this.apresentacao = apresentacao;
    }

    public ArrayList<Jurado> getJurados() {
        return jurados;
    }

    public void setJurados(ArrayList<Jurado> jurados) {
        this.jurados = jurados;
    }

    public ArrayList<Requisito> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(ArrayList<Requisito> requisitos) {
        this.requisitos = requisitos;
    }

    public Float getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    
    
}