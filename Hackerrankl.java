class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // Nothing extra neede
}

class Solution {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.println(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10));
    }
}

