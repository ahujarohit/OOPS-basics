import java.util.Scanner;
class Rectangle {

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		width = w;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		height = h;
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Width : ");
		width = in.nextInt();
		System.out.println("Enter Height : ");
		height = in.nextInt();
	}

	public void showData() {
		System.out.println("Width : " + width);
		System.out.println("Height : " + height);
	}

	public int getArea() {
		return width * height;
	}

	public int getPerimeter() {
		return 2 * (width + height);
	}

	public static void main(String args[]){
		Rectangle r = new Rectangle();
		r.acceptData();	
		r.showData();	
		System.out.println("Area : " + r.getArea());	
	}
}





















