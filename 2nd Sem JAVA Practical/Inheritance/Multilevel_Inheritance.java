class Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

class Anatomy extends Animal {
    public void legs() {
        System.out.println("Dog have 4 Legs");
    }

    public void ears() {
        System.out.println("Dog have 2 ears");
    }
}

class Dog extends Anatomy {
    public void eat() {
        System.out.println("Dog food");
    }
}

class Multilevel_Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.legs();
        d.ears();
        d.eat();
    }
}