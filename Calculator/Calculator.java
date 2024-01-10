import java.util.function.*;

public class Calculator {
    Calculator() { }

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> y == 0? divisionByZero(x, y) : (x / y); // проверка на 0
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;

    private Integer divisionByZero(int x, int y) {
        System.out.println("Деление на ноль! (" + x + "/" + y + ")");
        return 0;
    }

//    int calculate(BinaryOperator<Integer> operator, int x, int y) {
//        int result = 0;
//        try {
//            result = operator.apply(x, y);
//        } catch (ArithmeticException e) {
//            System.err.println("Деление на ноль!");
//        }
//        return result;
//    }

    Consumer<Integer> println = System.out::println;

}