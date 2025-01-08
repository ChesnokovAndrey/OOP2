import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\HOME\\OOP_2\\LABA4\\src\\resource\\tasks.txt"; // Замените на фактический путь
        try {
            Parser parser = new Parser();
            List<String> lines = parser.parse(filePath);
            for (String line : lines) {

                //  Регулярное выражение для поиска уравнений
                Pattern pattern = Pattern.compile("([+-]?\\d+(\\.\\d+)?)[\\+\\-\\*\\/]+([+-]?\\d+(\\.\\d+)?)");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String expression = matcher.group();
                    System.out.println("Выражение: " + expression);
                    String[] parts = expression.split("[+\\-*/]");

                    // Вычисление выражения -  упрощённая версия
                    // Вычисление должно производиться по приоритету операций
                    if (parts.length == 2) {
                        double val1 = Double.parseDouble(parts[0]);
                        double val2 = Double.parseDouble(parts[1]);

                        System.out.println("Результат вычисления: " + Calculate.calculate(expression.substring(parts[0].length(),parts[0].length()+1), val1, val2));
                    }

                }
                // Регулярное выражение для поиска квадратных уравнений
                Pattern quadraticPattern = Pattern.compile("([+-]?\\d+(\\.\\d+)?)(x\\^2)?([+-]?\\d+(\\.\\d+)?)(x)?([+-]?\\d+(\\.\\d+)?)=0");

                // Обработка квадратных уравнений
                if (quadraticPattern.matcher(line).matches()) {
                    Matcher m = quadraticPattern.matcher(line);
                    if (m.matches()) {
                        try {
                            double a = Double.parseDouble(m.group(1));
                            double b = Double.parseDouble(m.group(3));
                            double c = Double.parseDouble(m.group(5));

                            double[] roots = QuadraticEquation.solveQuadraticEquation(a, b, c);

                            if (roots.length == 0) {
                                System.out.println("Уравнение " + line + " не имеет вещественных корней.");
                            } else if (roots.length == 1) {
                                System.out.println("Уравнение " + line + " имеет один корень: " + roots[0]);
                            } else {
                                System.out.println("Уравнение " + line + " имеет два корня: " + roots[0] + ", " + roots[1]);
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Ошибка: Не удалось преобразовать коэффициенты уравнения " + line + " в числа.");
                        }
                    }

                }

            }
        } catch (Exception e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}