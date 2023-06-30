import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data: %n", i + 1);
            System.out.print("Outsorced (y/n)? ");
            char resp = sc.next().charAt(0);
            if (resp == 'y') {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerhour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee a = new OutsourcedEmployee(name, hours, valuePerhour, additionalCharge);
                employees.add(i, a);
            } else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerhour = sc.nextDouble();

                Employee a = new Employee(name, hours, valuePerhour);
                employees.add(i, a);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : employees) {
            System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
