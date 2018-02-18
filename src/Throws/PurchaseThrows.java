package Throws;

public class PurchaseThrows extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Exception _hidden;
	
	public PurchaseThrows(String er){
		super(er);
	}
		
	public PurchaseThrows(String er, Exception e){
		super(er);
		this._hidden=e;
	}
	
	public Exception getHiddenException(){
		return this._hidden;
	}
}
