package application;

import application.exceptions.DominioExecption;
import application.model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            //  dados de entrada para criação de reserva
            System.out.println("Digite o número do quarto");
            int quarto = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite a data inicial");
            Date dataInicial = sdf.parse(sc.next());
            System.out.println("Digite a data final");
            Date dataFinal = sdf.parse(sc.next());

            // instanciando entidade reserva
            Reserva reserva = new Reserva(quarto, dataInicial, dataFinal);

            // mostrando dados da reserva
            System.out.println(reserva.toString());

            // Atualizando datas de reserva
            System.out.println("Digite a nova data inicial");
            Date novaDataInicial = sdf.parse(sc.next());
            System.out.println("Digite a nova data final");
            Date novaDataFinal = sdf.parse(sc.next());
            reserva.atualizaDataReserva(novaDataInicial, novaDataFinal);

            // mostrando dados da reserva após atualização
            System.out.println(reserva.toString());
        } catch (ParseException e) {
            System.out.println("Erro ao gerar as datas inseridas.");
        } catch (DominioExecption e) {
            System.out.println("Erro de validação: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Algum erro inesperado aconteceu. Tente novamente mais tarde.");
        }


        sc.close();
    }
}
