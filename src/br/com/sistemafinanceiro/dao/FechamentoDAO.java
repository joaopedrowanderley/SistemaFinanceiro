/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.dao;


import br.com.sistemafinanceiro.model.Entradas;
import br.com.sistemafinanceiro.model.Fechamento;
import br.com.sistemafinanceiro.model.Saidas;
import br.com.sistemafinanceiro.util.ConnectionFactory;
import br.com.sistemafinanceiro.util.DateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joão pedro
 */
public class FechamentoDAO {
    private Connection con;
    private String sql;
    private PreparedStatement st;
    private ResultSet rs;
    FechamentoDAO dao;
    Fechamento f;
   
    public void inserir(Fechamento fechamento) throws Exception{
        dao= new FechamentoDAO();
        
        float totalSaida,totalEntrada,lucro;
        totalSaida = dao.buscarSaidas(fechamento.getData());
        totalEntrada = dao.buscarEntradas(fechamento.getData());
        lucro= totalEntrada - totalSaida;
        
        con = ConnectionFactory.getConnection();
        
        sql = "insert into fechamento (total_saida, total_entrada, lucro, data) values (?,?,?,?)";
        
        st = con.prepareStatement(sql);
        
        st.setFloat(1,totalSaida );
        st.setFloat(2,totalEntrada);
        st.setFloat(3, lucro);
        
        
        java.sql.Date dataSql = new java.sql.Date(fechamento.getData().getTime());
        
        st.setDate(4, dataSql);
 
        
        st.executeUpdate();
        
        con.close();
        f = dao.buscar(fechamento);
        System.out.println(f);
    }
    public float buscarSaidas(Date data) throws SQLException{
        float saidas=0;
        con = ConnectionFactory.getConnection();
        sql = "select * from saidas where TO_CHAR(data, 'DD/MM/YYYY') = ?   ";
        st = con.prepareStatement(sql);
        st.setString(1, DateUtil.dateToString(data));
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            saidas += rs.getFloat("valor");
        }
        con.close();
        return saidas;
    }
    public float buscarEntradas(Date data) throws SQLException{
        float entradas =0;
        con = ConnectionFactory.getConnection();
        sql = "select * from entradas where TO_CHAR(data, 'DD/MM/YYYY')  = ? ";
        st = con.prepareStatement(sql);
        st.setString(1, DateUtil.dateToString(data));
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            entradas += rs.getFloat("valor");
        }
        con.close();
        return entradas;
    }
    public Fechamento buscar(Fechamento fechamento) throws Exception{
        Fechamento f = null;
        con = ConnectionFactory.getConnection();
        sql = "select * from fechamento where data = ?";
        st = con.prepareStatement(sql);
        java.sql.Date dataSql = new java.sql.Date(fechamento.getData().getTime());
        st.setDate(1, dataSql);
        ResultSet rs = st.executeQuery();
        if(rs.next()){
           float totalSaida = rs.getFloat("total_saida");
           float totalEntrada = rs.getFloat("total_entrada");
           float lucro = rs.getFloat("lucro");
            f = new Fechamento();
            f.setTotalSaida(totalSaida);
            f.setTotalEntrada(totalEntrada);
            f.setLucro(lucro);
            f.setData(dataSql);
        }
        con.close();
        return f;
    }
    public List<Fechamento> listar() throws Exception{
        List<Fechamento> fechamento = new ArrayList<>();
        con = ConnectionFactory.getConnection();
        sql = "select * from fechamento";
        st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while(rs.next()){
            Date data = rs.getDate("data");
            float lucro = rs.getFloat("lucro");
            float totalSaida = rs.getFloat("total_saida");
            float totalEntrada = rs.getFloat("total_entrada");
            
            Fechamento f = new Fechamento();
            
            f.setLucro(lucro);
            f.setTotalEntrada(totalEntrada);
            f.setTotalSaida(totalSaida);
            f.setData(data);
            
            
           fechamento.add(f);
        }
        con.close();
        return fechamento;
    }
    public void remover(Fechamento fechamento) throws Exception{
        Date data = fechamento.getData();
        con = ConnectionFactory.getConnection();
        
        sql = "delete from fechamento where data = ?";
        
        st = con.prepareStatement(sql);
        
        java.sql.Date dataSql = new java.sql.Date(fechamento.getData().getTime());
        st.setDate(1, dataSql);
        
        st.executeUpdate();
        
        con.close();
    }
}
