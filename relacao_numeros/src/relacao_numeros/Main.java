package relacao_numeros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean igual=false, naoIgual=false, maior=false, menor=false, maiorIgual=false, menorIgual=false;
		
		int num1, num2;
		
		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite mais um numero: ");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			igual=true; 
		}
		if (num1 != num2) {
			naoIgual=true;
		}
		if (num1 > num2) {
			maior=true;
		}
		if (num1 < num2) {
			menor=true;
		}
		if (num1 >= num2) {
			maiorIgual=true;
		}
		if (num1 <= num2) {
			menorIgual=true;
		}
		
		System.out.println(num1 + " igual " + num2 + "? " + igual);
		System.out.println(num1 + " nao igual " + num2 + "? " + naoIgual);
		System.out.println(num1 + " maior " + num2 + "? " + maior);
		System.out.println(num1 + " menor " + num2 + "? " + menor);
		System.out.println(num1 + " maior igual " + num2 + "? " + maiorIgual);
		System.out.println(num1 + " menor igual " + num2 + "? " + menorIgual);
	}

}
