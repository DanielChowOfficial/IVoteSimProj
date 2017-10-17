package pj1;

import java.util.Random;

public class SimulationDriver {

	public static void main(String[] args) {
		int MAXNUMQ = 7;
		int MAXNUMSTUDENT = 200;
		
		
		//Multiple Choise demo with random number of students between 0 and 200. with a random number of questions between 2 and 9. Each student can randomly choose their multiple solutions
		System.out.println("Multiple Choise Demo");
		Random ran = new Random();
		int numQ = ran.nextInt(MAXNUMQ);
		int numStudents = ran.nextInt(MAXNUMSTUDENT);
		MCQuestion sampleMC = new MCQuestion(numQ + 2);
		
		CommandLineOutput clo = new CommandLineOutput();
		
	
		for(int i = 0; i < numStudents; i++){
			sampleMC.addSubmission(Integer.toString(ran.nextInt()), Integer.toString(ran.nextInt()));
		}
		
		clo.displayCount(sampleMC.accumulate());
		
		
		
		//Single choice Demo. It uses the same random number of questiosn and number of students as the mc demo but each student only offers one answer. 
		
		System.out.println("Single Choise Demo");
		
		SCQuestion sampleSC = new SCQuestion(numQ + 2);
		CommandLineOutput closc = new CommandLineOutput();
		
		for(int i = 0; i < numStudents; i++){
			sampleSC.addSubmission(Integer.toString(ran.nextInt()), Integer.toString(ran.nextInt(numQ + 3)));
		}
		closc.displayCount(sampleSC.accumulate());
		

	}

}
