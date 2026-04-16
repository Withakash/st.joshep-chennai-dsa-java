class A {
    static void show() { System.out.println("A"); }
}
class B extends A {
    static void show() { System.out.println("B"); }
}
class Test {
    public static void main(String[] args) {
        // B obj = new B();
        // obj.show();
    }
}
