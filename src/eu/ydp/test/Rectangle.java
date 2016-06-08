package eu.ydp.test;

public class Rectangle implements Figure {
	
	private final double side1;
	private final double side2;
	public static final String Name="rectangle";
	
	Rectangle(String[] args){
		side1=(Double.parseDouble(args[0]));
		side2=(Double.parseDouble(args[1]));
	}
	
	@Override
	public double calculateField() {
		return side1*side2;		
	}
	@Override
	public String getName() {
		return Name;
	}



}
