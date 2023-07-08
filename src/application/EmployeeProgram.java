package application;

import listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++){
            System.out.println("Emplyoee # " + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
                System.out.print("Nome: ");
                sc.nextLine();
                String name = sc.nextLine();;
                System.out.print("Salário: ");
                double salary = sc.nextDouble();
                list.add(new Employee(id,name,salary));
        }

        System.out.println("Informe o id do empregado que terá reajuste salarial: ");
        int id = sc.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (employee == null){
            System.out.println("Esse id não existe!");
        }else {
            System.out.print("Informe a porcentagem: ");
            double percentage = sc.nextDouble();
            employee.increaseSalary(percentage);
        }
        System.out.println("Lista de funcionários: ");
        System.out.println( list.toString());

        sc.close();
    }
}
