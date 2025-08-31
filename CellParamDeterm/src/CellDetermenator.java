import MyExceptions.spaceGroupException;

public class CellDetermenator {
	
	public Cell cellDetermenator(String cellType,double lambda,Peak peak1,Peak peak2,Peak peak3) throws spaceGroupException{
		if(!cellType.equals("orthorombic")) {
			throw new spaceGroupException();
		}
			double a=peak1.getH()*peak1.getD(lambda);
			double b=peak2.getK()*peak2.getD(lambda);
			double c=peak3.getL()*peak3.getD(lambda);
		
		return new Cell(a,b,c);
	}
}
