/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.dao;

import br.com.sistemafinanceiro.model.Entradas;
import br.com.sistemafinanceiro.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joão pedro
 */
public class EntradasDAO {
    private Connection con;
    private String sql;
    private PreparedStatement st;
    private ResultSet rs;
    
    public void inserir(Entradas entrada) throws Exception{
        con = ConnectionFactory.getConnection();
        
        sql = "insert into entradas ( valor, data) values (?,?)";
        
        st = con.prepareStatement(sql);
        
        
        st.setFloat(1,entrada.getValor());
        
        java.sql.Date dataSql = new java.sql.Date(entrada.getData().getTime());
        
        st.setDate(2, dataSql);
 
        
        st.executeUpdate();
        
        con.close();
    }
    public void editar(Entradas entrada) throws Exception{
        con = ConnectionFactory.getConnection();
        
        sql = "update entradas set  valor = ?, data = ?  where codigo = ?";
        
        st = con.prepareStatement(sql);
        
        
        st.setFloat(1, entrada.getValor());
        st.setDate(2, new java.sql.Date(entrada.getData().getTime()));
        st.setInt(3, entrada.getCodigo());
        
        st.executeUpdate();
        
        con.close();
    }
    public void remover(Entradas entrada) throws Exception{
        con = ConnectionFactory.getConnection();
        
        sql = "delete from entradas where codigo = ?";
        
        st = con.prepareStatement(sql);
        
        st.setInt(1, entrada.getCodigo());
        
        st.executeUpdate();
        
        con.close();
    }
    public List<Entradas> listar() throws Exception{
        List<Entradas> entradas = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select * from entradas";
        st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            int codigo = rs.getInt(1);
            Date data = rs.getDate("data");
            float valor = rs.getFloat("valor");
            
            
            Entradas e = new Entradas();
            
            e.setCodigo(codigo);
            e.setValor(valor);
            e.setData(data);
            
            
           entradas.add(e);
        }
        con.close();
        return entradas;
    }
    
        public Entradas buscar(int codigo) throws Exception{
        Entradas e = null;
        con = ConnectionFactory.getConnection();
        sql = "select * from entradas where codigo = ?";
        st = con.prepareStatement(sql);
        st.setInt(1, codigo);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            int valor = rs.getInt("valor");
            Date data = rs.getDate("data");
            e = new Entradas();
            e.setCodigo(codigo);
            e.setValor(valor);
            e.setData(data);
        }
        con.close();
        return e;
    }
}
