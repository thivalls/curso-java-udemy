package application;

import application.models.Employee;
import application.models.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees");
        int number = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < number; i++){
            System.out.println("É Terceirazado?(y/n)");
            String response = sc.nextLine();
            if(response.equals("y")) {
                System.out.println("Digite o nome do terceirizado");
                String nome = sc.nextLine();

                System.out.println("Digite a quantidade de horas");
                double horas = sc.nextDouble();

                System.out.println("Digite o valor por hora trabalhada");
                double valorPorhora = sc.nextDouble();

                System.out.println("Digite o da taxa de serviço");
                double valorTaxaServico = sc.nextDouble();
                sc.nextLine();

                Employee employee = new OutsourcedEmployee(nome, horas, valorPorhora, valorTaxaServico);
                employees.add(employee);
            } else {
                System.out.println("Digite o nome do funcionário");
                String nome = sc.nextLine();

                System.out.println("Digite a quantidade de horas");
                double horas = sc.nextDouble();

                System.out.println("Digite o valor por hora trabalhada");
                double valorPorhora = sc.nextDouble();
                sc.nextLine();

                Employee employee = new Employee(nome, horas, valorPorhora);
                employees.add(employee);
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " $ " + employee.calculaPagamento());
        }

//        System.out.println("PAYMENTS WITH STREAM:");
//        employees.stream().map(employee -> {
//            System.out.println(employee.getName() + " $ " + employee.calculaPagamento());
//                    return employee.getHours();
//        });

        sc.close();
    }
}
