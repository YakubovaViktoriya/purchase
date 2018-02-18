package main;

public class Runner {

		public static void main(String args[])
		{
			ShoppingCart s1=new ShoppingCart();
			System.out.print(s1);
			s1.SortDay();
			System.out.print(s1);
			s1.SortType();
			System.out.print(s1);
		}
}
