package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		
		System.out.println();
		System.out.print("Qual é o percentual para aumentar o salário? ");
		double percent = sc.nextDouble();
		
		funcionario.aumentoSalario(percent);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ funcionario);
		
		
		sc.close();
	}

}
