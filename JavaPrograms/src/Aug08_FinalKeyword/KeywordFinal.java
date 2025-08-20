package Aug08_FinalKeyword;

public final class KeywordFinal //Since due to final keyword we can't create subclass/child class
{
	final static int a=10;//cannot be changed, similar like string constant
	public static void main(String[] args) 
	{
		KeywordFinal obj=new KeywordFinal();
		obj.getnumber();
		//a=15;//error will occur, as we cannot change the value of a  

	}
	public final void getnumber()//We cannot override this method in child class due to this final keyword
	{
		System.out.println("This is final method");
	}
}
