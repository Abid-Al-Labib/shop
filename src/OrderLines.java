import java.util.Date;
import java.util.Random;

public class OrderLines {
	private int amountOrdered;
	private Item ItemOrdered;
	
	OrderLines(Item ItemOrdered)
	{
		
		this.ItemOrdered = ItemOrdered;
		setAmountOrdered();
	}
	
	

	public int getAmountOrdered() {
		return amountOrdered;
	}
	
	//sets the amount needed by invoking getQuantity from Item
	public void setAmountOrdered() {
		this.amountOrdered = 50 - this.ItemOrdered.getQuantity();
	}

	//Makes an order to be displayed
	public String toString()
	{
		String s ="";
		s+="\nItem description: "+ ItemOrdered.getToolName()+"\nAmount ordered: "+this.amountOrdered+"\nSupplier: "+ItemOrdered.getSupplier().getCompanyName()+"\n";
		return s;		
	}
	
}
