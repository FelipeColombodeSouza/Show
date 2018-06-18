/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.felipe.singleton;

import br.edu.felipe.objeto.Apresentacao;
import br.edu.felipe.objeto.Candidato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SApresentacao {
    
    private SApresentacao() {
    }
     private List<Apresentacao> Apresentacoes = new ArrayList();

    public List<Apresentacao> getApresentacoes() {
        return Apresentacoes;
    }
     
    public static SApresentacao getInstance() {
        return SApresentacaoHolder.INSTANCE;
    }
    
    private static class SApresentacaoHolder {

        private static final SApresentacao INSTANCE = new SApresentacao();
    }
}
