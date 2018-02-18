package main;

import Throws.PurchaseThrows;

public class Purchase{
	private int price;
	private int date;
	private int count;
	
	public Purchase(int price, int date, int count) throws PurchaseThrows {
		if (price<0)
			try {
				throw new PurchaseThrows("������������� ����!!");
			} catch (PurchaseThrows e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.err.print("����!!!!!!!!");
			}
			finally{
				price=0;
			}
		this.price=price;
		if (count<0)
			throw new PurchaseThrows("������������� ����������!");
		this.count=count;
		if (date<=0)
			throw new PurchaseThrows("������� ������ ����!!");
		this.date=date;
	}
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		if (date<=0)
			try {
				throw new PurchaseThrows("������� ������ ����!!");
			} catch (PurchaseThrows e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				date=0;
			}
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	
	public int purchasePrice()
	{
		return price*count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + date;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Purchase) obj;
		if (count != other.count)
			return false;
		if (date != other.date)
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String s="\t"+date+"\t\t"+price+"\t\t"+count+"\t\t-\t\t-\t\t-";
		return s;
		
	}
	
	
}
