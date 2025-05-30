package modulo_valor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num_entrada, modulo_num;
		
		System.out.print("Digite um valor: ");
		num_entrada = sc.nextDouble();
		
		if (num_entrada < 0) {
			modulo_num = (num_entrada)*(-1);
		}
		
		else {
			modulo_num = num_entrada;
		}
		
		System.out.println("O módulo do valor digitado é |" + modulo_num + "|");
	}

}
