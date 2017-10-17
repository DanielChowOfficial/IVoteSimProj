package pj1;

import java.util.Scanner;

public class IVote {
		static Scanner scan;
		
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		boolean run = true;
		QuestionInterface question = null;
		CommandLineOutput clo = new CommandLineOutput();
		while (run == true){
			switch (getQuestionOptions()){
				case 1: 
					question = new MCQuestion(getNumberOfQuestions());
					break;
				case 2:
					question = new SCQuestion(getNumberOfQuestions());
					break;
			}
			
			
			int i = 0;
			while(i != 3){
				switch (printOptions()){
				case 1: 
					System.out.println("Please enter your ID Number");
					scan.nextLine();
					String id = scan.nextLine();					
					System.out.println("Please enter your selection(s)");					
					String submission = scan.nextLine();	
					question.addSubmission(id, submission);
					break;
				case 2:
					clo.displayCount(question.accumulate());
					break;
				case 3: i = 3;
					break;
			}
			}
			
	
			
		}
		
		
		

	}
	public static int getQuestionOptions(){
		int num = 0;
		
		while(num != 1 && num !=2){
			System.out.println("Please select an option by entering a number.");
			System.out.println("1. Multiple Choice Question");
			System.out.println("2. Single Choise Option");
			num = scan.nextInt();
		}
		return num;
		
	}
	
	public static int getNumberOfQuestions(){
		int num = 0;
		while(num < 2 || num >9){
			System.out.println("Please enter the number of answers ranging from 2-9 inclusive.");
			num = scan.nextInt();
		}
		return num;
		
	}
	
	public static int printOptions(){
		
		int num = 0;
		
		while(num != 1 && num != 2 && num != 3){
			System.out.println("Please select an option by entering a number.");
			System.out.println("1. Student adding submission");
			System.out.println("2. Display current votes");
			System.out.println("3. Reset");
			num = scan.nextInt();
		}
		return num;
		
	}

}
