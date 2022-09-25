public class Generics {
    public static void main(String args[]) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        String[] stringArray = { "Hello_World" };
        MyGenerics<Integer> g1 = new MyGenerics<Integer>();
        MyGenerics<String> g2 = new MyGenerics<String>();
        System.out.println("Printing Integer Array");
        g1.printArray(intArray);

        System.out.println("Printing Character Array");
        g2.printArray(stringArray);
    }
}

class MyGenerics<E> {
    E a;

    void set(E a) {
        this.a = a;
    }

    public <T> void printArray(T r[]) {
        for (T i : r)
            System.out.println(i);
    }
}