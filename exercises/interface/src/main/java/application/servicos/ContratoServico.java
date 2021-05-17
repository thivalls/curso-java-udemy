package application.servicos;

import application.modelo.Contrato;
import application.modelo.Parcela;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class ContratoServico {
    private final ServicoPagamento servicoPagamento;
    private Contrato contrato;

    public ContratoServico(Contrato contrato, ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
        this.contrato = contrato;
    }

    public void processaContrato() throws ParseException {
        for (int i = 1; i <= contrato.getNumeroParcelas(); i++) {
            double parcelaBase = contrato.getValorTotalContrato() / contrato.getNumeroParcelas();
            double taxaComJuros = parcelaBase + servicoPagamento.aplicaTaxaJuros(parcelaBase, i);
            double taxaFinal = taxaComJuros + servicoPagamento.aplicaTaxaPagamento(taxaComJuros);

            // Aplicando regra de data
            Date novaDataParcela = aplicaRegraData(contrato.getDataContrato(), i);

            contrato.getParcelas().add(new Parcela(taxaFinal, novaDataParcela));
        }
    }

    private Date aplicaRegraData(Date date, int i) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, i);
        return cal.getTime();
    }
}
