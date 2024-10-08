import java.util.Scanner;
final class TestCircle {
    protected float radius;
    public final static float PI = 3.14f;

    public TestCircle() {

    }

    public TestCircle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        radius = in.nextFloat();
        in.close();
    }

    public void showData() {
        System.out.println("Radius : " + radius);
    }

    public final float getArea() {
        return PI * radius * radius;
    }

    public final float getCircumference() {
        return 2 * PI * radius;
    }

    public static final void main(String args[]) {
        TestCircle tc = new TestCircle();
        tc.acceptData();
        tc.showData();
        System.out.println("Area : " + tc.getArea());
    }
}