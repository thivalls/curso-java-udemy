package application.servicos;

import application.modelo.Contrato;
import application.modelo.Parcela;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        for(int i=1; i <= contrato.getNumeroParcelas(); i++) {
            double parcelaLimpa = contrato.getValorTotalContrato() / contrato.getNumeroParcelas();
            double taxaComJuros = servicoPagamento.aplicaTaxaJuros(parcelaLimpa, i);
            double taxaFinal = servicoPagamento.aplicaTaxaPagamento(taxaComJuros);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//            Calendar cal = Calendar.getInstance();
//            cal.setTime(contrato.getDataContrato());
//            cal.add(Calendar., 30 * i);
//            Date novaDataParcela = Contrato.sdf.;
            contrato.getParcelas().add(new Parcela(taxaFinal, sdf.parse("13/12/2021")));
        }
    }
}
