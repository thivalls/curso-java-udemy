package application.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Contrato {
    private long numeroContrato;
    private Date dataContrato;
    private Double valorTotalContrato;
    private int numeroParcelas;

    private List<Parcela> parcelas;

    public Contrato(long numeroContrato, Date dataContrato, Double valorTotalContrato, int numeroParcelas) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = dataContrato;
        this.valorTotalContrato = valorTotalContrato;
        this.numeroParcelas = numeroParcelas;
    }

    public long getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotalContrato() {
        return valorTotalContrato;
    }

    public void setValorTotalContrato(Double valorTotalContrato) {
        this.valorTotalContrato = valorTotalContrato;
    }

    public void setNumeroContrato(long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcela) {
        this.parcelas = parcela;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "numeroContrato=" + numeroContrato +
                ", dataContrato=" + dataContrato +
                ", valorTotalContrato=" + valorTotalContrato +
                ", numeroParcelas=" + numeroParcelas +
                ", parcelas=" + parcelas +
                '}';
    }
}
