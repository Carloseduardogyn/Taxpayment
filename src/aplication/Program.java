package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Income;
import entities.Legal;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Income> inco = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char cha = sc.next().charAt(0);
			if (cha == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();

				inco.add(new PhysicalPerson(name, income, health));

			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				System.out.print("Number of imployees: ");
				int imployee = sc.nextInt();

				inco.add(new Legal(name, income, imployee));
			}

		}

		System.out.println();
		
		double sum = 0.00;
		System.out.println("TAXES PAID:");
		for (Income in : inco) {
			double tax = in.incomePay();
			System.out.println(in.getName() + ": $ " + String.format("%.2f", tax));
			
			sum += tax;

		}
		
		System.out.println();
		
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();

	}

}
