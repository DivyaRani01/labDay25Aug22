package studentManagement;

import java.util.Comparator;

//creating marks comparator to compare marks 
public class marksComparator implements Comparator<student> {

	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		if (s1.studentMarks== s2.studentMarks)
		return 0;
		if (s1.studentMarks > s2.studentMarks)
			return 1;
		else 
			return -1;
	}
	
	

}
