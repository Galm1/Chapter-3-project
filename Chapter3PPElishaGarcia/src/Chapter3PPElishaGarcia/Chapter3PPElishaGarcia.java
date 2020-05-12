package Chapter3PPElishaGarcia;


/**Student Name: Elisha Garcia

*Date Completed: 03/02/2020

*Project No. and Page No. in the book: Project 1, pg. 99 - 126

*Extra Credit: No

*Project Description: Using Java API util.Random and util.Math to give the user a vaguely
*					  random new username. 

**/

//importing all java.util
import java.util.*;

public class Chapter3PPElishaGarcia {
	
	public static void main (String[] args) {
		
		//declaring and initiating my Scanner and Random objects
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//declaring my variables
		String firstName, lastName, firstNameChar, lastNameLastFour, newUserName;
		double age, temp, numFromAge;
		int intFromAge, intAge, userNameNewNum;
		
		//asking for user input to fill my declared variables
		System.out.println("Please enter your first name");
		firstName = scan.nextLine();
		
		System.out.println("Please enter your lastname");
		lastName = scan.nextLine();
		
		System.out.println("Please enter your age");
		age = scan.nextDouble();
		
		//casting the age into an int for use
		intAge = (int) age;
		
		//using to temp to temporally store a number for arithmetic to get a new number
		temp = Math.sqrt(age);
		numFromAge = Math.floor(temp/2);
		
		//casting again for syntactical use
		intFromAge = (int) numFromAge;
		
		//getting the the first character of the first name by using substring
		firstNameChar = firstName.substring(intFromAge, intFromAge +1);
		
		//getting the last four characters of the last name by using substring and .length()
		lastNameLastFour = lastName.substring(lastName.length() - 4, lastName.length());
		
		//getting a random number between the users age and 99
		userNameNewNum = ran.nextInt(99 - intAge + 1) + intAge;
		
		//combining all of my instantiated variables together into the new user name 
		newUserName = firstNameChar + lastNameLastFour + userNameNewNum;
		

		//printing out results to the user
		System.out.println();
		System.out.println("Your full name is:\t" + firstName + " " + lastName);
		System.out.println("Your age is:\t\t" + intAge);
		System.out.println("Your user name is:\t" + newUserName.toLowerCase());
		
		
			
	}

}
