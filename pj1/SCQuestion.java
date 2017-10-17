package pj1;

public class SCQuestion implements QuestionInterface {
	
	IVoteService voteService;
	int size;
	SCQuestion(int size){
		this.size = size;
		voteService = new IVoteService();
	}

	@Override
	public int[] accumulate() {
		int[] total = new int[size];
		for(int i = 0; i < voteService.group.size(); i++){
			for(int j = 0; j < size; j++){
				if(voteService.group.get(voteService.student.students.get(i))[j] == 1){
					total[j]++;
				}
			}
		}
		return total;
	}
	
	public void addSubmission(String id, String submission){
		int[] ans = new int[size];
		if(submission.length()!=1){
			System.out.println("Invalid Answer, Please Resubmit");
			return;
		}
		for(int i = 0; i < size; i++){
			if((submission.indexOf((char)(i+49)) >=0) || submission.indexOf((char) (i+65)) >= 0 || submission.indexOf((char) (i+97)) >= 0){
				ans[i]++;	
			}	
		}

		voteService.addSubmission(id, ans);
	}
}
