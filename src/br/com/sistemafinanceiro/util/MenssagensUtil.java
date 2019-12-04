/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author joão pedro
 */
public class MenssagensUtil {
    public static final Locale LOCALE_PT_BR = new Locale("pt", "BR");
    public static final Locale LOCALE_EN_US = new Locale("en", "US");
    public static final Locale LOCALE_ES_ES = new Locale("es", "ES");
    
    private static ResourceBundle bundle = ResourceBundle.getBundle("mensagens", LOCALE_PT_BR);
    
    public static final String MSG_BUTTON_EXCLUIR = "msg.button.excluir";
    public static final String MSG_BUTTON_EDITAR = "msg.button.editar";
    public static final String MSG_BUTTON_SAIDAS = "msg.button.saidas";
    public static final String MSG_BUTTON_ENTRADAS = "msg.button.entradas";
    public static final String MSG_BUTTON_FECHAMENTO = "msg.button.fechamento";
    public static final String MSG_BUTTON_SALVAR = "msg.button.salvar";
    public static final String MSG_BUTTON_CANCELAR = "msg.button.cancelar";
    public static final String MSG_TITULO_SAIDAS = "msg.titulo.saidas";
    public static final String MSG_TITULO_ENTRADAS = "msg.titulo.entradas";
    public static final String MSG_TITULO_FECHAMENTO = "msg.titulo.fechamento";
    public static final String MSG_TITULO_INICIO = "msg.titulo.inicio";
    public static final String MSG_TITULO_CADASTRARENTRADA = "msg.titulo.cadastrarentrada";
    public static final String MSG_TITULO_CADASTRARSAIDAS = "msg.titulo.cadastrarsaidas";
    public static final String MSG_BUTTON_INSERIR = "msg.button.inserir";
    public static final String MSG_ERRO_EXCLUIR = "msg.erro.excluir";
    public static final String MSG_ERRO_SALVAR = "msg.erro.salvar";
    public static final String MSG_TABELA_DESCRICAO = "msg.tabela.descricao";
    public static final String MSG_TABELA_DATA = "msg.tabela.data";
    public static final String MSG_TABELA_VALOR = "msg.tabela.valor";
    public static final String MSG_TABELA_CODIGO = "msg.tabela.codigo";
    public static final String MSG_TABELA_SAIDASTOTAL = "msg.tabela.saidatotal";
    public static final String MSG_TABELA_ENTRADASTOTAL = "msg.tabela.entradatotal";
    public static final String MSG_TABELA_LUCRO = "msg.tabela.lucro";
    public static final String MSG_MENU_RELATORIO = "msg.menu.relatorio";
    
    public static String getString(String key){
        return bundle.getString(key);
    }
    
    public static void setLocale(Locale locale){
        bundle = ResourceBundle.getBundle("mensagens", locale);
    }
    
}
