//Class in Java 

class Main {
    public int addNum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int num1 = 111;
        int num2 = 345;
        Main newSum = new Main();
        int result = newSum.addNum(num1, num2);
        System.out.println("Sum is " + result);
    }
}

class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.println("Lamp is on?" + isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.println("Lamp is on?" + isOn);
    }

    public static void main(String[] args) {

        Lamp led = new Lamp();
        Lamp hol = new Lamp();
        led.turnOn();
        hol.turnOff();

    }
}

// Using concat for connect between strings
// USing equals to compare between strings

class Thiskeys {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Thiskeys obj = new Thiskeys();
        obj.setName("Yamaki");
        System.out.println("obj.name: " + obj.getName());

    }
}

// Using Recuising by Number
class Factorial {
    static int factorial(int n) {
        if (n != 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        int num = 5, result;
        result = factorial(num);
        System.out.println("The factorial of " + num + " is " + result);

    }

}

// Using of super Keyword
class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("I am a dog.");
    }
}

class Run {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
