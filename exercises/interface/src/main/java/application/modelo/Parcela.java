package application.modelo;

import java.util.Date;

public class Parcela {
    private Double valor;
    private Date vencimento;

    public Parcela(Double valor, Date vencimento) {
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Parcela{" +
                "valor=" + valor +
                ", vencimento=" + vencimento +
                '}';
    }
}
