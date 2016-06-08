package eu.ydp.test;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		
		Activity activity= new Activity();
		boolean ok = true;
		Scanner s = new Scanner(System.in);

				
		while (ok) {
	
		System.out.print("calculator > ");
		String commandString = s.nextLine();
			
			if (commandString.equals("exit")){
				ok=false;
				System.out.println("Exited");
			}
			else if (commandString.contains("area")){				
				activity.results(commandString);
				      
			}
			else if (commandString.equals("hello")){
				System.out.println("Welcome to Area Calculator. Enter command.");
			}
			else if (commandString.equals("showall")){
				activity.logs(commandString);
			}
			else{
				System.out.println("Available commands: hello ,exit ,showall ,area [figure type] [input data]");
			}
		}
		s.close();				
	}

}
