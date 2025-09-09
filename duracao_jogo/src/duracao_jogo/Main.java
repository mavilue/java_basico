package duracao_jogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int duracao;
		int hora_in = sc.nextInt();
		int hora_fin = sc.nextInt();
		
		if (hora_in>hora_fin) {
			duracao = 24 - hora_in + hora_fin;
		}
		
		else if (hora_in == hora_fin) {
			duracao = 24;
		}
		
		else {
			duracao = hora_fin - hora_in;
		}
		
		System.out.println("O tempo de jogo foi de: " + duracao + " hora(s).");

	}

}
