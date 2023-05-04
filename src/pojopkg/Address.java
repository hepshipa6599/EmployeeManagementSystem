package pojopkg;

public class Address {
	int doorNo;
	String Street;
	String City;
	String State;
	int Pincode;
	public Address(int doorno,String Street,String City,String State,int Pincode)
	{
		super();
		this.doorNo=doorno;
		this.Street=Street;
		this.City=City;
		this.State=State;
		this.Pincode=Pincode;
		
		
	}
	public Address() {
		
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", Street=" + Street + ", City=" + City + ", State=" + State + ", Pincode="
				+ Pincode + "]";
	}
	
}
