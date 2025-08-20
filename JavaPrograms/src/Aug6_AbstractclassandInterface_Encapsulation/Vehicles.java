package Aug6_AbstractclassandInterface_Encapsulation;

public class Vehicles implements InterfaceVehicles
{

	public static void main(String[] args) 
	{
		InterfaceVehicles obj=new Vehicles();
		obj.Honda();
		obj.Mazda();

	}
	public void Honda()
	{
		System.out.println("This is Honda method");
	}
	public void Mazda()
	{
		System.out.println("This is Mazda method");
	}

}
