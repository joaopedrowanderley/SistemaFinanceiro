
package br.com.sistemafinanceiro.model;

import br.com.sistemafinanceiro.util.DateUtil;
import java.util.Date;
/**
 *
 * @author joão pedro
 */
public class Entradas {
    private int codigo;
    private float valor;
    private Date data;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
                .append(valor)
                .append(" - ")
                .append(data);
        return sb.toString();
    }
    
}
