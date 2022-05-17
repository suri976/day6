package day6;

public class Cone extends Shape {
	
	int radius;
	int h;
	final float pi=3.14f;
	
	
	
	
	void area()
	{
		float area;
		area=pi*radius*radius;
		System.out.println("Area of circle = "+area);
	}
	
	 void perimeter()
	 {
		 float p;
		 p=2*(pi*radius);
		 System.out.println("Perimeter of circle = "+p);
		 
		 
	 }
	 void diameter()
	 {
		 int d;
		 d=2*radius;
		 System.out.println("Diameter of circle = "+d);
		 
		 
	 }
	 
	 void vol()
	 {
		 float v;
		 v=pi*radius*radius*h;
		 System.out.println("Volume of circle = "+v/3);
		 
		 
		 
	 }

	public Cone(int radius, int h) {
		super();
		this.radius = radius;
		this.h = h;
	}

	@Override
	public String toString() {
		return "Cone [radius=" + radius + ", h=" + h + "]";
	}

	
}
