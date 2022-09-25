//Same name of methods but diffrent types/numbers of data types 
class Method_Overloading {
    void add() {
        int a = 10, b = 20, c;
        c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }

    void add(double x, int y) {
        double c;
        c = x + y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Method_Overloading r = new Method_Overloading();
        r.add();
        r.add(50, 20);
        r.add(22.5, 10);
    }
}