public class Cell {
	
	//cell parameters
	private double a;
	private double b;
	private double c;
	
	//cell angles
	private double alpha;
	private double beta;
	private double gamma;
	
	public Cell(double a, double b, double c, double alpha, double beta, double gamma) {
		this.a=a;
		this.b=b;
		this.c=c;
		
		this.alpha=alpha;
		this.beta=beta;
		this.gamma=gamma;
	}
	
	public Cell(double a, double b, double c) {
		this(a,b,c,90,90,90);
	}
	
	

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getAlpha() {
		return alpha;
	}
	
	public double getBeta() {
		return beta;
	}
	
	public double getGamma() {
		return gamma;
	}
	
	
	
	public String toString() {
		return a+" "+b+" "+c+" "+alpha+" "+beta+" "+gamma;
	}
	
	public void printToMe() {
		System.out.printf("%.4f %.4f %.4f %.4f %.4f %.4f",a, b,c,alpha,beta,gamma);
	}
}
