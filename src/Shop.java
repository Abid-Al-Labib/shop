import java.io.FileNotFoundException;

public class Shop {
	
	private Inventory myInventory;
	private SupplierList mySupplierList;
	
	Shop(SupplierList mysupplierlist,Inventory myinventory)
	{
	
		this.myInventory = myinventory;
		this.mySupplierList = mysupplierlist;
	}
	
	public SupplierList getmySupplierList()
	{
		return mySupplierList;
	}
	
	//Displays the supplier list
	public void printSupplierList()
	{
		String s;
		s = mySupplierList.Supplierlistdisplay();
		System.out.print(s);
	}
	//Displays the inventory
	public void printInventory()
	{
		System.out.print(myInventory.inventorydisplay());
	}
	
	//searches for Item by Id
	public Item searchForItemById (int id)
	{
		Item i = myInventory.findItemById(id);
		return i;
	}
	//searches for Item by name
	public Item searchForItemByName(String name)
	{
		return myInventory.findItemByName(name);
	}
	//decreases quantity of item by 1
	public void decreaseItem(String name)
	{
		myInventory.decreaseItem(name);
	}
	//displays the quantity of the the item after searching it by name
	public void checkQuantity(String name)
	{
		myInventory.checkQuantity(name);
	}
	//prints the order
	public void printOrder()
	{
		myInventory.displayOrder();
	}

}
