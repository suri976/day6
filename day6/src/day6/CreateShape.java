package day6;

public class CreateShape {
	public static void main(String[] args) {
		
Shape r;
r=new Rec(1,2);

System.out.println(r);
r.area();
r.perimeter();
r.vol();
System.out.println();

r=new Circle(4);
System.out.println(r);

r.diameter();
r.area();
r.perimeter();
System.out.println();

r=new Square(2);

System.out.println(r);
r.area();
r.perimeter();
System.out.println();

r=new Triangle(5,6,2);

System.out.println(r);
r.area();
r.perimeter();
System.out.println();

r=new Cone(3,5);

System.out.println(r);
r.area();
r.perimeter();
System.out.println();

r=new Cuboid(2,5,6);

System.out.println(r);
r.vol();
System.out.println();

r=new Cube(6,3,6);

System.out.println(r);
r.vol();
r.perimeter();
System.out.println();











		
	}

}
