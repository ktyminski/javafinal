package eu.ydp.test;

public class FigureFactory extends RuntimeException {
	public static final String Rectangle="rectangle";
	public static final String Square="square";
	public static final String Circle="circle";
	
	public Figure createFigure (String figure, String[] args)  {
		if (figure.equals(Rectangle)){
			return new Rectangle(args);
	    }
		else if (figure.equals(Square)){
			return new Square(args);
		}
		else if(figure.equals(Circle)) {
			return new Circle(args);
	    }
		else{
			throw new RuntimeException("Wrong figure");
		}
				
   }
}
