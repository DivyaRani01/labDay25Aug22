package com.collectionPractise;

import java.util.Comparator;

public class comparatorRam implements Comparator <cell> {
	
	public int compare(cell c1, cell c2) {
	if(c1.cellRam==c2.cellRam)
		// TODO Auto-generated method stub
		return 0;
	if(c1.cellRam>c2.cellRam)
		return 1;
	else
		return -1;
	
	}
	

}
