package Assign;
class Circle // create a class
{
	private double pi;
	private int r;
	
	 public int getR() // Using getter method
	 {
		return r;
	}

	public void setR(int r) //Using setter method
	{
		this.r = r;
	}

	public Circle(int r) // parameterized constructor
	{
		super();
		this.r = r;
	}

	public void Area() //Using method
	{	
		 double pi=3.14;
		 double area=pi*r*r;  //calculate the area of circle
		 System.out.println("Area of circle is :"+area);
		 
	}
}


public class Assign_ment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructor overloading
				Circle c = new Circle(4);     // parameter pass
				c.Area();
				Circle c1=new Circle(20);    // parameter pass
				c1.Area();

	}

}
