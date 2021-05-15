package application;

import application.model.entities.Reserva;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //  solicitando número do quarto
        System.out.println("Digite o número do quarto");
        int quarto = sc.nextInt();
        sc.nextLine();

        // solicitando a data inicial
        System.out.println("Digite a data inicial");
        Date dataInicial = sdf.parse(sc.next());

        // solicitando a data final
        System.out.println("Digite a data final");
        Date dataFinal = sdf.parse(sc.next());

        if(dataFinal.before(dataInicial)) {
            System.out.println("Erro de reserva: A data final deve ser sempre maior do que a data inicial.");
            System.out.println("Programa encerrado");
        } else {
            Reserva reserva = new Reserva(quarto, dataInicial, dataFinal);
            System.out.println(reserva.toString());

            System.out.println("Digite a nova data inicial");
            Date novaDataInicial = sdf.parse(sc.next());

            System.out.println("Digite a nova data final");
            Date novaDataFinal = sdf.parse(sc.next());

            Date dataHoje = new Date();
            if(novaDataInicial.before(dataHoje) || novaDataFinal.before(dataHoje)) {
                System.out.println("Erro de reserva: As datas devem ser futuras.");
                System.out.println("Programa encerrado");
            } else if(novaDataFinal.before(novaDataInicial)) {
                System.out.println("Erro de reserva: A data final deve ser sempre maior do que a data inicial.");
                System.out.println(reserva.toString());
            } else {
                reserva.atualizaDataReserva(novaDataInicial, novaDataFinal);
                System.out.println(reserva.toString());
            }


        }

        sc.close();
    }
}
