package eu.ydp.test;

public class Square implements Figure {
	private final double side;
	public static final String Name="square";
	
	Square(String[] args){
		side=(Double.parseDouble(args[0]));
	}

	@Override
	public double calculateField() {
		return side*side;
	}
	@Override
	public String getName() {
		return Name;
	}

}
