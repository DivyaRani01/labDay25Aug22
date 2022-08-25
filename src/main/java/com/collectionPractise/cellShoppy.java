package com.collectionPractise;

import java.util.ArrayList;
import java.util.Collections;

public class cellShoppy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cell c1 =new cell(1,23000,"Realme",4);
		cell c2 = new cell(2,33000,"readme" ,6);
		cell c3 = new cell(7,80000,"Apple iphone 13",6);
		cell c4 = new cell(3,33000,"Samsung" ,7);
		cell c5= new cell(5,3300,"Nokia" ,2);
		
		ArrayList <cell> al =new ArrayList<cell>();

		al.add(c1); 
		al.add(c3);
		al.add(c4);
		al.add(c2);
		al.add(c5);
		 System.out.println("\t\t\t\t****Mobile Based on Ram****");
		 Collections.sort(al,new comparatorRam());
		 for(cell c : al)
			 System.out.println(c.cellId+" is "+c.cellModel+" and cost is "+c.cellPrice+" and RAM is "+c.cellRam+"gb");
		 
		 System.out.println("\t\t\t\t****Mobile Based on Price****");
		 Collections.sort(al,new comparatorPrice());
		 for(cell c : al)
			 System.out.println(c.cellId+" is "+c.cellModel+" and cost is "+c.cellPrice+" and RAM is "+c.cellRam+"gb");


	}

}
