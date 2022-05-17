package day6;

public class Rec extends Shape {
	int len;
	int br;

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
	 public Rec(int len, int br) {
			super();
			this.len = len;
			this.br = br;
			
		}
	
	Rec()
	{
		
		System.out.println("inside  Rec ");
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBr() {
		return br;
	}

	public void setBr(int br) {
		this.br = br;
	}

	@Override
	public String toString() {
		return "Rec [len=" + len + ", br=" + br + "]";
	}
	
	
	
	
}
