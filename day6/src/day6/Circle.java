package day6;
public  class Circle extends Shape {
	
		public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getPi() {
		return pi;
	}

	
	
	
	  int radius; 
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

		public Circle(int radius) {
			super();
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Circle [radius=" + radius + "]";
		}

		
		 
		 
		 
		 
	}



