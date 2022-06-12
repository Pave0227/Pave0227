package JAVA_API;

// ! 인터페이스 --------------------------------------------------------
interface Mineral_List {
    int add();
}

// ? 클래스 ----------------------------------------------------------
class Gold implements Mineral_List {
    public int add() {
        return 100;
    }

}

class Silver implements Mineral_List {
    public int add() {
        return 90;
    }
}

class Bronze implements Mineral_List {

    public int add() {
        return 80;
    }
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral_List min) {
        this.value += min.add();
    }

    public int getValue() {
        return this.value;
    }
}

// todo 구동부 ----------------------------------------------------------
public class Mineral {
    public static void main(String[] args) {
        MineralCalculator cal = new MineralCalculator();
        Gold gold = new Gold();
        Silver silver = new Silver();
        Bronze bronze = new Bronze();
        cal.add(gold);
        cal.add(silver);
        cal.add(bronze);
        System.out.println(cal.getValue()); // 270 출력
    }
}