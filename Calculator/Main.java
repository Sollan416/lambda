
public class Main {
    public static void main(String[] args) throws ArithmeticException {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);

//        int d = calc.calculate(calc.divide, 25, 0);  // Деление на ноль!
//        calc.println.accept(d);

        /*
         * В результате вычислений происходит недопустимая операция - деление на ноль.
         * Выполнение программы прерывается ошибкой ArithmeticException.
         *
         * Возможные решения:
         * 1. Добавление в оператор divide проверки делителя на 0 и ссылки на метод,
         * который будет сообщать об ошибке
         * 2. Создание метода, содержащего блок try-catch, через который будут происходить вычисления.
         */
    }
}
