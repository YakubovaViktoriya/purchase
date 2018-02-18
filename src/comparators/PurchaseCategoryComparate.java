package comparators;

import java.util.Comparator;

import main.Bonus;
import main.DiscountFixed;
import main.DiscountProcent;
import main.Purchase;

public class PurchaseCategoryComparate implements Comparator<Purchase>{
	public int compare(Purchase p1, Purchase p2){
		int q1=0,q2=0;
		if (p1.getClass()==Purchase.class)
			q1=1;
		if (p2.getClass()==Purchase.class)
			q2=1;
		if (p1.getClass()==DiscountProcent.class)
			q1=2;
		if (p2.getClass()==DiscountProcent.class)
			q2=2;
		if (p1.getClass()==DiscountFixed.class)
			q1=3;
		if (p2.getClass()==DiscountFixed.class)
			q2=3;
		if (p1.getClass()==Bonus.class)
			q1=4;
		if (p2.getClass()==Bonus.class)
			q2=4;
		return q1-q2;
	}
}
