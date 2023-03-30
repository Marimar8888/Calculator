package files;

import interfaces.IOperation;
//Clase para realizar la resta implementa la interface IOperation que recibe los número y se define que hacer con ellos
public class SubtractionOperation implements IOperation {
    //En este caso realiza la resta de los dos números
    @Override
    public int performOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
