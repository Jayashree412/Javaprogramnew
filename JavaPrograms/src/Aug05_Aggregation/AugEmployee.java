package Aug05_Aggregation;

public class AugEmployee 
{
int empId;
String empName;
AugAddress address;//Aggregation is happened here. Address class name as data type+variable name
	public static void main(String[] args) 
	{
		
		AugAddress obj=new AugAddress("Chennai","Tamil Nadu","India",674874l);
		AugEmployee obj1=new AugEmployee(1124,"Jay",obj);//address object is added here to fetch the address details from address class
		obj1.display();
	}
	public AugEmployee(int empId, String empName, AugAddress address) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}
	public void display()
	{	
		System.out.println("The emp id is:"+empId);
		System.out.println("The emp name is:"+empName);
		System.out.println("The emp city is:"+address.city);//calling using the instance variable address to display the address details
		System.out.println("The emp state is:"+address.state);//calling using the instance variable address to display the address details
		System.out.println("The emp country is:"+address.country);//calling using the instance variable address to display the address details
		System.out.println("The emp zip is:"+address.zip);//calling using the instance variable address to display the address details
	}
	public static void main(int a,int b) 
	{
		
	}
}
