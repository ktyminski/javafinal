package eu.ydp.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class Activity {
	List<String> logs = new ArrayList<String>();	
	FigureFactory factory = new FigureFactory();

	public void results(String command){
		
	    String[] input=command.split(" ");
	    
	    if (input.length==4 && input[1].equals("rectangle") || (input.length==3 && (input[1].equals("square") || input[1].equals("circle")))){
	    input=command.split(" ",3);
	    System.out.println(input[2]);
	    
	    if( Pattern.matches("(\\d+.\\d+)|(\\d+)", input[2])){	   
		  input=command.split(" ",3);
		  String[] input2=input[2].split(" ");
		
		  Figure result=factory.createFigure(input[1],input2);
		  System.out.println("Result is: "+result.calculateField());

		  Date date=new Date();			
		  logs.add(date +": "+result.getName() +" "+ result.calculateField());
	      }else{
	    	System.out.println("Bad Arguments");
	      }
	    
	    }else{
	    	System.out.println("Bad Formula");
	    }
	}
	
	
	public void logs(String command){
		logs.forEach(System.out::println);
	}
}
