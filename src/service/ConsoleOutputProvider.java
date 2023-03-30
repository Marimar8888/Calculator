package service;
import interfaces.IOutputProvider;
public class ConsoleOutputProvider implements IOutputProvider{

    @Override
    public void printResult(int firstNumber, int secondNumber, String operationSymbol, int result) {
        System.out.println("La " + operationSymbol + " de " + firstNumber + " y " + secondNumber + " es " + result);
    }
}
