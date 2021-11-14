package inAndOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Input {
    public static String ERROR = "[ERROR]";
    private Scanner scanner;
    private List<String> carNames;
    private int count;
    private IOValidator validator;
    public Input(Scanner scanner) {
        this.scanner = scanner;
        this.carNames = new ArrayList<>();
        this.count = 0;
    }

    public void getInput() {
        System.out.println("입력해주세요");
        //validation
        String names = validateCarNames();
        // 자동차 이름 get
        getCarNames(names);
        // 시도 횟수 validation get
        System.out.println("회수 입력");
        validateCount();

    }

    private void validateCount() {
        String countVal = scanner.nextLine();
        checkIfEmpty(countVal);
        for (int i = 0; i < countVal.length(); i++) {
            if (!Character.isDigit(countVal.charAt(i))) {
                throw new RuntimeException(ERROR + " 시도 횟수는 숫자여야합니다.");
            }
        }
        this.count = Integer.parseInt(countVal);
        System.out.println(count);
    }

    private void checkIfEmpty(String input) {
        if (input.isEmpty()) {
            throw new RuntimeException(ERROR + " 입력을 확인해주세요.");
        }
    }

    private String validateCarNames() {
        String line = scanner.nextLine();
        checkIfEmpty(line);
        checkInputContainsComma(line);
        return line;

    }

    private void checkInputContainsComma(String input) {
        if (!input.contains(",")) {
            throw new RuntimeException(ERROR + " ,을 활용하여 구분해주세요");
        }
    }

    private void getCarNames(String names) {
        String[] split = names.split(",");
        for (String name : split) {
            carNames.add(name);
        }
    }


}
