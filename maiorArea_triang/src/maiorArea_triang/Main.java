package maiorArea_triang;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the measures of triangle X: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();

		double areaX = calculoValor(a,b,c);
		double areaY = calculoValor(d,e,f);
		
		resultadoPrt(areaX,areaY);
		
		sc.close();
	}
	
	public static double calculoValor(double a, double b, double c) {
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public static void resultadoPrt(double areaX, double areaY) {
		System.out.println("Triangle X area: " + String.format("%.4f",areaX));
		System.out.println("Triangle Y area: " + String.format("%.4f",areaY));
		
		if (areaX > areaY) {
			System.out.println("Larger area = X");
		}
		else {
			System.out.println("Larger area = Y");
		}
	}

}
