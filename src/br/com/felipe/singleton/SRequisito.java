/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.felipe.singleton;

import br.edu.felipe.objeto.Requisito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SATC
 */
public class SRequisito {
    
    private List<Requisito> requisito = new ArrayList();

    public List<Requisito> getRequisito() {
        return requisito;
    }
    
    private SRequisito() {
    }
    
    public static SRequisito getInstance() {
        return SRequisitoHolder.INSTANCE;
    }
    
    private static class SRequisitoHolder {

        private static final SRequisito INSTANCE = new SRequisito();
    }
}
