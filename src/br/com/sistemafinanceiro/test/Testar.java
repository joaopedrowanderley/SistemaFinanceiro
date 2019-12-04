/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.test;

import br.com.sistemafinanceiro.dao.FechamentoDAO;
import br.com.sistemafinanceiro.dao.SaidasDAO;
import br.com.sistemafinanceiro.model.Fechamento;
import br.com.sistemafinanceiro.model.Saidas;
import br.com.sistemafinanceiro.util.DateUtil;
import java.util.Date;

/**
 *
 * @author joão pedro
 */
public class Testar {
    public static void main(String[] args) throws Exception{
        FechamentoDAO dao = new FechamentoDAO();
        Fechamento fe =  new Fechamento();
        fe.setData(DateUtil.stringToDate("13/03/2019"));
        dao.inserir(fe);
        
        
        
        System.out.println("adcionado com sucesso");
        
    }
}
