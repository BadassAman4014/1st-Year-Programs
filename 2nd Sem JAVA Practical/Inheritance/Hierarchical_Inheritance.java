class A {
    public void showA() {
        System.out.println("A");
    }
}

class B extends A {
    public void showB() {
        System.out.println("B");
    }
}

class C extends A {
    public void showC() {
        System.out.println("C");
    }
}

class Hierarchical_Inheritance {
    public static void main(String[] args) {
        B demo = new B();// B extends A
        demo.showB();
        demo.showA();

        C demo1 = new C();// C extends A
        demo1.showC();
        demo1.showA();
    }
}