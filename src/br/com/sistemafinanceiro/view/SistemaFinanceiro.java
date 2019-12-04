/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.view;

import br.com.sistemafinanceiro.dao.EntradasDAO;
import br.com.sistemafinanceiro.dao.FechamentoDAO;
import br.com.sistemafinanceiro.dao.SaidasDAO;
import br.com.sistemafinanceiro.model.Entradas;
import br.com.sistemafinanceiro.model.Fechamento;
import br.com.sistemafinanceiro.model.Saidas;
import br.com.sistemafinanceiro.util.DateUtil;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author joão pedro
 */
public class SistemaFinanceiro {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String op,op2;
        SaidasDAO daoS = new SaidasDAO();
        EntradasDAO daoE = new EntradasDAO();
        FechamentoDAO daoF = new FechamentoDAO();
        Saidas s;
        Entradas e;
        Fechamento f ;
        ;
        do{
            System.out.println("SISTEMA FINACEIRO\n\n");
            System.out.println("1 - Saidas");
            System.out.println("2 - Entradas");
            System.out.println("3 - Fechamento");
            System.out.println("0 - Sair");
            op=input.nextLine();
            
            if(op.equals("1")){
                System.out.println("SAIDAS\n");
                System.out.println("1 - inserir");
                System.out.println("2 - editar");
                System.out.println("3 - remover");
                System.out.println("4 - consultar");
                op2=input.nextLine();
                
                if(op2.equals("1")){
                    s = new Saidas();
                    
                    System.out.println("Descricao:");
                    s.setDescricao(input.nextLine());
                    System.out.println("Data");
                    s.setData(DateUtil.stringToDate(input.nextLine()));
                    System.out.println("Valor");
                    s.setValor(input.nextFloat());
                    
                    
                    daoS.inserir(s);
                    System.out.println("Saida salva com sucesso");
                    
                }else if(op2.equals("2")){
                    System.out.println("Informe o código: ");
                    int codigo = Integer.parseInt(input.nextLine());
                
                    s = daoS.buscar(codigo);
                
                    if(s != null){
                        System.out.println("Nova descricao: ");
                        String novaDescricao = input.nextLine();
                        s.setDescricao((novaDescricao.equals("")) ? s.getDescricao() : novaDescricao);
                        System.out.println("Nova data ");
                        s.setData(DateUtil.stringToDate(input.nextLine()));
                        System.out.println("novo valor: ");
                        float novoValor = input.nextFloat();
                        s.setValor(novoValor);
                        
                        
                        

                        daoS.editar(s);

                        System.out.println("Registro editado com sucesso!");
                    }
                    else{
                        System.out.println("Registro não encontrado!");
                    }
                }else if(op2.equals("3")){
                    System.out.println("Informe o código: ");
                    int codigo = Integer.parseInt(input.nextLine());
                
                    s = daoS.buscar(codigo);
                
                    if(s != null){
                    daoS.remover(s);
                    System.out.println("Registro excluido com sucesso!");
                    }
                    else{
                        System.out.println("Registro não encontrado!");
                    }
                }else if(op2.equals("4")){
                    List<Saidas> saidas= daoS.listar();
                    for(Saidas sa : saidas){
                    System.out.println(sa);
                }
              }
            }else if(op.equals("2")){
                System.out.println("ENTRADAS\n");
                System.out.println("1 - inserir");
                System.out.println("2 - editar");
                System.out.println("3 - remover");
                System.out.println("4 - consultar");
                op2=input.nextLine();
                
                if(op2.equals("1")){
                    e = new Entradas();
                    
                    
                    System.out.println("Data");
                    e.setData(DateUtil.stringToDate(input.nextLine()));
                    System.out.println("Valor");
                    e.setValor(input.nextFloat());
                    
                    
                    daoE.inserir(e);
                    System.out.println("Entrada salva com sucesso");
                    
                }else if(op2.equals("2")){
                    System.out.println("Informe o código: ");
                    int codigo = Integer.parseInt(input.nextLine());
                
                    e = daoE.buscar(codigo);
                
                    if(e != null){
                        
                        System.out.println("Nova data ");
                        e.setData(DateUtil.stringToDate(input.nextLine()));
                        System.out.println("novo valor: ");
                        float novoValor = input.nextFloat();
                        e.setValor(novoValor);
                        
                        
                        

                        daoE.editar(e);

                        System.out.println("Registro editado com sucesso!");
                    }
                    else{
                        System.out.println("Registro não encontrado!");
                    }
                }else if(op2.equals("3")){
                    System.out.println("Informe o código: ");
                    int codigo = Integer.parseInt(input.nextLine());
                    
                    e = daoE.buscar(codigo);

                
                    if(e != null){
                    daoE.remover(e);
                    System.out.println("Registro excluido com sucesso!");
                    }
                    else{
                        
                        System.out.println("Registro não encontrado!");
                    }
                }else if(op2.equals("4")){
                    List<Entradas> entradas= daoE.listar();
                    for(Entradas en: entradas){
                    System.out.println(en);
                }
              }
            }else if (op.equals("3")){
                System.out.println("FECHAMENTOS :");
                System.out.println("1 - fechar periodo");
                System.out.println("2 - remover fechamento ");
                System.out.println("3 - consultar");
                op2 = input.nextLine();
                
                if(op2.equals("1")){
                    System.out.println("Digite a data:");
                    Date data = DateUtil.stringToDate(input.nextLine());
                     f = new Fechamento();
                     f.setData(data);
                    daoF.inserir(f);
                }else if (op2.equals("2")){
                    System.out.println("Digite a data:");
                    Date data = DateUtil.stringToDate(input.nextLine());
                     f = new Fechamento();
                     f.setData(data);
                     daoF.remover(f);
                     System.out.println("Excluido com sucessso");
                }else if(op2.equals("3")){
                    List<Fechamento> fechamento= daoF.listar();
                    for(Fechamento fe : fechamento){
                        System.out.println(fe);
                    }
                }
            }
        }while(!op.equals("0"));
    }
}
