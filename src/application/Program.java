package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
		A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos números 0 a 9.
		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o número de estudantes que vão
		alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		N estudantes. Para cada registro de aluguel, informar o nome e email do
		estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		um relatório de todas ocupações do pensionato, por ordem de quarto.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int rooms = s.nextInt();
		
		System.out.println();
		
		Room[] r = new Room[10];

		s.nextLine();
		
		for(int i = 0; i < rooms; i++) {
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			String name = s.nextLine();
			System.out.print("Email: ");
			String email = s.nextLine();
			System.out.print("Id: ");
			int id = s.nextInt();
			
			r[id] = new Room(name, email);
			
			s.nextLine();
			System.out.println();
		}
		System.out.println("Busy rooms:");
		for(int i = 0; i <= 10;i++) {
			if(r[i] != null) {
				System.out.println(i + ": " + r[i].getName() + ", " + r[i].getEmail());
			}
		}
		
		
		s.close();

	}

}
