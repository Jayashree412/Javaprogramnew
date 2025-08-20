package samplePackage2;

import samplePackage1.*;

public class SampleClassB extends SampleClassA //A is the parent and B is the child
{

	public static void main(String[] args) 
	{
        SampleClassA.display();//calling a static method from SampleClassA
       //SampleClassA obj=new SampleClassA();//calling a instance method from SampleClassA using a object
     SampleClassB obj=new SampleClassB();//calling a instance method from SampleClassA(Parent) using a object of SampleClassB(Child),
     									//since we've already extended the ClassA to ClassB while the method in Parent class is Protected
        obj.details();
        
       /* SampleClassB obj1=new SampleClassB();
        obj1.details();
        SampleClassB.display()*/
	}

}
