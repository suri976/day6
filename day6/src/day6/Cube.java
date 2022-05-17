package day6;

public class Cube extends Shape{
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
		 p=4*(len+br+h);
		 System.out.println("Perimeter of Cube = "+p);
		 
		 
	 }
	 
	
	@Override
	public String toString() {
		return "Cube [len=" + len + ", br=" + br + ", h=" + h + "]";
	}

	public Cube(int len, int br, int h) {
		super();
		this.len = len;
		this.br = br;
		this.h = h;
	}

	void vol()
	 {
		 int p;
		 p=(len*br*h);
		 System.out.println("Volume of Cube = "+p);
		 
	 }

}
