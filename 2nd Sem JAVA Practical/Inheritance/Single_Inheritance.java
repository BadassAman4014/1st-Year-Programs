class Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog food");
    }
}

class Single_Inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();

    }
}