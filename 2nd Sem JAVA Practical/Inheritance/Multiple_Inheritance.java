interface A {
    void show();
}

interface B {
    void show();
}

class Multiple_Inheritance implements A, B {
    public void show() {
        System.out.println("Interface A and B");
    }

    public static void main(String[] args) {
        Multiple_Inheritance m = new Multiple_Inheritance();
        m.show();
    }
}