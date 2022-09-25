class Constructor_Overloading {
    int id;
    String name;
    int age;

    Constructor_Overloading(int i, String n) {
        id = i;
        name = n;
    }

    Constructor_Overloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Constructor_Overloading s1 = new Constructor_Overloading(24, "Aman");
        Constructor_Overloading s2 = new Constructor_Overloading(62, "Viranchi", 1);
        s1.display();
        s2.display();
    }
}