package racingcar;





import inAndOut.Input;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        Input input = new Input(scanner);
        // 자동차 이름 및 시도 횟수 get
        input.getInput();

        System.out.println("hello");

        while (true) {
            System.out.println("   ");
        }
    }
}
