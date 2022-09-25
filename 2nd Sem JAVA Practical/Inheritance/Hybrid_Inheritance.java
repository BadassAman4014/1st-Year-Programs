//Hierarchical and Single Inheritance
class C {
    public void disp() {
        System.out.println("C");
    }
}

class A extends C {
    public void disp() {
        System.out.println("A");
    }
}

class B extends C {
    public void disp() {
        System.out.println("B");
    }
}

public class Hybrid_Inheritance extends A {
    public void disp() {
        System.out.println("D");
    }

    public static void main(String args[]) {
        Hybrid_Inheritance obj = new Hybrid_Inheritance();
        obj.disp();
    }
}