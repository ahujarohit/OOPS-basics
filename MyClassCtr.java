import java.util.Scanner;
class MyClassCtr {
    protected int a;
    protected int b;
    private static int ctr;

    public MyClassCtr() {
        ctr++;
    }

    public MyClassCtr(int a, int b) {
        this.a = a;
        this.b = b;
        ctr++;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static int getCtr() {
        return ctr;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A : ");
        a = in.nextInt();
        System.out.println("Enter B : ");
        b = in.nextInt();
    }

    public void showData() {
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }

    public static void main(String args[]) {
        MyClassCtr x = new MyClassCtr();
        MyClassCtr y = new MyClassCtr(1, 2);
        MyClassCtr z = new MyClassCtr(4, 5);
        System.out.println("Counter : " + getCtr());
    }
}




















