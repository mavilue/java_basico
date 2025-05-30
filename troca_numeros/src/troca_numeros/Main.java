package troca_numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, troca;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		num2 = sc.nextInt();
		
		troca = num1;
		num1 = num2;
		num2 = troca;
		
		System.out.println();
		System.out.println("Números trocados:");
		System.out.print("PRIMEIRO VALOR = " + num1 + "\nSEGUNDO VALOR = " + num2);
		
	}

}
