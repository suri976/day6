package day6;

public class Cuboid  extends Shape{
	
	int len;
	int br;
	int h;
	
	
	
	
	
	void area()
	{
		int area;
		area=len*br;
		System.out.println("Area of rectangle = "+area);
	}
	
	 void perimeter()
	 {
		 int p;
		 p=2*(len*br);
		 System.out.println("Perimeter of rectangle = "+p);
		 
		 
	 }
	 
	 @Override
	public String toString() {
		return "Cuboid [len=" + len + ", br=" + br + ", h=" + h + "]";
	}

	public Cuboid(int len, int br, int h) {
		super();
		this.len = len;
		this.br = br;
		this.h = h;
	}

	void vol()
	 {
		 int p;
		 p=(len*br*h);
		 System.out.println("Volume of Cuboid = "+p);
		 
	 }
	 

}
