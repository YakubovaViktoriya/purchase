package main;

import Throws.PurchaseThrows;

public class Bonus extends Purchase{
	private int costBonus;
	
	public Bonus(int price, int date, int count,int costBonus) throws PurchaseThrows{
		super(price,date,count);
		this.setCostBonus(costBonus);
	}

	public int getCostBonus() {
		return costBonus;
	}

	public void setCostBonus(int costBonus) {
		this.costBonus = costBonus;
	}
	
	public int purchasePrice(){
		return super.purchasePrice()-costBonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + costBonus;
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
		Bonus other = (Bonus) obj;
		if (costBonus != other.costBonus)
			return false;
		return true;
	}
	
	public String toString(){
		return "\t"+this.getDate()+"\t\t"+this.getPrice()+"\t\t"+this.getCount()+"\t\t-\t\t-\t\t"+costBonus;
	}
	
}
