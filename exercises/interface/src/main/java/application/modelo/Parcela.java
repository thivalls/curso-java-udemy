package application.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
    private Double valor;
    private Date vencimento;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Parcela(double valor, Date vencimento) {
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
        return sdf.format(vencimento) + " - $" + valor;
    }
}
