import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class order {
	private Date date;
	private int OrderId;
	private ArrayList<OrderLines> x;
	
	order()
	{
		this.date = new Date();
		x = new ArrayList<OrderLines>();
		OrderId = idGenerator();
	}
	//adding order line to the arraylist 
	public void addOrderLine(OrderLines theOrderLine)
	 {
		 x.add(theOrderLine);
	 }
	 //displays the order, by invoking toString method from OrderLInes
	 public void DisplayOrder()
	 {
		 String s ="";
		 s+="*************************************************************************************";
		 s+="\nORDER ID:"+OrderId+"\nDate Order: "+date+"\n";
		 for (int i = 0; i<x.size();i++)
		 {
			 s+=x.get(i).toString();
		 }
		 s+="\n**************************************************************************************\n";
		 
		 System.out.printf(s);
	 }
	 //Used to generate 5 digit random order number
	 public int idGenerator()
		{
			
			Random r = new Random();
			int id = 9999+r.nextInt(90001);
			return id;		
		}
	//return the size of the arraylist
	public int getSize()
	{
		return x.size();
	}
}
