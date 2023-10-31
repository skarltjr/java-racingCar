package racingcar.car;


public class Car {
    private final String name;
    private int position = 0;
    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public void move() {
        this.position++;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
