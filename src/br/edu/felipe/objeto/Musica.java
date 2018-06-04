/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.felipe.objeto;

/**
 *
 * @author SATC
 */
public class Musica {

    private String artista;
    private String genero;
    private int tempo;
    private String nome;

    public Musica(String artista, String genero, int tempo, String nome) {
        this.artista = artista;
        this.genero = genero;
        this.tempo = tempo;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Musica{" + "artista=" + artista + ", genero=" + genero + ", tempo=" + tempo + ", nome=" + nome + '}';
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
