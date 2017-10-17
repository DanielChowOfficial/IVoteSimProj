package pj1;



public class CommandLineOutput implements OutputInterface {

	@Override
	public void displayQuestion(String question) {
		System.out.println(question);
		
	}

	public void displayCount(int[] count) {
		for(int i = 0; i < count.length; i++){
			System.out.print((char)(i+65));
			System.out.print(" : ");
			System.out.println(count[i]);
			
		}
	
	}

}
