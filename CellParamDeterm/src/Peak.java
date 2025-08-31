
public class Peak {
	private double twoTheta;
	private double theta;
	
	
	private int h;
	private int k;
	private int l;
	
	public Peak(double twoTheta, int h,int k,int l) {
		this.twoTheta=twoTheta;
		this.theta=twoTheta/2*Math.PI/180;
		this.h=h;
		this.k=k;
		this.l=l;
	}
	
	public double getTheta() {
		return theta;
	}
	
	public int getH() {
		return h;
	}
	
	public int getK() {
		return k;
	}
	
	public int getL() {
		return l;
	}
	
	public double getD(double lambda) {
		return lambda/(2*Math.sin(theta));
	}
	
	public String toString() {
		return h+" "+k+" "+l+" "+twoTheta;
	}
}
