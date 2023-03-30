package files;

import interfaces.IOperation;
//Clase para realizar la suma implementa la interface IOperation que recibe los número y se define que hacer con ellos
public class AdditionOperation implements IOperation {
    //En este caso realiza la suma de los dos números
    public int performOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
