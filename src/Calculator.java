public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public class CalculatorExample {


        public static void main(String[] args) {
            Calculator myCalculator = new Calculator();
            int sum = myCalculator.add(10, 5);
            System.out.println(sum);

            int difference = myCalculator.sub(10, 5);
            System.out.println(difference);

        }

    }
}
