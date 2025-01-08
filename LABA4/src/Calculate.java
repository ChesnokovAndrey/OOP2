public class Calculate {
    public static double calculate(char operator, double... numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0; // или throw new IllegalArgumentException("Пустой набор чисел");
        }


        for (double num : numbers) {
            if (!Double.isFinite(num)) {
                throw new IllegalArgumentException("Ошибка валидации входных параметров");
            }
        }

        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            double num = numbers[i];
            switch (operator) {
                case '+':
                    result += num;
                    break;
                case '-':
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                case '/':
                    if (num == 0) {
                        throw new ArithmeticException("Ошибка: деление на ноль");
                    }
                    result /= num;
                    break;
                default:
                    throw new IllegalArgumentException("Недопустимый оператор");
            }
        }
        return result;
    }
}
