
package br.com.sistemafinanceiro.model;

import java.util.Date;
import br.com.sistemafinanceiro.util.DateUtil;

/**
 *
 * @author joão pedro
 */
public class Saidas {
    
    private int codigo;
    private String descricao;
    private float valor;
    private Date data; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(codigo)
                .append(" - ")
                .append(descricao)
                .append(" - ")
                .append(valor)
                .append(" - ")
                .append(data);
        return sb.toString();
    }
}
