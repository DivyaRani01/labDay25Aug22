package com.collectionPractise;

import java.util.Comparator;

public class comparatorPrice implements Comparator <cell> {
	public int compare(cell c1,cell c2) {
		if(c1.cellPrice == c2.cellPrice)
			return 0;
		if(c1.cellPrice>c2.cellPrice)
			return 1;
		else 
			return -1;
	}

}
