import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data: %n", i + 1);

            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual income: ");
            double anualincome = sc.nextDouble();

            if (ic == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, anualincome, numberOfEmployees));
            } else {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualincome, healthExpenditures));
            }

            System.out.println();
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (TaxPayer payer : list) {
            double test = payer.tax();
            System.out.println(payer.getName() + ": $" + String.format("%.2f", test));
            sum += test;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

        sc.close();
    }
}
