
public class Supplier {
	private int id;
	private String companyName;
	private String address;
	private String contact;
	
	Supplier(int id, String company, String address, String contact)
	{
		this.id = id;
		this.companyName = company;
		this.address = address;
		this.contact = contact;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;	
	}
	//prints the detail for the supplier
	public String supplierstat()
	{
		String s;
		s = this.id+", "+this.companyName+", "+this.address+", "+this.contact;
		return s;
	}
}
