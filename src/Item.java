
public class Item {
	private int Id;
	private String ToolName;
	private int quantity;
	private float price;
	private Supplier supplier;
	private boolean alreadyOrdered;
	Item(int Id,String ToolName,int quantity,float price,Supplier supplier)
	{
		this.Id = Id;
		this.ToolName = ToolName;
		this.quantity = quantity;
		this.price = price;
		this.supplier = supplier;
		this.alreadyOrdered = false;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getToolName() {
		return ToolName;
	}
	public void setToolName(String toolName) {
		ToolName = toolName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	//decrease the quantity of this item by 1
	public void decreaseItem()
	{
	
		this.quantity = this.quantity - 1;	
	}
	//returns the amount of order needed for this item
	public int orderamount()
	{
		return (50 - this.quantity);
	}
	//displays the details for this object
	public String toString()
	{
		String s;
		s = this.Id+", "+this.ToolName+", "+this.quantity+", "+this.price+", "+this.supplier.getId()+"\n";
		return s;
	}
	//too check if item is already ordered or not, to eliminate the chances of reordering
	public boolean isAlreadyOrdered() {
		return alreadyOrdered;
	}
	//setting alreadyordered to true or false depending on the scenari0(quantity)
	public void setAlreadyOrdered(boolean alreadyOrdered) {
		this.alreadyOrdered = alreadyOrdered;
	}
}
