import java.util.Scanner;
class Circle extends Point {

	protected float radius;

	public Circle() {
		super(10, 10);
		radius = 10f;
	}

	public Circle(int x, int y) {
		super(x, y);
		radius = 10f;
	}

	public Circle(float radius) {
		super(10, 10);
		this.radius = radius;
	}

	public Circle(int x, int y, float radius) {
		super(x, y);
		this.radius = radius;
	}

	public Circle(Point p) {
		super(p.getX(), p.getY());
		radius = 10f;
	}

	public Circle(Point p, float radius) {
		super(p.getX(), p.getY());
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override			//annotation override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		radius = in.nextFloat();
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Radius : " + radius);
	}

	public float getArea() {
		return (float) (Math.PI * Math.pow(radius, 2));
	}

	public float getCircumference() {
		return (float) (2 * Math.PI * radius);
	}

	public Point getCenter() {
		int x = getX();
		int y = getY();
		Point p = new Point(x, y);
		return p;
		// return new Point(getX(), getY());  //Anonymous Object
	}

	public static void main(String args[]) {
		Circle c1 = new Circle(10, 20, 30f);
		c1.showData();

		Point p1 = new Point(1, 2);
		Circle c2 = new Circle(p1, 3f);
		c2.showData();

		Circle c3 = new Circle();
		c3.acceptData();
		c3.showData();
		System.out.println("Area : "  + c3.getArea());

		Point p2 = c1.getCenter();
		p2.showData();
		c1.getCenter().showData();
	}
}


















































