interface Asd {
    void sing();
}

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal implements Asd {
    void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}

class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
