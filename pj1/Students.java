package pj1;

import java.util.ArrayList;

public class Students {
	ArrayList<String> students;
	
	Students(){
		students = new ArrayList<String>();
	}

	public boolean addStudent(String id){
		if(students.contains(id)){
			return false;
		}
		else{
			students.add(id);
		}
		
		
		
		return true;
		
	}
}
