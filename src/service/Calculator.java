package service;

import files.AdditionOperation;
import files.DivisionOperation;
import files.MultiplicationOperation;
import files.SubtractionOperation;
import interfaces.ICalculator;
import interfaces.IInputProvider;
import interfaces.IOperation;
import interfaces.IOutputProvider;

public class Calculator implements ICalculator {
    //Se crean variables de interfaces para controlar la consola el input y el output
    private final IInputProvider inputProvider;
    private final IOutputProvider outputProvider;
    //Constructor inicializa las variables
    public Calculator(IInputProvider inputProvider, IOutputProvider outputProvider){
        this.inputProvider = inputProvider;
        this.outputProvider = outputProvider;
    }
    //Método llamado desde el main cuando se pulsa run
    public void start() {
        //muestra el mensaje para introducir el primer número y guarda lo introducido en una variable int
        int firstNumber = inputProvider.getNumberInput("Enter the first number: ");
        //muestra el mensaje para introducir el segundo número y guarda lo introducido en una variable int
        int secondNumber = inputProvider.getNumberInput("Enter the second number: ");
        //muestra el mensaje para introducir el simbolo de la operaicón y guarda lo introducido en un string
        String operationSymbol = inputProvider.getOperationInput("Enter the operation (+, -, *, /): ");
        //LLama al método getOperation de esta misma clase y devuelve en una varialbe tipo IOperation el resultado
        // de la operación
        IOperation operation = getOperation(operationSymbol);
        //Llama al método performOperation de la interface ICalculator
        int operationResult = performOperation(firstNumber, secondNumber,
                operation);
        //A través del objeto de la consola outputProvider se imprime el mensaje interfaz IOuputProvider
        //implementado en ConsoleOutputProvider
        outputProvider.printResult(firstNumber, secondNumber, operationSymbol,
                operationResult);
    }
    //Método implementado de interface ICalculator devuelve el resultado de la operación
    @Override
    public int performOperation(int firstNumber, int secondNumber, IOperation operation) {
        return operation.performOperation(firstNumber, secondNumber);
    }
    //Recibe el simbolo y llama al método de la clase AddictionPeration (método performOperation)
    private IOperation getOperation(String operationSymbol) {
        switch (operationSymbol) {
            case "+":
                return new AdditionOperation();
            case "-":
                return new SubtractionOperation();
            case "*":
                return new MultiplicationOperation();
            case "/":
                return new DivisionOperation();
            default:
                throw new UnsupportedOperationException("Invalid operation");
        }
    }
}
