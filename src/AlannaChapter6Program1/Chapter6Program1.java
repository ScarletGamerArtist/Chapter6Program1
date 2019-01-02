package AlannaChapter6Program1;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 12/18
 * Student score organizer. 
 */

public class Chapter6Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to input the number of students. 
		System.out.println("Enter the number of students: ");
		int stuNum = input.nextInt(); 
		int num = -1; 
		
		//Prompt user to enter student names and scores. 
		System.out.println("Please enter your students' names and their scores: ");
		
		
		//Names are entered here
		while(num != stuNum ) {
			System.out.println("Name: ");
		String name = input.nextLine();
		num++;
		}
		
		//Num is reset beack to "0"
		num = 0;
		
		
		//The Scores are entered here.
		while (num != stuNum) {
			System.out.println("Scores: ");
			int score = input.nextInt(); 
			num++;
			
		}
	
		
	
		
		int max = score; 
		
		if (score > max) {
			max = score; 
			System.out.println("The highest score was: "+max);
		}
		else {
			System.out.println("The highest score was: "+max);
		}
		
		






		}
		
		
		
	
		
		
		
		
		
		
		/*
		int number, max;
		number = input.nextInt(); 
		max = number; 
		String student = input.nextLine(); 
		int num = 0;
		
		
		do {
			num ++;
			student = input.nextLine(); 
			number = input.nextInt();
			if (number> max)
				max = number; 
		}while (num != 3);
		
		
		System.out.println("The highest score is: "+max);
		System.out.println("Number "+number);	
		
		*/

	}


