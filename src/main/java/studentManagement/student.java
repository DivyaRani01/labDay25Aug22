
package studentManagement;
//creating a class called student to declare variables and creating constructors with fields
public class student {

		// TODO Auto-generated method stub
		//declaring variables to be used in program
		int studentId ;
		int studentAge ;
		int studentMarks ;
		String studentName ;
		/**
		 * creating constructor of all the variables
		 * @param studentId
		 * @param studentAge
		 * @param studentMarks
		 * @param studentName
		 */
		public student(int studentId,String studentName, int studentAge, int studentMarks) {
			super();
			this.studentId = studentId;
			this.studentAge = studentAge;
			this.studentMarks = studentMarks;
			this.studentName = studentName;
		}
		
		
}
		
	
