package application.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private int numeroQuarto;
    private Date dataInicial;
    private Date dataFinal;
    private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(int numeroQuarto, Date dataInicial, Date dataFinal) {
        this.numeroQuarto = numeroQuarto;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public long calculaDiasReserva() {
        long diff = getDataFinal().getTime() - getDataInicial().getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void atualizaDataReserva(Date dataInicial, Date dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Quarto" +
                + numeroQuarto +
                ", Data inicial da reserva: " + formatoData.format(dataInicial) +
                ", Data final da reserva: " + formatoData.format(dataFinal) +
                ", Duração da reserva: =" + calculaDiasReserva() + " noites" +
                '}';
    }
}
