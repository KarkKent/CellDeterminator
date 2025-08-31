import java.util.Set;

import MyExceptions.spaceGroupException;

public class TestDrive {

	public static void main(String[] args) {
		
		final double lambda=1.886;
		
		Peak peak1=new Peak(58.056072,4,0,0);
		Peak peak2=new Peak(28.081282,0,2,0);
		Peak peak3=new Peak(90.031471,0,0,6);
		
		CellDetermenator cellDet=new CellDetermenator();
		Cell cell=null;
		try {
			cell=cellDet.cellDetermenator("orthorombic", lambda, peak1, peak2, peak3);
		} catch (spaceGroupException e) {
			e.printStackTrace();
		}
		
		cell.printToMe();
		
		
//		h=4;
//		k=4;
//		l=0;
//		
//		double theta=90.005119/2;
//		
//		a=b=Math.sqrt((4/3)*(h*h+h*k+k*k))*d_val(lambda,theta);
//		
//		h=2;
//		k=0;
//		l=2;
//		
//		theta=28.081530/2;
//		c=l/Math.sqrt(1/(d_val(lambda,theta)*d_val(lambda,theta))-(4/3)*((h*h+h*k+k*k)/(a*a)));
//		
//		System.out.println(a+" "+b+" "+c);
	}
	public static double toRad(double angle) {
		return angle*Math.PI/180;
	}
	
	public static double d_val(double lambda, double theta) {
		return lambda/(2*Math.sin(theta*Math.PI/180));
	}
}
