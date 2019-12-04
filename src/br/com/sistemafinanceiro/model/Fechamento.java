/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemafinanceiro.model;

import java.util.Date;

/**
 *
 * @author joão pedro
 */
public class Fechamento {
    private float lucro;
    private float totalSaida;
    private float totalEntrada;
    private Date data;

    

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public float getTotalSaida() {
        return totalSaida;
    }

    public void setTotalSaida(float totalSaida) {
        this.totalSaida = totalSaida;
    }

    public float getTotalEntrada() {
        return totalEntrada;
    }

    public void setTotalEntrada(float totalEntrada) {
        this.totalEntrada = totalEntrada;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date mes) {
        this.data = mes;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(data)
                .append(" - ")
                .append(totalSaida)
                .append(" - ")
                .append(totalEntrada)
                .append(" - ")
                .append(lucro);
        return sb.toString();
    }
}
