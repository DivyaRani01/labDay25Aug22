
package studentManagement;
//importing required packages 
import java.util.Comparator;

//creating a comparator which will comparre student id for sorting purposes using collection 

public class idComparator implements Comparator <student> {
	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		if(s1.studentId == s2.studentId)
		return 0;
		if(s1.studentId > s2.studentId)
			return 1 ;
		else
			return -1;
			
		
	}

	

}
