package service;

import interfaces.IInputProvider;

import java.util.InputMismatchException;
import java.util.Scanner;
//Clase para la consola de entrada implementa la interface IInputProvider
public class ConsoleInputProvider implements IInputProvider {

    @Override
    public int getNumberInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println(message);
            try {
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please enter a valid number.");
                        scanner.next();
            }
        }
        return number;
    }

    @Override
    public String getOperationInput(String message) {
        Scanner scanner = new Scanner(System.in);
        String operationSymbol = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.println(message);
            operationSymbol = scanner.next();
            if (isValidOperation(operationSymbol)) {
                validInput = true;
            } else {
                System.out.println("Invalid input, please enter a valid operation.");
            }
        }
        return operationSymbol;
    }
    private boolean isValidOperation(String operationSymbol) {
        return operationSymbol.matches("[+\\-*/]");
    }
}
