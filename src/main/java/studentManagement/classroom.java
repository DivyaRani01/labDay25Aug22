//Creating a class called class romm
package studentManagement;

import java.util.ArrayList;
import java.util.Collections;

public class classroom {

	//creating main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student(101 , "Ram", 12 ,88);
		student s2 = new student(105 , "Shyam", 14 ,99);
		student s3 = new student(103 , "Angel", 15 ,80);
		student s4 = new student(102 , "Lucifer", 11 ,94);
		student s5 = new student(104 , "Taylor", 20 ,98);
		//creating an array list for storing data information
		ArrayList <student> al =new ArrayList<student>();
        //adding values
		al.add(s1); 
		al.add(s3);
		al.add(s4);
		al.add(s2);
		al.add(s5);
		//printing student based on student id
		 System.out.println("\t\t\t\t*****Student list based on StudentID*****");
		 //sorting students on the bases of student id
		 Collections.sort(al,new idComparator());
		 //using for each loop to print all the details
		 for(student s : al)
			 System.out.println(s.studentId+" is the student id of student named "+s.studentName+" having age is "+ s.studentAge+" and "
			 		+ "marks scored is"+s.studentMarks);
		 
		 
		 //printing student based on student age
		 System.out.println("\n\t\t\t\t*****Student list based on Students Age*****");
		 //sorting students on the bases of student age
		 Collections.sort(al,new ageComparator());
		 //using for each loop to print all the details
		 for(student s : al)
			 System.out.println(s.studentAge+" is the age  of student named "+s.studentName+" having student id  is "+ s.studentId+" and "
			 		+ "marks scored is"+s.studentMarks);
		 
		 
		 //printing student based on student marks
		 System.out.println("\n\t\t\t\t*****Student list based on Students Marks*****");
		 //sorting students on the bases of student marks
		 Collections.sort(al,new marksComparator());
		 //using for each loop to print all the details
		 for(student s : al)
			 System.out.println(s.studentMarks+" is the scored marks of student named "+s.studentName+" having age is "+ s.studentAge+" and "
			 		+ "student id is"+s.studentMarks);
		 


	}

}
