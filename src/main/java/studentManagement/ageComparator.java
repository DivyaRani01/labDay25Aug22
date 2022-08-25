package studentManagement;

import java.util.Comparator;

//creating age comparator using collection
public class ageComparator implements Comparator <student> {

	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub

		if(s1.studentAge== s2.studentAge)
			return 0;
		if(s1.studentAge>s2.studentAge)
			return 1;
		else 
			return -1 ;
		
	}
	
	

}
