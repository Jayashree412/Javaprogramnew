package ThisKeyword;

public class SampleKeyword 
{

	public static void main(String[] args) 
	{
		SampleKeyword obj=new SampleKeyword();
		obj.display();
	}
	public void display()
	{
		this.show();
		System.out.println("This is method1");
	}
	public void show()
	{
		System.out.println("This is method2");
	}
}

//by default this.show. 
//this keyword is pointing to current object.this keyword is added during compile time.without the this keyword as well this will work
