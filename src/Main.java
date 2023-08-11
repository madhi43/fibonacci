public class Main
{
    public static void main(String[] args) {
        int inputNumber = 4;
        /*FactorialFinder factorialFinder = new FactorialFinder();
        System.out.println("Foactorial :"+factorialFinder.factorial(inputNumber));
        System.out.println();*/
        FibonacciFinder fibonacciFinder = new FibonacciFinder();
        System.out.println("Fibonacci :" +fibonacciFinder.fibonacci(inputNumber));
    }
}
/*class FactorialFinder{
    int factorial(int number){
        if (number <= 1) {
            return number;
        }
        return number * factorial(number - 1);
    }
}*/
class FibonacciFinder{
    int fibonacci(int number){
        if(number<=1){
            return number;
        }
        return fibonacci(number-1)+fibonacci(number-2);
    }
}