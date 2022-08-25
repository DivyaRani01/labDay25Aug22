/* 
 * Write a Java Program to Create a new text file and read the input from the user, save the input in the text file.
 * by Divya
 */
package studentManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class fileHandling {

	public static void main(String[] args) throws IOException {
		//creating Scanner object for taking input from the user
		Scanner obj = new Scanner(System.in);
		//taking file name from the user
		out.println("Enter File Name");
		String name = obj.next();
		//creating file and providing the path for the same
		File f1 = new File("D:\\"+name);
		
		
		
		
		if(f1.createNewFile()) {
			out.println("File Created Successfully.....................\nYour File Name is  "+ f1.getName());
			int op =0;
			while (op < 5) {
				// creating choice for the user to read a file to write a file or to exit from the file
				out.println("\n\t\t\t---------Enter your choice ---------\n1---To Write * \n2---To Read *\n3---To Exit *");
				op = obj.nextInt();
				
				switch(op) {
					
				case 1 : out.println("Enter the text ");
						String content = obj.next();
						// Calling method to write
						fileHandling.fileWrite(f1, content);
				break;
				        // Calling file Reader 
				case 2 : fileHandling.fileRead(f1);
				break;
				
				default : out.println("\nFile is closing.........\n=====FILE CLOSED===== ");
					System.exit(0);
				}
				
				 
			}
			
		}
		else {
			out.println("File already exist .");
		}
		// closing Scanner Object
		obj.close();
	}
	
	//creating another method to written the text on file
	public static void fileWrite(File f1,String content) throws IOException {
		// TODO Auto-generated stub
		String path = f1.getAbsolutePath();
		FileWriter writer = new FileWriter(path);// Creating fileWriter obj to write on a file
		writer.write(content);// Storing c
		out.println("\nSuccessFully Written.\n");
		//Closing fileWriter object
		writer.close();
		
	}
	
	//Method to read the file
	public static void fileRead(File f1) {
		
		// TODO Auto-generated stub
		try {  
      
            Scanner Reader = new Scanner(f1); 
            out.println("\n"+f1.getName()+" Opening \nFile Contains : \n");
            //using hasNextline method 
            while (Reader.hasNextLine()) {  
                String fileData = Reader.nextLine();  
                out.println(fileData);  
            }  
            //Closing Scanner object
            Reader.close();  
        } catch (FileNotFoundException exception) {  
            out.println("Unexpected error occurred!");  
            exception.printStackTrace();  
        }  
	}

}
