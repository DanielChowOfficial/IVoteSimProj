package pj1;

import java.util.HashMap;

public class IVoteService implements IVoteServiceInterface{
	
	HashMap<String, int[]> group;
	Students student;
	
	IVoteService(){
		group = new HashMap<String, int[]>();
		student = new Students();
	}
	
	public boolean addSubmission(String id, int[] selections){
		if(group.containsKey(id)){
			group.remove(id);
			group.put(id, selections);
			return false;
		}
		else{
			group.put(id, selections);
			student.addStudent(id);
			return true;
		}
		
	}

}
