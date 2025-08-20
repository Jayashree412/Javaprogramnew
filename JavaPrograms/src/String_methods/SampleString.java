package String_methods;

public class SampleString 
{

	public static void main(String[] args) 
	{
		String name="Orange";//String literals/constants--which means this stored as permanent value for name.It goes to constant pool
		name=name+"s";
		String s=new String("Apple");//this won't go to constant pool, it will go to heap memory. Since it's created with "new" keyword
		String s1="Hello";//stored in constant pool
		String s2="hello";
		String s3=new String("Hello");//stored in Heap memory
		String s4=s1.concat("Java");//It just appends to s1 but not change the content of s1.
		StringBuffer s5=new StringBuffer("World");//this is mutable i.e changeable. used in Multi threading concept
		StringBuilder s6=new StringBuilder("Welcome");//This is also mutable
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 3)); //till index 1 to index 3 ,but 3 excluded
	    System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//content comparison. doesn't matter about the location of the string
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);//location of the string is checked here
		System.out.println(name); //The pointer now changed from Orange to Oranges
		System.out.println(s1.contains("l"));//to check whether that character is present in string
		System.out.println(s1.equalsIgnoreCase(s2));//ignores the case sensitivity and check only the content
		System.out.println(s4);
		System.out.println(s1);
		System.out.println(s5.reverse());//reversing the value in s5 and it's replaced by new reversed value
		System.out.println(s5.append("Change"));//appending the changed/reversed value with change
		System.out.println(s5); // the reversed appended value is now s5
		System.out.println(s6.reverse());
		System.out.println(s6.append("Home"));
		System.out.println(s6);
		
	}

}
