package main;

import Throws.PurchaseThrows;

public class DiscountFixed extends Purchase {
	final private int discount;
	
	public DiscountFixed(int price, int date, int count, int discount) throws PurchaseThrows{
		super(price,date,count);
		this.discount=discount;
	}

	public int getDiscount() {
		return discount;
	}
	public int purchasePrice(){
		return super.purchasePrice()-discount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + discount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscountFixed other = (DiscountFixed) obj;
		if (discount != other.discount)
			return false;
		return true;
	}
	
	public String toString()
	{
		return "\t"+this.getDate()+"\t\t"+this.getPrice()+"\t\t"+this.getCount()+"\t\t-\t\t"+discount+"\t\t-";
	}
}
