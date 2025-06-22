package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		estudante.nome = sc.nextLine();
		estudante.primeiroTri = sc.nextDouble();
		estudante.segundoTri = sc.nextDouble();
		estudante.terceiroTri = sc.nextDouble();
		
		if (estudante.somaNotas()>=60) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("REPROVADO \nFALTAM " + estudante.notaFinal() + " PONTOS");
		}
		
		sc.close();
		
	}

}