package ge.edu.btu;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

        calculatorService.sum(3,4);
        calculatorService.prod(4,2);

    }
}
