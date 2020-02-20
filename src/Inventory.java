import java.util.ArrayList;

public class Inventory {
	private ArrayList<Item> ItemList;
	private order order;
	
	Inventory(ArrayList<Item> itemlist)
	{
		this.ItemList = itemlist;
		order = new order();
	}
	//prints quantity of item;
	public void checkQuantity(String name)
	{
		Item theItem = findItemByName(name);
		System.out.printf("\nThe quantity in stock is: %d\n",theItem.getQuantity());
	}
	//makes an order and adds it to the order's arraylist
	public void orderNeeded(Item x)
	{
		OrderLines newOrderLine = new OrderLines(x);
		order.addOrderLine(newOrderLine);
	}
	//displays the order
	public void displayOrder()
	{
		if (order.getSize()==0)
		{
			System.out.println("Nothing to order:");
		}
		else order.DisplayOrder();
	}
	//decreases the quantity after finding the item by name from the arraylist
	public void decreaseItem(String name)
	{
		
		Item theItem = findItemByName(name);
		if(theItem.getQuantity()>0)
			{theItem.setQuantity(theItem.getQuantity()-1);}
		if(theItem.getQuantity()<40 && !theItem.isAlreadyOrdered())
		{
			orderNeeded(theItem);
			theItem.setAlreadyOrdered(true);
		}
	}
	//searches item by id from the arraylist
	public Item findItemById(int id)
	{
		for (int i = 0 ; i < ItemList.size();i++) 
		{
			if(ItemList.get(i).getId() == id)
			{
				return ItemList.get(i); 
			}
		}
		return null;
	}
	//searches for item by name from the array list
	public Item findItemByName(String name)
	{
		for (int i = 0 ; i<ItemList.size();i++)
		{
			if(ItemList.get(i).getToolName().equals(name) )
			{
				return ItemList.get(i);
			}
			
		}
		return null;
	}
	//displays the inventory by invoking toString method of item
	public String inventorydisplay()
	{
		String s="";
		for(int i=0;i<this.ItemList.size();i++)
		{
			s+=ItemList.get(i).toString();
		}
		return s;
	}

}
