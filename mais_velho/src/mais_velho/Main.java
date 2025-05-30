package mais_velho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, maior_idade, posicao_maior;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		sc.nextLine();
	
		int []idades = new int[n];
		String []nomes = new String[n];
		for (int i=0;i<n;i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine();
		}
		
		maior_idade = idades[0];
		posicao_maior = 0;
		for (int i=1;i<n;i++) {
			if (idades[i] > maior_idade) {
				maior_idade = idades[i];
				posicao_maior = i;
			}
		}
		
		System.out.println();
		System.out.println("PESSOA MAIS VELHA: " + nomes[posicao_maior]);
		
		sc.close();
	}

}
