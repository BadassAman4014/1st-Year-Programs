class Parameterized_constructor {
    int id;
    String name;

    Parameterized_constructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Parameterized_constructor s1 = new Parameterized_constructor(24, "Aman");
        Parameterized_constructor s2 = new Parameterized_constructor(62, "Viranchi");
        s1.display();
        s2.display();
    }
}