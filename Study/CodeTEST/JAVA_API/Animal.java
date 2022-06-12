package JAVA_API;

// ? 인터페이스 ---------------------------------------------------------
interface Predator {
    String getFood();

    default void Print_Food() {
        System.out.printf("My Food is %s\n", getFood());
    }

    int LEG_COUNT = 4; // 인터페이스 상수

    static int Speed() {
        return LEG_COUNT * 30;
    }
}

interface BarkAnimal {
    String bark();

    default void Print_Bark() {
        System.out.println(bark());
    }
}

interface all extends Predator, BarkAnimal {

}

// todo ---------------------------------------------------------
public class Animal {
    public static void main(String[] arg) {
        // ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.Protect(tiger);
        bouncer.Protect(lion);

    }
}

// ! 클래스 ---------------------------------------------------------
class Animals {
    String name;

    void SetName(String name) {
        this.name = name;
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Tiger extends Animals implements all {
    public String getFood() {
        return "apple";
    }

    public String bark() {
        return "어흥";
    }
}

class Lion extends Animals implements all {
    public String getFood() {
        return "banana";
    }

    public String bark() {
        return "으르렁";
    }
}

class Bouncer {
    void Protect(BarkAnimal animal) {
        animal.Print_Bark();
    }
}
