package num_maior_num_menor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menor_num, maior_num, mult_m;
		double divisaoM;
		int []num = new int[3];
		

		for (int i=0;i<3;i++) {
			System.out.print("Digite o " + (i+1) + "o valor maior que zero: ");
			num[i] = sc.nextInt();
			
			while (num[i]<=0) {
				System.out.print("Tente novamente digitar o " + (i+1) +"o valor: ");
				num[i] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("VALORES DIGITADOS");
		for (int i=0;i<3;i++) {
			System.out.print(num[i] + " ");
		}
		
		maior_num = num[0];
		menor_num = num[0];		
		for (int i=0;i<3;i++) {
	
			if (num[i] > maior_num) {
				maior_num = num[i];
			}

			if (num[i] < menor_num) {
				menor_num = num[i];
			}		
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR DIGITADO: " + maior_num + "\nMENOR VALOR DIGITADO: " + menor_num);
	}

}
