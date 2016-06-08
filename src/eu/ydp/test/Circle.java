package eu.ydp.test;

public class Circle implements Figure {
	private final double radius;
	public static final String Name="circle";
	
	Circle(String[] args){
		radius=(Double.parseDouble(args[0]));
	}

	@Override
	public double calculateField() {
		return radius*radius*Math.PI;
	}

	@Override
	public String getName() {
		return Name;
	}

}
