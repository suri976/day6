package day6;

public class Triangle extends Shape {
	int len;
	int br;
	int h;
	
	
	
	
	
	void area()
	{
		 float area;
		area=1/2*(len*br);
		System.out.println("Area of Triangle = "+area);
	}
	
	 void perimeter()
	 {
		 int p;
		 p=len+br+h;
		 System.out.println("Perimeter of Triangle = "+p);
		 
		 
	 }

	@Override
	public String toString() {
		return "Triangle [len=" + len + ", br=" + br + ", h=" + h + "]";
	}

	public Triangle(int len, int br, int h) {
		super();
		this.len = len;
		this.br = br;
		this.h = h;
	}
	
	

}
