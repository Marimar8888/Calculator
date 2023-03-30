import interfaces.ICalculator;
import interfaces.IInputProvider;
import interfaces.IOutputProvider;
import service.Calculator;
import service.ConsoleInputProvider;
import service.ConsoleOutputProvider;

public class Main {
    public static void main(String[] args) {
        //Creo las instancias de las consolas (interfaces) y de la calculadora
        IInputProvider inputProvider = new ConsoleInputProvider();
        IOutputProvider outputProvider = new ConsoleOutputProvider();
        ICalculator calculator = new Calculator(inputProvider, outputProvider);
        //LLama al método start de la clase Calculator
        ((Calculator) calculator).start();

    }
}