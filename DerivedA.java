import java.util.Scanner;
class DerivedA extends AbstractA {

	protected int a;

	public DerivedA() {
	}

	public DerivedA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A : ");
		a = in.nextInt();
	}	

	@Override
	public void showData() {
		System.out.println("A : "+ a);
	}	
	
	public static void main(String args[]) {
//ERROR		AbstractA obj = new AbstractA();
		AbstractA obj1 = new DerivedA(10);
		DerivedA obj2 = new DerivedA(20);
		obj1.showData();
		obj2.showData();
	}	
}

















