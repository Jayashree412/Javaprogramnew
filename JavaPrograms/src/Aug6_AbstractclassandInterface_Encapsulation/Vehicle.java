package Aug6_AbstractclassandInterface_Encapsulation;

public class Vehicle 
{
	private String vehicleType;
	private String vehicleName;
	// Only getter and setter methods
	public String getVehicleType() 
	{
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;//to set values for the instance variable and it is write only method
	}
	public String getVehicleName() {
		return vehicleName;//to get the values from the instance variables and it is read only method
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}

//Use of the Encapsulation--To wrap a data and code as a unit. Security of data
//It's mandatory that for encapsulation Private data members and public methods are created here
//We can get the data using getters and set values to the setters
//We can get Bank Pin and Aadhar pin which means to secure a data we use getter method only setter method is optional here since we won't be changing it
//To set the values to those data we use setter method which is write only