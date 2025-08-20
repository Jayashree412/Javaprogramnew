
public class Vehicles 
{
	String name;
	String brand;
	int modelnumber;
	public Vehicles(int modelnumber1) 
	{
		modelnumber=modelnumber1;

	}
	public Vehicles(String name1,String brand1) 
	{
		name=name1;
		brand=brand1;
	}
	public void display()
	{
		System.out.println("The Vehicle model number is:"+modelnumber);
		System.out.println("The Vehicle belongs to:"+name);
		System.out.println("The Vehicle Brand is:"+brand);
		
	}
	public static void main(String[] args) 
	{
		Vehicles v1=new Vehicles(594);
		Vehicles v2=new Vehicles("GK","Mazda");
		v1.display();
		v2.display();
	}

}
