package entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiq() {
		return salarioBruto-imposto;
	}
	
	public void aumentoSalario(double percent) {
		salarioBruto*=(1+(percent/100)); 
	}
	
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", salarioLiq());
	}
	
}
	