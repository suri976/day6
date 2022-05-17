package day6;

public class Square extends Shape  {
	int side;
	
	
	
	
	
	
	void area()
	{
		int area;
		area=side*side;
		System.out.println("Area of Square  = "+area);
	}
	
	 void perimeter()
	 {
		 int p;
		 p=2*(2*side);
		 System.out.println("Perimeter of Square  = "+p);
		 
		 
	 }

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}

