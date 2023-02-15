import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите расчет в формате 'x operator y'. P.s Не забывайте пробелы! :");
        String calculation = input.nextLine();

        String[] parts = calculation.trim().split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[2]);
        String operator = parts[1];

        if (x < 1 || x > 10 || y < 1 || y > 10) {
            throw new IllegalArgumentException("Неверные цифры. Оба числа должны быть от 1 до 10 включительно");
        }

        int result;
        switch (operator) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                throw new IllegalArgumentException("Неверная команда. Команда должна быть из выбраных +, -, *, /.");
        }

        System.out.println("Ответ " + result);
    }
}