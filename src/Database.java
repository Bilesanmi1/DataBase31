import java.util.Scanner;
public class Database {

	public static void main(String[] args) {
		int userChoice = 0;
		String userString = "";
		String student = "";
		String food = "";
		String hometown = "";
		boolean correct = false;
		boolean reRun = false;
		
		Scanner input = new Scanner(System.in);
		String students [][] = {{"Peter James", "Detroit", "Pizza"},
								{"Joe Shiesty", "Memphis", "Steak"},
								{"Max Hummer", "Warren", "Salad"},
								{"Lex Luther", "Mexico", "Cookies"},
								{"Wes Underwood", "Houston", "Ribs"},
								{"Frank Gore", "New York", "Chicken"},
								{"Ivan Jones", "Logos", "HamBuger"},
								{"Sam Darnold", "New Jersey", "Pizza"},
								{"Manny Davis", "Flint", "Subway"},
								{"Victor Davis", "Oak Parl", "Salad"}
							   };
		
		while(!(reRun)) {
		do {
		try {
			System.out.println("Which Student would you like to learn more about? (Enter a number 1-10)");
			userChoice = input.nextInt();
			student = students[userChoice - 1][0];
			food = students[userChoice - 1][2];
			hometown = students[userChoice - 1][1];
		    correct = true;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Student does not exist. Please Try again");
		}
		}while(!(correct));
		System.out.printf("Sutdent %d is %s.", userChoice, student);
		correct = false;
		do {
			try{
				System.out.println("What would you like to know about the student. (Enter \"Hometown\" or \"Food\")");
				userString = input.next();
				
				correct = true;
				
						
			}catch(Exception e) {
				System.out.println("Data does not exist. Try again");
			}
		}while(!(correct));
		
		
		
		if(userString.equals("Hometown")) {
			String studentFirst = student.substring(0, student.indexOf(' '));
			System.out.printf("%s is from %s",studentFirst,hometown);
		}else if (userString.equals("Food")){
			String studentFirst = student.substring(0, student.indexOf(' '));
			System.out.printf("%s Favorite food is %s ",studentFirst,food);
		}
		correct = false;
		
		do {
		try{
			System.out.println("would you like to continue. (Enter \"yes\" or \"no\")");
			userString = input.next();
			if(userString.equals("yes")) {
				reRun = false;
				}else if (userString.equals("no")) {
					System.out.println("Thanks!");
					reRun = true;
				}
			correct = true;
			}
			
			
		catch(Exception e) {
			System.out.println("Data does not exist. Try again");
		}
		}while(!(correct));
		
		
		
		
			}
		}
}
		
		
		
	
		

	


