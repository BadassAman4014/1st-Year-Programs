abstract class A {
    abstract void run();
}

class B extends A {
    void run() {
        System.out.println("Running B");
    }
}

class C extends A {
    void run() {
        System.out.println("Running A");
    }
}

class Abstraction {
    public static void main(String args[]) {
        A s = new B();
        s.run();
        A t = new C();
        t.run();
    }
}