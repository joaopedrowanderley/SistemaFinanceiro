/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.dao;

import br.com.sistemafinanceiro.model.Saidas;
import br.com.sistemafinanceiro.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import br.com.sistemafinanceiro.util.DateUtil;
/**
 *
 * @author joão pedro
 */
public class SaidasDAO {
    private Connection con;
    private String sql;
    private PreparedStatement st;
    private ResultSet rs;
    
    public void inserir(Saidas saida) throws Exception{
        con = ConnectionFactory.getConnection();
        
        sql = "insert into saidas (descricao, valor, data) values (?,?,?)";
        
        st = con.prepareStatement(sql);
        
        st.setString(1, saida.getDescricao());
        st.setFloat(2,saida.getValor());
        
        java.sql.Date dataSql = new java.sql.Date(saida.getData().getTime());
        
        st.setDate(3, dataSql);
 
        
        st.executeUpdate();
        
        con.close();
    }
    public void editar(Saidas saida) throws Exception{
        con = ConnectionFactory.getConnection();
        
        sql = "update saidas set descricao = ?, valor = ?, data = ?  where codigo = ?";
        
        st = con.prepareStatement(sql);
        
        st.setString(1, saida.getDescricao());
        st.setFloat(2, saida.getValor());
        st.setDate(3, new java.sql.Date(saida.getData().getTime()));
        st.setInt(4, saida.getCodigo());
        
        st.executeUpdate();
        
        con.close();
    }
    public void remover(Saidas saida) throws Exception{
        con = ConnectionFactory.getConnection();
        
        sql = "delete from saidas where codigo = ?";
        
        st = con.prepareStatement(sql);
        
        st.setInt(1, saida.getCodigo());
        
        st.executeUpdate();
        
        con.close();
    }
    public List<Saidas> listar() throws Exception{
        List<Saidas> saidas = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select * from saidas";
        st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            int codigo = rs.getInt(1);
            String descricao = rs.getString("descricao");
            Date data = rs.getDate("data");
            float valor = rs.getFloat("valor");
            
            
            Saidas s = new Saidas();
            
            s.setCodigo(codigo);
            s.setDescricao(descricao);
            s.setValor(valor);
            s.setData(data);
            
            
            saidas.add(s);
        }
        con.close();
        return saidas;
    }
    
    public Saidas buscar(int codigo) throws Exception{
        Saidas s = null;
        con = ConnectionFactory.getConnection();
        sql = "select * from saidas where codigo = ?";
        st = con.prepareStatement(sql);
        st.setInt(1, codigo);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            String descricao = rs.getString("descricao");
            int valor = rs.getInt("valor");
            Date data = rs.getDate("data");
            s = new Saidas();
            s.setCodigo(codigo);
            s.setDescricao(descricao);
            s.setValor(valor);
            s.setData(data);
        }
        con.close();
        return s;
    }
    
 }

