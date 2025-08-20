package Aug6_AbstractclassandInterface_Encapsulation;

public class VehicleEncapsule {

	public static void main(String[] args) 
	{
		Vehicle obj=new Vehicle();
		obj.setVehicleType("Car");
		System.out.println(obj.getVehicleType());
		obj.setVehicleName("Mazda");
		System.out.println(obj.getVehicleName());
	}

}
