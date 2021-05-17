package application;

import application.modelo.Contrato;
import application.modelo.Parcela;
import application.servicos.ContratoServico;
import application.servicos.PagSeguro;
import application.servicos.PayPal;
import application.servicos.ServicoPagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Objetos iniciais necessários
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Formação de dados de entrada
        System.out.println("Dados do Contrato");
        System.out.println("-------------------------------");

        System.out.println("Digite o número do contrato");
        long numeroContrato = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a data do contrato");
        Date dataContrato = sdf.parse(sc.next());

        System.out.println("Digite o valor total do contrato");
        Double totalContrato = sc.nextDouble();

        System.out.println("Digite o número de parcelas");
        int numeroParcelas = sc.nextInt();
        sc.nextLine();

        Contrato contrato = new Contrato(numeroContrato, dataContrato, totalContrato, numeroParcelas);

        ServicoPagamento servicoPagamento = new PayPal();
        //ServicoPagamento servicoPagamento = new PagSeguro();
        ContratoServico contratoServico = new ContratoServico(contrato, servicoPagamento);

        contratoServico.processaContrato();

        for(Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela.toString());
        }

        sc.close();

    }
}
