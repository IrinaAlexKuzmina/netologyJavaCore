public class Main {

    public static void main(String[] args){

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b); // на 0 делить нельзя => если делить на очень малькое число, получаем +/- бесконечность,
                                        // в зависимости от знака делимого числа

        calc.println.accept(c);
    }
}
