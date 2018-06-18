/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.felipe.singleton;

import br.edu.felipe.objeto.Candidato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SCandidato {
    
   private List<Candidato> Candidatos = new ArrayList();
  

    public List<Candidato> getCandidatos() {
        return Candidatos;
    }
   
    
    private SCandidato() {
    }
    
    public static SCandidato getInstance() {
        return singletonHolder.INSTANCE;
    }
    
    private static class singletonHolder {

        private static final SCandidato INSTANCE = new SCandidato();
    }
}
