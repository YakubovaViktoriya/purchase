package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Throws.PurchaseThrows;
import comparators.PurchaseCategoryComparate;

public class ShoppingCart {
	private ArrayList<Purchase> mass;
	
	public ShoppingCart(){
		mass=new ArrayList<Purchase>();
		try {
			mass.add(new Bonus(-5,10,3,5));
			mass.add(new Purchase(100,2,3));
			mass.get(1).setDate(-3);
			mass.add(new DiscountProcent(1000,1,2,5));
			mass.add(new DiscountFixed(30,3,5,10));
			mass.add(new DiscountFixed(150,26,13,33));
			mass.add(new Purchase(250,31,2));
			mass.add(new Bonus(500,7,1,100));
			mass.add(new Purchase(50,4,12));
			mass.add(new DiscountProcent(300,10,3,30));
			mass.add(new Purchase(60,3,2));
			
		} catch (PurchaseThrows e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SortDay(){
		mass.sort((Purchase p1, Purchase p2) -> Integer.compare(p1.getDate(), p2.getDate()));
		
		String [] mas={"czxcz","345","75"};
		Arrays.sort(mas, (str1,str2) -> Integer.compare(str1.length(), str2.length()));
		System.out.println("String =");
		//System.out.println(mas.toString());
		List<String> list=Arrays.asList(mas);
		list.forEach(System.out :: println);
		list.sort((str1,str2) -> str2.compareTo(str1));
		System.out.println("\n");
		list.forEach(str -> System.out.println(str));
	}
	
	public void SortType(){
		PurchaseCategoryComparate sort=new PurchaseCategoryComparate();
		mass.sort(sort);
	}

	public String toString(){
		StringBuffer s= new StringBuffer();
		for (Purchase p : mass)
			s.append(p.toString()+"\n");
		return s+"\n\n";
	}
	
	
}
