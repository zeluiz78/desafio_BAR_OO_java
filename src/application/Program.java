package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("Sexo:");
		Bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();
						
		System.out.println();
		System.out.println("RELATORIO:");
		System.out.printf("Consumo = R$ %.2f%n", Bill.feeding());
		
		if (Bill.couvert() == 0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = %.2f%n", Bill.couvert());
		}
		
		System.out.printf("Ingresso = %.2f%n", Bill.ticket());
		System.out.println();
		
		System.out.printf("Valor a pagar = R$ %.2f%n", Bill.total());
		
		sc.close();

	}

}
