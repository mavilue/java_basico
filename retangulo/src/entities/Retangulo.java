package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double AreaRet() {
		return width*height;
	}
	
	public double PerimRet() {
		return 2*(width+height);
	}
	
	public double DiagRet() {
		return Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f", AreaRet())
				+ "\nPERIMETER = "
				+ String.format("%.2f", PerimRet())
				+ "\nDIAGONAL = "
				+ String.format("%.2f", DiagRet());
	}
	
}