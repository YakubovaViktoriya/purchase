package main;

import Throws.PurchaseThrows;

public class DiscountProcent extends Purchase{
	private int procent;
	
	public DiscountProcent(int price, int date,int count, int procent) throws PurchaseThrows{
		super(price,date,count);
		assert  (procent>0): "Некорректно указан проент скидки!!!";
		this.setProcent(procent);
	}

	public int getProcent() {
		return procent;
	}

	public void setProcent(int procent) {
		this.procent = procent;
	}
	
	public int purchasePrice(){
		return super.purchasePrice()*(1-procent/100);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + procent;
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
		DiscountProcent other = (DiscountProcent) obj;
		if (procent != other.procent)
			return false;
		return true;
	}
	
	public String toString(){
		String s="\t"+this.getDate()+"\t\t"+this.getPrice()+"\t\t"+this.getCount()+"\t\t"+procent+"\t\t-\t\t-";
		return s;
	}
}
