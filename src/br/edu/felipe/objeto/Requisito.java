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
public class Requisito {

    private String requisito;
    private float nota;
    private char status;

    public Requisito(String requisito, float nota, char status) {
        this.requisito = requisito;
        this.nota = nota;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Requisito{" + "requisito=" + requisito + ", nota=" + nota + ", status=" + status + '}';
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

}
