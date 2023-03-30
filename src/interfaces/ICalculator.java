package interfaces;

public interface ICalculator {
    //Metodo recibe los números y el resultado de la operación
    int performOperation(int firstNumber, int secondNumber, IOperation  operation);
}
