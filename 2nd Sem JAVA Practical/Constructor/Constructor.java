//no need to call constructor it calles by itself when initilized
class Constructor {
    Constructor() {
        System.out.println("Bike is created");
    }

    public static void main(String args[]) {
        Constructor b = new Constructor();
    }
}