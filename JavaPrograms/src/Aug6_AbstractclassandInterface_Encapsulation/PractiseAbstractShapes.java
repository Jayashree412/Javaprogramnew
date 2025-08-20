package Aug6_AbstractclassandInterface_Encapsulation;

public class PractiseAbstractShapes extends PractiseAbstract
{
float pi=3.14f;
	public static void main(String[] args) 
	{
		PractiseAbstract obj=new PractiseAbstractShapes();
		float circlearea=obj.circle();
		int circlerectangle=obj.rectangle();
		System.out.println("The area of circle:"+obj.circle());
		System.out.println("The area of rectangle:"+obj.rectangle());

	}
	public float circle()
	{
		float a=14.5f;
		float b=44.4f;
		float area=a*b*pi;
		return area;
	}
	public int rectangle()
	{
		int x=44;
		int y=11;
		int area=x*y;
		return area;
		
	}
}
