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
        in.close();
    }

    @Override
    public void showData() {
        System.out.println("A : " + a);
    }

    public static void main(String args[]) {
        // AbstractA obj = new AbstractA();
        AbstractA obj = new DerivedA(10);
        DerivedA obj1 = new DerivedA(20);
        obj.showData();
        obj1.showData();
    }
}























