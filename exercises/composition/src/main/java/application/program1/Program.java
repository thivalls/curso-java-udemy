package application.program1;

import application.program1.entities.Department;
import application.program1.entities.HourContract;
import application.program1.entities.Worker;
import application.program1.entities.enums.WorkerLevel;
import application.program2.entities.Client;
import application.program2.entities.OrderItem;
import application.program2.entities.Order;
import application.program2.entities.enums.OrderStatus;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter department: ");
        Department workerDepartment = new Department(sc.nextLine());

        System.out.println("Inform the worker data");
        System.out.println("Name:");
        String workerName = sc.nextLine();
        System.out.println("Level:");
        WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
        System.out.println("Base Salary:");
        BigDecimal workerBaseSalary = new BigDecimal(sc.nextDouble());

        Worker worker = new Worker(workerName, workerLevel, workerBaseSalary, workerDepartment);


        System.out.println("Deseja adicionar algum contrado para este trabalhador? (y/n)");
        sc.nextLine();
        String response = sc.nextLine();

        if(response.equals("y")) {
            boolean action = true;
            while(action == true) {
                System.out.println("Digite a data");
                Date dateContract = sdf.parse(sc.next());
                System.out.println("Digite o valor por hora de contrato");
                double valuePerHour = sc.nextDouble();
                System.out.println("Digite a quantidade de horas trabalhadas");
                int hours = sc.nextInt();

                worker.addContract(new HourContract(dateContract, valuePerHour, hours));
                System.out.println("Deseja adicionar algum mais algum contrado para este trabalhador? (y/n)");
                sc.nextLine();
                String newResponse = sc.nextLine();
                if(newResponse.equals("n")) {
                    action = false;
                }
            }
        }

        System.out.println("Enter month and year to calculate incomes (MM/YYYY)");
        String dateToReport = sc.nextLine();

        String[] dateToReportExploded = dateToReport.split("/");


        System.out.printf("Name: " + worker.getName());
        System.out.printf("Department: " + worker.getDepartment());
        System.out.printf("Income: " + worker.income( Integer.parseInt(dateToReportExploded[0]), Integer.parseInt(dateToReportExploded[1]) ) );

        sc.close();
    }
}
