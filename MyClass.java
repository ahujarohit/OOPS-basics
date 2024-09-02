class MyClass {

    private int a;                  //member data

    public int getA() {
        return a;
    }

    public void setA(int a) {       //argument
        this.a = a;
    }

    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.setA(100);          
        //obj is the current context. "Current Context" is the object in use
        MyClass obj1 = new MyClass();
        obj1.setA(200);          
        //obj1 is the current context. "Current Context" is the object in use
        //IN Java current context, in class is referred using "this"
        //"this becomes compulsoy when member data and argument shares a common name"
    }
}

class Employee {
    String code;
    String name;
    String dept;
    String desig;
    int salary;

    public void setData(String a, String b, String c, String d, int e) {
        code = a;
        name = b;
        dept = c;
        desig = d;
        salary = e;
    }
    public void setData(String code, String name, String dept, String desig, int salary) {
        this.code = code;
        this.name = name;
        this.dept = dept;
        this.desig = desig;
        this.salary = salary;
    }

    public void setData(String a, String b) {
        name = a;
        dept = b;
    }
    public void setData(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }
}

class Employee {
    private Employee this;
}































