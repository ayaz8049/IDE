import java.util.Scanner;

class Area{
	void AreaOfCircle(double radius) {
	        double area = 3.14 * radius * radius;
	        System.out.println("the area of the circle is "+ area);
	    }
	
	void AreaOfRectangle(int length, int breadth) {
		int area = length * breadth;
        System.out.println("the area of the rectangle is "+ area);
	}
	
	void AreaOfTriangle(double base, double height) {
		double area = 0.5 * base * height;
        System.out.println("the area of the triangle is "+ area);
	}
}
public class Example {
	public static void main(String args[]) {
		double radius,base, height;
		int length, breadth;
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the radius");
		radius = sc.nextDouble();
		System.out.println("Enter the length and breadth of rectangle");
		length = sc.nextInt();
		breadth = sc.nextInt();
		System.out.println("Enter the base and height of triangle");
		base = sc.nextDouble();
		height = sc.nextDouble();
		
		Area a = new Area();
		
		a.AreaOfCircle(radius);
		a.AreaOfRectangle(length, breadth);
		a.AreaOfTriangle(base, height);
	}
}
