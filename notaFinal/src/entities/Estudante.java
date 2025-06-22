package entities;

public class Estudante {
	public String nome;
	public double primeiroTri;
	public double segundoTri;
	public double terceiroTri;
	
	public double somaNotas() {
		return primeiroTri+segundoTri+terceiroTri;
	}
		
	public double notaFinal() {
		if (somaNotas()<60) {
			return 60-somaNotas();
		}
		else {
			return 0.0;
		}
	}
}
