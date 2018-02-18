package comparators;

import java.util.Comparator;


import main.Purchase;

public class PurchaseDayComparate implements Comparator<main.Purchase>{

	@Override
	public int compare(Purchase arg0, Purchase arg1) {
		return arg0.getDate()-arg1.getDate();
	}


}
