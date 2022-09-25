class A {
    void run() {
        System.out.println("Method A");
    }
}

class Method_Overiding extends A {
    void run() {
        System.out.println("Method B");
    }

    public static void main(String args[]) {
        Method_Overiding obj = new Method_Overiding();
        obj.run();
    }
}